package testNGdemo;

import org.testng.annotations.Test;

//Run All

public class testng1 {
	@Test(priority =1)
	
	//Run | Debug
	
	public void method1() {
		System.out.println("I am in Inside");
	}
	
@Test(priority = 2)
	
	//Run | Debug
	
	public void method2() {
		System.out.println("I am in outside");
	}
	
@Test(priority = 3)

//Run | Debug

	public void method3() {
	System.out.println("I am nowhere ");
	}
}
