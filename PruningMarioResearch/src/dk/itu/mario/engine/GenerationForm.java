package dk.itu.mario.engine;

import graphBuilder.BlockNode;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import beauty.SingleScreen;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class GenerationForm { 

	static int counterNames=0;
	static MarioComponent mario;
	static JFrame frame;
	static ArrayList metrics;
	public static void main(String[] args) 
     {			
			/*---------------------to load and print------------------------*/
			/*Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			Timer timer = new Timer();
			timer.schedule(new TimerTask() {
			@Override
    	  	public void run() {
				//System.out.println("en siberia");
				String nameFile="tela"+counterNames;
			       try {
				        BufferedImage imagew;
				        //Rectangle rec = frame.getBounds();
				        imagew = new Robot().createScreenCapture(new Rectangle((screenSize.width-640)/2, (screenSize.height-480)/2,640, 480));
						ImageIO.write(imagew, "png", new File(nameFile+".png"));
						} catch (HeadlessException | AWTException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
							catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}	
			       
			    if(counterNames>0)
			       {mario.stop();
			       frame.setVisible(false);
			       }			    
		    	frame = new JFrame("Mario Experience Showcase");
		    	mario = new MarioComponent(640, 480,true,nameFile);
		    	frame.setContentPane(mario);
		    	frame.setResizable(false);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.pack();

		        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		        frame.setLocation((screenSize.width-frame.getWidth())/2, (screenSize.height-frame.getHeight())/2);

		        frame.setVisible(true);
		        mario.start();   
		        counterNames++;
			}
        	}, 3000,3000); */ 
			
		/*---------------------to load------------------------*/

		/*
			//System.out.println("en siberia");
			String nameFile="tela"+counterNames;
		       			    
	    	frame = new JFrame("Mario Experience Showcase");
	    	mario = new MarioComponent(640, 480,true,"");
	    	frame.setContentPane(mario);
	    	frame.setResizable(false);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.pack();

	        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	        frame.setLocation((screenSize.width-frame.getWidth())/2, (screenSize.height-frame.getHeight())/2);

	        frame.setVisible(true);
	        mario.start();   
	       */
		
	  	
		
	  	/*---------------------to Generate screens------------------------*/
		
			int numElementsGlobalParamet=5; 
			double wParamether=3;
			int methodSearch=3;
			Random rand = new Random();
			long seedM = -2011069996;
			System.out.println("seed "+seedM);
	    	JFrame frame = new JFrame("Mario Experience Showcase");
	    	MarioComponent mario = new MarioComponent(640, 480,true," ",5,numElementsGlobalParamet,wParamether,methodSearch,seedM);
	    	System.out.println("");
	    	System.out.println(numElementsGlobalParamet+" "+wParamether+" ");
	    	
	    	frame.setContentPane(mario);
	    	frame.setResizable(false);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.pack();

	        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	        frame.setLocation((screenSize.width-frame.getWidth())/2, (screenSize.height-frame.getHeight())/2);

	        frame.setVisible(true);
	    	
	        mario.start();  
	}	

}
