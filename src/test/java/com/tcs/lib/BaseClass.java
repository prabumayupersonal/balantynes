package com.tcs.lib;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	private static WebDriver driver;

	protected  String getBase64Screenshot()
	{
	    return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
	}
	
	protected byte[] getBytesScreenshot() {
	return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}

	
	protected Boolean launchBrowser(String bName) {
		switch (bName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			return false;
		}
		return true;
	}

	protected void gotoUrl(String url) {
		driver.get(url);
	}

	protected void maximizeBrowser() {
		driver.manage().window().maximize();
	}

	protected void quitBrowser() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
}
