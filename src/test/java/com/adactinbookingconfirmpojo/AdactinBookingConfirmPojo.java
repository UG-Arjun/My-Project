package com.adactinbookingconfirmpojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.ReUsableClass;

public class AdactinBookingConfirmPojo extends ReUsableClass {

public	AdactinBookingConfirmPojo() {
	
	PageFactory.initElements(driver, this);
}
	
@FindBy(id="order_no")
private WebElement OrderID;

public WebElement getOrderID() {
	return OrderID;
}
	
}
