package com.sidupadhyayula.gameRunner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
	}
 
}