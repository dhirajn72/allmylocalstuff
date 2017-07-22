package com.hibernate.core;

import javax.persistence.*;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name = "vehicle")
@Proxy(lazy = false)
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "vehId")
	private int vehId;

	@Column(name = "vehName")
	private String vehName;

	@Column(name = "vehColour")
	private String vehColour;

	@Column(name = "vehCost")
	private String vehCost;

	@ManyToOne
	@JoinColumn(name = "ownerId", referencedColumnName = "ownerId")
	private Owner owner;

	public Vehicle() {

	}

	public Vehicle(String vehName, String vehColour, String vehCost) {
		super();
		this.vehName = vehName;
		this.vehColour = vehColour;
		this.vehCost = vehCost;
	}

	public int getVehId() {
		return vehId;
	}

	public void setVehId(int vehId) {
		this.vehId = vehId;
	}

	public String getVehName() {
		return vehName;
	}

	public void setVehName(String vehName) {
		this.vehName = vehName;
	}

	public String getVehColour() {
		return vehColour;
	}

	public void setVehColour(String vehColour) {
		this.vehColour = vehColour;
	}

	public String getVehCost() {
		return vehCost;
	}

	public void setVehCost(String vehCost) {
		this.vehCost = vehCost;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return this.vehId + " " + this.vehName + " " + this.vehColour + " "
				+ this.vehCost;
	}
}