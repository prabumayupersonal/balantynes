package com.tcs.lib;

import com.tcs.pages.HeaderPage;
import com.tcs.pages.HomePage;

public class PageObjectFactory {

	private static HomePage homePage =  new HomePage();
	private static HeaderPage headerPage = new HeaderPage();
	private PageObjectFactory() {}
	public static Page getPage(String pName) {
		switch(pName.toLowerCase()) {
		case "homepage":
			return homePage;
		case "headerpage":
			return headerPage;
		}
		return null;
	}
}
