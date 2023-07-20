package com.adactinloginerrorpagepojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.ReUsableClass;

public class AdactinLoginErrorPagePojo extends ReUsableClass {

	
	public AdactinLoginErrorPagePojo() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//b[text()='Invalid Login details or Your Password might have expired. ']")
	private WebElement textInvalid;

	public WebElement getTextInvalid() {
		return textInvalid;
	}
	
	
	
}
