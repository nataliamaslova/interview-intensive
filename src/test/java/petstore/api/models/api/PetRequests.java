package petstore.api.models.api;

import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import petstore.api.models.Pet;

import static io.restassured.RestAssured.given;

public class PetRequests {

    public static Pet createPet(Pet pet) {
        return given()
                .contentType(ContentType.JSON)
                .body(pet)
                .when()
                .post("/pet")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract().as(Pet.class);
    }

    public static Pet readPet(int petId) {
        return  given()
                .contentType(ContentType.JSON)
                .when()
                .get("/pet/" + petId)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract().as(Pet.class);
    }

    public static Pet updatePet(Pet pet) {
        return given()
                .contentType(ContentType.JSON)
                .body(pet)
                .when()
                .put("/pet")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract().as(Pet.class);
    }

    public static void deletePet(int petId) {
        given()
                .contentType(ContentType.JSON)
                .when()
                .delete("/pet/" + petId)
                .then()
                .statusCode(HttpStatus.SC_OK);
    }
}
