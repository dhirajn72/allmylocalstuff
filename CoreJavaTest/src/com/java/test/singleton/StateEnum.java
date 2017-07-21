package com.java.test.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Enum example with unnecessary and ignored serialization specification
 * details. The Enum is already Serializable and attempts to control its
 * serialization behavior are ignored. See Section 1.12 ("Serialization of Enum
 * Constants") of the "Java Object Serialization Specification Version 6.0".
 */
public enum StateEnum implements Serializable {
	ALABAMA("Alabama", "AL"), CALIFORNIA("California", "CA"), COLORADO(
			"Colorado", "CO"), IDAHO("Idaho", "ID"), UTAH("Utah", "UT"), WYOMING(
			"Wyoming", "WY");

	// Don't do this: Don't specify serialVersionUID for enums and don't use
	// an arbitrary constant such as 42L for all versions; use serialver on Sun
	// JDK
	private static final long serialVersionUID = 42L;

	private String stateName;
	private String stateAbbreviation;

	StateEnum(final String newStateName, final String newStateAbbreviation) {
		this.stateName = newStateName;
		this.stateAbbreviation = newStateAbbreviation;
	}
}