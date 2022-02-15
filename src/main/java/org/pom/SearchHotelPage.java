package org.pom;
import org.Hotel.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class SearchHotelPage extends BaseClass {
		@FindBy(id="location")
		public WebElement dDnLocation;

		@FindBy(id="hotels")
		public WebElement dDnHotel;

		@FindBy(id="room_type")
		public WebElement dDnRoomType;

		@FindBy(id="room_nos")
		public WebElement dDnNoOfRooms;

		@FindBy(id="datepick_in")
		private WebElement txtCheckInDate;

		@FindBy(id="datepick_out")
		private WebElement textCheckoutDate;

		@FindBy(id="adult_room")
		private WebElement dDnAdultsPerRoom;

		@FindBy(id="child_room")
		private WebElement dDnChildrenPerRoom;

		@FindBy(id="Submit")
		private WebElement btnSearch;

		public WebElement getdDnLocation() {
			return dDnLocation;
		}

		public WebElement getdDnHotel() {
			return dDnHotel;
		}

		public WebElement getdDnRoomType() {
			return dDnRoomType;
		}

		public WebElement getdDnNoOfRooms() {
			return dDnNoOfRooms;
		}

		public WebElement getTxtCheckInDate() {
			return txtCheckInDate;
		}

		public WebElement getTextCheckoutDate() {
			return textCheckoutDate;
		}

		public WebElement getdDnAdultsPerRoom() {
			return dDnAdultsPerRoom;
		}

		public WebElement getdDnChildrenPerRoom() {
			return dDnChildrenPerRoom;
		}

		public WebElement getBtnSearch() {
			return btnSearch;
		}

		public void searchHotelPage(String location,String hotels,String roomType,String noOfRooms,String checkInDate,String checkOutDate,String adultsPerRoom,String childrenPerRoom) {
			selectoptionsByText(getdDnLocation(), location);
			selectoptionsByText(getdDnHotel(), hotels);
			selectoptionsByText(getdDnRoomType(), roomType);
			selectoptionsByText(getdDnNoOfRooms(), noOfRooms);
			sendKeys(getTxtCheckInDate(), checkInDate);
			sendKeys(getTextCheckoutDate(), checkOutDate);
			selectoptionsByText(getdDnAdultsPerRoom(), adultsPerRoom);
			selectoptionsByText(getdDnChildrenPerRoom(), childrenPerRoom);
			click(getBtnSearch());
		}



	}

