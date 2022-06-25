package com.kelompok.salespelamar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kelompok.salespelamar.driver.DriverSingleton;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username")
	private WebElement inputEmail;
	
	@FindBy(name = "password")
	private WebElement inputPassword;
	
	@FindBy(css = "#page-container > div > div.right-content > div > div.login-content > form > div.login-buttons")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div[2]/div[2]")
	private WebElement txtWelcome;
	
	@FindBy(xpath = "//*[@id=\"page-container\"]/div/div[2]/div/div[2]/div")
	private WebElement messageErrorLogin;
	
	public void loginForm(String username, String password) {
		inputEmail.sendKeys(username);
		inputPassword.sendKeys(password);
		btnLogin.click();
	}
	
	public String getTxtWelcome() {
		return txtWelcome.getText();
	}
	
	public String getMessageErrorLogin() {
		return messageErrorLogin.getText();
	}
}
