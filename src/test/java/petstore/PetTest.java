package petstore;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import petstore.api.models.Category;
import petstore.api.models.Pet;
import petstore.api.models.api.PetRequests;

import static io.restassured.RestAssured.given;

public class PetTest {

    @BeforeAll
    public static void setupApiTests() {
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
    }

    @Test
    public void userCanBeAbleCreatePet() {
        Category category = Category.builder().id(8).name("terrier").build();
        Pet glen = Pet.builder().id(567).name("Jack").status("available").category(category).build();
        Pet cretedPet = PetRequests.createPet(glen);
        Assertions.assertEquals(glen, cretedPet);
    }

    @Test
    public void userCanBeAbleReadPet() {
        // 1. Create Pet
        Category category = Category.builder().id(8).name("terrier").build();
        Pet glen = Pet.builder().id(567).name("Jack").status("available").category(category).build();
        Pet cretedPet = PetRequests.createPet(glen);

        // 2. Read Pet
        Pet readPet = PetRequests.readPet(cretedPet.getId());

        // Verification
        Assertions.assertEquals(cretedPet, readPet);
    }

    @Test
    public void userCanBeAbleUpdatePet() {
        // 1. Create Pet
        Category category = Category.builder().id(8).name("terrier").build();
        Pet glen = Pet.builder().id(567).name("Jack").status("available").category(category).build();
        Pet cretedPet = PetRequests.createPet(glen);

        // 2. Update Pet
        String expectedStatus = "not available";
        glen.setStatus(expectedStatus);
        Pet actualPet = PetRequests.updatePet(glen);

        // 3. Verification
        Assertions.assertEquals(glen, actualPet);
    }

    @Test
    public void userCanBeAbleDeletePet() {
        // 1. Create Pet
        Category category = Category.builder().id(8).name("terrier").build();
        Pet glen = Pet.builder().id(567).name("Jack").status("available").category(category).build();
        Pet cretedPet = PetRequests.createPet(glen);

        // 2. Delete Pet
       PetRequests.deletePet(cretedPet.getId());

        // 3. Verification that Pet is npt exist anymore
        given()
                .contentType(ContentType.JSON)
                .when()
                .get("/pet/" + cretedPet.getId())
                .then()
                .statusCode(HttpStatus.SC_NOT_FOUND);
    }
}

