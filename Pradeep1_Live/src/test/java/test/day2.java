package test;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
 
	@Test
  public void test() {
		System.out.println("Test");
		
  }
	
	@BeforeTest
	  public void beforetest() {
		System.out.println("Before Test");
	  }
	@AfterTest
	  public void aftertest() {
		System.out.println("After Test");
	  }
	
	@AfterMethod
	  public void aftermethod() {
		System.out.println("After Method");
	  }
	@BeforeMethod
	  public void beforemethod() {
		System.out.println("Before Method");
	  }
	@BeforeSuite
	  public void beforesuite() {
		System.out.println("Before Suite");
	  }
	
	@AfterSuite
	  public void aftersuite() {
		System.out.println("After Suite");
	  }
	
	@BeforeClass
	  public void beforeclass() {
		System.out.println("Before Class");
	  }
	
	@AfterClass
	  public void afterclass() {
		System.out.println("After Class");
	  }

}
