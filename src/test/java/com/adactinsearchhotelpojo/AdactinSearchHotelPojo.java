package com.adactinsearchhotelpojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.ReUsableClass;

public class AdactinSearchHotelPojo extends ReUsableClass {

	public AdactinSearchHotelPojo () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="location")
	private WebElement locationDropdown;
	
	@FindBy(name="room_nos")
	private WebElement roomsDropdown;
	
	@FindBy(name="datepick_in")
	private WebElement checkIn;
	
	@FindBy(name="datepick_out")
	private WebElement checkOut;
	
	@FindBy(name="adult_room")
	private WebElement adultsperRoom;
	
	@FindBy(name="Submit")
	private WebElement buttonSearch;

	public WebElement getLocationDropdown() {
		return locationDropdown;
	}

	public WebElement getRoomsDropdown() {
		return roomsDropdown;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdultsperRoom() {
		return adultsperRoom;
	}

	public WebElement getButtonSearch() {
		return buttonSearch;
	}

	
	
	
}
