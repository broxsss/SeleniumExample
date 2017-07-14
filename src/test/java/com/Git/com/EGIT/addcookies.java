package com.Git.com.EGIT;

import org.testng.annotations.Test;
import java.io.BufferedWriter;		
import java.io.File;		
import java.io.FileWriter;		
import java.util.concurrent.TimeUnit;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.Cookie;		

public class addcookies		
{		
     static WebDriver driver;	
    @Test
    public  void cookies()					
    {		
            System.setProperty("webdriver.chrome.driver","C:/akshay/chromedriver.exe");					
    		driver=new ChromeDriver();  
    		driver.manage().window().maximize();
			driver.get("http://flipkart.com");

        driver.findElement(By.linkText("Log In")).click();					
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);					
        // Input Emial id and Password If you are already Register		
        driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("broxsss@gmail.com");							
        driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys("7417224393");							
        driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();					
        		
        // create file named Cookies to store Login Information		
        File file = new File("Cookies.data");							
        try		
        {		
            // Delete old file if exists
			file.delete();		
            file.createNewFile();			
            FileWriter fileWrite = new FileWriter(file);							
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);							
            // loop for getting the cookie information 		
            for(Cookie ck : driver.manage().getCookies())							
            {		
                Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
                Bwrite.newLine();			
        }		
            Bwrite.flush();			
            Bwrite.close();			
            fileWrite.close();			
        }catch(Exception ex)					
        {		
            ex.printStackTrace();			
        }		
    }		
}

