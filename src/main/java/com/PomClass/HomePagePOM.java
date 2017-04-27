package com.PomClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.Page;

import io.appium.java_client.android.AndroidDriver;

public class HomePagePOM {

	public AndroidDriver driver;
	
	@FindBy(name="Sign in or")
	private WebElement signin_link;
	
	@FindBy(xpath ="//android.widget.ImageButton[@content-desc = 'Navigation View Closed']")
	private WebElement nav_menu_clk;
	
	@FindBy(id="com.sears.android:id/scan_button")
	private WebElement scan_btn;
	
	@FindBy(id="com.sears.android.debug:id/cartButton")
	private WebElement cart_link;
	
	@FindBy(name="logout")
	private WebElement link_logout;
	
	@FindBy(id="com.sears.android.debug:id/search_bar")
	private WebElement searchBox_txt;
	
	
	public HomePagePOM(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		// TODO Auto-generated constructor stub
	}
	
	public void clk_SigninLink()
	{
		signin_link.click();
	}
	public void clk_nav()
	{
		nav_menu_clk.click();
	}
	public void clk_scanbtn()
	{
		scan_btn.click();
	}
	
	public void clk_cartlink()
	{
		cart_link.click();
	}
	
	public void lnk_logout()
	{
		link_logout.click();
	}
	public void search_txtbox(String text)
	{
		searchBox_txt.sendKeys(text);
		//searchBox_txt.sendKeys(Keys.ENTER);
	  driver.pressKeyCode(66);
	  
/*
driver.pressKeyEvent(66) or driver.pressKeyEvent(AndroidKeyCode.ENTER) 
2. Driver.sendKeyEvent(66) 
3. driver.execute("mobile:keyevent", "keycode:66");*/
	}
}
