package com.amir.springcore;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Employee;
import com.springcore.dependentInjectionProperty.Employees;
import com.springcore.properties.Village;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/dependentInjectionProperty/dependentObject.xml");
       Employees employee=(Employees) context.getBean("emp");
       System.out.println(employee);
       
    }
}
