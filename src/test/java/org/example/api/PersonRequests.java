package org.example.api;

import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.example.api.models.Person;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasKey;

public class PersonRequests {
    public static String createPerson(Person person) {
        return given()
                .body(person)
                .contentType(ContentType.JSON)
                .when()
                .post("/person")
                .then()
                .assertThat().statusCode(HttpStatus.SC_CREATED)
                .body("$", hasKey("_id"))
                .extract()
                .path("_id");
    }

    public static void readPerson(String personId) {
        given()
                .get("/person/" + personId)
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK);
    }

    public static void deletePerson(String personId) {
        given()
                .delete("/person/" + personId)
                .then()
                .assertThat().statusCode(HttpStatus.SC_OK);
    }

    public static void updatePerson(Person person, String personId) {
        given()
                .body(person)
                .contentType(ContentType.JSON)
                .put("/person/" + personId)
                .then()
                .assertThat().statusCode(HttpStatus.SC_OK);
    }
}
