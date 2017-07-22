package com.java.p3;

public class Clonning {
	public static void main(String[] args) throws CloneNotSupportedException {
		Hai hai = new Hai(88);
		Hello h1 = new Hello(99, hai);
		Hello h2 = (Hello) h1.clone();
		System.out.println(hai.x);//88
		System.out.println(h1.hai.x);//88
		System.out.println(h2.hai.x);//88
		h1.hai.x = 100;
		System.out.println(hai.x);//100
		System.out.println(h1.hai.x);//100
		System.out.println(h2.hai.x);//100

	}
}

class Hai {
	int x;

	public Hai() {

	}

	public Hai(int x) {

		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
}

class Hello implements Cloneable {
	int x;
	Hai hai;

	public Hello() {
	}

	public Hello(int x, Hai hai) {
		this.x = x;
		this.hai = hai;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public Hai getHai() {
		return hai;
	}

	public void setHai(Hai hai) {
		this.hai = hai;
	}

	
	 /*@Override protected Object clone() throws CloneNotSupportedException {
	  return super.clone(); }
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		if (this instanceof Cloneable) {
			System.out.println(this);
			Hai hai = new Hai(this.hai.getX());//getting the exact value and creating the new object
			Hello hello = new Hello(this.getX(), hai);
			return hello;
		} else {
			throw new CloneNotSupportedException();
		}
	}
}
