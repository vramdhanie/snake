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

		addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e){
				what = !what;
				if(e.getKeyChar() == KeyEvent.VK_D){
					AffineTransform af = new AffineTransform();
					af.rotate(Math.toRadians(90));
					snake.direction(af);
				}
			}
		});

	}

	@Override
	protected void paintComponent(Graphics g){		
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;

		snake.draw(g2);

		if(what){
			g2.drawString("What!", 20, 20);
		}

		Rectangle2D r = new Rectangle2D.Double(200, 200, 200, 20);
		g2.fill(r);
		AffineTransform af = new AffineTransform();
		af.rotate(Math.toRadians(45), 300, 210);
		g2.fill(af.createTransformedShape(r));
	}

	private class RepaintLoop implements Runnable{
		public void run(){
			while(true){
				repaint();
				try{
					Thread.sleep(30);
				}	catch(InterruptedException e){}
			}
		}
	}

}
