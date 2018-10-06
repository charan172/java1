package com.cg.fourone.beans;

public class CurrentAccount extends Account{
private final int overDraftLimit=25000;
	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(int acNum, Person acHolder, double balance) {
		super(acNum, acHolder, balance);
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(Person acHolder, double balance) {
		super(acHolder, balance);
		// TODO Auto-generated constructor stub
	}

	public int getOverDraftLimit() {
		return overDraftLimit;
	}

}
