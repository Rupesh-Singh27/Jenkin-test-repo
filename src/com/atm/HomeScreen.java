package com.atm;

import java.util.Map;
import java.util.Scanner;

public class HomeScreen {
	
	Database db;
	Map<Integer, Integer> accountInfo;
	SalaryAccount salaryAccount;
	SavingAccount savingAccount;
	Scanner scan;
	
	public HomeScreen() {
		db = new Database();
		salaryAccount = new SalaryAccount();
		savingAccount = new SavingAccount();
	}
	
	public void validateUser() {
		 scan = new Scanner(System.in);
		System.out.println("Welcome to ATM");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Please Enter your account number: ");
		int accountNo = scan.nextInt();
		System.out.println("Please Enter your password: ");
		int password = scan.nextInt();
		
		accountInfo = db.accountNoAnsPassword;
		
		for (Map.Entry<Integer, Integer> entry : accountInfo.entrySet()) {
			int accountNoToValidate = entry.getKey();
			int passwordNoToValidate = entry.getValue();
			
//			if(accountNoToValidate != accountNo && passwordNoToValidate != password) {
//				System.out.println("Invalid detail");
//			}
			
			if(accountNoToValidate == accountNo && passwordNoToValidate == password) {
				//methodCall in which user will select account type
				System.out.println("You have been validated.");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				chooseAccount();
			}
	
		}
		scan.close();
	}
	
	private void chooseAccount() {
		System.out.println("Welcome!! Please choose your account");
		scan = new Scanner(System.in);
		System.out.println("0. Exit \t 1. Saving Account \t 2. Salary Account");
		int choice = scan.nextInt();
		if(choice == 1) {
			System.out.println("You have chosen saving account");
			savingAccount.showMenu();
		}else if(choice == 2) {
			//Salary Account class
			System.out.println("You have chosen salary account");
			salaryAccount.showMenu();
		}else if(choice == 0){
			System.exit(0);
		}else {
			System.out.println("Please choose from the option only and should be a number");
		}
		scan.close();
	}
	
}
