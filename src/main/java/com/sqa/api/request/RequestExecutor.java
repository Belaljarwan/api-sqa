package com.sqa.api.request;


import io.restassured.http.ContentType;

import static com.sqa.api.utils.BaseClass.RESPONSE;
import static io.restassured.RestAssured.given;

public class RequestExecutor {


    public void request(RequestBuilder requestBuilder) {

        switch (requestBuilder.getRequestMethod()) {

            case GET:
                RESPONSE = given().body(requestBuilder.getRequestBody().toJSONString()).contentType(ContentType.JSON).get(requestBuilder.getPath());
                break;
            case POST:
                RESPONSE = given().body(requestBuilder.getRequestBody().toJSONString()).contentType(ContentType.JSON).post(requestBuilder.getPath());
                break;
            case PUT:
                RESPONSE = given().body(requestBuilder.getRequestBody().toJSONString()).contentType(ContentType.JSON).put(requestBuilder.getPath());
                break;
            case DELETE:
                RESPONSE = given().body(requestBuilder.getRequestBody().toJSONString()).contentType(ContentType.JSON).delete(requestBuilder.getPath());
                break;

        }

    }
}
