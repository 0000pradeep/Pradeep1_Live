package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class day2 {
  public WebDriver driver;
  public WebDriverWait wait;
	@Test(priority=0)
  public void test() {
		System.out.println("Test started");
		System.setProperty("webdriver.chrome.driver", "C:\\Latest drivers servers\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.navigate().to("http://www.facebook.com");
		wait.until(ExpectedConditions.titleIs(driver.getTitle()));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		System.out.println("The current  url is " +driver.getCurrentUrl());
		System.out.println("The title is " +driver.getTitle());
		System.out.println("Test completed");
		
  }
	
	@Test(priority=1)
	  public void test1() {
			driver.close();
	  }
}
