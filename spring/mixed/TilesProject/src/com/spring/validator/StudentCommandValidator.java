/**
 * 
 */
package com.spring.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.spring.command.StudentCommand;

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
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return StudentCommand.class.equals(arg0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.validation.Validator#validate(java.lang.Object,
	 * org.springframework.validation.Errors)
	 */
	@Override
	public void validate(Object commnad, Errors errors) {

		StudentCommand studentCommand = (StudentCommand) commnad;
		int sid = studentCommand.getSid();
		String sname = studentCommand.getSname();
		String email = studentCommand.getEmail();
		String phone = studentCommand.getPhone();
		int age = studentCommand.getAge();

		if (sid == 0) {
			errors.rejectValue("sid", "errors.sid.required", null,
					"SID REQUIRED");
		} else if (("" + sid) != null) {
			try {
				System.out.println(sid);
				Integer.parseInt(sid + "");
				System.out.println(sid);
			} catch (Exception e) {
				errors.rejectValue("sid", "errors.sid.required1", null,
						"ONLY DIGITS ALLOWED");
			}
		}

		if (sname == null || sname.trim().length() == 0) {
			errors.rejectValue("sname", "errors.sname.required", null,
					"SNAME REQUIRED");
		}
		if (email == null || email.trim().length() == 0) {
			errors.rejectValue("email", "errors.email.required", null,
					"SNAME REQUIRED");
		} else if (!email.endsWith("@gmail.com")) {
			errors.rejectValue("email", "errors.email.required1", null,
					"GMAIL DOMAIN ALLOWED");

		}
		if (phone == null || phone.trim().length() == 0) {
			errors.rejectValue("phone", "errors.phone.required", null,
					"PHONE REQUIRED");
		} else if (phone.length() != 10) {
			errors.rejectValue("phone", "errors.phone.required1", null,
					"PHONE SHOULD BE 10 DIGITS");
		} else if (phone.length() == 10) {
			try {
				Long.parseLong(phone);
			} catch (Exception e) {
				errors.rejectValue("phone", "errors.phone.required2", null,
						"DIGITS ARE ALLOWED");
			}
		}
		if (age < 5 || age > 100) {
			errors.rejectValue("age", "errors.age.required", null,
					"AGE BETWEEN 5 TO 100 ALLOWED");
		}

	}
}
