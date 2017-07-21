package com.spring.java;

import java.beans.PropertyEditorSupport;

public class FeeEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {

		String[] arr = text.split(",");
		String totalFee = arr[0];
		String feePaid = arr[1];
		String feeBal = arr[2];

		Fee fee = new Fee(Double.parseDouble(totalFee),
				Double.parseDouble(feePaid), Double.parseDouble(feeBal));

		this.setValue(fee);
	}
}
