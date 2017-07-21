package org.java.abstractfactory;

import org.java.abstractfactory.model.Computer;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}
}