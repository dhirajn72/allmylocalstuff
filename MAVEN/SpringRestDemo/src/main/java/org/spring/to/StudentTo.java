package org.spring.to;

public class StudentTo {
	int sid;
	String sname;
	String email;
	String phone;

	public StudentTo() {
		// TODO Auto-generated constructor stub
	}

	public StudentTo(int sid, String sname, String email, String phone) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.phone = phone;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
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
		return "StudentTo [sid=" + sid + ", sname=" + sname + ", email="
				+ email + ", phone=" + phone + "]";
	}

}
