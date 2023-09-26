package com.tcs.pages;

import com.tcs.lib.BaseClass;
import com.tcs.lib.Page;

public class HomePage extends BaseClass  implements Page{

	public boolean gotoHomePage() {
		gotoUrl("https://www.ballantynes.co.nz");
		return true;
	}
}
