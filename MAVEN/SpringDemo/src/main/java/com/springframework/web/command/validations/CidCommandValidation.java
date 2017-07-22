package com.springframework.web.command.validations;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.springframework.web.command.CidCommand;

public class CidCommandValidation implements Validator {

	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return CidCommand.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {

		String cid = ((CidCommand) target).getCid();

		if (cid == null || cid.trim().length() == 0) {
			errors.rejectValue("cid", "errors.cid.mandatory");
		} else {
			try {
				int id = Integer.parseInt(cid);
			} catch (Exception e) {
				errors.rejectValue("cid", "errors.cid.integer");
			}
		}

	}

}
