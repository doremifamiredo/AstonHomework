package data;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class APIHelper {
    private static final RequestSpecification requestSpec = new RequestSpecBuilder()
            .setBaseUri("https://postman-echo.com")
            .setAccept(ContentType.JSON)
            .setContentType(ContentType.JSON)
            .log(LogDetail.ALL)
            .build();

    public APIHelper() {
    }

    public DataHelper.Woops requestWoops() {
        return given()
                .spec(requestSpec)
                .body(DataHelper.getArgs())
                .when().log().body()
                .get("/get")
                .then().log().body()
                .statusCode(200)
                .extract()
                .body().as(DataHelper.Woops.class);
    }

    public DataHelper.RawText requestRawText(String body) {
        return given()
                .spec(requestSpec)
                .body(body)
                .when().log().body()
                .post("/post")
                .then().log().body()
                .statusCode(200)
                .extract().body().as(DataHelper.RawText.class);
    }

    public void requestFormData() {
        given()
                .spec(requestSpec)
                .contentType(ContentType.MULTIPART)
                .multiPart("foo1", "bar1")
                .multiPart("foo2", "bar2")
                .post("/post")
                .then().log().body()
                .statusCode(200)
                .assertThat()
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.connection", equalTo("close"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("url", equalTo("https://postman-echo.com/post"));
    }

    public void requestPut(String text) {
        given()
                .spec(requestSpec)
                .body(text)
                .when().log().body()
                .put("/put")
                .then().log().body()
                .statusCode(200)
                .assertThat()
                .body("data", equalTo(text))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.connection", equalTo("close"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("url", equalTo("https://postman-echo.com/put"));
    }

    public void requestPatch(String text) {
        given()
                .spec(requestSpec)
                .body(text)
                .when().log().body()
                .patch("/patch")
                .then().log().body()
                .statusCode(200)
                .assertThat()
                .body("data", equalTo(text))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.connection", equalTo("close"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("url", equalTo("https://postman-echo.com/patch"));
    }

    public void requestDelete(String text) {
        given()
                .spec(requestSpec)
                .body(text)
                .when().log().body()
                .delete("/delete")
                .then().log().body()
                .statusCode(200)
                .assertThat()
                .body("data", equalTo(text))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.connection", equalTo("close"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("url", equalTo("https://postman-echo.com/delete"));
    }
}
