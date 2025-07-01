package RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UpdateBooking {
    @Test
    public void fullUpdate(){

        RestAssured.baseURI = "https://restful-booker.herokuapp.com/booking";

        String payload  = "{\n" +
                "    \"firstname\" : \"Ujjwal\",\n" +
                "    \"lastname\" : \"Thakur\",\n" +
                "    \"totalprice\" : 222,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        Response response = given()
                .contentType("application/json")
                .cookie("token","4d6229abac9267e")
                .body(payload)
                .when().put("/1976")
                .then().statusCode(200).extract().response();

        System.out.println("Response: " + response.asString());

    }
}
