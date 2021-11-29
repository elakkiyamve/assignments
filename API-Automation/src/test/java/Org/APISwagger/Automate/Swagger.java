package Org.APISwagger.Automate;


import Org.APISwagger.Automate.Category;
import Org.APISwagger.Automate.PetNames;
import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Swagger {

@Test
public void testCreatingAUser(){

        PetNames petDetails=new PetNames();

        Category category=new Category();
        category.setId(0);
        category.setName("name");
        petDetails.setCategory(category);

        petDetails.setName("Doggie");

//        String[] photoUrls = {"photoUrl"};
//        petDetails.setPhotoUrls(photoUrls);
//
//        Tags[] tags = new Tags[0];
//        petDetails.setTags(tags);
//
//        petDetails.setStatus("available");

        PetNames createdPetDetails=

        given().
        contentType(ContentType.JSON).
        body(petDetails).
        log().body().
        when().
        post("https://petstore.swagger.io/v2/pet").
        as(PetNames.class);

        System.out.println(createdPetDetails.getName());

        }
     @Test
    public void testToGetUserLogin(){
        given()
                .when().get("https://petstore.swagger.io/v2/pet").
                then().assertThat().
                body(".paths['/user/login'].get.tags[0]",equalTo("name"));

    }
}
