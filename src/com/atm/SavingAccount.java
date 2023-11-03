package com.atm;

import java.util.Random;
import java.util.Scanner;

public class SavingAccount {
	
	private Scanner scan;
	private double amount;
	private int upperBound;
	public SavingAccount() {
		upperBound = 1001;
		amount = new Random().nextInt(upperBound);
		scan = new Scanner(System.in);
	}
	
	public void showMenu() {
		int choice;
		String continueChoice;
		do {
			System.out.println("1.Deposit money");
			System.out.println("2.Withdraw money");
			System.out.println("3.Show balance");
			System.out.println("0.Exit");
			System.out.println("Please choose your operation from above options");
			choice = scan.nextInt();
			switch(choice) {
				case 1: 
					System.out.println("Deposit money function");
					this.depositMoney();
					break;
				case 2:
					System.out.println("Withdraw money function");
					this.withdrawnAmount();
					break;
				case 3:
					System.out.println("Show balance function");
					this.showBalance();
					break;
				case 0:
					System.exit(0);
					break;
				default:
					System.out.println("Please choose proper operation!!");	
			}
			System.out.println("Would you like to continue? (Y/N)");
			continueChoice = scan.next();
		}while(continueChoice.equalsIgnoreCase("Y"));
	}
	
	private void depositMoney() {
		System.out.println("Please enter the amount you want to deposit");
		double amount = scan.nextDouble();
		
		if(amount > 100000) {
			System.out.println("Your limit to deposit is till 100000");
		}else if(amount <= 0){
			System.out.println("Please enter valid amount to deposit");
		}else {
			this.amount = this.amount + amount;
			System.out.println("Amount deposited successfully!!");
		}
		
	}
	
	private void withdrawnAmount() {
		System.out.println("Please enter the amount you want to withdraw");
		double amount = scan.nextDouble();
		
		if(amount > 10000) {
			System.out.println("Your limit to withdraw is till 10000 at a time");
		}else if(amount <= 0){
			System.out.println("Please enter valid amount to withdraw");
		}else {
			this.amount = this.amount - amount;
			System.out.println("Amount withdrawn successfully!!");
			System.out.println("Collect your cash!!");
		}
	}
	
	private void showBalance() {
		System.out.println("Your account balance is " + this.amount);
	}
}
