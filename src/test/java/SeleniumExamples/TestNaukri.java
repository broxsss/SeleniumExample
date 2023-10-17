package SeleniumExamples;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestNaukri {

@Test
public void TestPopUp() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","/Users/sainaks/Documents/selenium/chromedriver-mac-x64/chromedriver");
	Map<String, Object> prefs = new HashMap<String, Object>();
	prefs.put("profile.default_content_setting_values.notifications", 2);
	prefs.put("profile.default_content_settings.geolocation", 1);
	ChromeOptions option = new ChromeOptions();
	WebDriver driver;
	option.addArguments("test-type");
	option.addArguments("--disable-geolocation");
	option.addArguments("--enable-strict-powerful-feature-restrictions");
	option.addArguments("--disable-infobars");
	option.addArguments("--disable-popup-blocking");
	option.setExperimentalOption("prefs",prefs);
	
	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	capabilities.setCapability(ChromeOptions.CAPABILITY, option);
	driver = new ChromeDriver(capabilities);
	driver.manage().window().maximize();

// Load app
driver.get("http://www.naukri.com/");
System.out.println(System.getProperty("my.value"));
System.out.println(System.getProperty("buildDirectory"));

// It will return the parent window name as a String
String parent=driver.getWindowHandle();

// This will return the number of windows opened by Webdriver and will return Set of St//rings
Set<String>s1=driver.getWindowHandles();

System.out.println(s1);

// Now we will iterate using Iterator
Iterator<String> I1= s1.iterator();

while(I1.hasNext())
{

   String child_window=I1.next();

// Here we will compare if parent window is not equal to child window then we            will close

if(!parent.equals(child_window))
{
driver.switchTo().window(child_window);

System.out.println(driver.switchTo().window(child_window).getTitle());

driver.close();
}

}
// once all pop up closed now switch to parent window
driver.switchTo().window(parent);
System.out.println(driver.getTitle());
System.out.println("reached here");
driver.findElement(By.xpath("//div[@id='qsbClick']")).click();
driver.findElement(By.xpath("//input[@name='qp']")).sendKeys("testing");
Thread.sleep(5000);
boolean ab = driver.getPageSource().contains("You can turn them off anytime from browser settings");
Actions actions = new Actions(driver);
WebElement element = driver.findElement(By.xpath("//ul[@class='Sdrop']"));
//actions.moveToElement(element);
System.out.println("reached here1   "+ab);
Thread.sleep(2000);
//actions.build().perform();

// use Mouse hover action for that element
actions.moveToElement(element).build().perform();

// Give wait for 2 seconds 
Thread.sleep(2000);

// finally click on that element
actions.click(element).build().perform();

WebElement elem = driver.findElement(By.xpath("//button[@id='qsbFormBtn']"));
actions.click(elem).build().perform();
driver.quit();

}
}
