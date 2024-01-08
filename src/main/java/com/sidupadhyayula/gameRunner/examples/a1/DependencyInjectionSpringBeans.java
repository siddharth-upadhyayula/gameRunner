package com.sidupadhyayula.gameRunner.examples.a1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class DependencyInjectionSpringBeans {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(DependencyInjectionSpringBeans.class)) {
			
			
			
		}
		
		
	}
 
}
