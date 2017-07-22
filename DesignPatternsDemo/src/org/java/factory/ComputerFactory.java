package org.java.factory;

import org.java.abstractfactory.model.Computer;
import org.java.abstractfactory.model.PC;
import org.java.abstractfactory.model.Server;

public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hdd,
			String cpu) {
		if ("PC".equalsIgnoreCase(type))
			return new PC(ram, hdd, cpu);
		else if ("Server".equalsIgnoreCase(type))
			return new Server(ram, hdd, cpu);

		return null;
	}
}