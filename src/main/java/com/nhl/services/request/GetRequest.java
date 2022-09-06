package com.nhl.services.request;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GetRequest {

    public static void main(String args[]){
        RestAssured.baseURI = "https://api.itbook.store/";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET,"1.0/search/9781484206485");

        System.out.println(response.getStatusCode());

        Headers headerResponse = response.getHeaders();
        System.out.println(headerResponse);

        ResponseBody bodyResponse = response.getBody();
        System.out.println(bodyResponse.prettyPeek());
    }
}
