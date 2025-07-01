package RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetBooking {

    public static void main(String[] args) {

        // Set base URI
        RestAssured.baseURI = "https://restful-booker.herokuapp.com/booking";

        // Send GET request
        Response response = given()
                .when()
                .get("/3948");

        // Print response
        System.out.println("📦 Status Code: " + response.getStatusCode());
        System.out.println("🧾 Response Body:\n" + response.asPrettyString());
    }
}
