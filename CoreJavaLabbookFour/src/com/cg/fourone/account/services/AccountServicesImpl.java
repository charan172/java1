package com.cg.fourone.account.services;

import com.cg.fourone.beans.Account;
import com.cg.fourone.beans.CurrentAccount;
import com.cg.fourone.beans.Person;
import com.cg.fourone.beans.SavingsAccount;
import com.cg.fourone.daoservices.AccountDAO;
import com.cg.fourone.daoservices.AccountDAOImpl;
import com.cg.fourone.exception.AccountDetailsNotFoundException;
import com.cg.fourone.exception.AccountServicesNotFoundException;




public class AccountServicesImpl implements AccountServices{
	private AccountDAO accountDAO = new AccountDAOImpl() ;
	@Override
	public Account getAccountDetails(int acNum)
			throws AccountDetailsNotFoundException,
			AccountServicesNotFoundException {
		Account account = accountDAO.findOne(acNum);
		if(account==null) throw new AccountDetailsNotFoundException("Account Details Not Found");
		return account;
	}

	@Override
	public double deposit(int acNum, int amount)throws AccountDetailsNotFoundException,AccountServicesNotFoundException {
		Account account=getAccountDetails(acNum);
		CurrentAccount cac=new CurrentAccount();
		if(amount>cac.getOverDraftLimit())
			System.out.println("Amount entered is more than overdraft limit");
		else account.setBalance(account.getBalance()+amount);
		return account.getBalance();
	}

	@Override
	public double withdrawal(int acNum, int amount)throws AccountDetailsNotFoundException,AccountServicesNotFoundException {
		Account saccount=  getAccountDetails(acNum);
		SavingsAccount sac=new SavingsAccount();
		if(saccount.getBalance()-amount<sac.getMinbalance())
			System.out.println("Funds not sufficient");
		else{
			saccount.setBalance(saccount.getBalance()-amount);
		}
		return saccount.getBalance();
	}

	@Override
	public int acceptaccountDetails(String name,int age, double balance)throws AccountServicesNotFoundException {
		Account account = new Account(new Person(name,age),balance); 
		account=accountDAO.save(account);
		return account.getAcNum();

	}

}
