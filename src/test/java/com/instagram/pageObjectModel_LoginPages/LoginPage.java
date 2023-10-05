package com.instagram.pageObjectModel_LoginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;

public LoginPage(WebDriver driver) {// user Define Constructor
	super();
	this.driver = driver;
	PageFactory.initElements(driver, this); //
}
public WebElement userNameID(String enterYourUserName) {
	WebElement uName=driver.findElement(By.name("username")); // creating an object
	// this is POM style coding
	uName.clear();
	uName.sendKeys(enterYourUserName);
	return uName;
	
}
public WebElement passWordID(String enetrYourPassWord) {
	WebElement pass=driver.findElement(By.name("password"));
	pass.clear();
	pass.sendKeys(enetrYourPassWord);
	return pass;
	
}
public void clickButton() {
	WebElement loginButton=driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
	loginButton.click();
}
}
