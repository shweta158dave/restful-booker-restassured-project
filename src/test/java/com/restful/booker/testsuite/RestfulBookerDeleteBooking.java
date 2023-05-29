package com.restful.booker.testsuite;

import com.restful.booker.testbase.TestBase;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;

import static io.restassured.RestAssured.given;
public class RestfulBookerDeleteBooking extends TestBase {
    static ValidatableResponse response;
    @Test
    public void deleteBooking() {
        Response response = given()
                .auth().preemptive().basic("admin", "password123")
                .pathParam("id", 3259)
                .when()
                .delete("/booking/{id}");
        response.then().statusCode(201);
        response.prettyPrint();

    }
}
