package com.ActiTime.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout_Link {
	@FindBy(id="logoutLink")
	private WebElement logout;
	/*@FindBy(xpath="//td[text()='Enter Time-Track']")
	private WebElement timeTrack_Title;
	*/
	public void getLogOut()
	{
		logout.click();
	}
	/*public String getTimeTrackTitle()
	{
		return timeTrack_Title.getText();
	}*/
}
