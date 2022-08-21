package com.springcore.Autowire.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/Autowire/Annotation/configautowire.xml");
        Employee employee =context.getBean("employee",Employee.class);
        //Employee.class --in this case no need to type cast
        System.out.println(employee);
	}

}
