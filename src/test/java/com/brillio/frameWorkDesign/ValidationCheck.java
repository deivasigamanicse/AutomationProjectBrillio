package com.brillio.frameWorkDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidationCheck {
	
	@Test
	
	  public void validationOne() { WebDriverManager.chromedriver().setup();
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--disable-notifications");
	  
	  WebDriver driver = new ChromeDriver(options);
	  driver.get("https://demo.openemr.io/b/openemr");
	  driver.findElement(By.id("authUser")).sendKeys("admin");
	  driver.findElement(By.id("clearPass")).sendKeys("pass");
	  driver.findElement(By.id("login-button")).click();
	  
	  String title = driver.getTitle(); Assert.assertEquals(title, "OpenEmr"); }
	 @Test
	public void invalidCred() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.openemr.io/b/openemr");
		driver.findElement(By.id("authUser")).sendKeys("addadfggadgmin12345");
		driver.findElement(By.id("clearPass")).sendKeys("padfsadadss");
		String invalidCred = driver.findElement(By.xpath("//div[contains(text(),'Invalid username)]")).getText();
		
		Assert.assertEquals(invalidCred, "invalid");
		
	}
}
