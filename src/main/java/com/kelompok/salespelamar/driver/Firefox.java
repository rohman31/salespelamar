package com.kelompok.salespelamar.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {

	public WebDriver setStrategy() {
		System.setProperty("webdriver.gecko.driver", "/Users/rohman/Documents/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	
}
