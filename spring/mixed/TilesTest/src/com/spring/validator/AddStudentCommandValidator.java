package com.spring.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.spring.commands.AddStudentCommand;

public class AddStudentCommandValidator implements Validator {

	@Override
	public boolean supports(Class<?> cls) {
		// TODO Auto-generated method stub
		return AddStudentCommand.class.equals(cls);
	}

	@Override
	public void validate(Object command, Errors errors) {
		// TODO Auto-generated method stub

		AddStudentCommand addStudentCommand = (AddStudentCommand) command;
		if (addStudentCommand.getSid() == null
				|| addStudentCommand.getSid().trim().length() == 0) {
			errors.rejectValue("sid", "errors.sid.required");
		} else if (addStudentCommand.getSid() != null) {
			String sid = addStudentCommand.getSid();
			if (!sid.startsWith("JLC-")) {
				errors.rejectValue("sid", "errors.sid.format1");
			} else {
				// sid=JLC-001
				String sid1 = addStudentCommand.getSid();
				String subSid = sid1.substring(4);
				try {
					int x = Integer.parseInt(subSid);
				} catch (Exception e) {
					errors.rejectValue("sid", "errors.sid.format3");
				}
			}
		}
		if (addStudentCommand.getSname() == null
				|| addStudentCommand.getSname().trim().length() == 0) {
			errors.rejectValue("sname", "errors.sname.required");
		}
		if (addStudentCommand.getEmail() == null
				|| addStudentCommand.getEmail().trim().length() == 0) {
			errors.rejectValue("email", "errors.email.required");

		} else if (!addStudentCommand.getEmail().endsWith("@gmail.com")) {
			errors.rejectValue("email", "errors.email.format1");
		}
		if (addStudentCommand.getPhone() == null
				|| addStudentCommand.getPhone().trim().length() == 0) {
			errors.rejectValue("phone", "errors.phone.required");

		} else if (addStudentCommand.getPhone() != null && addStudentCommand.getPhone().length()==10) {
			try {
				Long phone = Long.parseLong(addStudentCommand.getPhone());
			} catch (Exception e) {
				errors.rejectValue("phone", "errors.phone.format1");

			}
		}
		else{
			errors.rejectValue("phone", "errors.phone.format2");
		}

	}
}
