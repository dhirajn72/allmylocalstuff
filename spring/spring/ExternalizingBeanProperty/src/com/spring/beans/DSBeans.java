package com.spring.beans;

import javax.annotation.Resource;

public class DSBeans {
	@Resource(name = "mysqlDS")
	DriverClass mysqlClass;
	@Resource(name = "oracleDS")
	DriverClass oracleClass;

	public void showDS() {
		System.out.println(mysqlClass);
		System.out.println(oracleClass);

	}

}
