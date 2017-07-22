package com.java.core;

public final class ImmutableClassEmployee {
	private final int eid;
	private final String ename;
	private final String email;
	private final long phone;
	private final Address address;

	public ImmutableClassEmployee(int eid, String ename, String email,
			long phone, Address address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.email = email;
		this.phone = phone;
		this.address = new Address(address.getAid(), address.getStreet(),
				address.getPin());
	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public String getEmail() {
		return email;
	}

	public long getPhone() {
		return phone;
	}

	public Address getAddress() {
		return new Address(this.address.getAid(), this.address.getStreet(),
				this.address.getPin());
	}

	@Override
	public String toString() {
		return eid
				+ " "
				+ ename
				+ " "
				+ email
				+ " "
				+ phone
				+ " "
				+ address;
	}
}
