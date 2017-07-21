package com.spring.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.spring.commands.CidCommand;

public class CidCommandValidator implements Validator {

	@Override
	public boolean supports(Class<?> cls) {
		// TODO Auto-generated method stub
		return CidCommand.class.equals(cls);
	}

	@Override
	public void validate(Object command, Errors errors) {
		// TODO Auto-generated method stub

		CidCommand cidCommand = (CidCommand) command;
		String cid = cidCommand.getCid();

		if (cid == null || cid.trim().length() == 0) {
			errors.rejectValue("cid", "errors.cid.mandatory");
		} else if (cid != null) {
			try {
				int x = Integer.parseInt(cid);
			} catch (Exception e) {
				errors.rejectValue("cid", "errors.cid.digit");
			}
		}

	}

}
