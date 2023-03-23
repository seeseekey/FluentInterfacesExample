package org.example.fluentinterfaces;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;

class RestAssuredTests {

    @Test
    void testPiDelivery() {

        RestAssured.when()
          .get("https://api.pi.delivery/v1/pi?start=0&numberOfDigits=100").
        then()
          .statusCode(200)
          .body("content", Matchers.startsWith("31415926535897932384"));

        Matchers.startsWith("");
    }
}
