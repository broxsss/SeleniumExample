package com.Git.com.EGIT;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class HighLightMe {

 public static void main(String[] args) throws InterruptedException {
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
  //Open Application
  driver.navigate().to("http://www.uftHelp.com");
  //Find the element to highlight
  WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
  //Function call to Highlight the element
  fnHighlightMe(driver,element);
 }

 public static void fnHighlightMe(WebDriver driver,WebElement element) throws InterruptedException{
  //Creating JavaScriptExecuter Interface
   JavascriptExecutor js = (JavascriptExecutor)driver;
   for (int iCnt = 0; iCnt < 3; iCnt++) {
      //Execute javascript
         js.executeScript("arguments[0].style.border='4px groove green'", element);
         Thread.sleep(1000);
         js.executeScript("arguments[0].style.border=''", element);
   }
 }
 
}