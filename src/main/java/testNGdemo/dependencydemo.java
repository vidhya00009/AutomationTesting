package testNGdemo;

import org.testng.annotations.Test;

public class dependencydemo {
	
	@Test
	void insert_card() {
		System.out.println(" Insert the card");
	}
	
	@Test(dependsOnMethods = "insert_card")
	void enter_credentials() {
		System.out.println("Enter the credentials");
	}
	
	@Test(enabled = false ,dependsOnMethods = "enter_credentials")
	void check_bal() {
		System.out.println("Check the balance");
	}
	
	@Test(dependsOnMethods = "enter_credentials")
	void retrive_money() {
		System.out.println("Retrive the money");
	}
}
