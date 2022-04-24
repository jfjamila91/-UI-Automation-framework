package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class HomePageTest extends BaseClass {
	HomePageTest homepage;
	
	public HomePageTest() throws IOException {
		
		}
	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		homepage = new HomePageTest();
	}
	
	@Test
	   public void pageTitleTest()  {
		   homepage.pageTitleTest();
	   }
	@Test
	public void ClickOnShopNowTest() {
		homepage.ClickOnShopNowTest();
	}
	@Test
	public void ClickOnServicesTest() {
		homepage.ClickOnServicesTest();
	}
	@Test
	 public void ClickOnDepartmentsTest() {
		 homepage.ClickOnDepartmentsTest();
	 }
	@Test
	public void GroceryButtonTest() {
		homepage.GroceryButtonTest();
		
	}
	@Test
	public void DealOfTheDayTest() {
		homepage.DealOfTheDayTest();
	}
	
	
	
	@Test
	 public void ClickOnPharmacyTest() {
		 homepage.ClickOnPharmacyTest();
		  }

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
}
