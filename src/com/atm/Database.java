package com.atm;

import java.util.HashMap;
import java.util.Map;

public class Database {
	
	Map<Integer, Integer> accountNoAnsPassword;
	
	public Database() {
		
		accountNoAnsPassword = new HashMap<Integer, Integer>();
		
		accountNoAnsPassword.putIfAbsent(12345678, 0000);
		accountNoAnsPassword.putIfAbsent(87654321, 1111);
		accountNoAnsPassword.putIfAbsent(12348765, 2222);
		accountNoAnsPassword.putIfAbsent(43215678, 3333);
		accountNoAnsPassword.putIfAbsent(01234567, 4444);
		
		
	}

}
