package com.java.test.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test1 {
	public static void main(String[] args) {

		try {

			FileInputStream fileInputStream = new FileInputStream(
					new File(
							"/home/dhiraj/MyWorkSpace/workspace/CoreJavaTest/src/thirdparty.ser"));
			ObjectInputStream objectInputStream = new ObjectInputStream(
					fileInputStream);
			SerThirdParty serThirdParty = (SerThirdParty) objectInputStream
					.readObject();
			System.out.println("Object Deserialised !!");
			System.out.println(serThirdParty);
			System.out.println(serThirdParty.getThirdParty().toString());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/*
class SerThirdParty implements Serializable {
	int id;
	String name;

	public SerThirdParty(ThirdParty thirdParty) {
		this.id = thirdParty.getId();
		this.name = thirdParty.getName();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public ThirdParty getThirdParty() {
		return new ThirdParty(this.id, this.name);
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SerThirdParty [id=" + id + ", name=" + name + "]";
	}

}
*/