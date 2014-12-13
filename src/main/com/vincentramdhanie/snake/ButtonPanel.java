package com.vincentramdhanie.snake;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;

public class ButtonPanel extends JPanel{
	JButton btnNew;
	JButton btnPause;
	JButton btnExit;
	JButton btnstart;

	SnakeController controller;

	public ButtonPanel(SnakeController controller){
		super();
		btnstart = new JButton("Start");
		btnExit = new JButton("Exit");
		btnPause = new JButton("Pause");
		btnNew = new JButton("New");

		//make all buttons same width
		btnstart.setPreferredSize(new Dimension(SidePanel.PANEL_WIDTH,25));
		btnExit.setPreferredSize(new Dimension(SidePanel.PANEL_WIDTH,25));
		btnPause.setPreferredSize(new Dimension(SidePanel.PANEL_WIDTH,25));
		btnNew.setPreferredSize(new Dimension(SidePanel.PANEL_WIDTH,25));

		this.controller = controller;

		btnstart.addActionListener(new StartButtonHandler());

		btnNew.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				getController().reset();
			}
		});

		add(btnNew);
		add(btnstart);
		add(btnPause);
		add(btnExit);

		setBackground(Color.BLACK);
	}


	public SnakeController getController(){
		return this.controller;
	}


	class StartButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			getController().start();
		}
	}
}