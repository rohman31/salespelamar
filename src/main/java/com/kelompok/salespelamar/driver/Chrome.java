package com.kelompok.salespelamar.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome implements DriverStrategy {

	public WebDriver setStrategy() {
//		System.setProperty("webdriver.chrome.driver", "/Users/rohman/Documents/chromedriver");
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
}
