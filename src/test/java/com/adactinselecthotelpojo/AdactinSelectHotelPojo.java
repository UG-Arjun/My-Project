package com.adactinselecthotelpojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.base.ReUsableClass;

public class AdactinSelectHotelPojo extends ReUsableClass {

	public AdactinSelectHotelPojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="hotel_name_3")
	private WebElement textHotelCreek;

	
	
	public WebElement getTextHotelCreek() {
		return textHotelCreek;
	}

	@FindBys({@FindBy(name="radiobutton_4"),@FindBy(xpath="//input[@type='radio' and @value='4']")})
	private WebElement hotelRadioButton;
	

	
	@FindAll({@FindBy(name="continue"),@FindBy(xpath="//input[@class='reg_button' and @value='Continue']")})
    private WebElement continueButton;



	public WebElement getHotelRadioButton() {
		return hotelRadioButton;
	}



	public WebElement getContinueButton() {
		return continueButton;
	}
	
	
}
