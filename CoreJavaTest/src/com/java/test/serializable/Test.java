package com.java.test.serializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test {
	public static void main(String[] args) {

		try {

			ThirdParty thirdParty = new ThirdParty(99, "dk");
			SerThirdParty serThirdParty = new SerThirdParty(thirdParty);

			FileOutputStream fileOutputStream = new FileOutputStream(
					new File(
							"/home/dhiraj/MyWorkSpace/workspace/CoreJavaTest/src/thirdparty.ser"));
			ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(serThirdParty);
			System.out.println("Object serialised !!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

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

class ThirdParty {
	int id;
	String name;

	public ThirdParty() {
		// TODO Auto-generated constructor stub
	}

	public ThirdParty(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ThirdParty [id=" + id + ", name=" + name + "]";
	}

}
