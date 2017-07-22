package com.spring.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.spring.commands.SearchCommand;

public class SearchSidValidator implements Validator {

	@Override
	public boolean supports(Class<?> cls) {
		// TODO Auto-generated method stub
		return SearchCommand.class.equals(cls);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub

	}

}
