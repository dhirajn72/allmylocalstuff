package com.hibernate.persistence.TablePerSubClass;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "nemployee")
@PrimaryKeyJoinColumn(name = "eid")
public class NightshiftEmployee extends Employee {
	private String inTime;
	private String building;
	private String outTime;

	public NightshiftEmployee() {
		// TODO Auto-generated constructor stub
	}

	public NightshiftEmployee(String ename, String inTime, String building,
			String outTime) {
		super(ename);
		this.inTime = inTime;
		this.building = building;
		this.outTime = outTime;
	}

	public String getInTime() {
		return inTime;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getOutTime() {
		return outTime;
	}

	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	@Override
	public String toString() {
		return inTime + " " + building + " " + outTime;
	}

}
