package com.vincentramdhanie.snake;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

public class TopPanel extends JPanel{
	JPanel logoPanel;
	JPanel scorePanel;

	public TopPanel(){
		super();
		logoPanel = new LogoPanel();
		scorePanel = new ScorePanel();

		setLayout(new BorderLayout());

		add(logoPanel, BorderLayout.NORTH);
		add(scorePanel, BorderLayout.CENTER);

		setBackground(Color.ORANGE);
	}
}