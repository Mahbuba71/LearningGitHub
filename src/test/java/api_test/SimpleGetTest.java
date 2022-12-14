package api_test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SimpleGetTest {
    private static final Logger LOGGER = LogManager.getLogger(SimpleGetTest.class);

    @Test
    public void getAllUsers() {

        LOGGER.info("----------API Test:Get ALL Users-----------");

        //Specify the base URL or endpoint of the REST API
        RestAssured.baseURI = "https://reqres.in/api/users";

        // Create an object from the RequestSpecification Class in order to send the request to the server
        // Added the server URL to make the request

        RequestSpecification httpRequest = RestAssured.given();

        // Maka a request to the server and this will return the response
        Response response = httpRequest.request(Method.GET);
        LOGGER.debug(response.getBody().asString());

        // Validating response code is 200

        Assert.assertEquals(response.getStatusCode(),200);

        JsonPath jsonPath = response.jsonPath();
        List<String> list = jsonPath.get("data.email");

        String expectedEmail = "george.bluth@reqres.in";
        boolean emailExist = list.contains(expectedEmail);

        Assert.assertTrue(emailExist,expectedEmail + "does not exist");

        LOGGER.info("----------End Test:Get ALL Users-----------");
    }
}
