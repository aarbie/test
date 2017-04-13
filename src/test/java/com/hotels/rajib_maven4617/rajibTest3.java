package com.hotels.rajib_maven4617;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class rajibTest3 extends WebDriverFactory17 {
	
	@Test
	
	public void checkWithFacebookID() throws InterruptedException{
		
		Landingpage17 landingpage = new Landingpage17();
		landingpage.clickOnButton(By.id("hdr-account"));
		Thread.sleep(2000);
		landingpage.clickOnButton(By.id("hdr-signin"));
		landingpage.SwitchtoWindow(0);
		landingpage.clickOnButton(By.xpath("//a[@class='popup-trigger social-btn social-btn--googleplus']"));
		landingpage.SwitchtoWindow(1);
		landingpage.passKeys(By.id("Email"), "rajib.nsu");
		landingpage.clickOnButton(By.id("next"));
		//landingpage.SwitchtoWindow(2);
		landingpage.passKeys(By.id("Passwd"), "1313");
		landingpage.clickOnButton(By.id("signIn"));
		
		
	}

}
