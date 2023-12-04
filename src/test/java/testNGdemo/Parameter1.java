package testNGdemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter1 {

	@Test
	@Parameters("name1")
	void display(String name) {
		System.out.println("vidya"+name);
	}



}
