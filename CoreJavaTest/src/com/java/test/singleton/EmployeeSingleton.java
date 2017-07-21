package com.java.test.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeSingleton {
	public static void main(String[] args) {

		try {
			ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(
					new FileOutputStream("empser.ser"));
			Employee employee = Employee.getEmployee();
			System.out.println(employee);
			objectOutputStream1.writeObject(employee);
			objectOutputStream1.close();
			System.out.println("Object serialized !");

			System.out.println("==================================");

			ObjectInputStream objectInputStream1 = new ObjectInputStream(
					new FileInputStream("empser.ser"));
			Employee employee2 = (Employee) objectInputStream1.readObject();
			objectOutputStream1.close();
			
			System.out.println(employee2.getEmployee());
			System.out.println(employee2);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
