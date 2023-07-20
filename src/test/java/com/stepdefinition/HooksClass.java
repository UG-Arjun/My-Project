package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.ReUsableClass;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksClass extends ReUsableClass {

	@Before
	public void beforeExecution() {
		launchBrowser();
		windowMaximize();
		loadURL("https://adactinhotelapp.com/");
		}
	
}
