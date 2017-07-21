package com.java.test.immutable;

public class Immutable {
	public static void main(String[] args) {
		Adress adress = new Adress("palya", "KA", "india");
		Employee e1 = new Employee(99, "dhiraj", adress);
		Employee e2 = new Employee(99, "dhiraj", adress);
		System.out.println(e1 == e2);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.equals(e2));

	}
}

final class Employee {
	private int eid;
	private String ename;
	private Adress adress;

	public Employee(int eid, String ename, Adress adress) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.adress = new Adress(adress.getStreet(), adress.getState(),
				adress.getCountry());
	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public Adress getAdress() {
		return adress;
	}

	@Override
	public String toString() {
		return "Employee [eid="
				+ eid
				+ ", ename="
				+ ename
				+ ", adress="
				+ new Adress(this.adress.getStreet(), this.adress.getState(),
						this.adress.getCountry()) + "]";
	}

}

class Adress {
	String street;
	String state;
	String country;

	public Adress(String street, String state, String country) {
		super();
		this.street = street;
		this.state = state;
		this.country = country;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
