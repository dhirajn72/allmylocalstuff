package com.spring.command.validations;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.spring.command.CustomerCommand;

public class CustomerCommandValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return CustomerCommand.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {

		CustomerCommand cc = (CustomerCommand) target;
		String cname = cc.getCname();
		String email = cc.getEmail();
		String phone = cc.getPhone();

		if (cname == null || cname.length() == 0) {
			errors.rejectValue("cname", "errors.cname.required");
		}
		if (email == null || email.length() == 0) {
			errors.rejectValue("email", "errors.email.required");
		}

		else if (!email.endsWith("@gmail.com")) {
			errors.rejectValue("email", "errors.email.format1");
		}
		if (phone == null || phone.length() == 0) {
			errors.rejectValue("phone", "errors.phone.required");
		} else if (phone.length() != 10) {
			errors.rejectValue("phone", "errors.phone.length");
		} else if (phone.length() == 10) {
			try {
				Long.parseLong(phone);
			} catch (Exception e) {
				errors.rejectValue("phone", "errors.phone.number");
				e.printStackTrace();
			}
		}
	}
}
