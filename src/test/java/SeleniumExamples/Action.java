package SeleniumExamples;

	import java.awt.List;
import java.util.HashMap;
	import java.util.Map;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
    import org.openqa.selenium.interactions.Actions;
    import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
	
	public class Action {
		WebDriver driver;
		IframeGeneric iframe = new IframeGeneric();
	@Test
		public void check_action() throws InterruptedException{

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//driver//chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
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
		String parentWindow = driver.getWindowHandle();
		System.out.println("parentWindow     ::::"+parentWindow);
			driver.manage().window().maximize();
			Thread.sleep(5000);
			int size = driver.findElements(By.tagName("iframe")).size();
		    System.out.println("Total Frames --" + size);
			Actions act=new Actions(driver);
			int num = iframe.findframenumber(driver,By.className("demo-frame"));
			System.out.println("iframe : "+num);
			driver.switchTo().frame(0);
			WebElement drag =driver.findElement(By.xpath("//*[@id='draggable']"));
			System.out.println(driver.findElement(By.id("draggable")).getLocation());
			System.out.println(driver.findElement(By.xpath("//*[@id='draggable']/p")).getText());
			Thread.sleep(4000);
			act.clickAndHold(drag).moveByOffset(33,33).build().perform();
			Thread.sleep(4000);
			driver.switchTo().parentFrame();
			//driver.switchTo().window(parentWindow);
			//driver.switchTo().defaultContent();
			driver.quit();
			driver = new ChromeDriver(capabilities);
			driver.manage().window().maximize();
			driver.get("http://jqueryui.com/droppable/");
			int number = iframe.findframenumber(driver,By.className("demo-frame"));
			System.out.println("iframe : "+number);
			driver.switchTo().frame(0);
			Thread.sleep(3000);
			Actions acts=new Actions(driver);
			acts.dragAndDrop(driver.findElement(By.xpath(".//*[@id='draggable']")), driver.findElement(By.xpath(".//*[@id='droppable']"))).build().perform();
			Thread.sleep(3000);
			driver.switchTo().defaultContent();
			
			
		}

	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	
	
	}

