package jp.gr.java_conf.saka.controller;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

@QuarkusTest
class UserResourceTest {

  @Test
  void post() {
    given()
      .when()
      .body("{\"name\":\"hoge\"}")
      .contentType(ContentType.JSON)
      .accept(ContentType.JSON)
      .post("/user")
      .then()
      .statusCode(201)
      .body(containsString("\"name\":\"hoge\""));
  }
}
