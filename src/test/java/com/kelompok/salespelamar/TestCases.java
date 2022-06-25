package com.kelompok.salespelamar;

import javax.management.loading.PrivateClassLoader;

public enum TestCases {

	T1("Testing Login Invalid Customer"),
	T2("Testing Login Valid Customer"),
	T3("testing Menu My Bookings Customer");
	
	
	private String testName;
	
	TestCases(String testName) {
		this.testName = testName;
	}
	
	public String getTestname() {
		return testName;
	}
}
