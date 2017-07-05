package com.Git.com.EGIT;

	import java.util.HashMap;
	import java.util.Map;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
	
	public class Action {
		
	
	public static void main(String args[]) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver","C:/akshay/chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions option = new ChromeOptions();
		WebDriver driver;
		option.addArguments("test-type");
		option.addArguments("--disable-geolocation");
		option.addArguments("--disable-infobars");
		//option.addArguments("--disable-popup-blocking");
		option.setExperimentalOption("prefs",prefs);
		option.addArguments("--disable-popup");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, option);
		driver = new ChromeDriver(capabilities);
		driver.manage().window().maximize();
		//driver.get("http://www.naukri.com");
		// Type something on Skill textbox
		driver.get("http://www.google.com");
			driver.manage().window().maximize();
			Actions act=new Actions(driver);
			act.contextClick().perform();
		}

		
		
		
	}

