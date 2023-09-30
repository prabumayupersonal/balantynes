package com.tcs.stepdefinition;

import org.testng.Assert;

import com.aventstack.extentreports.service.ExtentService;
import com.tcs.lib.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {

	@Before
	public void setUp() {
		ExtentService.getInstance().setSystemInfo("Selenium Version", "2.46");
	
	}

	@After
	public void tearDown(Scenario scenario ) {
      
	}
}
