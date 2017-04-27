package com.Script;

import org.testng.annotations.Test;

import com.PomClass.Account_POM;
import com.PomClass.HomePagePOM;
import com.PomClass.LoginPagePOM;
import com.PomClass.StoreFinder_POM;
import com.genericMethods.SettingDesiredCapabilities;

public class AddChangeStore extends SettingDesiredCapabilities {
	
	@Test
	public void addStore()
	{
	
	HomePagePOM obj = new HomePagePOM(driver);
		obj.clk_nav();
	obj.clk_scanbtn();

 	Account_POM obj4 = new Account_POM(driver);
	obj4.setPreferredStore();
	
	StoreFinder_POM obj5= new StoreFinder_POM(driver);
	obj5.addNewStore();
	
	
	
}
}
