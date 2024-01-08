package com.sidupadhyayula.gameRunner.examples.a0;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MongoDBDataService implements DataService{
	
	@Override
	public int[] retrieveData() {
		return new int[] {11, 22, 33, 44, 55};
	}
}

