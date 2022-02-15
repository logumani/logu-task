package org.pom;

import org.Hotel.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingConfirmPage extends BaseClass {
	
	@FindBy(id="my_itinerary")
	public WebElement bookedHotels;

	public WebElement getBookedHotels() {
		return bookedHotels;
	}	
	
	public void bookConfirmationPage(){
		click(getBookedHotels());
		
	}
	
}

