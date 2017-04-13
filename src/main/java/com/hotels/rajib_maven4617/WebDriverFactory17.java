package com.hotels.rajib_maven4617;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class WebDriverFactory17 {
	
	 private static WebDriver driver = null;
	 private static final String HOTEL = "https://www.hotels.com/";
	 
	   public static WebDriver getDriver() {
	        // TODO Auto-generated method stub
	        return driver;
	    }
	   
	   @BeforeClass

	    public void inirtializeDriver() {
	        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.get(HOTEL);
	        getDriver().manage().window().maximize();
	        
	        
	            }

	    @AfterClass

	    public void tearDown() {

	        if (driver != null) {
	            driver.manage().deleteAllCookies();
	            //driver.quit();
	        }

	    }


}
