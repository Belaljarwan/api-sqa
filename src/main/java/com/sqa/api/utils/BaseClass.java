package com.sqa.api.utils;


import com.sqa.api.request.RequestBuilder;
import com.sqa.api.request.RequestExecutor;
import com.sqa.api.response.ResponseHandler;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
    public static Response RESPONSE;
    public RequestBuilder requestBuilder = new RequestBuilder();
    public RequestExecutor requestExecutor = new RequestExecutor();
    public ResponseHandler responseHandler = new ResponseHandler();
    public JSONObject requestBody = new JSONObject();

    @BeforeMethod
    public void beforeMethod() {
        RestAssured.baseURI = "https://reqres.in/api";
    }

}
