package com.cg.fourone.beans;

public class SavingsAccount extends Account{
private final int minbalance=500;
	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(int acNum, Person acHolder, double balance) {
		super(acNum, acHolder, balance);
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(Person acHolder, double balance) {
		super(acHolder, balance);
		// TODO Auto-generated constructor stub
	}

	public int getMinbalance() {
		return minbalance;
	}

}
