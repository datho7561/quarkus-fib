package com.datho7561.fib;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class FibonacciEndpointTest {

	@Test
	public void integrationTest() {
		given().when().get("/fibonacci").then().statusCode(200)
				.body(is("[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377]"));
	}

}