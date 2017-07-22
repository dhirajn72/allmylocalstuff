package com.java.dp.af;

public abstract class AnimalColorFactory {
	public static AnimalColor getColor(String c) {
		if (c.equalsIgnoreCase("black")) {
			return new Black();
		} else if (c.equalsIgnoreCase("white")) {
			return new White();
		} else if (c.equalsIgnoreCase("red")) {
			return new Red();
		} else
			return null;

	}

}
