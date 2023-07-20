package com.base;

import java.time.Duration;

import java.util.List;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReUsableClass {
public static WebDriver driver;
	
	public void launchBrowser() {
    WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	}
	
	public void windowMaximize() {
	driver.manage().window().maximize();
    }
	
	public void loadURL(String url) {
	driver.get(url);
    }
	
	public void type(WebElement element, String data) {
		element.click();
        element.clear();
	element.sendKeys(data);
    }
	
	public void btnClick(WebElement element) {
	element.click();	
    }
	
	public String text(WebElement element) {
	return element.getText();
    }
	
	public String valueAttribute(WebElement element, String value) {
	return  element.getAttribute(value);
	}
	
	public String getPageUrl() {
	return  driver.getCurrentUrl();
	}
	
	public String getPageTitle() {
	return driver.getTitle();
	}
	
	public String gettingWindowID() {
	return driver.getWindowHandle();
	}
	 
	public Set<String> gettingWindowsID() {
	return driver.getWindowHandles();
	}
	
	public void clickDouble(WebElement element) {
	Actions a = new Actions(driver);
	a.doubleClick(element).perform();;
	}
	
	public void rightClick(WebElement element) {
		Actions a = new Actions(driver);
	 a.contextClick(element).perform();
	 }
	
	public void methodDragAndDrop(WebElement source, WebElement target) {
		Actions a = new Actions(driver);
	a.dragAndDrop(source, target).perform();
	}
	
	public void selectingByVisibleText(WebElement element,String text) {
		Select s = new Select(element);
	s.selectByVisibleText(text);
	}    
	public void selectingByIndex(WebElement element,int integer) {
		Select s = new Select(element);
	s.selectByIndex(integer);
	}    
	public void selectingByValue(WebElement element,String value) {
		Select s = new Select(element);
	s.selectByValue(value);
	}    
	public List<WebElement> gettingOptions(WebElement element) {
		Select s = new Select(element);
	List<WebElement> ListOfOptions = s.getOptions();
	return ListOfOptions;
	}    
	public WebElement firstSelectedOption(WebElement element) {
		Select s = new Select(element);
	WebElement firstSelectedOption = s.getFirstSelectedOption();		
	return firstSelectedOption;
	}
	public List<WebElement> allSelectedOptions(WebElement element) {
		Select s = new Select(element);
	List<WebElement> SelectedOptions = s.getAllSelectedOptions();
	return SelectedOptions;
	}    
	public boolean isItMultiple(WebElement element) {
	 Select s = new Select(element);
	boolean	multiple = s.isMultiple();
	return multiple;
	}
	public void deselectingByVisibleText(WebElement element,String text) {
		Select s = new Select(element);
	s.deselectByVisibleText(text);
	}
	public void deselectingByIndex(WebElement element,int integer) {
		Select s = new Select(element);
	s.deselectByIndex(integer);
	}
	public void deselectingByValue(WebElement element,String value) {
		Select s = new Select(element);
	s.deselectByValue(value);
	}
	
	public void waitImplicit(long seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
		}
	
}