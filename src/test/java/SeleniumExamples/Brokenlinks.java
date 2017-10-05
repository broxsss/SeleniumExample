package SeleniumExamples;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

import java.net.HttpURLConnection;
import java.net.URL; 
import java.util.ArrayList;
import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.restassured.response.Response;

import org.openqa.selenium.WebElement;


 
public class Brokenlinks {
 
  public static List findAllLinks(WebDriver driver)
 
  {
 
	  List<WebElement> elementList = new ArrayList();
 
	  elementList = driver.findElements(By.tagName("a"));
 
	  elementList.addAll(driver.findElements(By.tagName("img")));
 
	  List finalList = new ArrayList(); ;
 
	  for (WebElement element : elementList)
 
	  {
 
		  if(element.getAttribute("href") != null)
 
		  {
 
			  finalList.add(element);
 
		  }		  
 
	  }	
 
	  return finalList;
 
  }
 
	public static String isLinkBroken(URL url) throws Exception
 
	{
 
		//url = new URL("http://yahoo.com");
 
		String response = "";
 
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
 
		try
 
		{
 
		    connection.connect();
 
		     response = connection.getResponseMessage();	        
 
		    connection.disconnect();
 
		    return response;
 
		}
 
		catch(Exception exp)
 
		{
 
			return exp.getMessage();
 
		}  				
 
	}
	
	public static String isLinkBroke(String url) throws Exception
	 
	{
		
		//System.out.println("\""+url+"\"");
		Response res = given().when().get(url);
    	 
		
		
		
		return res.getStatusLine();
 
	
	}
	public static void main(String[] args) throws Exception {
 
		// TODO Auto-generated method stub
 
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//driver//chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		WebDriver ff = null;
		options.addArguments("--disable-infobars");
         
		options.setExperimentalOption("prefs", prefs);
		ff = new ChromeDriver(options); 
		ff.manage().window().maximize();
			ff.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
 
			 List<WebElement> allImages = findAllLinks(ff);    
 
		    System.out.println("Total number of elements found " + allImages.size());
 
		    for( WebElement element : allImages){
 
		    	try
 
		    	{
		    		//System.out.println(element.getAttribute("href"));
			       // System.out.println("URL: " + element.getAttribute("href")+ " returned " + isLinkBroken(new URL(element.getAttribute("href"))));
 
		    		System.out.println("URL: " + element.getAttribute("href")+ " returned " + isLinkBroke(element.getAttribute("href")));
 
		    	}
 
		    	catch(Exception exp)
 
		    	{
 
		    		System.out.println("At " + element.getAttribute("innerHTML") + " Exception occured -&gt; " + exp.getMessage());	    		
 
		    	}
 
		    }
 
	    }
 
	}
