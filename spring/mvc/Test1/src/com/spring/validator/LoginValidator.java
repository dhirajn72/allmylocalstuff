package com.spring.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.spring.commands.LoginCommand;

public class LoginValidator implements Validator {

	@Override
	public boolean supports(Class<?> cls) {
		// TODO Auto-generated method stub
		return LoginValidator.class.equals(cls);
	}

	@Override
	public void validate(Object command, Errors errors) {
		// TODO Auto-generated method stub

		LoginCommand loginCommand = (LoginCommand) command;

		String un = loginCommand.getUsername();
		String ps = loginCommand.getPassword();

		if (un == null || un.length() == 0) {
			errors.rejectValue("username", "errors.un.required", null, null);
		}
		if (ps == null || ps.length() == 0) {
			errors.rejectValue("password", "errors.ps.required", null, null);
		}

		
	}

}
