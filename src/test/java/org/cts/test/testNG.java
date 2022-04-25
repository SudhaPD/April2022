package org.cts.test;

import org.base.BaseClass;
import org.page.SearchPage;
import org.testng.annotations.Test;

public class testNG extends BaseClass{

	@Test
	public void test1() {
		launchBrowser("chrome");
		urlLaunch("https://www.flipkart.com/");
		SearchPage s=new SearchPage();
		s.search();
		
	}
	
}
