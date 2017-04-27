package com.PomClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class StoreFinder_POM {
	
	public AndroidDriver driver;
	
	@FindBy(xpath="//android.view.View[@id='zipChangeModal']")
	private WebElement link_changeStore;
	

	@FindBy(xpath="//android.view.View[@index='0']//android.widget.EditText[@index='0']")
	private WebElement txtbox_zipcode;
	
	@FindBy(xpath="//android.widget.Button[@content-desc='Submit']")
	private WebElement btn_submitZipCode;
	
	@FindBy(xpath="//android.widget.Button[@index='4']")
	private WebElement clk_firstStoreAddress;
	
	public StoreFinder_POM(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addNewStore()
	{
		link_changeStore.click();
		txtbox_zipcode.clear();
		txtbox_zipcode.sendKeys("77002");
		
		btn_submitZipCode.click();
		
		clk_firstStoreAddress.click();
	}
	

}
