package com.genericMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;



public class SettingDesiredCapabilities extends AppiumServerStartStop {
	public AndroidDriver driver;
	
	DesiredCapabilities cap;	

	@BeforeTest
	public void openApp() throws MalformedURLException
	{
		cap =new DesiredCapabilities();
		
		
		cap.setCapability("automationName", ReadPropertiesfile.getConfigProperties("AUTOMATIONNAME"));
		cap.setCapability("platformVersion", ReadPropertiesfile.getConfigProperties("PLATFORMVERSION"));
		cap.setCapability("platformName",ReadPropertiesfile.getConfigProperties("PLATFORMNAME"));
		cap.setCapability("deviceName", ReadPropertiesfile.getConfigProperties("DEVICENAME"));
//cap.setCapability("app",".\\APKFiles\\Sears_10.3.apk" );
		
		cap.setCapability("appPackage", ReadPropertiesfile.getConfigProperties("APPPACKAGE"));
cap.setCapability("appActivity", ReadPropertiesfile.getConfigProperties("APPACTIVITY"));
cap.setCapability("unicodekeyboard", ReadPropertiesfile.getConfigProperties("UNICODEKEYBOARD"));
cap.setCapability("resetkeyboard", ReadPropertiesfile.getConfigProperties("RESETKEYBOARD"));

driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);  //TODO URL is method imported from "java.net" Package  and this will throw "MalformedURLException"

driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

driver.unlockDevice();
//driver.resetApp();

	}
	
	@AfterTest
	public void closeApp()
	{
		driver.quit();
	}
}
