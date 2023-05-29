package com.restful.booker.testsuite;

import com.restful.booker.testbase.TestBase;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;

import static io.restassured.RestAssured.given;
public class RestfulBookerGetBookingId extends TestBase {
    static ValidatableResponse response;
    @Test
    public void getBookingId() {
        Response response = given()
                .pathParam("id", 1317)
                .when()
                .get("/booking/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }

}
