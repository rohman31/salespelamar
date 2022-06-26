package com.kelompok.salespelamar.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {

	@Value("${browser}")
	private String browser;
	
	@Value("${username}")
	private String username;
	
	@Value("${password}")
	private String password;
	
	@Value("${wrongPassword}")
	private String wrongPassword;
	
	@Value("${txtWelcome}")
	private String txtWelcome;
	
	@Value("${messageErrorLogin}")
	private String messageErrorLogin;
	
	@Value("${titlePageMyBookings}")
	private String titlePageMyBookings;

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTxtWelcome() {
		return txtWelcome;
	}

	public void setTxtWelcome(String txtWelcome) {
		this.txtWelcome = txtWelcome;
	}

	public String getWrongPassword() {
		return wrongPassword;
	}

	public void setWrongPassword(String wrongPassword) {
		this.wrongPassword = wrongPassword;
	}

	public String getMessageErrorLogin() {
		return messageErrorLogin;
	}

	public void setMessageErrorLogin(String messageErrorLogin) {
		this.messageErrorLogin = messageErrorLogin;
	}

	public String getTitlePageMyBookings() {
		return titlePageMyBookings;
	}

	public void setTitlePageMyBookings(String titlePageMyBookings) {
		this.titlePageMyBookings = titlePageMyBookings;
	}
	
	
	
	
}
