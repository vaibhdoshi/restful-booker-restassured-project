package com.restful.booker.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class TestBase {
    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "http://restful-booker.herokuapp.com";
        RestAssured.basePath = "/apidoc/index.html";
    }


}
