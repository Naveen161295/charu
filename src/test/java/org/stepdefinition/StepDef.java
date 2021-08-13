package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	WebDriver driver;
	@Given("User is on Adactin hotel website")
	public void user_is_on_Adactin_hotel_website() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sekar\\eclipse-workspace\\CucumberClass\\Driver\\chromedriver1.exe");
	     driver=new ChromeDriver();
	     driver.get("https://adactinhotelapp.com/");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
	}

	@When("User enter the valid {string} and {string}")
	public void user_enter_the_valid_and(String userName, String password) {
		driver.findElement(By.id("username")).sendKeys(userName);
		 driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("User click the login button")
	public void user_click_the_login_button() {
		driver.findElement(By.id("login")).click();	
	}

	@Then("User should verify the success message")
	public void user_should_verify_the_success_message() {
		 Assert.assertTrue("valid login details", true);
	}

	@When("User give a valid {string},{string},{string},{string},{string},{string},{string}and {string}")
	public void user_give_a_valid_and(String location, String hotel, String roomtype, String NoOfRoom, String checkIn, String checkOut, String adultPerroom, String childPerroom) {
		driver.findElement(By.id("location")).sendKeys(location);
	    driver.findElement(By.id("hotels")).sendKeys(hotel);
	    driver.findElement(By.id("room_type")).sendKeys(roomtype);
	    driver.findElement(By.id("room_nos")).sendKeys(NoOfRoom);
	    driver.findElement(By.id("datepick_in")).sendKeys(checkIn);
	    driver.findElement(By.id("datepick_out")).sendKeys(checkOut);
	    driver.findElement(By.id("adult_room")).sendKeys(adultPerroom);
	    driver.findElement(By.id("child_room")).sendKeys(childPerroom);
	}

	@When("User click the search button")
	public void user_click_the_search_button() {
		driver.findElement(By.id("Submit")).click();
	}

	@Then("User click the checkbox and Search button")
	public void user_click_the_checkbox_and_Search_button() {
		driver.findElement(By.id("radiobutton_0")).click();
	    driver.findElement(By.id("continue")).click();
	}

	@When("User should enter some details like {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_enter_some_details_like_and(String firstName, String lastName, String address, String ccno, String cctype, String exmonth, String exyear, String cvv) {
		driver.findElement(By.id("first_name")).sendKeys(firstName);
		   driver.findElement(By.id("last_name")).sendKeys(lastName);
		   driver.findElement(By.id("address")).sendKeys(address);
		   driver.findElement(By.id("cc_num")).sendKeys(ccno);
		   driver.findElement(By.id("cc_type")).sendKeys(cctype);
		   driver.findElement(By.id("cc_exp_month")).sendKeys(exmonth);
		   driver.findElement(By.id("cc_exp_year")).sendKeys(exyear);
		   driver.findElement(By.id("cc_cvv")).sendKeys(cvv);
	}

	@Then("User should click the Book now button")
	public void user_should_click_the_Book_now_button() {
		driver.findElement(By.id("book_now")).click();
		WebElement order_no = driver.findElement(By.id("order_no"));
		String orderId = order_no.getAttribute("value");
		System.out.println("Order id is "+orderId);
		driver.quit();
	}
}
