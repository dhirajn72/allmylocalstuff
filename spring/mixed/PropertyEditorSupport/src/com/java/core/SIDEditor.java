package com.java.core;

import java.beans.PropertyEditorSupport;

public class SIDEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		// text=B-001
		String bid = text.substring(0, 2);
		String sid = text.substring(2);
		SID sid2 = new SID(bid, Integer.parseInt(sid));
		this.setValue(sid2);

	}

}
