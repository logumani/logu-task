package org.pom;

import org.Hotel.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass
{
	@FindBy(id="username")
	private WebElement txtUserName;

	@FindBy(id="password")
	private WebElement txtPassword;

	@FindBy (id="login")
	private WebElement btnloginName;

	public WebElement getTextUserName()
	{
		return txtUserName;
	}
	public WebElement getTextPassword()
	{
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnloginName;
	}
	public void login (String UserName, String Password)	{
		sendKeys(getTextUserName(), UserName);
		sendKeys(getTextPassword(), Password);
		click(getBtnLogin());
	}




}


