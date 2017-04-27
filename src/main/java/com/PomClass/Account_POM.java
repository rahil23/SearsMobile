package com.PomClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Account_POM {
	
	public AndroidDriver driver;
	
	@FindBy(name="Personal Information")
	private WebElement tab_personalinfo;
	
@FindBy(name="Preferred Store")
private WebElement btn_PreferredStore;
	
@FindBy(name="Set Preferred Store") //this is on preferred store page.. only single page and single locator
private WebElement btn_setPreferredStore;

	public Account_POM(AndroidDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public void clk_tabPersonalInfo()
	{
		tab_personalinfo.click();
	}
	
	public void setPreferredStore()
	{
		if(btn_PreferredStore.isDisplayed())
		{
			btn_PreferredStore.click();
			btn_setPreferredStore.click();
			
		}
		else
		{
	System.out.println("change store");
		}
	}
	
}


