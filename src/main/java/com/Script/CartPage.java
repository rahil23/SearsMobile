package com.Script;

import org.testng.annotations.Test;

import com.PomClass.CartPage_POM;
import com.PomClass.HomePagePOM;
import com.genericMethods.SettingDesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class CartPage extends SettingDesiredCapabilities {
	
	

	@Test
	public void quantitySelect() throws InterruptedException
	{
	
	HomePagePOM obj = new HomePagePOM(driver);
		obj.clk_cartlink();
		
		Thread.sleep(10000);
		
		System.out.println(driver.getContext());
		//driver.context("WEBVIEW");
		
		CartPage_POM obj2 = new CartPage_POM(driver);
//	------------ working-----------
	/*	obj2.selectQuantity();
		Thread.sleep(5000);*/
//------------------------------------------

		obj2.selectMethodDropdown();
		
		/*obj2.selectMethodDropdown("FREEPickup|");
		obj2.selectMethodDropdown("Delivery");
		obj2.selectMethodDropdown("FREEPickup|");*/

}
}
