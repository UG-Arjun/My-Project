package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features", glue="com.stepdefinition", dryRun=false,
monochrome=true, plugin= {"pretty","junit:src\\test\\resources\\Reports\\AdactinHotelBooking.xml",
		"html:src\\test\\resources\\Reports\\AdactinHotelBooking.html"} )
public class RunnerClass {

}
