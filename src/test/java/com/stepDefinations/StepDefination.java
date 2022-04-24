package com.stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	
      WebDriver driver;
 @Test   
@Given("^user is on the homepage$")
public void user_is_on_the_homepage() throws Throwable {
   
	// -----set property and create object for web driver
	System.setProperty("webdriver.chrome.driver", "/Users/jamila/eclipse-workspace/WalmartAutomationProject/drivers/chromedriver");
	driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	// -----get URL and page Title
	driver.get("https://www.walmart.com");
	String title = driver.getTitle();
	System.out.println("page Title is : " + title + "\n");

	// ------maximize window, delete all cookies and refresh
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
}
@Test 
@When("^user click source Sign in button$")
public void user_click_source_Sign_in_button() throws Throwable {
    driver.findElement(By.linkText("Sign In"));
}
@Test
@When("^user enters email$")
public void user_enters_email() throws Throwable {
	driver.findElement(By.name("email")).sendKeys("jannat10@gmail.com");
}
@Test
@When("^user enters  password$")
public void user_enters_password() throws Throwable {
	driver.findElement(By.name("password")).sendKeys("JannatulJamila10");
}

@When("^user click sign in button$")
public void user_click_sign_in_button() throws Throwable {
    
}

@Then("^user capture page title$")
public void user_capture_page_title() throws Throwable {
    }

@Then("^user close the browser$")
public void user_close_the_browser() throws Throwable {
   
}

@Given("^user want to sign into walmart website$")
public void user_want_to_sign_into_walmart_website() throws Throwable {
    
}

@When("^user enter \"([^\"]*)\" address and \"([^\"]*)\"$")
public void user_enter_address_and(String arg1, String arg2) throws Throwable {
    
}

@Then("^user click sign up button$")
public void user_click_sign_up_button() throws Throwable {
    
}



}
