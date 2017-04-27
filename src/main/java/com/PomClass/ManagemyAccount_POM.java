package com.PomClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.springframework.beans.factory.support.ManagedArray;

import io.appium.java_client.android.AndroidDriver;

public class ManagemyAccount_POM {
	
	public AndroidDriver driver;
	
	@FindBy(xpath="//android.widget.Button[@content-desc='Add A New Address']")
	private WebElement btn_addNewAddress;
	
	@FindBy(xpath="//android.widget.EditText[@text='First Name required ']")
	private WebElement txt_FName;
	
	@FindBy(xpath="//android.widget.EditText[@text='Last Name required ']")
	private WebElement txt_LName;
	
	@FindBy(xpath="//android.widget.EditText[@text='Address 1 required ']")
	private WebElement txt_add1;
	
	@FindBy(xpath="//android.widget.EditText[@text='City/Town required ']")
	private WebElement txt_CityTown;
	
	@FindBy(xpath="//android.widget.Spinner[contains(@content-desc,'State required ')]")
	private WebElement dropdown_state;
	
	@FindBy(xpath="//android.widget.EditText[@text='Zip Code']")
	private WebElement txt_zipcode;
	
	@FindBy(className="android.widget.ListView")
	private WebElement state_list;
	
	@FindBy(name="Illinois")
	private WebElement state_name;
	
	@FindBy(name="Zip Code")
	private WebElement zipcode_txt;
	
	@FindBy(xpath="//android.widget.EditText[@text='Phone required ']")
	private WebElement txt_PhoneRequired;
	
	@FindBy(xpath="//android.widget.Button[@content-desc='Add Address']")
	private WebElement btn_Addadress;
	     
	
	public ManagemyAccount_POM(AndroidDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;	
PageFactory.initElements(driver, this);
	}
	
	public void addAddress() throws InterruptedException
	{
		btn_addNewAddress.click();
		txt_FName.click();
		txt_FName.sendKeys("Fname");
		
		driver.hideKeyboard();
		txt_LName.click();
		txt_LName.sendKeys("Lname");
		
		driver.hideKeyboard();
		txt_add1.click();
		txt_add1.sendKeys("Addresssample");
		
		driver.hideKeyboard();
		txt_CityTown.click();
txt_CityTown.sendKeys("chicago");

driver.hideKeyboard();
dropdown_state.click();
handlelist("Illinois");
/*List tabList = driver.findElements(By.xpath("android.widget.ListView"));
int n = tabList.size();
for(int i=0;i<=n;i++)
{
	
tabList.get(4);
Thread.sleep(3000);
}
driver.scrollToExact("Illinois");
state_name.click();
*/
Thread.sleep(5000);
driver.hideKeyboard();
zipcode_txt.click();
zipcode_txt.sendKeys("60601");

driver.hideKeyboard();
txt_PhoneRequired.click(); 
txt_PhoneRequired.sendKeys("9872090912");

driver.hideKeyboard();
btn_Addadress.click();


		
	}
	public void handlelist(String text){
		try{
			driver.scrollToExact(text);	
			driver.findElement(By.xpath("//android.widget.ListView[@index='0']//android.widget.CheckedTextView[@text='"+text+"']")).click();
			
		}catch(Exception e){
			
		}
	}

}
