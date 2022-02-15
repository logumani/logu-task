package org.Hotel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hi {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("logu1991");
		WebElement txtPwd = driver.findElement(By.id("password"));
		txtPwd.sendKeys("hello");
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();

	}
}
