package com.Git.com.EGIT;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class robot_upload {

@Test
public void upload() throws InterruptedException, AWTException
{
	System.setProperty("webdriver.chrome.driver","C:/akshay/chromedriver.exe");
	Map<String,Object> prefs = new HashMap<String,Object>();
	prefs.put("profile.default_content_setting_values.notifications", 2);
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-infobars");
	option.addArguments("--disable-geolocation");
	option.addArguments("test-type");
	option.setExperimentalOption("prefs", prefs);
	WebDriver driver = new ChromeDriver(option);
	driver.manage().window().maximize();
	StringSelection sel = new StringSelection("C:\\Users\\aksaini\\Desktop\\1.txt");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
	System.out.println("selection" +sel);
	// Open Monster.com
	 driver.get("http://my.monsterindia.com/create_account.html");
	 Thread.sleep(2000);
	 String parent = driver.getWindowHandle();
	 System.out.println("parent :  "+driver.getTitle());
	 Set<String> st = driver.getWindowHandles();
	 Iterator<String> it = st.iterator();
	 while(it.hasNext())
	 {
		 String child = it.next();
		 if(!parent.equals(child))
		 {
			 driver.switchTo().window(child);
			 System.out.println("child  :"+driver.switchTo().window(child).getTitle());
			 driver.close();
			 
		 }
		 
	 }
	 driver.switchTo().window(parent);
	 
	 // Create object of Robot class
	 Robot robot = new Robot();
	 Thread.sleep(1000);
	 
	 
	 robot.keyPress(KeyEvent.VK_DOWN);
	 robot.keyPress(KeyEvent.VK_DOWN);
	 robot.setAutoDelay(2000);
	 robot.keyPress(KeyEvent.VK_DOWN);
	 robot.keyRelease(KeyEvent.VK_DOWN);
	 // This will scroll down the page 
//	JavascriptExecutor js = (JavascriptExecutor)driver;
//	 js.executeScript("scroll(0,350)");
	 
	// Wait for 5 seconds
	 Thread.sleep(5000);
	 
	// This will click on Browse button
	 driver.findElement(By.id("wordresume")).click();
	 
	 
	 
	 System.out.println("Browse button clicked");
	 
	
	      
	  // Press Enter

	 robot.keyPress(KeyEvent.VK_ENTER);
	 
	// Release Enter
	 robot.keyRelease(KeyEvent.VK_ENTER);
	 
	  // Press CTRL+V
	 robot.keyPress(KeyEvent.VK_CONTROL);
	 robot.keyPress(KeyEvent.VK_V);
	 
	// Release CTRL+V
	 robot.keyRelease(KeyEvent.VK_CONTROL);
	 robot.keyRelease(KeyEvent.VK_V);
	 Thread.sleep(1000);
	        
	       //  Press Enter 
	 robot.keyPress(KeyEvent.VK_ENTER);
	 robot.keyRelease(KeyEvent.VK_ENTER);
	 
	 
	
	
}

}
