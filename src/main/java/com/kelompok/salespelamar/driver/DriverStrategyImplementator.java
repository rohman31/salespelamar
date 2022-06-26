package com.kelompok.salespelamar.driver;

import com.kelompok.salespelamar.utils.Constants;

public class DriverStrategyImplementator {

	public static DriverStrategy chooseStrategy(String strategy) {
		
		switch(strategy) {
		case Constants.CHROME:
			return new Chrome();
			
		case Constants.FIREFOX:
			return new Firefox();
		
		default:
			return null;
		}
		
	}
	
}
