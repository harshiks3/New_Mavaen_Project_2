package testcases;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;


public class HomePageTest {
	 HtmlUnitDriver driver;
  
  @BeforeMethod
  public void beforeTest() {
	  driver = new HtmlUnitDriver();
	  driver.get("http://localhost:9090/MevanWebAppOne/");
//	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
  }
                      
  @Test
  public void test01_titleTest() {
	  String pageTitle = driver.getTitle();
	  System.out.println("Title of this page is .........." +pageTitle);
	  Assert.assertEquals(pageTitle, "Mevan WebApp One");
//	  Assert.assertEquals(pageTitle, "Google");
	 
  }
}
