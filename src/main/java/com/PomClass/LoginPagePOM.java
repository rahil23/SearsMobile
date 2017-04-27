package com.PomClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class LoginPagePOM {
	
	public AndroidDriver driver;
	
	@FindBy(id="com.sears.android:id/login_email")
	private WebElement emailid_txbox;
	
	@FindBy(id="com.sears.android:id/login_password")
	private WebElement pass_txtbox;
	
	@FindBy(id="com.sears.android:id/btn_login")
	private WebElement signin_btn;
	
	 public LoginPagePOM(AndroidDriver driver) { 
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void doLogin(String email,String password)
	{
		emailid_txbox.click();
		emailid_txbox.clear();
		emailid_txbox.sendKeys(email);
		driver.hideKeyboard();
		
		pass_txtbox.click();
		pass_txtbox.clear();
		pass_txtbox.sendKeys(password);
		driver.hideKeyboard();
		signin_btn.click();
		
	}
	 
	 

}
