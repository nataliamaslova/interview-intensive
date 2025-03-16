package org.example;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.example.api.PersonRequests;
import org.example.api.models.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class SimpleTest {

    @BeforeAll
    public static void setupTests() {
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        RestAssured.baseURI = "https://crudcrud.com/api/9e82f533436741a4a0936b2d6cdebbc3";
    }

    @Test
    public void userShouldBeAbleCreatePerson() {
        Person person = Person.builder().name("Kate Semina").age(27).build();
        PersonRequests.createPerson(person);
    }

    @Test
    public void userShouldBeAbleDeletePerson() {
        // 1. Create Person
        Person person = Person.builder().name("Kate Semina").age(27).build();
        PersonRequests.createPerson(person);

        // 2. Delete Person
        PersonRequests.deletePerson(person.getId());

        // 3. Verify that Person is not existed anymore
        given()
                .contentType(ContentType.JSON)
                .get("/person/" + person.getId())
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_NOT_FOUND);
       }

    @Test
    public void userShouldBeAbleUpdatePerson() {
        // 1. Create Person
        Person person = Person.builder().name("Kate Semina").age(27).build();
        PersonRequests.createPerson(person);

        // 2. Update Person
        PersonRequests.updatePerson(person, person.getId());

        // 3. Verify that Person is updated
        Integer age = given()
                .get("/person/" + person.getId())
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .path("age");
        Assertions.assertEquals(28, age);
    }

    @Test
    public void userShouldBeAbleReadPerson() {
        // 1. Create Person
        Person person = Person.builder().name("Kate Semina").age(27).build();
        PersonRequests.createPerson(person);

        // 2. Read Person
        PersonRequests.readPerson(person.getId());
    }
}
