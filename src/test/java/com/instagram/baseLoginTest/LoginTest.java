package com.instagram.baseLoginTest;

import org.testng.annotations.Test;

import com.instagram.POM_PageFactory.LoginPageWithPageFactory;
import com.instagram.base.BaseTest;
import com.instagram.utilities.PropertiesReader;

public class LoginTest extends BaseTest {
	LoginPageWithPageFactory lpf;
	PropertiesReader propertiesreader;
	
	@Test
	public void validLoginTest() {
		propertiesreader=new PropertiesReader();
		lpf=new LoginPageWithPageFactory(driver);
		lpf.userNameMethod(propertiesreader.getusernName());
		lpf.passWordMethod(propertiesreader.getPassWord());
		lpf.LoginButtonMethod();
	}
	
}
