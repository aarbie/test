package com.hotels.rajib_maven4617;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.GetAlertText;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class rajibTest9 extends WebDriverFactory17{

@Test
	
	public void testOnError() throws InterruptedException{
		
		
		Landingpage17 landingpage = new Landingpage17();
		
		Thread.sleep(1000);
		landingpage.clickOnButton(By.xpath("//button[contains(text(),'Search')]"));
		String original = landingpage.getText(By.xpath("//div[@class='form-error']/span[contains(text(),'Please')]"));
		String expected = "Please tell us the destination, hotel or landmark you’re looking for";
		Assert.assertEquals(expected, original);
		System.out.println(original);
		
		
		
		////div[@class='form-error']/span[contains(text(),'Please')]
		
	}
	
}
