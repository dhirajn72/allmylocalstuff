package com.spring.propertyeditorsupport;

import java.beans.PropertyEditorSupport;
import java.util.ArrayList;
import java.util.List;

public class EmailEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {

		List<String> strings = new ArrayList<String>();
		String[] emails = text.split(",");
		for (String s1 : emails) {
			strings.add(s1);
		}
		this.setValue(strings);

	}
}
