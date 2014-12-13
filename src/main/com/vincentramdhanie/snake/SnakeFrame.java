package com.vincentramdhanie.snake;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class SnakeFrame extends JFrame{

	public static final int WINDOW_WIDTH = 600;
	public static final int WINDOW_HEIGHT = 400;

	private SnakePanel mainPanel;
	private JPanel sidePanel;

	private SnakeController controller;
	
	public SnakeFrame(){
		super("Snake");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mainPanel = new SnakePanel();
		add(mainPanel, BorderLayout.CENTER);

		controller = new SnakeController(mainPanel);

		sidePanel = new SidePanel(controller);
		add(sidePanel, BorderLayout.EAST);

		setVisible(true);
	}


}
