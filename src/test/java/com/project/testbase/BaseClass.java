package com.project.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.project.utils.ConfigsReader;
import com.project.utils.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	

	
	public static WebDriver setUp() {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		switch(ConfigsReader.getProperty("browser").toLowerCase()){
		case "chrome":
			WebDriverManager.chromedriver().setup();//version("81")ayrlayabilirz
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
			default:
				throw new RuntimeException("Browser is not supported");
		}
		driver.get(ConfigsReader.getProperty("url"));
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		PageInitializer.initialize();
		return driver;
	}
	
      public static void tearDown() {//bazen quit calismayabilir bu sinifa gel
    	  if(driver!=null) {
    		  driver.quit();
    	  }
      }
}
