package tests.testng.api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ChuckNorris {
    private static final Logger LOGGER = LogManager.getLogger(ChuckNorris.class);
    RequestSpecification requestSpecRandom = new RequestSpecBuilder()
            .setBaseUri("https://api.chucknorris.io/jokes/random")
            .setAccept(ContentType.JSON)
            .setContentType(ContentType.JSON)
            .log(LogDetail.ALL)
            .build();

    RequestSpecification requestSpecNoUrl = new RequestSpecBuilder()
            .setAccept(ContentType.JSON)
            .setContentType(ContentType.JSON)
            .log(LogDetail.ALL)
            .build();

    @Test
    public void retrieveRandomJoke() {
        String randomJoke = RestAssured.given()
                .spec(requestSpecRandom)
                .when()
                .get()
                .then()
                .extract().body().asString();
        LOGGER.info(randomJoke);
    }

    @Test
    public void retrieveResultOfFreeSearch() {
        String searchResult = RestAssured.given()
                .spec(requestSpecNoUrl)
                .when()
                .get("https://api.chucknorris.io/jokes/search?query=individual")
                .then()
                .extract().body().asString();
        LOGGER.info(searchResult);
    }

    @Test
    public void retrieveListOfCategories() {
        Response categoriesList = RestAssured.given()
                .spec(requestSpecNoUrl)
                .when()
                .get("https://api.chucknorris.io/jokes/categories");
        String categories = categoriesList.asString();
        LOGGER.info(categories);
    }

}
