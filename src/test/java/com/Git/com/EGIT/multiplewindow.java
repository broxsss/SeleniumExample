package com.Git.com.EGIT;

import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class multiplewindow {
	
	@Test
	public void multiplewindows()
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
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.naukri.com");
		String parent = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		Set<String> s1 =driver.getWindowHandles(); 
		Iterator<String> itr = s1.iterator();
		while(itr.hasNext())
		{
			String child = itr.next();
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
				String childs=driver.switchTo().window(child).getTitle();
				System.out.println("child  :"+childs);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		
		
	}

}
