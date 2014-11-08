package com.vincentramdhanie.snake;

import java.awt.geom.AffineTransform;
import java.util.List;
import java.util.ArrayList;
import java.awt.Graphics2D;

public class Snake{
	List<Segment> segments;
	Head head;

	public Snake(){
		segments = new ArrayList<Segment>();
		head = new Head();
		segments.add(head);
		Thread t = new Thread(new MoveSnake());
		t.start();
	}

	public void direction(AffineTransform af){
		for(Segment s: segments){
			s.addTransform(af);
		}
	}

	public void draw(Graphics2D g){
		for(Segment s: segments){
			s.draw(g);	
		}
	}

	public void move(){
		AffineTransform trans = new AffineTransform();
		trans.translate(-5, 0);
		if(head.getShape().getBounds2D().getX() <= 0){
			trans.translate(600, 0);
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