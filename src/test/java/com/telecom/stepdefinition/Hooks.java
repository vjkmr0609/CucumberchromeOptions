package com.telecom.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.telecom.resources.Commonaction;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commonaction {
	Commonaction common = new Commonaction();

@Before
public void beforeScenario() {
	System.out.println("Program Start");
	common.launch("http://www.demo.guru99.com/telecom/");
}

@After
public void afterScenario(Scenario scenario) {
	System.out.println("Program end");
	
	if(scenario.isFailed()) {
		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

		scenario.embed(screenshot, "image/png");
	}else {
		
		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

		scenario.embed(screenshot, "image/png");
	}
	
	
	driver.quit();
}
}
