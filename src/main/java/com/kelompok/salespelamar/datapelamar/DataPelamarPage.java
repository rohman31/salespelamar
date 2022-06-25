package com.kelompok.salespelamar.datapelamar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kelompok.salespelamar.driver.DriverSingleton;

public class DataPelamarPage {

	private WebDriver driver;
	
	public DataPelamarPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username")
	private WebElement inputEmail;
	
	@FindBy(name = "password")
	private WebElement inputPassword;
	
	@FindBy(css = "#content > div.panel-body > div > div.note-content > a")
	private WebElement btnKlik;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div[2]/div[2]")
	private WebElement txtWelcome;
	
	@FindBy(xpath = "//*[@id=\"page-container\"]/div/div[2]/div/div[2]/div")
	private WebElement messageErrorLogin;
	
	public void dataPelamarForm() {
//		inputEmail.sendKeys(username);
//		inputPassword.sendKeys(password);
		btnKlik.click();
	}
	
//	public String getTxtWelcome() {
//		return txtWelcome.getText();
//	}
//	
//	public String getMessageErrorLogin() {
//		return messageErrorLogin.getText();
//	}
}
