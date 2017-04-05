package com.genericMethods;

import org.openqa.selenium.Dimension;

import io.appium.java_client.android.AndroidDriver;

public class SwipeNScroll {
	AndroidDriver driver;
	 
	public void swipeDynamic(double startx,double endx)
	{
	
		Dimension dsize = driver.manage().window().getSize();
	int startx1 = (int) (dsize.width*startx);
	int endx1 = (int) (dsize.width*endx);
	
	int starty = dsize.height/2;
	
	driver.swipe(startx1, starty, endx1, starty, 5000);
	
}
	
	public void scrollDynamic(double starty,double endy)
	{

		Dimension dsize = driver.manage().window().getSize();
	int starty1 = (int) (dsize.height*starty);
	int endy1 = (int) (dsize.height*endy);
	
	int startx = dsize.height/2;
	
	driver.swipe(startx, starty1, startx, endy1, 4000);
	
}
}
