package com.vincentramdhanie.snake;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class SnakeFrame extends JFrame{

	public static final int WINDOW_WIDTH = 600;
	public static final int WINDOW_HEIGHT = 400;

	private SnakePanel mainPanel;
	private JPanel sidePanel;
	
	public SnakeFrame(){
		super("Snake");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		sidePanel = new SidePanel();
		add(sidePanel, BorderLayout.EAST);

		mainPanel = new SnakePanel();
		add(mainPanel, BorderLayout.CENTER);


		setVisible(true);
	}


}
