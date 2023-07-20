package com.adactinbookinghotelpojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.ReUsableClass;

public class AdactinBookingHotelPojo extends ReUsableClass{

public	AdactinBookingHotelPojo() {
	
	PageFactory.initElements(driver, this);
}
	
	
	@FindBy(name="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(name="address")
	private WebElement typeAddress;

	@FindBy(name="cc_num")
	private WebElement creditCardNo;
	
	@FindBy(id="cc_type")
	private WebElement ccTypeDropdown;
	
	@FindBy(name="cc_exp_month")
	private WebElement monthDropdown;
	
    @FindBy(name="cc_exp_year")
	private WebElement yearDropdown;
    
    @FindBy(id="cc_cvv")
    private WebElement cvv;
    
    @FindBy(name="book_now")
    private WebElement buttonBookNow;
	

    public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getTypeAddress() {
		return typeAddress;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public WebElement getCcTypeDropdown() {
		return ccTypeDropdown;
	}

	public WebElement getMonthDropdown() {
		return monthDropdown;
	}

	public WebElement getYearDropdown() {
		return yearDropdown;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getButtonBookNow() {
		return buttonBookNow;
	}


}
