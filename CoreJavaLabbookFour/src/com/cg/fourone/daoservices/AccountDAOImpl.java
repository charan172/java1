package com.cg.fourone.daoservices;
import java.util.ArrayList;
import java.util.HashMap;
import com.cg.fourone.beans.Account;
public class AccountDAOImpl implements AccountDAO {
	private static HashMap<Integer,Account>accounts=new HashMap<>();
	private static int ACCOUNT_ID_COUNTER=101;
	@Override
	public Account save(Account account) {
		account.setAcNum(ACCOUNT_ID_COUNTER++);
		accounts.put(account.getAcNum(), account);
		return account;
	}
	@Override
	public Account findOne(int acNum) {
		return accounts.get(acNum);
	}
}