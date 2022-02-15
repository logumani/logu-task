package org.Hotel;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Validation {
	static WebDriver driver;
	@BeforeClass
		public static void beforeClass() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://adactinhotelapp.com/");
			driver.manage().window().maximize();
		}
	@AfterClass
	public static void afterClass() {
	driver.quit();
	}
	
	@Before
	public void beforeMethod(){
long start = System.currentTimeMillis();
System.out.println(start);
	}
	
	@After
	public void afterMethod(){
		long end = System.currentTimeMillis();
		System.out.println(end);
	}
	
@Test
public void test()
{
	WebElement txtUserName = driver.findElement(By.id("username"));
	txtUserName.sendKeys("vinothvk");
	
	String name = txtUserName.getAttribute("value");
	Assert.assertEquals("Verify user Name", "vinothvk", name);
	
	WebElement txtPass = driver.findElement(By.id("password"));
	txtPass.sendKeys("R2W89W");
	
	String pass = txtUserName.getAttribute("value");
	Assert.assertEquals("Verify password", "R2W89W", pass);
	
	WebElement btnlogin = driver.findElement(By.name("login"));
	btnlogin.click();
	
	String title = driver.getTitle();
	boolean check = title.contains("login");
	Assert.assertTrue("Verify Tittle", check);
}
	
}

	
