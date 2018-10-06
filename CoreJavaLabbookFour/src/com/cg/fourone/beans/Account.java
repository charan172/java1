package com.cg.fourone.beans;

public class Account {
private int acNum;
private Person acHolder;
private double balance;
public Account(int acNum, Person acHolder, double balance) {
	super();
	this.acNum = acNum;
	this.acHolder = acHolder;
	this.balance = balance;
}
public Account(Person acHolder, double balance) {
	super();
	this.acHolder = acHolder;
	this.balance = balance;
}
public Account() {
	super();
}
public int getAcNum() {
	return acNum;
}
public void setAcNum(int acNum) {
	this.acNum = acNum;
}
public Person getAcHolder() {
	return acHolder;
}
public void setAcHolder(Person acHolder) {
	this.acHolder = acHolder;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
@Override
public String toString() {
	return "Account [acNum=" + acNum + ", acHolder=" + acHolder + ", balance="
			+ balance + "]";
}

}