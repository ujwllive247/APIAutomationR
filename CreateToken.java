package RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CreateToken {

    public static void main(String[] args) {

        RestAssured.baseURI = "https://restful-booker.herokuapp.com";

        String payload = "{\n" +
                "  \"username\": \"admin\",\n" +
                "  \"password\": \"password123\"\n" +
                "}";

        Response response = given()
                .header("Content-Type", "application/json")
                .body(payload)
                .when()
                .post("/auth");

        String token = response.jsonPath().getString("token");

        System.out.println("Response Body: " + response.asString());
        System.out.println("Token: " + token);
    }
}
