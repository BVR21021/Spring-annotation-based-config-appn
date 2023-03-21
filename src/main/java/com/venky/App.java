package com.venky;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.venky")
public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
		EmployeeBean E = (EmployeeBean) ctx.getBean(EmployeeBean.class);
		AddressBean A = (AddressBean) ctx.getBean(AddressBean.class);
		System.out.println(E.toString());
		System.out.println(A.toString());
	}
}
