package com.java.dp.client;

import com.java.dp.AnimalFactory;
import com.java.dp.Cat;
import com.java.dp.Cow;
import com.java.dp.Dog;

public class Test {
	public static void main(String[] args) {

		Dog dog = (Dog) AnimalFactory.getAnimal("dog");
		dog.speak();
		Cow cow = (Cow) AnimalFactory.getAnimal("cow");
		cow.speak();
		Cat cat = (Cat) AnimalFactory.getAnimal("cat");
		cat.speak();

	}
}
