package com.hotels.rajib_maven4617;

import org.openqa.selenium.By;

public class Landingpage17 extends Base17 {

	private By locateID;
	private By keyPassing;
	private int index;
	private String checkData;
	private String original;

	public String getCheckData() {
		return checkData;
	}

	public void setCheckData(String checkData) {
		this.checkData = checkData;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public By getLocateID() {
		return locateID;
	}

	public void setLocateID(By locateID) {
		this.locateID = locateID;
	}

	public By getKeyPassing() {
		return keyPassing;
	}

	public void setKeyPassing(By keyPassing) {
		this.keyPassing = keyPassing;
	}

	public void listWorking(By locateID, String checkData) {
		listWork(locateID, checkData);
	}

	public void selectedItem(By locateID) {
		selectedItem(locateID);

		// TODO Auto-generated method stub

	}

	public String getText(By locateID)
	{
		return original = getErrorMessage(locateID);
		
		// TODO Auto-generated method stub

	}
	
	

	public void passKeys(By locateID, String keysPassing) {
		enterData(locateID, keysPassing);
	}

	public void switchTowin(int index) {
		SwitchtoWindow(index);
	}

	public void clickOnButton(By locateID) {
		clickOn(locateID);
		// TODO Auto-generated method stub

	}

}
