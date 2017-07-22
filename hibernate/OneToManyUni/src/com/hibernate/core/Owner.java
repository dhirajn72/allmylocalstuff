package com.hibernate.core;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name = "owner")
public class Owner {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ownerId")
	private int ownerId;

	@Column(name = "ownerName")
	private String ownerName;

	@Column(name = "ownerEmail")
	private String ownerEmail;

	@Column(name = "ownerPhone")
	private String ownerPhone;

	public Owner() {

	}

	public Owner(String ownerName, String ownerEmail, String ownerPhone) {
		super();
		this.ownerName = ownerName;
		this.ownerEmail = ownerEmail;
		this.ownerPhone = ownerPhone;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerEmail() {
		return ownerEmail;
	}

	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}

	public String getOwnerPhone() {
		return ownerPhone;
	}

	public void setOwnerPhone(String ownerPhone) {
		this.ownerPhone = ownerPhone;
	}


	@Override
	public String toString() {
		return this.ownerId + " " + this.ownerName + " " + this.ownerEmail
				+ " " + this.ownerPhone;
	}

}
