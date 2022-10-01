package com.sqa.api.request;


import org.json.simple.JSONObject;

public class RequestBuilder {

    String path;
    JSONObject requestBody = new JSONObject();
    HttpMethods requestMethod;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public JSONObject getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(JSONObject requestBody) {
        this.requestBody = requestBody;
    }

    public HttpMethods getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(HttpMethods requestMethod) {
        this.requestMethod = requestMethod;
    }
}
