package com.Script;

import org.testng.annotations.Test;

import com.PomClass.HomePagePOM;
import com.PomClass.PDPImages_POM;
import com.PomClass.PDP_POM;
import com.PomClass.SearchPage_POM;
import com.genericMethods.SettingDesiredCapabilities;
import com.genericMethods.SwipeNScroll;

import io.appium.java_client.android.AndroidDriver;

public class PDPScript  extends SettingDesiredCapabilities {


	
	
	
	@Test
	public void swipeSearsPDP() throws InterruptedException
	{
		HomePagePOM obj2 = new HomePagePOM(driver);
		obj2.search_txtbox("mixer");
		Thread.sleep(5000);
		
		SearchPage_POM obj3 = new SearchPage_POM(driver);
		obj3.clk_firstElement();
		
		
		SwipeNScroll obj = new SwipeNScroll();
		
		System.out.println(driver.getContext());
		
		/*for(int i=0;i<=4;i++)
		{
			Thread.sleep(3000);
			obj.swipeDynamic(.80, .10);
			Thread.sleep(3000);s
		}*/
		
		
		Thread.sleep(3000);
		PDP_POM obj5 = new PDP_POM(driver);
		obj5.clk_HomeImg();
		Thread.sleep(3000);
		
		PDPImages_POM obj6 = new PDPImages_POM(driver);
		
		obj6.clk_secongPDPimg();
		Thread.sleep(3000);
		
		obj6.zoomImg();
		Thread.sleep(5000);
		
		
	}
	
}
