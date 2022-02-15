package org.pom;

import org.Hotel.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookHotelPage extends BaseClass {

	@FindBy(id="first_name")
	public WebElement firstName;

	@FindBy(id="last_name")
	public WebElement lastName;

	@FindBy(id="address")
	public WebElement address;

	@FindBy(id="cc_num")
	public WebElement creditCardNo;

	@FindBy(id="cc_type")
	public WebElement creditCardType;

	@FindBy(id="cc_exp_month")
	public WebElement expiryMonth;

	@FindBy(id="cc_exp_year")
	public WebElement expiryYear;

	@FindBy(id="cc_cvv")
	public WebElement ccvNumber;

	@FindBy(id="book_now")
	public WebElement btnBook;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCcvNumber() {
		return ccvNumber;
	}

	public WebElement getBtnBook() {
		return btnBook;
	}

	public void BookHotelPage(String FirstName,String LastName,String address,String cardNo,String cardType,String expiryMonth,String expiryYear,String ccvNo) {
		sendKeys(getFirstName(), FirstName);
		sendKeys(getLastName(), LastName);
		sendKeys(getAddress(), address);
		sendKeys(getCreditCardNo(), cardNo);
		selectoptionsByText(getCreditCardType(), cardType);
		selectoptionsByText(getExpiryMonth(), expiryMonth);
		selectoptionsByText(getExpiryYear(), expiryYear);
		sendKeys(getCcvNumber(), ccvNo);
		click(btnBook);

	}


}
