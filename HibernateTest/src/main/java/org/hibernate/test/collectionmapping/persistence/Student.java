package org.hibernate.test.collectionmapping.persistence;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

//@Entity
//public class Student implements Cloneable {

public class Student {

	private int sid;
	private String sname;
	private String dob;
	private String qualification;

	/*
	 * In case of annotation this annotation can be used to specify the caching
	 * strategy for collection types, In case of xml configuration, it will be something like this,
	 * <array name="courses" table="courses" cascade="delete" fetch="select">
	 *	 	<cache usage="read-only" />
	 *		...
	 * </array>
	 */
	// @Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
	private String[] courses;
	private List<String> emails;
	private Set<Long> phones;
	private Map<String, Long> refs;

	public Student() {
	}

	public Student(String sname, String dob, String qualification,
			String[] courses, List<String> emails, Set<Long> phones,
			Map<String, Long> refs) {
		super();
		this.sname = sname;
		this.dob = dob;
		this.qualification = qualification;
		this.courses = courses;
		this.emails = emails;
		this.phones = phones;
		this.refs = refs;
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

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public Set<Long> getPhones() {
		return phones;
	}

	public void setPhones(Set<Long> phones) {
		this.phones = phones;
	}

	public Map<String, Long> getRefs() {
		return refs;
	}

	public void setRefs(Map<String, Long> refs) {
		this.refs = refs;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", dob=" + dob
				+ ", qualification=" + qualification + ", courses="
				+ Arrays.toString(courses) + ", emails=" + emails + ", phones="
				+ phones + ", refs=" + refs + "]";
	}

	/*
	 * @Override protected Object clone() throws CloneNotSupportedException {
	 * Student st = new Student(this.sname, this.dob, this.qualification,
	 * this.courses, this.emails, this.phones, this.refs); return st; }
	 */
}
