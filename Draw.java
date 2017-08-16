package com.bjlemon.ui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

import javax.swing.JPanel;

/*
 * Description: draw the area of playing chess
 * 
 * */

public class Draw extends JPanel{
     
	
	private int py_x = 50;  // x-location moving
	private int py_y = 50;  // y-location moving
	private Stroke stroke;
	
	public Draw(){
		this.setSize(500,500); 
		this.setBackground(new Color(221,180,92));   //set background color
    }
	
	
	public void paint(Graphics g){
		
		super.paint(g);
		paintQipan(g);
		
	}
	
	public void paintQipan(Graphics g){ //draw area of playing
		Graphics2D g2 = (Graphics2D)g;	
		for(int i = 0; i <15; i++){
			  //draw a horizontal line
			  //start point(0,0) (0,1) (0,2)    final point(14,0) (14,1)
		      g.drawLine(py_x, py_y+i*30, py_x+14*30, py_y+i*30);				      
		      //draw a vertical line(0,0) (1,0) (2,0)  final point (0,14) (1,14) (2,14)
		      g.drawLine(py_x+i*30, py_y+0,py_x+i*30 , py_y+14*30);			      	    	  
		     
		}
		//set the border line into bold line	
		 g2.setStroke(new BasicStroke(2.0f));
		 g.drawLine(py_x, py_y+0*30, py_x+14*30, py_y+0*30);
		 g.drawLine(py_x+0*30, py_y+0,py_x+0*30 , py_y+14*30);	
		 g.drawLine(py_x, py_y+14*30, py_x+14*30, py_y+14*30);
		 g.drawLine(py_x+14*30, py_y+0,py_x+14*30 , py_y+14*30);
		 
		 //draw the black point (filloval->ºÚÔ²  drawoval)
		 g.fillOval(45+3*30, 45+3*30, 10,10); //first
		 g.fillOval(45+7*30, 45+3*30, 10,10);  //second
		 g.fillOval(45+11*30, 45+3*30, 10,10); //third
		 
		 g.fillOval(45+3*30, 45+7*30, 10,10);  //fourth
		 g.fillOval(45+7*30, 45+7*30, 10,10); //middle
		 g.fillOval(45+11*30, 45+7*30, 10,10); //sixth
		 
		 g.fillOval(45+3*30, 45+11*30, 10,10); //seventh
		 g.fillOval(45+7*30, 45+11*30, 10,10);  //eighth
		 g.fillOval(45+11*30, 45+11*30, 10,10); //ninth
	}
	
	public void paintChess(Graphics g){
		
	}
}
