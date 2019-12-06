package com.tutorial.main;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window  extends Canvas{

	/**
	 * 
	 */
	private static final long serialVersionUID = -240840600533728354L;
	
	public Window(int width, int height, String title, Game game) {
		//JFrame is the frame of our window
		JFrame frame = new JFrame(title);
		
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		
		//Allows for the exit button to actually work, instead of having the threads continuously running in the background after window close
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		//Adding the game to the frame, without it the game will not show on the frame
		frame.add(game);
		frame.setVisible(true);
		game.start();
	}

}
