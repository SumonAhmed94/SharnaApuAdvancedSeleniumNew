package com.instagram.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.instagram.utilities.PropertiesReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
public WebDriver driver;
PropertiesReader reader; // creating instance variable
 @BeforeMethod
 public void openApp() {
	 reader=new PropertiesReader(); // creating object
	 String browser= reader.readBrowser();
	 if (browser.equalsIgnoreCase("Chrome")) { // we are using here conditionals statements loop
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	 }
	 else if (browser.equalsIgnoreCase("edge")) {
		 WebDriverManager.edgedriver().setup();
		 driver= new EdgeDriver();
	 }
	 else {
		 System.out.println("Chrome is default browser");
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	 }
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get(reader.getQaUrl());
 }
 @AfterMethod
	public void closeApp() {
		if (driver != null) {
			driver.quit();
		}
}}
