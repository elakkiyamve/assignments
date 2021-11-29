
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import io.restassured.filter.log.LogDetail;
import org.junit.Test;
import org.junit.runner.RunWith;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
public class GetStationDataOn15thApril {

   // @Test
    public void testGetStationDataOn15thAprilAndValidateForStatusCode(){
        given()
        .when().get("https://api.bart.gov/api/route.aspx?cmd=routes&key=MW9S-E7SL-26DU-VV8V&json=y&date=04/15/2021").
              then().log().body()
                .log().ifValidationFails(LogDetail.BODY).statusCode(200)
            .assertThat().statusCode(200);
    }


   // @Test
    public void testToCheckTheSecondRowTheColorBeige(){
        given()
                .when().get("https://api.bart.gov/api/route.aspx?cmd=routes&key=MW9S-E7SL-26DU-VV8V&json=y&date=04/15/2021").
                then().assertThat().

                body("root.routes.route[0].name",equalTo("")).
                body("root.routes.route",hasSize(12)).
                body("root.routes.route.routeID",hasItem("ROUTE 19")).
                body("root.routes.route.routeID",not(hasItem("ROUTE 100")));
    }

   // @Test
    public void testToGetSecondRowTheColorBeige(){
        given()
                .when().get("https://api.bart.gov/api/route.aspx?cmd=routes&key=MW9S-E7SL-26DU-VV8V&json=y&date=04/15/2021").
                then().assertThat().
            body("root.routes.route[0].color",equalTo("BEIGE"));

    }

}
