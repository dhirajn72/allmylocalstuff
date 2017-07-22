package com.spring.commands;

public class AddStudentCommand {

	private String sid;
	private String sname;
	private String email;
	private String phone;

	public AddStudentCommand() {

	}
	

	public AddStudentCommand(String sid, String sname, String email,
			String phone) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.phone = phone;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return sid + " " + sname + " " + email + " " + phone;
	}

}
