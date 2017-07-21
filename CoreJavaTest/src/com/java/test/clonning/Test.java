package com.java.test.clonning;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException{
		TestA testA= new TestA(90);
		TestB t1= new TestB(88, testA);
		TestB t2=(TestB)t1.clone();
		System.out.println(t1==t2);
		System.out.println(t1.testA==t2.testA);
		t1.print();
		t2.print();
		System.out.println("value changed !");
		t1.testA.x=101;
		t1.print();
		t2.print();
		
		
		
		
		
	}

}

class TestA {
	int x;

	public TestA(int x) {
		this.x = x;
	}
}

class TestB implements Cloneable{
	int y;
	TestA testA;

	public TestB(int y, TestA testA) {
		this.y = y;
		this.testA = testA;
	}

	void print() {
		System.out.println("TestB-y:" + y);
		System.out.println("TestA-x:" + testA.x);
	}

	/* Implementation of shallow clonning
	 * @see java.lang.Object#clone()
	 
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}*/
	
	/* Implementation of shallow clonning
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		TestA a =new TestA(this.testA.x);
		TestB b= new TestB(this.y, a);
		return b;
	}
	
}
