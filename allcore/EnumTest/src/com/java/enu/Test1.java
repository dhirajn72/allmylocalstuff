/**
 * 
 */
package com.java.enu;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course = Course.JAVA;
		System.out.println(course);
		Course course2 = Course.SERVLETS;
		System.out.println(course2);
		Course course3 = Course.JDK;
		System.out.println(course3);
		Course course5 = Course.JDBC;
		System.out.println(course5);
		Course course4 = Course.SPRING;
		course4.setName("Sri");
		course4.setMonths(5);
		course4.setFee(5000);
		System.out.println(course4);

		System.out.println(Course.JAVA.ordinal());
		System.out.println(course4.ordinal());
		System.out.println(course.ordinal());
		System.out.println(course5.ordinal());

		Course[] courses = Course.JAVA.values();
		for (Course c : courses) {
			System.out.println(c);
		}

		System.out.println("val->" + Course.JAVA);

		Print.m1(Course.JAVA);
		
		
	}

}

class Print {
	public static void m1(Course type) {
		System.out.println(type);
	}
}

enum Course {
	JAVA("Manish", 2, 3000.0), JDBC("Manish", 1, 2000.0), SERVLETS("Manish", 4,
			4000.0), SPRING(), JDK;

	private String name;
	public int months;
	private double fee;

	/**
	 * 
	 */
	private Course() {
		// TODO Auto-generated constructor stub
	}

	private Course(String name, int months, double fee) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.months = months;
		this.fee = fee;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param months
	 *            the months to set
	 */
	public void setMonths(int months) {
		this.months = months;
	}

	/**
	 * @param fee
	 *            the fee to set
	 */
	public void setFee(double fee) {
		this.fee = fee;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Enum#toString()
	 */
	/*
	 * @Override public String toString() { // TODO Auto-generated method stub
	 * return name + " " + months + " " + fee; }
	 */
}

enum C1 {
	// EAST, WEST, NORTH, SOUTH;

	EAST {
		void m1() {

		}
	},
	WEST {
		void m1() {

		}
	},
	NORTH {
		void m1() {

		}
	},
	SOUTH {
		void m1() {

		}
	};
	abstract void m1();

}
