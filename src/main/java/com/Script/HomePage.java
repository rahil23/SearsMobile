package com.Script;

import org.testng.annotations.Test;

import com.PomClass.Account_POM;
import com.PomClass.HomePagePOM;
import com.PomClass.LoginPagePOM;
import com.genericMethods.SettingDesiredCapabilities;
import com.genericMethods.SwipeNScroll;

public class HomePage extends SettingDesiredCapabilities {
	
	
	
 /*   @Test(enabled=false)
	public void scrollHeroBanner()
	{
		SwipeNScroll obj = new SwipeNScroll();
		
		for (int i=0 ; i<=4;i++)
		{
			
			obj.swipeDynamic(.80, .10);	
		}
		
    }
    */
   /* @Test(priority=1)
    public void clk_SigninLink()
    {
    	HomePagePOM obj2 = new HomePagePOM(driver);
    	obj2.clk_SigninLink();
    	
    }*/
    
	@Test
	public void type_SearchBox() throws InterruptedException
	{
		HomePagePOM obj2 = new HomePagePOM(driver);
		obj2.search_txtbox("mixer");
		Thread.sleep(20000);
	
	}
    
    /*@Test(priority=1)
    public void login() throws InterruptedException
    {
    	HomePagePOM obj2 = new HomePagePOM(driver);
    	obj2.clk_SigninLink();
    	
    	LoginPagePOM obj3 = new LoginPagePOM(driver);
    	obj3.doLogin("10jan17@automation.com", "sears111");
    	
    	Thread.sleep(25000);
    }*/
    
//    @Test
//    public void goToPersonalInfo()
//    {
//    	HomePagePOM obj2 = new HomePagePOM(driver);
//    	obj2.clk_nav();
//    	obj2.clk_scanbtn();
//    	
//    	Account_POM obj4 = new Account_POM(driver);
//    	obj4.clk_tabPersonalInfo();
    
//    }
//    

	
	
	
	
	
	
	

}
