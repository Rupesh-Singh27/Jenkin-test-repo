package com.atm;

import com.atm.Database;

public class Main {

	public static void main(String[] args) {
		new Database();
		HomeScreen homeScreen = new HomeScreen();
		homeScreen.validateUser();
	}

}
