package org.Hotel;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class HotelApp {
	public static void main(String[] args) throws IOException {
		//Create Object for Base Class
		BaseClass base = new BaseClass();
		
		//Launch the Browser
		base.getDriver();
		base.maximize();
		base.loadUrl("https://adactinhotelapp.com/");
WebElement txtuser = base.findelementbyID("username");		
String data = base.getData("Sheet1", 1, 1);
base.sendKeys(txtuser, "vinothvk");
base.findelementbyID("password");
base.getData("Sheet1", 2, 2);


	}

}
