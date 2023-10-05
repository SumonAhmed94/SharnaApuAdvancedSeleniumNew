package com.instagram.POM_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory {
WebDriver driver;
// POM should have its own Constructor
public LoginPageWithPageFactory(WebDriver driver) {//User define constructor 
	super();
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
//POM formula is each webelement have its own method.
// formula=@FindBy(how=How.attributes/locator name, using= values/xpth/css)
//                 data type and variable name

@FindBy(how=How.NAME, using="username") WebElement userNameID;
public WebElement userNameMethod(String enterYourUserName) {
	userNameID.sendKeys(enterYourUserName);
	return userNameID;
	
}
@FindBy(how=How.NAME, using="password") WebElement passWordID;
public WebElement passWordMethod(String enterYourPassWord) {
	passWordID.sendKeys(enterYourPassWord);
	return passWordID;
}

@FindBy(how=How.XPATH, using="//button[@class='_acan _acap _acas _aj1-']") private WebElement loginButtonID;
public void LoginButtonMethod() {
	loginButtonID.click();
}
}
