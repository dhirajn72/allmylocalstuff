package com.java.test.string;

public class Test2 {
	public static void main(String[] args) {
		Student s1 = new Student("SRI");
		Employee e1 = new Employee("SRI");
		s1.show(e1);

	}

}

class Student {
	String snm;

	public Student(String snm) {
		super();
		this.snm = snm;
	}

	void show(Employee em) {
		String msg = "SRI";
		System.out.println(em.enm == msg); // true
		System.out.println(em.enm == snm); // true
		em.display(this);

	}

}

class Employee {
	String enm;

	public Employee(String enm) {
		super();
		this.enm = enm;
	}

	void display(Student st) {
		String var = "SRI";
		System.out.println(st.snm == var); // t
		System.out.println(st.snm == enm); // t
	}
}
