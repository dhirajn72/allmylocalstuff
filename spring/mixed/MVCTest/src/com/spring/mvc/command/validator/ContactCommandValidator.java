package com.spring.mvc.command.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.spring.mvc.command.ContactCommand;

public class ContactCommandValidator implements Validator {

	@Override
	public boolean supports(Class class1) {
		return ContactCommand.class.equals(class1);
	}

	@Override
	public void validate(Object commnad, Errors errors) {
		ContactCommand contactCommand = (ContactCommand) commnad;
		int id = contactCommand.getId();
		String name = contactCommand.getName();
		String email = contactCommand.getEmail();
		String phone = contactCommand.getPhone();
		String dob = contactCommand.getDob();

		if (id == 0) {
			errors.rejectValue("id", "errors.id.required");
		}
		if (name == null || name.trim().length() == 0) {
			errors.rejectValue("name", "errors.name.required");
		}
		if (email == null || email.trim().length() == 0) {
			errors.rejectValue("email", "errors.email.required");
		} else if (!email.endsWith("@gmail.com")) {
			errors.rejectValue("email", "errors.email.format");
		}
		if (phone == null || phone.trim().length() == 0) {
			errors.rejectValue("phone", "errors.phone.required");
		} else if (phone.length() != 10) {
			errors.rejectValue("phone", "errors.phone.required.length");
		}
		if (dob == null || dob.trim().length() == 0) {
			errors.rejectValue("dob", "errors.dob.required");
		}
	}
}
