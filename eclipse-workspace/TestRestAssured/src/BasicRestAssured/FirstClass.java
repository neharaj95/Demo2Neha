package BasicRestAssured;

import io.restassured.RestAssured;
import  static io.restassured.RestAssured.*;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response=given().queryParam("key", "qaclick123").header("Content-Typ");

	}

}
