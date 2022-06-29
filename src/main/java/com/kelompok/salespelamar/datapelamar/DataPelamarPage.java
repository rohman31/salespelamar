package com.kelompok.salespelamar.datapelamar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.kelompok.salespelamar.driver.DriverSingleton;

public class DataPelamarPage {

	private WebDriver driver;
	
	public DataPelamarPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(name = "username")
//	private WebElement inputEmail;
//	
//	@FindBy(name = "password")
//	private WebElement inputPassword;
	
	@FindBy(css = "#content > div.panel-body > div > div.note-content > a")
	private WebElement btnKlik;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div[2]/div[2]")
	private WebElement txtWelcome;
	
	@FindBy(xpath = "//*[@id=\"page-container\"]/div/div[2]/div/div[2]/div")
	private WebElement messageErrorLogin;
	
	
	@FindBy(xpath = "//*[@id=\"content\"]/form[2]/div/div[1]/div/div[1]")
	private WebElement txtDataPelamar;
	
	
	@FindBy(xpath = "//*[@id=\"content\"]/form[2]/div/div[1]/div/div[3]/div[1]/div[2]/span/ul/li/div[3]/a")
	private WebElement btnContent;
	
	@FindBy(id = "file")
	private WebElement file;
	
	@FindBy(id = "Recruiter_Source")
	private WebElement SumberInformasi;
	
	@FindBy(id = "Recruiter")
	private WebElement Recruiter;
	
	
	@FindBy(css = "#fileupload > div > div.panel-footer.col-lg-12 > span > button")
	private WebElement btnSubmit;
	
	
	public void buttonDisisi() {
		btnKlik.click();
	}
	
	public void dataPelamarForm(String info, String recuit) {
		btnContent.click();
		file.sendKeys("/Users/rohman/Downloads/wallpaperbetter (2).jpg");
		btnSubmit.click();
		select(SumberInformasi).selectByValue(info);
		select(Recruiter).selectByVisibleText(recuit);
		
		
	}
	
	public void name() {
		
	}
	
	public static Select select(WebElement param) {
		Select tekan = new Select(param);
		return tekan;
	}

	public String getTxtDataPelamar() {
		return txtDataPelamar.getText();
	}
//	
//	public String getMessageErrorLogin() {
//		return messageErrorLogin.getText();
//	}
}
