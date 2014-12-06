package com.vincentramdhanie.snake;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Dimension;

public class SidePanel extends JPanel{
	JPanel topPanel;
	JPanel buttonPanel;

	public SidePanel(){
		super();
		setPreferredSize(new Dimension(100, 400));
		topPanel = new TopPanel();
		buttonPanel = new ButtonPanel();

		setLayout(new GridLayout(2,1));

		add(topPanel);
		add(buttonPanel);
	}
}