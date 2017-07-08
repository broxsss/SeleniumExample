package com.Git.com.EGIT;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class iframes {


	@Test
	public void frames()
	{
		System.setProperty("webdriver.chrome.driver", "C:/akshay/chromedriver.exe");
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
		 driver.get("http://demo.guru99.com/selenium/guru99home/"); 
		System.out.println(driver.findElement(By.xpath("//*[@id='rt-mainbody']/div/article/h3")).getLocation());
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("scroll(0,2367)");
		int size = driver.findElements(By.tagName("iframe")).size();
	    System.out.println("Total Frames --" + size);
	  //Commented the code for finding the index of the element
	    driver.switchTo().frame(1); //Switching to the frame
		System.out.println("********We are switched to the iframe*******");
		driver.findElement(By.xpath("html/body/a/img")).click();
		
		//Clicking the element in line with Advertisement
	    System.out.println("*********We are done***************");
	   // driver.switchTo().defaultContent();
	    System.out.println(driver.getTitle());
	    }
	

}
