package com.brillio.frameWorkDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://ChromeDriver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		Actions action = new Actions(driver);
		WebElement webelement= driver.findElement(By.id("nav-link-accountList"));https://www.amazon.in/dp/B09V2P9C3S/?pf_rd_r=1J101DDV6ZW1NYKGTJ89&pf_rd_p=608eee05-88a9-421f-a6bc-bb7a931bb83d&pd_rd_r=ded575af-af02-4bbe-8727-c5aa7cebbdc0&pd_rd_w=3Lp8j&pd_rd_wg=LehH5&ref_=pd_gw_unk#
		action.moveToElement(webelement).contextClick()
		.build().perform();
		action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("mobile").doubleClick()
		.build().perform();
		driver.findElement(By.id("nav-search-submit-text")).click();
		
		
		
		//WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox")).
		//action.moveToElement(searchBox).build().perform();
		
	}

}
