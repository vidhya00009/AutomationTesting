package testNGdemo;

import org.testng.annotations.Test;

public class Groupsdemo {
	 
	@Test(groups = ("regression"))
	 
	void test1() {
		System.out.println("test1 is in regression group");
	}
	
	@Test(groups = ("regression")) 
	void test2() {
		System.out.println("test2 is in regression group");
	}
	
	@Test(groups = ("performance"))
	void test3() {
		System.out.println(" test2 is in performance group");
	}
	
	@Test(groups = ("performance"))
	void test4() {
		System.out.println("test2 is in performance group");
	}
}
