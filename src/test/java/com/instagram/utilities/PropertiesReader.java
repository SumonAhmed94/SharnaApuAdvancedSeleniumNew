package com.instagram.utilities;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
Properties prop;

public PropertiesReader() {
	prop=new Properties();
	String propertyFile="src/test/resources/test.properties";
	FileInputStream fis;
	try {
		fis = new FileInputStream(propertyFile);// try means file will be find from the properties
		prop.load(fis);// prop = load the file
	} catch (IOException e) {
	
		e.printStackTrace();//error will be print
	}
}
public String readBrowser() {
	return prop.getProperty("browser");

}
public String getQaUrl() {
	return prop.getProperty("QaUrl");
}
public String getusernName() {
	return prop.getProperty("userNameID");
}
public String getPassWord() {
	return prop.getProperty("passWordID");
}

public static void main(String []args) {
	PropertiesReader pr=new PropertiesReader();
	String browserName=pr.readBrowser();
	System.out.println(browserName);
	}
}

