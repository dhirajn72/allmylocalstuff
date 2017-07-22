package com.springframework.web.command.validations;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.springframework.web.command.CustomerCommand;

public class CustomerCommandValidation implements Validator {

	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return CustomerCommand.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {

		CustomerCommand customerCommand = (CustomerCommand) target;
		String cid = customerCommand.getCid();
		String cname = customerCommand.getCname();
		String email = customerCommand.getEmail();
		String phone = customerCommand.getPhone();
		String age = customerCommand.getAge();

		if (cname == null || cname.trim().length() == 0) {
			errors.rejectValue("cname", "errors.cname.required");
		}
		if (email == null || email.trim().length() == 0) {
			errors.rejectValue("email", "errors.email.required");
		} else if (!email.endsWith("@gmail.com")) {
			errors.rejectValue("email", "errors.email.format1");
		}
		if (phone == null || phone.trim().length() == 0) {
			errors.rejectValue("phone", "errors.phone.required");
		} else if (phone.length() != 10) {
			errors.rejectValue("phone", "errors.phone.length");
		} else {
			try {
				long x = Long.parseLong(phone);
			} catch (Exception e) {
				e.printStackTrace();
				errors.rejectValue("phone", "errors.phone.integer");
			}

		}
		if (age == null || age.trim().length() == 0) {
			errors.rejectValue("age", "errors.age.required");
		} else if (age.length() != 0) {
			try {
				int x = Integer.parseInt(age);
				if (x < 10 || x > 80) {
					errors.rejectValue("age", "errors.age.range");
				}
			} catch (Exception e) {

				errors.rejectValue("age", "errors.age.integer");
			}
		}
	}

}
