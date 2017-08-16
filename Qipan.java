package com.bjlemon.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/*
chess 
created by brian
homework: 1.棋盘上加数字 2. 加黑点
*/

public class Qipan extends JFrame {
     
	private JMenuBar bar; //menu 
	private JMenu system; //system function
	private JMenuItem person; //1v1
	private JMenu ai;   //1vAI
	private JMenuItem blackchess;  //choose black
	private JMenuItem whitechess;  //choose white
	private Draw draw;  //draw the area of playing chess
	private JLabel userinfo;   //display user's information
	private JLabel gameinfo;   //display game's information
	
	public Qipan(){
    	 super("五子棋大战V1.0.1");
    	 this.setSize(600,600);    //The size of frame of game
    	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //we need to close the frame
    	 Dimension d = Toolkit.getDefaultToolkit().getScreenSize();  //toolkit(system tool)==>get size of screen
    	 int width = (int) d.getWidth();
    	 int height = (int)d.getHeight();
    	 
    	 
    	 this.setLocation((width-600)/2, (height-600)/2);  //width of screen - 600  put the frame into the middle
    	 this.setResizable(false);  //zoom in/out
    	 this.setVisible(true);   //frame must be visible
    	 init();
    }
	
	public void init(){   //Initialization of object
		bar = new JMenuBar();
		system = new JMenu("system preference");
		person = new JMenuItem("multiplayer game");
		ai = new JMenu("single player");
		blackchess = new JMenuItem("choose black one");
		whitechess = new JMenuItem("choose white one");
		draw = new Draw();
		userinfo = new JLabel("login");
		userinfo.setHorizontalAlignment(JLabel.CENTER);  //set userinfo in the middle
		gameinfo = new JLabel("ready");
		gameinfo.setHorizontalAlignment(JLabel.CENTER);
		
		bar.add(system);
		system.add(ai);
		system.add(person);
		
		ai.add(blackchess);
		ai.add(whitechess);
		
		this.setLayout(new BorderLayout());    //layout(game)
		
		this.setJMenuBar(bar);
		this.add(userinfo,BorderLayout.NORTH);    	
		this.add(draw,BorderLayout.CENTER);
		this.add(gameinfo,BorderLayout.SOUTH);
		//chess' color
		
	}
	
	public void addListener(){   //check for which action program perform  监听器
		
		
	}
	
	public static void main(String[] args){   // main function  
		new Qipan();
	}
}
