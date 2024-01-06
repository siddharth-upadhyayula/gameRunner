package com.sidupadhyayula.gameRunner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sidupadhyayula.gameRunner.game.GameRunner;
import com.sidupadhyayula.gameRunner.game.GamingConsole;
import com.sidupadhyayula.gameRunner.game.MarioGame;
import com.sidupadhyayula.gameRunner.game.PacMan;
import com.sidupadhyayula.gameRunner.game.SuperContra;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			
			context.getBean(GamingConsole.class).up();
			
			
			
			context.getBean(GameRunner.class).run();
			
			
		}
		
		
	}
 
}
