package com.spring.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.spring.command.CidCommand;

public class CidCommandValidation implements Validator {

	@Override
	public boolean supports(Class<?> cls) {
		return CidCommand.class.equals(cls);
	}

	@Override
	public void validate(Object command, Errors errors) {
		CidCommand cidCommand = (CidCommand) command;

		String cid = cidCommand.getCid();
		String exp = "^[0-9]*";
		if (cid == null || cid.trim().length() == 0) {
			errors.rejectValue("cid", "errors.cid.required");
		}

		if (!cid.matches(exp)) {
			errors.rejectValue("cid", "errors.cid.integer");
		}
	}

}
