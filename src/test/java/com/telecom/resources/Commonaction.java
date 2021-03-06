package com.telecom.resources;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonaction {
  public static WebDriver driver;
 
	public void launch( String url) {
		WebDriverManager.chromedriver().setup();
		
//		DesiredCapabilities chromeCapabilities = DesiredCapabilities.chrome();
//		chromeCapabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.DISMISS);
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.setExperimentalOption("excludeSwitches",
		 Arrays.asList("disable-popup-blocking"));
		options.addArguments("headless");
		
		//chromeCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
	    driver = new ChromeDriver(options);
	    driver.get(url);
	   // driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void clickTariff(WebElement ele) {
	  ele.click();

	}
	public void submitButton(WebElement ele) {
		ele.click();

	}
	public void insertText(WebElement ele, String value) {
		ele.sendKeys(value);

	}
}
