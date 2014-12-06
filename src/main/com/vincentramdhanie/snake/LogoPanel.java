package com.vincentramdhanie.snake;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

public class LogoPanel extends JPanel{
	public LogoPanel(){
		super();
			
		setBackground(Color.BLACK);
	}

	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.drawString("SNAKE", 10, 10);
	}
}