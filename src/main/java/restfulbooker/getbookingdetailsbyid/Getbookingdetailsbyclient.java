package restfulbooker.getbookingdetailsbyid;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Getbookingdetailsbyclient
{
 public BookingdetailsResponse getDetailsById(int id)
 {
   String url = String.format("%s/booking/%d","https://restful-booker.herokuapp.com",id);
Response response =given()
        .contentType("application/json")
        .when()
        .get(url)
        .then()
        .log().all()
        .extract().response();
BookingdetailsResponse bookingdetailsResponse =response.as(BookingdetailsResponse.class);
     bookingdetailsResponse.setHttpstatuscode(response.getStatusCode());
return bookingdetailsResponse;

 }
}
