package com.cg.fourone.account.services;
import com.cg.fourone.beans.Account;
import com.cg.fourone.beans.Person;
import com.cg.fourone.exception.AccountDetailsNotFoundException;
import com.cg.fourone.exception.AccountServicesNotFoundException;

public interface AccountServices {
double deposit(int acNum,int amount) throws AccountDetailsNotFoundException,AccountServicesNotFoundException;
double withdrawal(int acNum,int amount) throws AccountDetailsNotFoundException,AccountServicesNotFoundException;
Account getAccountDetails(int acNum)throws  AccountDetailsNotFoundException,AccountServicesNotFoundException;
int acceptaccountDetails(String name,int age,double balance) throws AccountServicesNotFoundException;

}
