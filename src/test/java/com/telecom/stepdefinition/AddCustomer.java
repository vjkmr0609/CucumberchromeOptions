package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;


public class AddCustomer {
    public static WebDriver driver;
	@Given("user launches demo telecom websie")
	public void user_launches_demo_telecom_websie() {
	    WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
	     driver.get("http://www.demo.guru99.com/telecom/");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	}

	@Given("user click add customer")
	public void user_click_add_customer() {
		driver.findElement(By.xpath("(//*[text()='Add Customer'])[1]")).click();
	   
	}

	@When("user enter all the details")
	public void user_enter_all_the_details() {
		driver.findElement(By.xpath("//*[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys("Vijay");
		driver.findElement(By.id("lname")).sendKeys("kumaar");
		driver.findElement(By.id("email")).sendKeys("vijayviswa95@gmail.com");
		driver.findElement(By.xpath("//*[@name='addr']")).sendKeys("please create my ID");
		driver.findElement(By.id("telephoneno")).sendKeys("9597666445");
	     
	}

	@When("user enter submit button")
	public void user_enter_submit_button() {
	    driver.findElement(By.xpath("//*[@type='submit']")).click();
	    
	}

	@Then("user customer id generated")
	public void user_customer_id_generated() {
	    WebElement equal = driver.findElement(By.xpath("(//table//tr//td)[3]"));
	    String print = equal.getText();
	    System.out.println(print);
	    Assert.assertEquals(print, "Please Note Down Your CustomerID");
	    driver.quit();
	}
	//one dim list concept
	@When("user enter all the details by one dim list concept")
	public void user_enter_all_the_details_by_one_dim_list_concept(DataTable dataTable) {
		List<String> data = dataTable.asList(String.class);
		driver.findElement(By.xpath("//*[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(data.get(0));
		driver.findElement(By.id("lname")).sendKeys(data.get(1));
		driver.findElement(By.id("email")).sendKeys(data.get(2));
		driver.findElement(By.xpath("//*[@name='addr']")).sendKeys(data.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(data.get(4));
	        
	}
	
   //BY ONE DIM MAP
	@When("user enter all the details by one dim  map concept")
	public void user_enter_all_the_details_by_one_dim_map_concept(DataTable dataTable) {
		Map<String, String> data = dataTable.asMap(String.class, String.class);
		driver.findElement(By.xpath("//*[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(data.get("fname"));
		driver.findElement(By.id("lname")).sendKeys(data.get("lname"));
		driver.findElement(By.id("email")).sendKeys(data.get("mail"));
		driver.findElement(By.xpath("//*[@name='addr']")).sendKeys(data.get("note"));
		driver.findElement(By.id("telephoneno")).sendKeys(data.get("call"));
	    
	}
	
	//TWO DIM LIST
	@When("user enter all the details by two dim  list concept")
	public void user_enter_all_the_details_by_two_dim_list_concept(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		driver.findElement(By.xpath("//*[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("lname")).sendKeys(data.get(4).get(1));
		driver.findElement(By.id("email")).sendKeys(data.get(3).get(2));
		driver.findElement(By.xpath("//*[@name='addr']")).sendKeys(data.get(2).get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(data.get(3).get(4));
	    
		
	}
	
	//2 DIM MAP
	@When("user enter all the details by two dim  map concept")
	public void user_enter_all_the_details_by_two_dim_map_concept(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class,String.class);
		driver.findElement(By.xpath("//*[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(data.get(0).get("fname"));
		driver.findElement(By.id("lname")).sendKeys(data.get(2).get("lname"));
		driver.findElement(By.id("email")).sendKeys(data.get(1).get("mail"));
		driver.findElement(By.xpath("//*[@name='addr']")).sendKeys(data.get(3).get("note"));
		driver.findElement(By.id("telephoneno")).sendKeys(data.get(3).get("call"));
	
	}
    //SCENARIO OUTLINE
	@When("user enter all the details {string},{string},{string},{string},{string}")
	public void user_enter_all_the_details(String fname, String lname, String mail, String note, String call) {
		driver.findElement(By.xpath("//*[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(fname);
		driver.findElement(By.id("lname")).sendKeys(lname);
		driver.findElement(By.id("email")).sendKeys(mail);
		driver.findElement(By.xpath("//*[@name='addr']")).sendKeys(note);
		driver.findElement(By.id("telephoneno")).sendKeys(call);
	 
	}
	
}
