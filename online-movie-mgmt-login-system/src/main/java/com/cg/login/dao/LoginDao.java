package com.cg.login.dao;

import com.cg.login.entity.Login;
import com.cg.login.exception.LoginException;

public interface LoginDao {
public Login validate(String userName, String userPass) throws LoginException;
public Login create(Login login)throws LoginException;
public Login findUser(String userName) throws LoginException;
}
