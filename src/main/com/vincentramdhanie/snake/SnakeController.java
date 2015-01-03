package com.vincentramdhanie.snake;

import java.awt.Graphics2D;

public class SnakeController{

	SnakePanel snakePanel;
	Snake snake;

	public SnakeController(){

	}

	public SnakeController(SnakePanel snakePanel){
		this.snakePanel = snakePanel;
		snake = new Snake();
		snakePanel.setController(this);
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

	public void draw(Graphics2D g){
		snake.draw(g);
	}
}