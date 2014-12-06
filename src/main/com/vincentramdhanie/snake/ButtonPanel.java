package com.vincentramdhanie.snake;

import javax.swing.JPanel;
import javax.swing.JButton;

public class ButtonPanel extends JPanel{
	JButton btnNew;
	JButton btnPause;
	JButton btnExit;
	JButton btnstart;

	public ButtonPanel(){
		super();
		btnstart = new JButton("Start");
		btnExit = new JButton("Exit");
		btnPause = new JButton("Pause");
		btnNew = new JButton("New");

		add(btnNew);
		add(btnstart);
		add(btnPause);
		add(btnExit);
	}
}