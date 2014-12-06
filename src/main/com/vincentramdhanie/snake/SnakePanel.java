package com.vincentramdhanie.snake;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.AffineTransform;

public class SnakePanel extends JPanel{

	boolean what;
	Snake snake;

	public SnakePanel(){
		super();
		setBackground(Color.BLACK);
		  
		snake = new Snake();

		Thread t = new Thread(new RepaintLoop());
		t.start();

		setFocusable(true);

		addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				what = !what;
				
				if(e.getKeyCode() == KeyEvent.VK_LEFT){
					snake.left();
					snake.rotate();
				    
				}else{
					if(e.getKeyCode() == KeyEvent.VK_RIGHT){
						snake.right();
						snake.rotate();
					}
				}
			}
		});

	}

	@Override
	protected void paintComponent(Graphics g){		
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;

		snake.draw(g2);

		
	}

	private class RepaintLoop implements Runnable{
		public void run(){
			while(true){
				repaint();
				try{
					Thread.sleep(40);
				}	catch(InterruptedException e){}
			}
		}
	}

}
