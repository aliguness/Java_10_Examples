package com.bilgeadam.lesson013;

/*
 * bir interest rate account number birde balance  ozelliklerim var 
 * 
 * şimdi bu sınıfı bir soyutlamınızı istiyorum bizim bankamızın faiz oranı 0.05 olsun 
 * 
 * daha sonra faiz getirsini heseplayan bir metod yazalım getInterestRate ==>
 * 
 * bir de getInformation metodu yazıp hesap bilgilerimiz gosterelim 
 * 
 * 
 */
public class BankAccount {

	static double interestRate;
	private double balance;
	private String accountNumber;

	public BankAccount(String accountNumber, double balance) {
		// Tek parametreli const. cagırımı
		// this.accountNumber = accountNumber;
		// this(balance, accountNumber);
		this(accountNumber);
		this.balance = balance;

	}

	public BankAccount(double balance, String accountNumber) {

		this(accountNumber, balance);
		// this.balance = 5892;

	}

	public BankAccount(String accountNumber) {
		this();
		this.accountNumber = accountNumber;

	}

	public BankAccount() {
		this.balance = 100;
	}

	public void getInformation() {
//		System.out.println(this);
//		BankAccount bankAccount = this;
		System.out.println("====HESAP BİLGİLERİ====");
		System.out.println("hesap numarası= " + accountNumber);
		System.out.println("hesap bakiyesi= " + balance);
		System.out.println("faiz oranı=" + interestRate);
		System.out.println("faiz getirisi= " + getInterestRate());
	}

	public double getInterestRate() {

		return this.balance * interestRate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountNumber() {

		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {

		this.accountNumber = accountNumber;
	}

}