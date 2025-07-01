package RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PartialUpdateBooking {

    public static void main(String[] args) {

        RestAssured.baseURI = "https://restful-booker.herokuapp.com/booking";

        // Example partial update payload
        String payload = "{\n" +
                "  \"firstname\" : \"Ramesh \",\n" +
                "  \"lastname\" : \"Kumar\"\n" +
                "}";

        Response response = given()
                .contentType("application/json")
                .cookie("token", "a3ec5b10a93afc4") // Use valid token
                .body(payload)
                .when()
                .patch("/3199"); // Replace 1543 with valid booking ID

        System.out.println("📦 Response:\n" + response.asPrettyString());
    }
}
