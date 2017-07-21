package com.java.test.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test3 {
	public static void main(String[] args) {

		try {

			ObjectOutputStream objectOutputStream = new ObjectOutputStream(
					new FileOutputStream("singletonSer.ser"));
			// MySingletonTest singletonTest = new MySingletonTest();

			Singleton singleton = Singleton.getInstance();

			// objectOutputStream.writeObject(singletonTest);
			System.out.println(singleton);
			objectOutputStream.writeObject(singleton);

			System.out.println("Singleton serialized successfully !!");

			objectOutputStream.close();

			System.out
					.println("=================================================");

			ObjectInputStream objectInputStream1 = new ObjectInputStream(
					new FileInputStream("singletonSer.ser"));
			// MySingletonTest mySingletonTest = (MySingletonTest)
			// objectInputStream.readObject();
			Singleton singletonTest1 = (Singleton) objectInputStream1
					.readObject();
			objectInputStream1.close();

			ObjectInputStream objectInputStream2 = new ObjectInputStream(
					new FileInputStream("singletonSer.ser"));

			Singleton singletonTest2 = (Singleton) objectInputStream2
					.readObject();
			objectInputStream2.close();

			System.out.println("These are desialized objects");
			System.out.println(singletonTest1.getInstance());
			System.out.println(singletonTest2.getInstance());
			System.out.println("================================");
			System.out.println(singletonTest1);
			System.out.println(singletonTest2);

			System.out.println("Singleton deserialized successfully !!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
