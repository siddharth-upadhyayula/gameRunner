package com.sidupadhyayula.gameRunner;

import com.sidupadhyayula.gameRunner.game.GameRunner;
import com.sidupadhyayula.gameRunner.game.MarioGame;
import com.sidupadhyayula.gameRunner.game.PacMan;
import com.sidupadhyayula.gameRunner.game.SuperContra;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//var game = new MarioGame();
		//var game = new SuperContra();
		
		var game = new PacMan(); //1: Object Creation
		
		var gameRunner = new GameRunner(game);
		//2: Object Creation + Wiring of Dependencies
		// Game is a Dependency of GameRunner
		
		gameRunner.run();

	}
 
}
