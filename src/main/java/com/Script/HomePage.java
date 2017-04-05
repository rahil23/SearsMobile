package com.Script;

import org.testng.annotations.Test;

import com.PomClass.HomePagePOM;
import com.genericMethods.SettingDesiredCapabilities;
import com.genericMethods.SwipeNScroll;

public class HomePage extends SettingDesiredCapabilities {
	
    @Test(enabled=false)
	public void scrollHeroBanner()
	{
		SwipeNScroll obj = new SwipeNScroll();
		
		for (int i=0 ; i<=4;i++)
		{
			
			obj.swipeDynamic(.80, .10);	
		}
		
    }
    
    @Test
    public void clk_SigninLink()
    {
    	HomePagePOM obj2 = new HomePagePOM(driver);
    	obj2.clk_SigninLink();
    	
    }
    
    

	
	
	
	
	
	
	

}
