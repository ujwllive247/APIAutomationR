package RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CreateBooking {

    public static void main(String[] args) {

        RestAssured.baseURI = "https://restful-booker.herokuapp.com";

        String payload = "{\n" +
                "  \"firstname\": \"ujjwal\",\n" +
                "  \"lastname\": \"Brown\",\n" +
                "  \"totalprice\": 111,\n" +
                "  \"depositpaid\": true,\n" +
                "  \"bookingdates\": {\n" +
                "    \"checkin\": \"2018-01-02\",\n" +
                "    \"checkout\": \"2019-01-01\"\n" +
                "  },\n" +
                "  \"additionalneeds\": \"Breakfast\"\n" +
                "}";

        Response response = given()
                .header("Content-Type", "application/json")
                .body(payload)
                .when()
                .post("/booking");

        System.out.println("📦 Response:\n" + response.asPrettyString());
    }
}
