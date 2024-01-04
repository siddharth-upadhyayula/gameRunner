package com.sidupadhyayula.gameRunner;

import com.sidupadhyayula.gameRunner.game.GameRunner;
import com.sidupadhyayula.gameRunner.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();

	}

}
