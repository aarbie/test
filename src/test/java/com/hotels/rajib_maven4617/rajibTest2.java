package com.hotels.rajib_maven4617;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class rajibTest2 extends WebDriverFactory17 {

	@Test
	
	public void hotelSearch() throws InterruptedException{
		
		Landingpage17 landingpage = new Landingpage17();
		landingpage.passKeys(By.id("qf-0q-destination"), "Marriot Hotel");
		Thread.sleep(1000);
		landingpage.clickOnButton(By.xpath("//button[contains(text(),'Search')]"));
	
	}
}
