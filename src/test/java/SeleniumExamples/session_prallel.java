package SeleniumExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class session_prallel {
	

	public static void main(String...strings ){
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
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("http://demo.guru99.com/V4/");
	    
	    //Second session of WebDriver
	    WebDriver  driver2 = new ChromeDriver(option); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //Goto guru99 site
	    driver2.get("http://demo.guru99.com/V4/");
	}
	}


