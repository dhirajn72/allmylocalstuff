package org.hibernate.primarykey.composite.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeeID implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String batch;

	public EmployeeID() {
	}

	public EmployeeID(int id, String batch) {
		super();
		this.id = id;
		this.batch = batch;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	@Override
	public int hashCode() {
		return (int) batch.hashCode() + id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof EmployeeID))
			return false;
		EmployeeID pk = (EmployeeID) obj;
		return this.id == pk.id && this.batch.equals(pk.batch);

	}

}
