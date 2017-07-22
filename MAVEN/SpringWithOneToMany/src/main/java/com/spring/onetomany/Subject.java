package com.spring.onetomany;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "subjects")
public class Subject {
	

	private String subject;

	@ManyToOne
	@JoinColumn(name = "sid", referencedColumnName = "sid")
	private Student student;

	public Subject(String subject) {
		super();
		this.subject = subject;

	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Subject [subject=" + subject + ", student=" + student + "]";
	}

}
