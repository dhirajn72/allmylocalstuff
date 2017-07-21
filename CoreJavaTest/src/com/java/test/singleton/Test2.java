package com.java.test.singleton;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class Test2 {
	public static void main(String[] args) {

		try {
			FileOutputStream fileOutputStream = new FileOutputStream(new File(
					"singletonSer.ser"));
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(
					fileOutputStream);
		//	MySingletonTest singletonTest = new MySingletonTest();

			Singleton singleton = Singleton.getInstance();

			// objectOutputStream.writeObject(singletonTest);
			System.out.println(singleton);
			objectOutputStream.writeObject(singleton);

			System.out.println("Singleton serialized successfully !!");

			objectOutputStream.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

final class MySingletonTest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final MySingletonTest singletonTest = new MySingletonTest();

	public static MySingletonTest getInstance() {
		return singletonTest;

	}
}

class Singleton implements Serializable {

	private static Singleton instance;

	public static Singleton getInstance() {

		if (instance == null) {
			System.out.println("instance is null");
			synchronized (Singleton.class) {
				System.out.println("locked Singleton class");
				instance = new Singleton();
			}
		}
		return instance;
	}

	private Singleton() {
		System.out.println("DC");
	}

	/*
	 * private void readObject(ObjectInputStream ois) throws IOException,
	 * ClassNotFoundException { ois.defaultReadObject(); instance = this; }
	 */
	private Object readResolve() throws ObjectStreamException {
		System.out.println("readResolve()");
		return instance;
	}
}
