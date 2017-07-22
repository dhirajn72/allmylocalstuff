package com.spring.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.spring.commands.AddCustomerCommand;

public class AddCustomerCommandValidation implements Validator {

	@Override
	public boolean supports(Class<?> cls) {
		return AddCustomerCommand.class.equals(cls);
	}

	@Override
	public void validate(Object command, Errors errors) {
		AddCustomerCommand addCustomerCommand = (AddCustomerCommand) command;
		String cname = addCustomerCommand.getCname();
		String email = addCustomerCommand.getEmail();
		String phone = addCustomerCommand.getPhone();
		String age = addCustomerCommand.getAge();

		if (cname == null || cname.trim().length() == 0) {
			errors.rejectValue("cname", "errors.cname.required");
		}
		if (email == null || email.trim().length() == 0) {
			errors.rejectValue("email", "errors.email.required");
		} else if (!email.endsWith("@gmail.com")) {
			errors.rejectValue("email", "errors.email.format1",
					new Object[] { "@gmail.com" }, null);
		}
		if (phone == null || phone.trim().length() == 0) {
			errors.rejectValue("phone", "errors.phone.required");
		} else if (phone.length() < 10 || phone.length() > 10) {
			errors.rejectValue("phone", "errors.phone.format1",
					new Object[] { 10 }, null);
		} else if (phone.length() == 10) {
			try {
				long x = Long.parseLong(phone);
			} catch (Exception e) {
				e.printStackTrace();
				errors.rejectValue("phone", "errors.phone.format1",
						new Object[] { 10 }, null);
			}
		}
		if (age == null || age.trim().length() == 0) {
			errors.rejectValue("age", "errors.age.required");
		} else if (age != null) {
			try {
				int a = Integer.parseInt(age);
				if (a < 18 || a > 100) {
					errors.rejectValue("age", "errors.age.format1",
							new Object[] { 18, 100 }, null);

				}
			} catch (Exception e) {
				errors.rejectValue("age", "errors.age.format1", new Object[] {
						18, 100 }, null);
			}
		}

	}
}
