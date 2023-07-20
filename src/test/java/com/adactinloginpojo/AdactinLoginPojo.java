package com.adactinloginpojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.ReUsableClass;

public class AdactinLoginPojo extends ReUsableClass {

	
	public AdactinLoginPojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	private WebElement textUsername;
	
	@FindBy(name="password")
	private WebElement textPassword;
	
	@FindBy(xpath="//input[@type='Submit']")
	private WebElement buttonLogin;

	public WebElement getTextUsername() {
		return textUsername;
	}

	public WebElement getTextPassword() {
		return textPassword;
	}

	public WebElement getButtonLogin() {
		return buttonLogin;
	}

	
	
	
}
