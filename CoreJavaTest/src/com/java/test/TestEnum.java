package com.java.test;

public enum TestEnum {
	FIRST, SECOND;

	private int field;

	public int getField() {
		return field;
	}

	public void setField(int field) {
		this.field = field;
	}

	@Override
	public String toString() {
		return super.toString() + ", field=" + field;
	}
}
