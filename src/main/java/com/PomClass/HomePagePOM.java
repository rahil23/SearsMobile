package com.PomClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.Page;

import io.appium.java_client.android.AndroidDriver;

public class HomePagePOM {

	public AndroidDriver driver;
	
	@FindBy(name="Sign in or")
	private WebElement signin_link;
	
	public HomePagePOM(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		// TODO Auto-generated constructor stub
	}
	
	public void clk_SigninLink()
	{
		signin_link.click();
	}
	
	
	
	
	
}
