package com.restful.booker.testsuite;

import com.restful.booker.testbase.TestBase;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RestfulBookerGetBooking extends TestBase {
    static ValidatableResponse response;
    @Test
    public void getBookingList() {
        Response response = given()
                .pathParam("id", 974)
                .when()
                .get("/booking/{id}");
        response.then().statusCode(200);
        System.out.println("Booking 2934 is deleted");
        response.prettyPrint();



    }
}
