package com.Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.PomClass.Account_POM;
import com.PomClass.HomePagePOM;
import com.PomClass.LoginPagePOM;
import com.PomClass.ManagemyAccount_POM;
import com.genericMethods.SettingDesiredCapabilities;

public class ManageMyAccount_Script extends SettingDesiredCapabilities {
	
	@Test
	public void addAddress() throws InterruptedException
	{
		/*WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("Fine Jewelry"))));*/
		
		//driver.scrollTo("Fine Jewelry");
		/*
		WebDriverWait wait2 = new WebDriverWait(driver,60);
		wait2.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("Sign in or"))));
*/		
	/*	
		//driver.scrollTo("Sign in or");
		HomePagePOM obj = new HomePagePOM(driver);
		obj.clk_nav();
		driver.scrollToExact("logout");
	
		
		obj.lnk_logout();
	*/	
	
   	//obj.clk_SigninLink();
		HomePagePOM obj = new HomePagePOM(driver);
    	obj.clk_SigninLink();
    	
    	
    	LoginPagePOM obj2 = new LoginPagePOM(driver);
    	obj2.doLogin("10jan17@automation.com", "sears111");
    	
    	Thread.sleep(40000);
		
    	obj.clk_nav();
		
    	
    	obj.clk_scanbtn();
    	
    	Account_POM obj4 = new Account_POM(driver);
    	obj4.clk_tabPersonalInfo();
    	
    	
		ManagemyAccount_POM obj5 = new ManagemyAccount_POM(driver);
		obj5.addAddress();	
		
	}
	
	
	
	
	
	
	
	

}
