package com.Git.com.EGIT;


import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class Chrome {

	@Test
	public void chorme()
	{

		System.setProperty("webdriver.chrome.driver","C:/akshay/chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		WebDriver driver;
		options.addArguments("--disable-infobars");

		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options); 
		driver.get("https:\\www.facebook.com");
		driver.manage().window().maximize();
		WebElement ele =driver.findElement(By.xpath("//*[@id='day']"));
		Select ab = new Select(ele);
		ab.selectByValue("24");
		WebElement elem =driver.findElement(By.xpath("//*[@id='month']"));
		Select abc = new Select(elem);
		abc.selectByValue("9");
		WebElement eleme =driver.findElement(By.xpath("//*[@id='year']"));
		Select abcd = new Select(eleme);
		abcd.selectByValue("1992");

		WebElement month_dropdown=driver.findElement(By.id("month"));

		Select month=new Select(month_dropdown);

		List<WebElement> dropdown=month.getOptions();

		for(int i=0;i<dropdown.size();i++){

			String drop_down_values=dropdown.get(i).getText();

			System.out.println("dropdown values are "+drop_down_values);

		}

		System.out.println("dencnnc");
	}


}
