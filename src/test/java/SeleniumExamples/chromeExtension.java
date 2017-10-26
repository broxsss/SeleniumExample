package SeleniumExamples;
import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class chromeExtension {
	 WebDriver  driver ;
 
     
         @Test
	     public void openFireFoxWithFirebug() throws InterruptedException {
	    	 System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//driver//geckodriver.exe");
	         String firebugFilePath = System.getProperty("user.dir")+"\\driver\\jid1-RMaoH9zYsFXFcg@jetpack.xpi";
//	         FirefoxProfile profile = new FirefoxProfile();
//	         profile.addExtension(new File(firebugFilePath));
//	         driver = new FirefoxDriver(profile);
	        // FirefoxProfile profile = new FirefoxProfile();
	         ProfilesIni firProfiles = new ProfilesIni();
	         //Get access of newly created profile WebDriver_Profile.
	         FirefoxProfile profile = firProfiles.getProfile("akshayautomation");
	         profile.setPreference("xpinstall.signatures.required", false);
	         profile.setPreference("security.mixed_content.block_active_content", false);
	         profile.setPreference("security.mixed_content.block_display_content", true);
	         profile.setPreference(" xpinstall.customConfirmationUI", false);
	         profile.setPreference("services.sync.prefs.sync.xpinstall.whitelist.required", false);
	         profile.setPreference("security.xpconnect.plugin.unrestricted", false);
	         profile.setPreference("security.csp.experimentalEnabled", true);
	        
	       //  driver = new FirefoxDriver(profile);
	         DesiredCapabilities cap = new DesiredCapabilities();
	         cap.setCapability(CapabilityType.ENABLE_PROFILING_CAPABILITY, profile);
	         driver = new FirefoxDriver(cap);
	         driver.manage().window().maximize();
	    	 driver.get("https://whatfix.com/community/#!flows/how-to-browse-an-article-on-wikipedia/a6dcc0c0-b4a8-11e7-aa36-82ae84f41eba/");
	    	 Thread.sleep(5000);
	    	 driver.findElement(By.id("plus_flow")).click();
	    	 Thread.sleep(5000);
	    	 
	    	 driver.findElement(By.xpath("//*[@id='screen1600']/div[4]/div/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
	    	 Thread.sleep(5000);
	    	 
	    	 Set handles1 = driver.getWindowHandles();
	    	  System.out.println(handles1);
	    	  Thread.sleep(5000);
	    	 driver.findElement(By.id("wfx-dashboard-see-live")).click();
	    	  

	    	  Thread.sleep(5000);
	    	  /*Set handles = driver.getWindowHandles();
	    	  System.out.println(handles);
	    	  for (String handle1 : driver.getWindowHandles()) {

	    	      System.out.println(handle1);

	    	      driver.switchTo().window(handle1);

	    	}*/
	    	  Thread.sleep(3000);
	    	  WebDriverWait wait = new WebDriverWait(driver, 20);
	    	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wfx-tooltip-title")));
	    	  String tooltip1p1 = driver.findElement(By.id("wfx-tooltip-title")).getText();
	    	  System.out.println(tooltip1p1);
	    	  String c1 =driver.findElement(By.xpath("//table[@class='WFPLFU']")).getCssValue("background-color");
	    	  String c2 =driver.findElement(By.xpath("//table[@class='WFPLFU']")).getAttribute("style");
	    	  System.out.println(c1+"    "+c2);
	    	  String tooltip1p2 = driver.findElement(By.xpath("//div[@class='WFPLDU']/table/tbody/tr[2]/td/div")).getText();
	    	 // String tooltip1p2 = driver.findElement(By.className("WFPLDU")).getText();
	    	  System.out.println(tooltip1p2);
	    	  driver.findElement(By.xpath("//a[@id='js-link-box-en']/strong")).click();
	    	  WebDriverWait wait1 = new WebDriverWait(driver, 20);
	    	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("wfx-tooltip-title")));
	    	  String tooltip2p1 = driver.findElement(By.id("wfx-tooltip-title")).getText();
	    	  System.out.println(tooltip2p1);
	    	  String c3 =driver.findElement(By.xpath("//table[@class='WFPLFU']")).getCssValue("background-color");
	    	  String c4 =driver.findElement(By.xpath("//table[@class='WFPLFU']")).getAttribute("style");
	    	  System.out.println(c3+"    "+c4);
	    	  String tooltip2p2 = driver.findElement(By.xpath("//div[@class='WFPLDU']/table/tbody/tr[2]/td/div")).getText();
	    	  System.out.println(tooltip2p2);
	    	  Thread.sleep(6000);
	    	  driver.findElement(By.xpath("//div[@id='simpleSearch']/input")).sendKeys("test");
	    	  WebDriverWait wait3 = new WebDriverWait(driver, 20);
	    	  wait3.until(ExpectedConditions.invisibilityOfElementLocated(By.id("wfx-tooltip-title")));
	    	  Actions action = new Actions(driver);
	    	  action.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
	    	  Thread.sleep(3000);
	    	  WebDriverWait wait4 = new WebDriverWait(driver, 20);
	    	  wait4.until(ExpectedConditions.visibilityOfElementLocated(By.id("wfx-tooltip-title")));
	    	  String tooltip3p1 = driver.findElement(By.id("wfx-tooltip-title")).getText();
	    	  System.out.println(tooltip3p1);
	    	  String c5 =driver.findElement(By.xpath("//table[@class='WFPLFU']")).getCssValue("background-color");
	    	  String c6 =driver.findElement(By.xpath("//table[@class='WFPLFU']")).getAttribute("style");
	    	  System.out.println(c5+"    "+c6);
	    	  String tooltip3p2 = driver.findElement(By.xpath("//div[@class='WFPLDU']/table/tbody/tr[2]/td/div")).getText();
	    	  System.out.println(tooltip3p2);
	    	  Thread.sleep(4000);
	    	  driver.findElement(By.xpath("//a[@class='WFPLOT']")).click();
	    	  Thread.sleep(5000);
	    	  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='WFPLKS WFPLAT']")));
	    	  WebDriverWait wait6 = new WebDriverWait(driver, 20);
	    	  wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='WFENIS']/div")));
	    	  System.out.println(driver.findElement(By.xpath("//div[@class='WFENIS']/div")).getText());
	    	  driver.findElement(By.xpath("//button[@class='WFENHM WFENNS']")).click();
	    	  driver.switchTo().defaultContent();
	    	  driver.close();
	    
	    	  driver.quit();
	    	  
         }
     
 
}