package com.cg.four.clients;

import java.util.Scanner;

import com.cg.fourone.account.services.AccountServices;
import com.cg.fourone.account.services.AccountServicesImpl;
import com.cg.fourone.beans.Account;
import com.cg.fourone.beans.Person;
import com.cg.fourone.exception.AccountDetailsNotFoundException;
import com.cg.fourone.exception.AccountServicesNotFoundException;


public class FourOneMainClass {

	public static void main(String[] args) throws AccountServicesNotFoundException,AccountDetailsNotFoundException{
		AccountServices accountServices = new AccountServicesImpl();
		try {
			int num;
			char c='Y';
			Account acco=new Account();
			Person per=new Person();
			while(c=='Y'){
				System.out.println("Account SYSTEM");
				System.out.println("1.Accept Account Details\n2.Deposit\n3.Withdraw");
				System.out.println("Enter the number to execute the command");
				Scanner in = new Scanner(System.in);
				num = in.nextInt();
				switch(num){
				case 1:
				{			
					System.out.println("Enter the name");
					per.setName(in.next());
					System.out.println("Enter the Age");
					per.setAge(in.nextInt());
					System.out.println("Enter the Balance");
					acco.setBalance(in.nextInt());
					accountServices.acceptaccountDetails(per.getName(),per.getAge(),acco.getBalance());
					System.out.println("To return to main menu press Y");
					c=in.next().charAt(0);
					break;
				}
				case 2:
				{System.out.println("Enter AcNum");
				int temp=in.nextInt();
				System.out.println(accountServices.getAccountDetails(temp));
				System.out.println("Enter the amount");
				accountServices.deposit(temp, in.nextInt());
				System.out.println(accountServices.getAccountDetails(temp));
				System.out.println("To return to main menu press Y");
				c=in.next().charAt(0);
				break;
				}
				case 3:
				{System.out.println("Enter AcNum");
				int temp=in.nextInt();
				System.out.println(accountServices.getAccountDetails(temp));
				System.out.println("Enter the amount");
				accountServices.withdrawal(temp, in.nextInt());
				System.out.println(accountServices.getAccountDetails(temp));
				System.out.println("To return to main menu press Y");
				c=in.next().charAt(0);
				break;
				}
				}
			}
		}catch(AccountServicesNotFoundException e){
			e.printStackTrace();
		}
		catch(AccountDetailsNotFoundException  e){
			e.printStackTrace();
		}
	}
}
