package RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class DeleteBooking {

    public static void main(String[] args) {

        RestAssured.baseURI = "https://restful-booker.herokuapp.com/booking";


        Response response = given()
                .contentType("application/json")
                .cookie("token", "f074b7cf9f92a50")
                .when()
                .delete("/1454");

        System.out.println("📦 Response Status Code: " + response.getStatusCode());
        System.out.println("🧾 Booking Id Deleted: " + response.asString());
    }
}
