package com.sidupadhyayula.gameRunner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sidupadhyayula.gameRunner.game.GameRunner;
import com.sidupadhyayula.gameRunner.game.GamingConsole;
import com.sidupadhyayula.gameRunner.game.MarioGame;
import com.sidupadhyayula.gameRunner.game.PacMan;
import com.sidupadhyayula.gameRunner.game.SuperContra;

@Configuration
public class GamingConfiguration {
	
	@Bean(name = "PacMan")
	public GamingConsole game() {
		var game = new PacMan();
		return game;
	}
	
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
			
	

}
