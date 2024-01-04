package com.sidupadhyayula.gameRunner;

import com.sidupadhyayula.gameRunner.game.GameRunner;
import com.sidupadhyayula.gameRunner.game.MarioGame;
import com.sidupadhyayula.gameRunner.game.PacMan;
import com.sidupadhyayula.gameRunner.game.SuperContra;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//var game = new MarioGame();
		//var game = new SuperContra();
		var game = new PacMan();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
