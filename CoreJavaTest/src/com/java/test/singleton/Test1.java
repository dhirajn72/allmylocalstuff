package com.java.test.singleton;

public class Test1 {
	public static void main(String[] args) {
		SingletonAproach_04 aproach_04 = SingletonAproach_04.INSTANCE;
		System.out.println(aproach_04.hashCode());
		System.out.println();
		SingletonAproach_04 aproach_042 = SingletonAproach_04.INSTANCE;
		/*aproach_042.setId(99);
		aproach_042.setName("kumar");
		aproach_042.setBatch("MK-D1");
		*/
	
		System.out.println(aproach_042.getId() + " " + aproach_042.getName()
				+ " " + aproach_042.getBatch());
		System.out.println("***************");

		System.out.println(SingletonAproach_04.INSTANCE);
		System.out.println(SingletonAproach_04.INSTANCE2);
		System.out.println(SingletonAproach_04.INSTANCE==SingletonAproach_04.INSTANCE2);

	}
}

// Eager initialisation
final class SingletonAproach_01 {
	private static final SingletonAproach_01 APROACH_01 = new SingletonAproach_01();

	public static final SingletonAproach_01 getInstance() {
		return APROACH_01;
	}

}

// static initialisation
final class SingletonAproach_02 {
	private static final SingletonAproach_02 APROACH_02;

	static {
		APROACH_02 = new SingletonAproach_02();
	}

	public static final SingletonAproach_02 getInstance() {
		return APROACH_02;
	}

}

// Lazy initialisation
final class SingletonAproach_03 {
	private static SingletonAproach_03 APROACH_03 = null;

	public static final SingletonAproach_03 getInstance() {
		if (APROACH_03 == null)
			return new SingletonAproach_03();
		return APROACH_03;

	}
}

enum SingletonAproach_04 {
	INSTANCE(1, "name", "batch"), INSTANCE2;
	int id;
	String name;
	String batch;

	private SingletonAproach_04() {
		// TODO Auto-generated constructor stub
	}
	//by default, constructor of enum are private 
	SingletonAproach_04(int id, String name, String batch) {
		this.id = id;
		this.name = name;
		this.batch = batch;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getBatch() {
		return batch;
	}

	/*public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}
	*/
	
	
	
}
