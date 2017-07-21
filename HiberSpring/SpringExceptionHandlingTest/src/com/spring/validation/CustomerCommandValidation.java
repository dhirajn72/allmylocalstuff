package com.spring.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.spring.command.CustomerCommand;
import com.spring.validation.exceptions.InvalidPhoneNoException;

public class CustomerCommandValidation implements Validator {

	@Override
	public boolean supports(Class<?> cls) {
		// TODO Auto-generated method stub
		return CustomerCommand.class.equals(cls);
	}

	@Override
	public void validate(Object command, Errors errors) {
		// TODO Auto-generated method stub

		CustomerCommand customerCommand = (CustomerCommand) command;

		String exp = "^[0-9]*";
		String cid = customerCommand.getCid();
		String cname = customerCommand.getCname();
		String email = customerCommand.getEmail();
		String phone = customerCommand.getPhone();
		String age = customerCommand.getAge();
		//System.out.println(phone.length());

		/*
		 * if (cid == null || cid.trim().length() == 0) {
		 * errors.rejectValue("cid", "errors.cid.required"); }
		 */
		if (cname == null || cname.trim().length() == 0) {
			errors.rejectValue("cname", "errors.cname.required");
		}
		if (email == null || email.trim().length() == 0) {
			errors.rejectValue("email", "errors.email.required");
		} else if (!email.endsWith("@igate.com")) {
			errors.rejectValue("email", "errors.email.formtat1");
		}
		if (phone == null || phone.trim().length() == 0) {
			errors.rejectValue("phone", "errors.phone.required");
		} else if (phone.length() < 10 || phone.length() > 10) {
			try {
				int phone1 = Integer.parseInt(phone);
				throw new InvalidPhoneNoException();
			} catch (Exception e) {
				errors.rejectValue("phone", "errors.phone.format1");
			}
		}
		if (age == null || age.trim().length() == 0) {
			errors.rejectValue("age", "errors.age.required");
		} else if (!age.matches(exp)) {
			errors.rejectValue("age", "errors.age.format1");
		}

	}

}
