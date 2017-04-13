package com.hotels.rajib_maven4617;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class rajibTest1 extends WebDriverFactory17 {

	@Test
	
	public void testOnSignupPage(){
		
		Landingpage17 landingpageobj = new Landingpage17();
		landingpageobj.clickOnButton(By.id("hdr-account"));
		
	}

}
