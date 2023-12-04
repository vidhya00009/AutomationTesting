package testNGdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	
	int i = 9;
	boolean b= true;//actual value
  @Test
  public void check () {
	  
	  //instead of "if condition" 
	  
	  //Assert.assertEquals(i, 6, "passed"); // i----> is not matched so the o/p is failled
	  
	 // Assert.assertEquals(b, false);
	  Assert.assertNotEquals(b, true);
	  
  }
}
