package com.Git.com.EGIT;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class wait {
	
	@Test
	public void allwait()
	{
		System.setProperty("webdriver.chrome.driver","C:/akshay/chromedriver.exe");
		Map<String,Object> prefs = new HashMap<String,Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions option = new  ChromeOptions();
		option.addArguments("test-type");
		option.addArguments("--disable-infobars");
		option.addArguments("--disable-geolocation");
		option.setExperimentalOption("prefs", prefs);
		WebDriver  driver = new ChromeDriver(option); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		// Click on timer button to start
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		WebDriverWait wait = new WebDriverWait( driver,20);
		// Here we will wait until element is not visible, if element is visible then it will return web element
				// or else it will throw exception
    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		 
				// if element found then we will use- In this example I just called isDisplayed method
			
		boolean status = false ;
	/*	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		status=driver.findElement(By.xpath("//p[text()='QTP']")).isDisplayed();*/
		status = element.isDisplayed();
		 AssertJUnit.assertEquals(2, 2);
				// if else condition
				if (status) {
					System.out.println("===== WebDriver is visible ======");
				} else {
					System.out.println("===== WebDriver is not visible======");
				}
		
	}

}
