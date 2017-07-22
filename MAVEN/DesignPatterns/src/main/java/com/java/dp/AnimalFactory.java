package com.java.dp;

public class AnimalFactory {

	public static Animal getAnimal(String s) {
		if (s.equalsIgnoreCase("dog")) {
			return new Dog();
		} else if (s.equalsIgnoreCase("cow")) {
			return new Cow();
		} else if (s.equalsIgnoreCase("cat")) {
			return new Cat();
		} else
			return null;
	}

}
