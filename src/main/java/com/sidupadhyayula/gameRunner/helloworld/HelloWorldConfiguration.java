package com.sidupadhyayula.gameRunner.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address) { };

record Address(String firstLine, String city){ };

@Configuration 
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Sid";
	} 
	
	@Bean
	public int age() {
		return 24;
	} 
	
	@Bean
	public Person person() {
		return new Person("Ravi", 20, new Address("Main Street", "Utrecht"));		
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address()); //creating this bean in case we need to use existing information to use in the new bean 		
	}

	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		//this bean is created in case we need to use existing information by using parameters instead of methods 
		return new Person(name, age, address3); //name, age		
	}
	
	@Bean(name = "address2") 
	public Address address() {
		return new Address("Mainstreet", "Jacksonville");
	}
}
