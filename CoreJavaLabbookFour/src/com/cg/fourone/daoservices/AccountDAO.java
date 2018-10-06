package com.cg.fourone.daoservices;
import com.cg.fourone.beans.Account;
public interface AccountDAO {
	Account save(Account account);
	Account findOne(int acNum);
}