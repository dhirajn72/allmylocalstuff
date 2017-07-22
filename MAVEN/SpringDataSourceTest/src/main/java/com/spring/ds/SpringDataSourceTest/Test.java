package com.spring.ds.SpringDataSourceTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext-ds.xml");
		DataSourceTest dataSourceTest = (DataSourceTest) applicationContext
				.getBean("ds");
		dataSourceTest.showMysqlInfo();
	}

}
