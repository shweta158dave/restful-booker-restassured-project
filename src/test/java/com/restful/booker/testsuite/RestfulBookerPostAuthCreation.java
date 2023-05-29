package com.restful.booker.testsuite;

import com.restful.booker.model.RestfulBookerPojo;
import com.restful.booker.testbase.TestBase;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;

import static io.restassured.RestAssured.given;
public class RestfulBookerPostAuthCreation extends TestBase {
    static ValidatableResponse response;
    @Test
    public void createBookingToken() {

        RestfulBookerPojo restfulBookingPojo = new RestfulBookerPojo();
        restfulBookingPojo.setUsername("admin");
        restfulBookingPojo.setPassword("password123");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(restfulBookingPojo)
                .when()
                .post("/auth");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}
