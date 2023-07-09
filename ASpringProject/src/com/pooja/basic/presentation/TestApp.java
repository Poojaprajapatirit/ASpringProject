package com.pooja.basic.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pooja.basic.bean.Employee;

public class TestApp {

	public static void main(String[] args) {
		
	//	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("TestCfg.xml");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("TestCfg1.xml");
		Employee employee =applicationContext.getBean("employee",Employee.class);
		System.out.println(employee);

	}

}
