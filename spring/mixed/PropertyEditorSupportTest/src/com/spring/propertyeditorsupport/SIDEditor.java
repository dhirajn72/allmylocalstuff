package com.spring.propertyeditorsupport;

import java.beans.PropertyEditorSupport;

public class SIDEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		// text="B99-001"
		String bid = text.substring(0, 3);
		int sid = Integer.parseInt(text.substring(4));
		System.out.println(bid + " " + sid);
		StudentID studentID = new StudentID(sid, bid);
		this.setValue(studentID);
	}

}
