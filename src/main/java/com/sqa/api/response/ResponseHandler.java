package com.sqa.api.response;


import java.util.concurrent.TimeUnit;

import static com.sqa.api.utils.BaseClass.RESPONSE;

public class ResponseHandler {

    public int getStatusCode() {
        return RESPONSE.getStatusCode();
    }

    public String getResponseBody() {
        return RESPONSE.getBody().asString();
    }

    public Object getResponseValue(String key) {
        return RESPONSE.getBody().jsonPath().get(key);
    }

    public long getResponseTime() {
        return RESPONSE.getTimeIn(TimeUnit.MILLISECONDS);
    }

}
