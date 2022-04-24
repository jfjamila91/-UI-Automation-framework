package com.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pageObjects.HomePage;
import com.pageObjects.LoginPage;

public class LoginPageTest extends BaseClass {

	LoginPage loginpage;
	HomePage homepage;
	public LoginPageTest() throws IOException {
		super();	
	}

@BeforeMethod
public void setup() throws IOException {
	initialization();
	loginpage = new LoginPage();
	homepage = new HomePage();
}
@Test
public void PageTitleTest() {
	String title = loginpage.pageTitle();
	System.out.println("title of this logn page is : " + title);
	AssertJUnit.assertEquals(title, "Walmart.com | Save Money. Live Better");
}
@Test
public void loginTest() throws IOException {
	loginpage.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
	loginpage.pageTitle();
	
}
@Test
public void CurrentUsernameTest() throws IOException {
	loginTest();
	loginpage.validateCurrentUserName();
}
@AfterMethod
public void TearDown() {
	driver.close();
}
}

   

