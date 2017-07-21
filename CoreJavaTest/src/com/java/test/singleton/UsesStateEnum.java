package com.java.test.singleton;

import java.io.Serializable;

public class UsesStateEnum {
	private StateEnum state;

	public UsesStateEnum(final StateEnum newState) {
		this.state = newState;
	}

	public StateEnum getState() {
		return this.state;
	}

	public void verifyEnumIsSerializable() {
		System.out.print("StateEnum instance of Serializable? ");
		System.out.println(this.state instanceof Serializable ? "yes" : "no");
	}

	public static void main(final String[] arguments) {
		System.out.println("Verify Enum is Serializable");
		final UsesStateEnum me = new UsesStateEnum(StateEnum.COLORADO);
		me.verifyEnumIsSerializable();
	}
}