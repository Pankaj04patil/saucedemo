package com.saucedemo.Testpackge;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBaseClass 
{
	WebDriver driver;
	Logger log = Logger.getLogger("b");
	
@BeforeMethod

public void setup()
{System.setProperty("webdriver.chrome.driver", 
		"./driverfolder/chromedriver.exe");
 driver = new ChromeDriver();
 PropertyConfigurator.configure("log4j.properites");
	
	log.info("browser is opened");



 driver.manage().window().maximize();
 log.info("Browser is maximize");
 driver.get("https://byjus.com/"); 
 log.info("url open");
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));


	
	
}	
@AfterMethod
public void teardown()
{   
	driver.quit();
	log.info("browser is closed");
	
	log.info("End of Program");
}
     










}
