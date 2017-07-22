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
		String sid = loginCommand.getSid();// JLC-99

		if (sid == null || sid.length() == 0) {
			errors.rejectValue("sid", "errors.sid.required");

		} else if (!sid.startsWith("JLC-")) {
			errors.rejectValue("sid", "errors.sid.format1");

		} else {
			try {
				String sub = sid.substring(4);
				System.out.println("Validation:"+sub);
				int sid1 = Integer.parseInt(sub);
			} catch (Exception e) {
				e.printStackTrace();
				errors.rejectValue("sid", "errors.sid.format2");
			}

		}

	}
}
