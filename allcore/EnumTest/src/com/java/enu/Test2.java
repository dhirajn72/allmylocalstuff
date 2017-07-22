/**
 * 
 */
package com.java.enu;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test2A.Angles angles = Test2A.Angles.COS;
		System.out.println(angles);
		System.out.println(angles.name());
	}

}

class Test2A {

	enum Angles {
		SIN(0), COS(0, 190), TAN(180);
		/**
	 * 
	 */
		private int angle1;
		private int angle2;

		private Angles(int angle) {
			// TODO Auto-generated constructor stub
			this.angle1 = angle;
		}

		private Angles(int angle, int angle2) {
			// TODO Auto-generated constructor stub
			this.angle1 = angle;
			this.angle2 = angle2;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Enum#toString()
		 */
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return angle1 + " " + angle2;
		}
	}

}