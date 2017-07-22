package com.java.core;

import java.beans.PropertyEditorSupport;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ListEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] arr = text.split(",");
		List<String> list = Arrays.asList(arr);
		this.setValue(list);

	}
}
