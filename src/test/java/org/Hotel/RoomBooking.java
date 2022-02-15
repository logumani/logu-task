package org.Hotel;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class RoomBooking extends BaseClass {

	@BeforeClass
	public static void launchBrowser()
	{
		getDriver();
		loadUrl("https://adactinhotelapp.com/");
		maximize();
		implicitWait();
	}
	@AfterClass
	public static void closeBrowser()
	{
		//		close();
	}
	@Before
	public void startTime() throws IOException
	{
		long start = System.currentTimeMillis();
		System.out.println(start);
		screenShot("C:\\Users\\logum\\Pictures\\Saved Pictures\\sc.png");
	}
	@After
	public void endTime() throws IOException
	{
		long end = System.currentTimeMillis();
		System.out.println(end);
		screenShot("C:\\Users\\logum\\Pictures\\Saved Pictures\\sc1.png");
	}

	@Test
	public void romeBooking() throws IOException
	{
		WebElement userName = findelementbyID("username");
		String text = getData("Sheet2", 1, 0);
		sendKeys(userName, text);
		WebElement password = findelementbyID("password");
		String text1 = getData("Sheet2", 1, 1);
		sendKeys(password, text1);
		WebElement btnLogin = findelementbyID("login");
		click(btnLogin);

		WebElement location = findelementbyID("location");
		selectoptionsByIndex(location, 2);

		WebElement hotel = findelementbyID("hotels");
		selectoptionsByIndex(hotel, 1);

		WebElement roomType = findelementbyID("room_type");
		selectoptionsByIndex(roomType, 1);

		WebElement roomNumber = findelementbyID("room_nos");
		selectoptionsByIndex(roomNumber, 2);

		WebElement submit = findelementbyID("Submit");
		click(submit);

		WebElement btn = findelementbyID("radiobutton_0");
		click(btn);

		WebElement cnt = findelementbyID("continue");
		click(cnt);

		WebElement frstName1 = findelementbyID("first_name");
		String data = getData("Sheet2", 1, 5);
		sendKeys(frstName1, data);
		
		WebElement lName = findelementbyID("last_name");
		String data1 = getData("Sheet2", 1, 6);
		sendKeys(lName, data1);

		WebElement address = findelementbyID("address");
		String data2 = getData("Sheet2", 1, 7);
		sendKeys(address, data2);

		WebElement creditNum = findelementbyID("cc_num");
		String data3 = getData("Sheet2", 1, 8);
		sendKeys(creditNum, data3);

		WebElement cardType = findelementbyID("cc_type");
		String data4 = getData("Sheet2", 1, 9);
		selectoptionsByText(cardType, data4);

		WebElement expMont = findelementbyID("cc_exp_month");
		selectoptionsByIndex(expMont, 2);	

		WebElement expYear = findelementbyID("cc_exp_year");
		selectoptionsByIndex(expYear, 12);

		WebElement cvv = findelementbyID("cc_cvv");
		String data5 = getData("Sheet2", 1, 12);
		sendKeys(cvv, data5);

		WebElement btnbooknow = findelementbyID("book_now");
		click(btnbooknow);

		WebElement orderid = findelementbyID("order_no");
		String orderID = getAttribute1(orderid, "Value");
		System.out.println(orderID);
	}


}
