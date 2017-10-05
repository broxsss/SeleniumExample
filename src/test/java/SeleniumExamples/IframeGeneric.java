package SeleniumExamples;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class IframeGeneric {

	WebDriver driver;
	
	@Test
	public void exampleiframe(){
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//driver//chromedriver.exe");
		Map<String,Object>  prefs = new HashMap<String,Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions option = new ChromeOptions();
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
		driver.get("http://jqueryui.com/draggable/");
		int num = findframenumber(driver,By.className("demo-frame"));
		System.out.println("iframe : "+num);
		driver.switchTo().frame(1);
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	public int findframenumber(WebDriver driver,By by)
	{
		int i;
		int framecount = driver.findElements(By.tagName("iframe")).size();
		for(i=0;i<framecount;i++)
		{
			driver.switchTo().frame(i);
			int count = driver.findElements(by).size();
			if(count>0)
			{
				break;
			}
			else{
				System.out.println("continue looping....");
			}
		}
		driver.switchTo().defaultContent();
		return i;
	}
	
}
