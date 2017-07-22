package com.java.core;

public class Test15 {
	public static void main(String[] args) {
		try (MyResource myResource1 = new MyResource(1);
				MyResource myResource2 = new MyResource(2);

		) {

			System.out.println(myResource1);
			System.out.println(myResource2);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}

class MyResource implements AutoCloseable {

	int a;

	public MyResource() {
		System.out.println("DC");
	}

	public MyResource(int a) {
		this.a = a;
		System.out.println("1-Args");
	}

	@Override
	public void close() throws Exception {
		System.out.println("Resources are closed");

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}