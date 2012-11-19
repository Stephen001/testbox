package com.awesome.turtlenecksandgotos.testbox.server;

import javax.ejb.Local;

import com.awesome.turtlenecksandgotos.testbox.persistence.AccountEntity;

@Local
public interface AccountManagerLocal {
	public AccountEntity create(String username, String password, String email);
	
	public AccountEntity login(String username, String password);
}
