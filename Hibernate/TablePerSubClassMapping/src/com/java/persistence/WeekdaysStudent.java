package com.java.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "wstudent")
@PrimaryKeyJoinColumn(name="sid")
public class WeekdaysStudent extends CurrentStudent {

	@Column(name = "qualification")
	private String qualification;

	@Column(name = "percentage")
	private String percentage;

	@Column(name = "yoe")
	private int yoe;

	public WeekdaysStudent() {

	}

	public WeekdaysStudent(String sname, String city, String status,
			double totalfee, double feebal, String timings, String branch,
			String qualification, String percentage, int yoe) {
		super(sname, city, status, totalfee, feebal, timings, branch);
		this.qualification = qualification;
		this.percentage = percentage;
		this.yoe = yoe;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public int getYoe() {
		return yoe;
	}

	public void setYoe(int yoe) {
		this.yoe = yoe;
	}

	@Override
	public String toString() {
		return qualification + " " + percentage + " " + yoe;
	}

}
