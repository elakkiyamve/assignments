package Org.APIAutomate;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class SerialDeserial {


    @Test
    public void testCreatingAUserAndValidatingStatusCode() {

        UserDetails userDetails = new UserDetails();
        userDetails.setName("Test");
        userDetails.setJob("Testing");

        Response response =

                given().
                        contentType(ContentType.JSON).
                        body(userDetails).
                        log().body().
                        when().
                        post("https://reqres.in/api/users").
                        then().
                        assertThat().
                        statusCode(201).
                        extract().response();

        System.out.println("Response is : " + response.asPrettyString());
    }
    @Test
    public void serialAndDeserial() {

        UserDetails userDetails = new UserDetails();
        userDetails.setName("Test");
        userDetails.setJob("Testing");
        CreatedUserDetails createdUserDetails =
                given().
                        contentType(ContentType.JSON).
                        body(userDetails).
                        log().body().
                        when().
                        post("https://reqres.in/api/users").


                   as(CreatedUserDetails.class);
        System.out.println(createdUserDetails);

        Assert.assertEquals(
                "Test",
                createdUserDetails.getName());
       // System.out.println(createdUserDetails.getId() + createdUserDetails.getCreatedAT());
    }

}

