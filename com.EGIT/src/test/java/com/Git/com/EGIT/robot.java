
package com.Git.com.EGIT;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class robot {
	

	@Test
	public void robots() throws InterruptedException, AWTException{
	
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
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.navigate().to("http:\\www.google.com");
	//Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("akshay");
	Actions rb = new Actions(driver);
	//Thread.sleep(4000);
	WebElement ele = driver.findElement(By.xpath("//*[@id='sbse0']/div[2]"));
	rb.moveToElement(ele).build().perform();
	rb.click().build().perform();
	Robot tb = new Robot();
	//Thread.sleep(4000);
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0,650)", "");
	//Thread.sleep(2000);
	jse.executeScript("scroll(0, -250)");
	tb.keyPress(KeyEvent.VK_PAGE_DOWN);
	//Thread.sleep(2000);
	tb.keyRelease(KeyEvent.VK_PAGE_DOWN);
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='lst-ib']")).clear();
	////tb.delay(2000);
	tb.keyPress(KeyEvent.VK_ESCAPE);
	//tb.delay(2000);
	tb.keyRelease(KeyEvent.VK_ESCAPE);
	WebElement ele1 = driver.findElement(By.xpath("//*[@id='lst-ib']"));
	rb.moveToElement(ele1).click().keyDown(ele1, Keys.SHIFT).sendKeys(ele1, "love").keyUp(ele1, Keys.SHIFT).doubleClick(ele1).build().perform();
	tb.keyPress(KeyEvent.VK_ENTER);
	//tb.delay(2000);
	tb.keyRelease(KeyEvent.VK_ENTER);
	System.out.println(ele1.getLocation());
	tb.mouseMove(166, 25); // move mouse point to specific location	
    tb.delay(1500);
    tb.keyPress(KeyEvent.VK_BACK_SPACE);
    tb.delay(1000);
    tb.keyPress(KeyEvent.VK_BACK_SPACE);
    tb.delay(1000);;
    tb.keyPress(KeyEvent.VK_BACK_SPACE);
    tb.delay(1000);;
    tb.keyPress(KeyEvent.VK_BACK_SPACE);
    tb.delay(1000);
    tb.keyRelease(KeyEvent.VK_BACK_SPACE);
    tb.delay(1000);
    rb.keyDown(ele1,Keys.SHIFT).sendKeys(ele1, "aayushi").keyUp(ele1, Keys.SHIFT).build().perform();
    tb.delay(2000);
    WebElement ele2=driver.findElement(By.xpath("//*[@id='_fZl']/span"));
    System.out.println(ele2.getLocation()); 
    tb.delay(1000);
    tb.keyPress(KeyEvent.VK_ENTER);
   // tb.mouseMove(736,18);
	tb.mousePress(InputEvent.BUTTON1_DOWN_MASK); // press left click	
    tb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // release left click	
    //tb.delay(1500);	
    tb.mousePress(InputEvent.BUTTON3_DOWN_MASK);
    tb.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
	driver.close();
	
	
	
	
	
	
}
}