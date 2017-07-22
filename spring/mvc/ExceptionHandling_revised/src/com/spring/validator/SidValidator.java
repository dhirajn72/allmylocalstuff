package com.spring.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.spring.command.SidSearchCommand;

public class SidValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		return SidSearchCommand.class.equals(arg0);
	}

	@Override
	public void validate(Object command, Errors errors) {
		SidSearchCommand sidSearchCommand = (SidSearchCommand) command;
		String sid = sidSearchCommand.getSid();
		if (sid == null || sid.length() == 0) {
			errors.rejectValue("sid", "error.sid.required", null, null);
		} else if (!sid.startsWith("JLC-")) {
			errors.rejectValue("sid", "error.sid.required1", null, null);
		} else if (sid != null) {
			String x = sid.substring(4);
			try {
				int y = Integer.parseInt(x);
			} catch (Exception e) {
				errors.rejectValue("sid", "error.sid.required2", null, null);
			}

		}

	}

}
