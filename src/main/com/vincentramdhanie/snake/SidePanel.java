package com.vincentramdhanie.snake;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Dimension;

public class SidePanel extends JPanel{
	JPanel topPanel;
	JPanel buttonPanel;
	SnakeController controller;

	public static final int PANEL_WIDTH = 100;

	public SidePanel(SnakeController controller){
		super();
		setPreferredSize(new Dimension(PANEL_WIDTH, SnakeFrame.WINDOW_HEIGHT));

		this.controller = controller;

		topPanel = new TopPanel();
		buttonPanel = new ButtonPanel(controller);

		setLayout(new GridLayout(2,1));

		add(topPanel);
		add(buttonPanel);
	}
}