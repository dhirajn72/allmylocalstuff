package com.java.core;

public class FinalizationTest {
	public static void main(String[] args) {

		FinalizeDemo finaliseDemo = new FinalizeDemo(88, "Singh");
		finaliseDemo = null;
		FinalizeDemo finaliseDemo2 = new FinalizeDemo(88, "Singh");
		FinalizeDemo finaliseDemo3 = new FinalizeDemo(88, "Singh");
		finaliseDemo2 = finaliseDemo3;

		FinalizeDemo finaliseDemo4 = new FinalizeDemo(88, "Singh");
		FinalizeDemo finaliseDemo5 = new FinalizeDemo(88, "Singh");
		finaliseDemo4 = null;
		finaliseDemo5 = null;
		/*
		 * Runs the finalization methods of any objects pending finalization.
		 * Calling this method suggests that the Java virtual machine expend
		 * effort toward running the <code>finalize</code> methods of objects
		 * that have been found to be discarded but whose <code>finalize</code>
		 * methods have not yet been run. When control returns from the method
		 * call, the virtual machine has made a best effort to complete all
		 * outstanding finalizations. <p> The virtual machine performs the
		 * finalization process automatically as needed, in a separate thread,
		 * if the <code>runFinalization</code> method is not invoked explicitly.
		 * <p> The method {@link System#runFinalization()} is the conventional
		 * and convenient means of invoking this method.
		 */
		// System.runFinalization();
		System.gc();

		System.out.println("main ends");

	}
}

class FinalizeDemo {

	int roll;
	String name;

	public FinalizeDemo(int roll, String name) {
		System.out.println("object created");
		this.roll = roll;
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	protected void finalize() throws Throwable {
		System.err.println("finalize() called");
	}

}
