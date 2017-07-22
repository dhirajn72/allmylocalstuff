package org.jpa.test.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//public class Student implements Cloneable {

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	@Column
	private String sname;
	@Column
	private String dob;
	@Column(name = "quali")
	private String qualification;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String sname, String dob, String qualification) {
		super();
		this.sname = sname;
		this.dob = dob;
		this.qualification = qualification;

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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", dob=" + dob
				+ ", qualification=" + qualification + ", courses=" + "]";
	}

	/*
	 * @Override protected Object clone() throws CloneNotSupportedException {
	 * Student st = new Student(this.sname, this.dob, this.qualification,
	 * this.courses, this.emails, this.phones, this.refs); return st; }
	 */
}
