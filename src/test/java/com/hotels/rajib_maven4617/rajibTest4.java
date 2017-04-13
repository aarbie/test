package com.hotels.rajib_maven4617;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class rajibTest4 extends WebDriverFactory17{
	
	@Test
	
	public void dateCheck(){
		

		Landingpage17 landingpage = new Landingpage17();
		landingpage.clickOnButton(By.id("qf-0q-localised-check-in"));
		//landingpage.listWorking(By.tagName("td"),"4");
		landingpage.listWorking(By.tagName("td"),"7");
		landingpage.clickOnButton(By.id("qf-0q-localised-check-out"));
		landingpage.listWorking(By.tagName("td"), "19");
		
		
	}
	

}
