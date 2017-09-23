package SeleniumExamples;

import org.testng.annotations.Test;
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
import org.testng.annotations.Test;

public class alert {
	
	@Test
	public void alerts() throws InterruptedException
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
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		// Click on Search Availability Service button
		 int size = driver.findElements(By.tagName("iframe")).size();
		 System.out.println(size);
		 driver.switchTo().frame("iframeResult");
		 driver.findElement(By.xpath("/html/body/button")).click();
//		 WebDriverWait wait = new WebDriverWait(driver, 20);
//		 WebElement ele= wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Hello! I am an alert box!")));
//	        System.out.println(ele.isDisplayed());
	    Thread.sleep(5000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        driver.quit();
		
	}
}
