package com.instagram.POM_PageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestWithPageFactory {
WebDriver driver;
LoginPageWithPageFactory lpf; // creating a Instance variable

@BeforeMethod
public void openApp() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.instagram.com/");
}
@Test
public void validLoginTest() {
	lpf= new LoginPageWithPageFactory(driver); // creating referential object
	lpf.userNameMethod("nurul");
	lpf.passWordMethod("Sumonshhd");
	lpf.LoginButtonMethod();
}
@AfterMethod
public void closeApp() {
	if (driver !=null) { // driver has a value
		driver.quit();
	}
}
}
