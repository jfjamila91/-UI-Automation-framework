package com.pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass{
	
	//page factory
	
	@FindBy(xpath = "//button[@class='w_7 w_9 w_AD db mb3 w-100']")
			WebElement SignInButton;
	
	@FindBy(name = "email")
	WebElement enterEmail;
	
	
	@FindBy(id = "signin-continue-submit-btn")
			WebElement clickContinue;
			
	@FindBy(name = "password")
	WebElement enterpassword;
	
	@FindBy(id="sign-in-pwd")
	WebElement ClickSignIn;

	@FindBy(xpath = "//div[@class='f7 mw3 mw4-xl truncate']")
	WebElement GetCurrentUserName;
	
	//--Initializing  Page Factory
		public LoginPage() throws IOException{
			PageFactory.initElements(driver, this);
		}
	//--getting page title	
		public String pageTitle() {
			String title = driver.getTitle();
			System.out.println("The Page title is : " + title);
			return title;
		}
	//--validating login with valid credential
		public HomePage validateLogin(String userName, String pass) throws IOException {
			
			SignInButton.click();
			enterEmail.sendKeys(userName);
			clickContinue.click();
			enterpassword.sendKeys(pass);
			ClickSignIn.click();
			return new HomePage();
		}
		//--getting current logged in user name	
			public String validateCurrentUserName() {
				String logged_User_name = GetCurrentUserName.getText();
				System.out.println("Current User Name is : "+logged_User_name);
				return logged_User_name;
			}
				
		}

