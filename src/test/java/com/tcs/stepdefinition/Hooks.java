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

		if (launchBrowser("chrome")) {
			maximizeBrowser();
		} else {
			Assert.assertTrue(false, "Browser launching : ");
		}

	}

	@After
	public void tearDown(Scenario scenario) {
		scenario.attach(getBytesScreenshot(), "image/png", scenario.getName());
		quitBrowser();
		System.out.println("Quit Browser......");

	}
}
