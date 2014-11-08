package com.vincentramdhanie.snake;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

public class SnakePanel extends JPanel{

	Rectangle2D rect;
	Ellipse2D circle;

	public SnakePanel(){
		super();
		setBackground(Color.BLACK);
		rect = new Rectangle2D.Double(20, 20, 300, 150);
		circle = new Ellipse2D.Double(110, 35, 120, 120); 
	}

	@Override
	protected void paintComponent(Graphics g){		
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;

		g.setColor(Color.WHITE);
		g2.fill(rect);
		g.setColor(Color.RED);
		g2.fill(circle);
	}
}
