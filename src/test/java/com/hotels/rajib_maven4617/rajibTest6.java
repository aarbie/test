package com.hotels.rajib_maven4617;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class rajibTest6  extends WebDriverFactory17{
	
@Test
	
	public void userAccount() throws InterruptedException{
		

		Landingpage17 landingpage = new Landingpage17();
		Thread.sleep(2000);
		landingpage.clickOnButton(By.id("hdr-account"));
		landingpage.clickOnButton(By.id("hdr-account-bookings"));
		landingpage.switchTowin(0);
		landingpage.passKeys(By.id("sign-in-email"), "rajib.nsu@gmail.com");
		landingpage.passKeys(By.id("sign-in-password"), "rajib@1981");
		landingpage.clickOnButton(By.xpath("//button[contains(text(),'Sign in')]"));
		
		
		
	}

}
