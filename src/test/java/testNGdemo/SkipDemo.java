package testNGdemo;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemo {
  @Test
   void test1 () {
	  System.out.println("executing test1.....");
  }
  
  @Test
  
  void test2() {
	  throw new SkipException("test is skipped....");
  }
}
