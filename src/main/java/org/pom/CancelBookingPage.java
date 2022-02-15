package org.pom;
import org.Hotel.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CancelBookingPage extends BaseClass {
	
	@FindBy(id="ids[]")
	public WebElement orderCheckBox;

		@FindBy(id="cancelall")
		public WebElement cancelBbn;

		public WebElement getOrderCheckBox() {
			return orderCheckBox;
		}

		public WebElement getCancelBbn() {
			return cancelBbn;
		}
		
		public void cancellBookingPage() {
			click(getOrderCheckBox());
			click(getCancelBbn());
		}

}
