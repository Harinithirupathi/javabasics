package com.types;

public class SavingAccount {
	public static int annualInterestRate;
	private double savingsbalance;
	public SavingAccount(double balance) {
		this.savingsbalance = balance;
	}
	public void calculateMonthlyInterest() {
		double interest = (savingsbalance * (annualInterestRate/100.0))/12;
		savingsbalance = savingsbalance + interest;
	}
	public static void modifyInterestRate(int newValue) {
       annualInterestRate = newValue;
}
	public void showbalance() {
		System.out.println("balance"+savingsbalance);
	}
	public static void main(String[] args) {
		SavingAccount sa1 = new SavingAccount(2000);
		SavingAccount sa2 = new SavingAccount(3000);
		SavingAccount.modifyInterestRate(4);
		sa1.showbalance();
		sa2.showbalance();
		sa1.calculateMonthlyInterest();
		sa2.calculateMonthlyInterest();
		sa1.showbalance();
		sa2.showbalance();
		SavingAccount.modifyInterestRate(5);
		sa1.showbalance();
		sa2.showbalance();
		sa1.calculateMonthlyInterest();
		sa2.calculateMonthlyInterest();
		sa1.showbalance();
		sa2.showbalance();
	}
}





