package com.vincentramdhanie.snake;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Color;

public class ScorePanel extends JPanel{
	JLabel lblScore;
	JLabel lblHighScore;
	JLabel lblScoreLabel;
	JLabel lblHighScoreLabel;

	public ScorePanel(){
		super();
		lblScore = new JLabel("00234");
		lblHighScore = new JLabel("02345");
		lblScoreLabel = new JLabel("Score");
		lblHighScoreLabel = new JLabel("High Score");

		setLayout(new GridLayout(4,1,5,5));
		add(lblScoreLabel);
		add(lblScore);
		add(lblHighScoreLabel);
		add(lblHighScore);

		setBackground(Color.BLACK);
		setForeground(Color.WHITE);
		
	}
}