package com.spring.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.spring.core.command.LoginCommand;

public class LoginCommandValidation implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		return LoginCommand.class.equals(arg0);
	}

	@Override
	public void validate(Object command, Errors errors) {
		LoginCommand loginCommand = (LoginCommand) command;
		String username = loginCommand.getUsername();
		String password = loginCommand.getPassword();

		if (username == null || username.length() == 0) {
			//errors.rejectValue("username", "errors.username.required");// null,"ENTER USERNAME"
			errors.rejectValue("username", "errors.username.required", null,"ENTER USERNAME");
			
		}
		if (password == null || password.length() == 0) {
			//errors.rejectValue("password", "errors.password.required");// null,"ENTER PASSWORD"
			errors.rejectValue("password", "errors.password.required", null,"ENTER PASSWORD");
			}
	}
}
