package com.cg.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.login.entity.Login;
import com.cg.login.exception.LoginException;
import com.cg.login.service.LoginService;

@RestController
@CrossOrigin("*")
public class LoginController {
	@Autowired
    LoginService loginService;
	@GetMapping("login/validate/{user}/{pass}")
	public ResponseEntity<String> validate(@PathVariable("user") String userName,@PathVariable("pass") String userPass) throws LoginException{
		String role = loginService.validate(userName, userPass);
		ResponseEntity<String> re = new ResponseEntity(role,HttpStatus.OK);
		 return re;
	}
	@PostMapping("login")
	public ResponseEntity<Login> create(@RequestBody Login login) throws LoginException{
		Login user =loginService.create(login);
		ResponseEntity<Login> re = new ResponseEntity(user,HttpStatus.OK);
		return re;
	}
}
