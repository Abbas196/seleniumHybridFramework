package com.banking_app.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.banking_app.pageObjects.Loginpage;

public class LoginTestCase1 extends BaseClass{
	@Test
	public void loginTest() throws IOException {
		driver.get(baseURL);
		Loginpage lp = new Loginpage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
		}
		else {
			captureScreen(driver,"LoginTest");
			Assert.assertTrue(false);
		}
	}
}
