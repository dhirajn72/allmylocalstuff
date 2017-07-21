package com.spring.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.spring.command.CidCommand;

public class EmailCommandValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return CidCommand.class.equals(arg0);
	}

	@Override
	public void validate(Object arg0, Errors errors) {
		CidCommand emailCommand = (CidCommand) arg0;

		int cid = emailCommand.getCid();

		if (cid == 0) {
			errors.rejectValue("cid", "errors.email");
		} else if (!((cid + "").matches("^[0-9]"))) {
			errors.rejectValue("cid", "errors.email.gmail");
		}
	}
}
