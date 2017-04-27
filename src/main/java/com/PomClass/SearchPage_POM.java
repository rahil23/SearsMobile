package com.PomClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class SearchPage_POM {
	
	public AndroidDriver driver;
	
	@FindBy(id="com.sears.android.debug:id/prdName0")
	private WebElement cli_firstElement;
	
	@FindBy(id="com.sears.android.debug:id/btn_refine")
	private WebElement btn_refine;
	
	
	public SearchPage_POM(AndroidDriver driver) {
		this.driver = driver;
	
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public void clk_firstElement()
	{
		cli_firstElement.click();
	}
	
	
	

}
