package com.hotels.rajib_maven4617;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class rajibTest7 extends WebDriverFactory17 {
	
@Test
	
	public void googleAccount() throws InterruptedException{
		

		Landingpage17 landingpage = new Landingpage17();
		Thread.sleep(2000);
		landingpage.clickOnButton(By.id("hdr-account"));
		landingpage.clickOnButton(By.id("hdr-account-bookings"));
		landingpage.switchTowin(0);
		landingpage.clickOnButton(By.xpath("//a[contains(text(),'Facebook')]"));
		landingpage.switchTowin(1);
		landingpage.passKeys(By.id("email"), "rajib.nsu");
	//landingpage.SwitchtoWindow(2);
		landingpage.passKeys(By.id("pass"), "1313");
		landingpage.clickOnButton(By.id("u_0_2"));
		
		
	}


}
