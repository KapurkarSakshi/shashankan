package com.cg.login.service;

import com.cg.login.entity.Login;
import com.cg.login.exception.LoginException;

public interface LoginService {
	public  String validate(String userName, String userPass) throws LoginException;
	public Login create(Login login) throws LoginException;
}