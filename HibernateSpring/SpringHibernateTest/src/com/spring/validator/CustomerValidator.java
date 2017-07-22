package com.spring.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.spring.command.Customer;

public class CustomerValidator implements Validator {

	@Override
	public boolean supports(Class<?> cls) {
		return Customer.class.equals(cls);
	}

	@Override
	public void validate(Object command, Errors errors) {

		Customer cust = (Customer) command;
		// int cid = cust.getCid();
		String cname = cust.getCname();
		String email = cust.getEmail();
		String phone = cust.getPhone();
		String age = cust.getAge();
		String company = cust.getCompany();
		String city = cust.getCity();

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
		}
		if (age == null || age.trim().length() == 0) {
			errors.rejectValue("age", "errors.age.required");
		} else if (age != null) {
			try {
				int age1 = Integer.parseInt(age);
				if (age1 > 18 && age1 < 100) {
				} else {
					errors.rejectValue("age", "errors.age.format1");
				}
			} catch (Exception e) {
				errors.rejectValue("age", "errors.age.format2");
				e.printStackTrace();
			}
		}
		if (company == null || company.trim().length() == 0) {
			errors.rejectValue("company", "errors.company.required");
		}
		if (city == null || city.trim().length() == 0) {
			errors.rejectValue("city", "errors.city.required");
		}
	}
}
