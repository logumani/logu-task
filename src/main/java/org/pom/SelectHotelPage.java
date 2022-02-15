package org.pom;
import org.Hotel.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class SelectHotelPage extends BaseClass {
	@FindBy(id="radiobutton_0")
	public WebElement radioButton;

	public WebElement getRadioButton() {
		return radioButton;
	}

	public void selectHotels() {
		click(getRadioButton());
	}
	}