package webdriver.api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class MyRestAzure {
    public static void main(String[] args) {
        RequestSpecification requestSpec = new RequestSpecBuilder()
                .setBaseUri("http://178.124.206.46:8001/app/ws/")
                .setAccept(ContentType.JSON).setContentType(ContentType.JSON)
                .log(LogDetail.ALL).build();
        String testing = RestAssured
                .given()

                .spec(requestSpec)
                .body(new Search("a", true))
                .when()
                .post()
                .then()
                //.extract().body().as(webdriver.api.Search.class)
                .extract().body().asString();
        // .statusCode(300);
        System.out.println(testing);

    }

}
