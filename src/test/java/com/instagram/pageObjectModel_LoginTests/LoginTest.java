package com.instagram.pageObjectModel_LoginTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.instagram.pageObjectModel_LoginPages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	WebDriver driver;
	LoginPage lp; //Here i'm building Has A relationship with Loginpage

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
		lp=new LoginPage(driver);
		lp.userNameID("nurulIslam");
		lp.passWordID("sumonahmed");
		lp.clickButton();
	}

	@AfterMethod
	public void closeApp() {
		if (driver !=null) {
			driver.quit();
		}
}}
