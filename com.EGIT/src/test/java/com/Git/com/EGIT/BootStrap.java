package com.Git.com.EGIT;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BootStrap {

	@Test
	public void Bootstrapfun() throws InterruptedException{

		System.setProperty("webdriver.chrome.driver","C:/akshay/chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		WebDriver driver;
		options.addArguments("--disable-infobars");

		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options); 
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='menu1']")).click();
		List <WebElement> list =driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
	
		for(WebElement ele:list)
		{
			System.out.println("details attribute :"+ele.getAttribute("innerHTML"));
			
			
			if(ele.getAttribute("innerHTML").contains("JavaScript"))
			{
				Thread.sleep(5000);
				ele.click();
				break;
			}
		}
		
		

	}
}






