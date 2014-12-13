package com.vincentramdhanie.snake;

public class SnakeController{

	SnakePanel snakePanel;

	public SnakeController(){

	}

	public SnakeController(SnakePanel snakePanel){
		this.snakePanel = snakePanel;
	}

	public void start(){
		//code to start the game
		snakePanel.startAnimation();
	}

	public void pause(){
		//code to pause the game
	}

	public void reset(){
		//code to reset the game
	}
}