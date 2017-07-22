package com.spring.java;

import java.beans.PropertyEditorSupport;

public class StudentIDEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {

		String bid = text.substring(0, 1);
		String sid = text.substring(2);

		StudentID id = new StudentID(bid, Integer.parseInt(sid));
		this.setValue(id);
	}

}
