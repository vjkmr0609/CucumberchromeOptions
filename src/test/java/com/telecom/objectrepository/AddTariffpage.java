package com.telecom.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.telecom.resources.Commonaction;

public class AddTariffpage extends Commonaction {
	
	public AddTariffpage() {
	     PageFactory.initElements(driver, this);
	}
    @FindBy (xpath = "//*[text()='Add Tariff Plan']")
    private WebElement TarrifButton;
    
    @FindBy (id = "rental1")
    private WebElement Rental;
    
    @FindBys ({
    	    @FindBy (name ="rental"),
    		@FindBy (id = "rental1") })
    private WebElement Rental1;
    
	@FindAll ({
	    @FindBy (name ="rental"),
		@FindBy (id = "rental1") })
    private WebElement Rental2;
    
    public void setRental1(WebElement rental1) {
		Rental1 = rental1;
	}

	public void setRental2(WebElement rental2) {
		Rental2 = rental2;
	}
	@FindBy (id = "local_minutes")
    private WebElement LocalMin;
    
    @FindBy (id = "inter_minutes")
    private WebElement InterMin;
    
    @FindBy (id = "sms_pack")
    private WebElement SmsPack;
    
    @FindBy (id = "minutes_charges")
    private WebElement MinCharge;
    
    @FindBy (id = "inter_charges")
    private WebElement InterCharge;
    
    @FindBy (id = "sms_charges")
    private WebElement SmsCharge;
    
    @FindBy (xpath = "//*[@type='submit']")
    private WebElement SubmitButton;

	public WebElement getTarrifButton() {
		return TarrifButton;
	}

	public WebElement getRental() {
		return Rental;
	}

	public WebElement getLocalMin() {
		return LocalMin;
	}

	public WebElement getInterMin() {
		return InterMin;
	}

	public WebElement getSmsPack() {
		return SmsPack;
	}

	public WebElement getMinCharge() {
		return MinCharge;
	}
    
	public WebElement getInterCharge() {
		return InterCharge;
	}

	public WebElement getSmsCharge() {
		return SmsCharge;
	}

	public WebElement getSubmitButton() {
		return SubmitButton;
	}
	 public WebElement getRental1() {
			return Rental1;
		}

		public WebElement getRental2() {
			return Rental2;
		}
    
    
	
}
