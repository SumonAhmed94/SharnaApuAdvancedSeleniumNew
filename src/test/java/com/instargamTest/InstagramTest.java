package com.instargamTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InstagramTest {
	public class FacebookTest {
		 WebDriver driver; // Creating Instance Variable
			@Test
			public void testOne() {
				System.out.println("hello testNg");
			}
			
			@Test
			public void openChromeBrowser() {
				WebDriverManager.chromedriver().setup();
				driver= new ChromeDriver(); //open a browser Chrome
				driver.get("https://www.instagram.com/"); //open application
			}
			@Test
			public void openEdgeBrowser() {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver(); //open a browser Edge
				driver.get("https://www.instagram.com/");
				
			}
		}
}
