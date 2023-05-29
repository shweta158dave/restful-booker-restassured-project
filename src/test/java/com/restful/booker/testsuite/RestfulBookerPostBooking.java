package com.restful.booker.testsuite;

import com.restful.booker.model.RestfulBookerPojo;
import com.restful.booker.testbase.TestBase;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
public class RestfulBookerPostBooking extends TestBase {
    static ValidatableResponse response;
    @Test
    public void createBooking() {
        HashMap<String, Object> bookingDays = new HashMap<>();
        bookingDays.put("checkin", "2018-01-01");
        bookingDays.put("checkout", "2019-01-01");

        RestfulBookerPojo restfulBookingPojo = new RestfulBookerPojo();
        restfulBookingPojo.setFirstname("Donna");
        restfulBookingPojo.setLastname("Harris");
        restfulBookingPojo.setTotalprice(111);
        restfulBookingPojo.setDepositpaid(true);
        restfulBookingPojo.setBookingdates(bookingDays);
        restfulBookingPojo.setAdditionalneeds("Breakfast");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(restfulBookingPojo)
                .when()
                .post("/booking");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}
