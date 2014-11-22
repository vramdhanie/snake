package com.vincentramdhanie.snake;

import java.awt.geom.AffineTransform;
import java.util.List;
import java.util.ArrayList;
import java.awt.Graphics2D;

public class Snake{
	List<Segment> segments;
	Head head;
	
	int direction;


	public Snake(){
		segments = new ArrayList<Segment>();
		head = new Head();
		segments.add(head);
		direction = 3;
		Thread t = new Thread(new MoveSnake());
		t.start();
	}

	public void left(){
		direction = ++direction % 4;
	}

	public void right(){
		direction = Math.abs(--direction) % 4;
	}

	public void direction(AffineTransform af){
		for(Segment s: segments){
			s.addTransform(af);
		}
	}

	public void rotate(){
		AffineTransform af = new AffineTransform();
		af.rotate(Math.toRadians(90), head.getShape().getBounds2D().getX(), head.getShape().getBounds2D().getY());
		direction(af);
	}

	public void draw(Graphics2D g){
		for(Segment s: segments){
			s.draw(g);	
		}
	}

	public void move(){
		AffineTransform trans = new AffineTransform();
		switch(direction){
			case 0: trans.translate(0, -5);break;
			case 1: trans.translate(-5, 0);break;
			case 2: trans.translate(0, 5);break;
			case 3: trans.translate(5, 0);break;
		}
		
		if(head.getShape().getBounds2D().getX() <= 0){
			trans.translate(600, 0);
		}
		if(head.getShape().getBounds2D().getX() > 600){
			trans.translate(-600, 0);
		}

		if(head.getShape().getBounds2D().getY() <= 0){
			trans.translate(0, 400);
		}

		if(head.getShape().getBounds2D().getY() > 400){
			trans.translate(0, -400);
		}
		for(Segment s: segments){
			s.addTransform(trans);
		}

	}

	private class MoveSnake implements Runnable{
		public void run(){
			while(true){
				move();
				try{
					Thread.sleep(30);
				}catch(InterruptedException e){

				}
			}
		}
	}
}