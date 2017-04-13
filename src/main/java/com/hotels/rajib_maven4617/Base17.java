package com.hotels.rajib_maven4617;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.google.common.base.Function;

import junit.framework.Assert;

public class Base17 {

	public static WebElement webDriverFluentWait(final By locator) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(WebDriverFactory17.getDriver())
				.withTimeout(15, TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class)
				.ignoring(ElementNotFoundException.class).withMessage(
						"Webdriver waited for 15 seconds but still could not find the element therefore Timeout Exception has been thrown");

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});

		return element;
	}

	public void listWork(By locator, String checkData) {

		List<WebElement> listWork = WebDriverFactory17.getDriver().findElements(locator);

		// ???? is here how to incorporate with webDriver fluent

		for (WebElement element1 : listWork) {

			String elementtext = element1.getText();
			// System.out.println(hotel1);

			if (elementtext.equals(checkData)) {
				element1.click();
				break;
			}

		}

	}

	public void SwitchtoWindow(int index) {

		List<String> ListOfWindows = new ArrayList<String>(WebDriverFactory17.getDriver().getWindowHandles());
		WebDriverFactory17.getDriver().switchTo().window(ListOfWindows.get(index));

	}

	public void SwitchToRootWindowAndCloseCurrentBrowser() {
		List<String> ListOfWindows = new ArrayList<String>(WebDriverFactory17.getDriver().getWindowHandles());

		for (int i = 1; i < ListOfWindows.size(); i++) {
			WebDriverFactory17.getDriver().switchTo().window(ListOfWindows.get(i));
			WebDriverFactory17.getDriver().close();
		}
		WebDriverFactory17.getDriver().switchTo().window(ListOfWindows.get(0));

	}

	
	public String getErrorMessage(By locator) {
		return webDriverFluentWait(locator).getText();
	}

	public void selectItems(By locator) {
		webDriverFluentWait(locator).isSelected();
	}

	
	public void enterData(By locator, String keysToSend) {
		webDriverFluentWait(locator).sendKeys(keysToSend);
	}

	
	public void clickOn(By locator) {
		webDriverFluentWait(locator).click();
	}
}
