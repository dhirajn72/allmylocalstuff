/**
 * 
 */
package com.java.oops;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Test3 {

}

abstract class Person {
	abstract void sleeping();

	abstract void walking();

	abstract void eating();

	abstract void talking();
}

class Adapter extends Person {

	void sleeping() {
	}

	void walking() {
	}

	void eating() {
	}

	void talking() {
	}
}

class Student extends Adapter {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.java.oops.Adapter#sleeping()
	 */
	@Override
	void sleeping() {
		// TODO Auto-generated method stub

	}

}
