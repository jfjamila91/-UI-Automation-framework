package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class HomePage extends BaseClass{
	
	//page factory
	
	@FindBy(linkText = "Shop now")
	WebElement ShopNow;
	
	@FindBy(linkText = "Services")
	WebElement Services;
		
	@FindBy(linkText = "all-Services")
	WebElement AllServices;
	
	@FindBy(linkText = "Departments")
	WebElement Departments;
		
	@FindBy(linkText = "all-Departments")
	WebElement AllDepartments;
	
	@FindBy(linkText= "Grocery")
	WebElement Grocery;
	
	@FindBy(linkText = "Deal of the Day")
	WebElement DealOfTheDayButton;
	
	@FindBy(partialLinkText = "Pharmacy")
	WebElement Pharmacy;
	
	@FindBy(xpath = "//div[@class='pv3 ph3 ph0-m bb b--near-white']")
	WebElement PharmacySections;
	
	//page factory initialization
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	 // page title 
	public String pagetitle() {
	String title = driver.getTitle();
	System.out.println("page title is : " + title);
	return title;
}
	public void ClickOnShopNow() {
		System.out.println("current page title is : " + driver.getTitle());
		ShopNow.click();
		driver.navigate().back();	
	}
	public void ClickOnServices() {
		System.out.println("current page title is : " + driver.getTitle());
		Services.click();
		AllServices.click();
		driver.navigate().back();
	}
	 public void ClickOnDepartments() {
		 System.out.println("current page title is : " + driver.getTitle());
		 Departments.click();
		 AllDepartments.click();
		 driver.navigate().back();
	 } 
    public void Grocery() {
	    System.out.println("current page title is : " + driver.getTitle());
	    Grocery.click();
	    driver.navigate().back();
    }   
	public void DealOfTheDay() {
	    DealOfTheDayButton.click();
	    driver.navigate().back();
}
    
    public void ClickOnPharmacy() {
    	System.out.println("current page title is : " + driver.getTitle());
    	Pharmacy.click();
    	String text = PharmacySections.getText();
    	System.out.println("all the Pharmacy sections are :" + text);
    	driver.navigate().back();
    }
    
}
