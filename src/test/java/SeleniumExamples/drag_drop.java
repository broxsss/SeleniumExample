package SeleniumExamples;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class drag_drop {

	
	
	
	@Test
	public void dragNdrop() throws InterruptedException, AWTException
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
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	 
	// Open webpage
	driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
	 
	// Add 5 seconds wait
	Thread.sleep(5000);
	 
	// Create object of actions class
	Actions act=new Actions(driver);
	 
	// find element which we need to drag
	WebElement drag=driver.findElement(By.xpath(".//*[@id='draggable']"));
	 
	// find element which we need to drop
	WebElement drop=driver.findElement(By.xpath(".//*[@id='droppable']"));
	 
	// this will drag element to destination
	act.dragAndDrop(drag, drop).build().perform();
	driver.quit();
}
}
