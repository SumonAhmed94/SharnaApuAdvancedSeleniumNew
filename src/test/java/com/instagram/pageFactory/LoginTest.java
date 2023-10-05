package com.instagram.pageFactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
WebDriver driver;
String userNameID="username";
String passWordID="password";
String logibButtonID="//button[@class='_acan _acap _acas _aj1-']";
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
	findById(userNameID).sendKeys("Nurul");
	findById(passWordID).sendKeys("Sumonhhf");
	findById(logibButtonID).click();
	


}
public WebElement findById(String id) {// helper method - doesn;t have any @Test annotations.
	return driver.findElement(By.name(id));//if we put this helper method then we don;t need to put the driver so many times
	
}

	
}

