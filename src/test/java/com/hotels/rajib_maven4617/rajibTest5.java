package com.hotels.rajib_maven4617;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class rajibTest5 extends WebDriverFactory17 {
	
@Test
	
	public void completeSearch() throws InterruptedException{
		

		Landingpage17 landingpage = new Landingpage17();
		Thread.sleep(2000);
		landingpage.enterData(By.id("qf-0q-destination"), "New York");
		landingpage.listWork(By.xpath("//div[@class='autosuggest-category-result']"), "New York, New York, United States of America");
		landingpage.clickOnButton(By.id("qf-0q-localised-check-in"));
		//landingpage.listWorking(By.tagName("td"),"4");
		landingpage.listWorking(By.tagName("td"),"7");
		landingpage.clickOnButton(By.id("qf-0q-localised-check-out"));
		landingpage.listWorking(By.tagName("td"), "19");
		landingpage.clickOnButton(By.xpath("//button[contains(text(),'Search')]"));
		
		
	}
	



}
