/**
 * 
 */
package com.spring.commad;

import java.rmi.StubNotFoundException;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * @author Dhiraj Kumar
 * @website www.facebook.com/dhiraj.singh.90
 */
public class StudentCommandValidator implements Validator {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.validation.Validator#supports(java.lang.Class)
	 */
	@Override
	public boolean supports(Class<?> cls) {
		// TODO Auto-generated method stub
		return StudentCommand.class.equals(cls);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.validation.Validator#validate(java.lang.Object,
	 * org.springframework.validation.Errors)
	 */
	@Override
	public void validate(Object command, Errors errors) {

		StudentCommand command2 = (StudentCommand) command;
		String sid = command2.getSid();

		if (sid == null || sid.trim().length() == 0) {
			errors.rejectValue("sid", "errors.sid.required", null, "Enter SID");
		} else if (!sid.startsWith("JLC-")) {
			errors.rejectValue("sid", "errors.sid.required1", null,
					"START WITH JLC-");
		} else {
			// JLC-99
			String string = sid.substring(4);
			try {
				int x = Integer.parseInt(string);
			} catch (Exception e) {
				errors.rejectValue("sid", "errors.sid.required2", null,
						"ONLY DIGITS ALLOWED AFTER JLC-");
			}

		}

	}
}
