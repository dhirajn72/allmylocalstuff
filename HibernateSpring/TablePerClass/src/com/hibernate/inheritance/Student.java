package com.hibernate.inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "student")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "STUT_YPE", length = 10)
@DiscriminatorValue(value = "STU")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Cascade(value = CascadeType.ALL)
	@Column(name = "sid")
	private int sid;

	@Column(name = "name")
	private String name;

	public Student() {
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return sid + " " + name;
	}

}
