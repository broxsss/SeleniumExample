package SeleniumExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testdiary_VisibleConditions {

public static void main(String[] args) throws InterruptedException {

WebDriver driver ;
System.setProperty("webdriver.chrome.driver","/Users/akshaykumarsaini/Desktop/chromedriver");
driver = new ChromeDriver();

driver.manage().window().maximize();

String contactUrl = "http://www.testdiary.com/training/selenium/selenium-test-page/";

driver.get(contactUrl);

(new WebDriverWait(driver, 10))
.until(ExpectedConditions.visibilityOfElementLocated(By.id("seleniumbox")));

// Declaring a local variable of type "WebElement" to initialize the
// value of the webElement (seleniumCheckbox) and webElement
// (restCheckbox)
WebElement seleniumCheckbox = null ;
try {
	 seleniumCheckbox = driver.findElement(By.id("seleniumboxd"));
}
catch(NoSuchElementException ex)
{
	System.out.println("Webelement is not present 1");
}

//WebElement seleniumCheckbox = driver.findElement(By.id("seleniumbox"));
seleniumCheckbox = driver.findElement(By.id("seleniumbox"));
WebElement restCheckbox = driver.findElement(By.id("restapibox"));

// wait was covered in prvious tutorial
(new WebDriverWait(driver, 30)).until(ExpectedConditions
.elementToBeClickable(seleniumCheckbox));



// Declaring a local variable of type "Boolean" to initialize the
// value of the webElement (checkSelenium) and webElement (checkRestApi)
// Using the isSelected method we check if the check box is selected or
// not.
Boolean checkSelenium = seleniumCheckbox.isSelected();
Boolean checkRestApi = restCheckbox.isSelected();

// use an if condition to check if boolean returned false
// If false then it was not selected
// click and select the checkbox
if (checkSelenium == false) {
seleniumCheckbox.click();
System.out.println("Test has selected Selenium checkbox");
} else {
System.out.println("Selenium checkbox was selected on default");
}

// Repeat the process for checkRestAapi
if (checkRestApi == false) {
restCheckbox.click();
System.out.println("Test has selected Rest api checkbox");
} else {
System.out.println("Rest Api checkbox was selected on default");
}

// Check if Save button is displayed on the WebPage
WebElement saveButton = driver.findElement(By.id("demo"));

Boolean checkSaveIsDisplayed = saveButton.isDisplayed();

if (checkSaveIsDisplayed == true) {
System.out.println("save button is displayed");
}

// Check if Save button is not enabled on the WebPage

Boolean checkSaveIsEnabled = saveButton.isEnabled();

if (checkSaveIsEnabled == false) {
System.out.println("save button is not enabled");
}

// Click on a radio button then check if the save button is now enabled

WebElement javaRadioButton = driver.findElement(By.id("java1"));

(new WebDriverWait(driver, 30)).until(ExpectedConditions
.elementToBeClickable(javaRadioButton));

javaRadioButton.click();

// check if it is now enabled
checkSaveIsEnabled = saveButton.isEnabled();
if (checkSaveIsEnabled == true) {
System.out.println("save button is enabled");
}

driver.close();

System.exit(0);

}
}