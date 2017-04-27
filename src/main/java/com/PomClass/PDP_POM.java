package com.PomClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericMethods.SettingDesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class PDP_POM {
	AndroidDriver driver;
	
	@FindBy(id="pdp_carousel_pager")
	private WebElement clk_PDPHomeimg;
	
	@FindBy(xpath="//android.widget.RelativeLayout[@index='1']")
	private WebElement clk_secondImage;
	
	@FindBy(id="touch_image_view")
	private WebElement clk_zoomPic;
	
	public PDP_POM(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public void clk_HomeImg()
	{
		clk_PDPHomeimg.click();
	}
	public void clk_secongPDPimg()
	{
		clk_secondImage.click();
		System.out.println("click 2nd Image");
	}
	public void zoomImg()
	{
		System.out.println("before Zoom");
		driver.zoom(clk_zoomPic);
		System.out.println("After Zoom");
	}
	
}
