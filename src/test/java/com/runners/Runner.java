package com.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



	@RunWith(Cucumber.class)

	@CucumberOptions(
			
	//Path of features file	
	features = "/Users/jamila/eclipse-workspace/WalmartAutomationProject/features",
	//Step definition file path
	glue =  {"com.stepDefinations"},

	//to find out Un-Defined Steps from features 
	dryRun = true,
	plugin = {"pretty","html:test-output"}
	)

	public class Runner{
		
		
	}


