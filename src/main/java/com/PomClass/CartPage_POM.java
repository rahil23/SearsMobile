package com.PomClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class CartPage_POM {
	public AndroidDriver driver;

	String text=null;
	@FindBy(xpath="//android.widget.Spinner[@content-desc='Move to... ']")
	private WebElement spn_moveto;
	
	//@FindBy()
	/*@FindBy(xpath="//android.view.View[@content-desc='Qty:']//following-sibling::view and //android.view.View[@content-desc='Remove']/preceding-sibling::view")
*/
	@FindBy(xpath="//android.webkit.WebView[@index='1']//android.view.View[@index='1']//android.widget.Spinner[@index='0']")
	private WebElement qtn_locator;
	
	/*@FindBy(xpath="//android.widget.Spinner[@index='0']//android.widget.CheckedTextView[@text='+text+']")
	private WebElement qtn_selector;*/
	
	
	@FindBy(xpath="//android.webkit.WebView[@index='0']//android.view.View[@index='4']//android.view.View[@content-desc='FREEPickup']")
	private WebElement pickup_dropdown;
	
	@FindBy(xpath="//android.webkit.WebView[@index='0']//android.view.View[@index='4']//android.view.View[@content-desc='FREEDelivery|']")
	private WebElement Delivery_dropdown;
	
	/*@FindBy(xpath="//android.view.View[@content-desc='+text+']")
	WebElement dropdown;*/
	
	public CartPage_POM(AndroidDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public void clk_moveTo()
	{
		spn_moveto.click();
	}

	public void selectQuantity()
	{
		System.out.println("Quantity dropdown is displayed" +qtn_locator.isDisplayed());
		qtn_locator.click();
		selectQuantity("4");
		System.out.println("quantity Selected");
	}

	
	public void selectQuantity(String text)
	{
			
		try {
			driver.findElement(By.xpath("//android.widget.FrameLayout[@index='0']//android.widget.ListView[@index='0']//android.widget.CheckedTextView[@text='"+text+"']")).click();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void selectMethodDropdown() throws InterruptedException
	{
		System.out.println("clicked selectMethodDropdown");
		Delivery_dropdown.click();
		System.out.println("dropdown seected");
		Thread.sleep(3000);
		pickup_dropdown.click();
		System.out.println("pickupdrodown seected");
		Thread.sleep(5000);
		driver.pressKeyCode(AndroidKeyCode.BACK);
		Delivery_dropdown.click();
		System.out.println("Delivery seected");
		Thread.sleep(5000);
		pickup_dropdown.click();
		System.out.println("pickupdrodown seected");
		Thread.sleep(5000);
		
	/*	dropdown.click();
		dropdown.click();
		dropdown.click();*/
	}

}
