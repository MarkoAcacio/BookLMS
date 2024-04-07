package main;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

public class Main {
	private static logic control;
	private static Gui gui;
	private static Bookandusers data;

	public static void main(String[] args) {
		 control = new logic();
		 gui = new Gui();
		 System.out.println("Tab Opened");
		 gui.login();
		 
		 String user = gui.getUsrinp();
	        String password = gui.getPassinp();
	        
	       control.enterbtn(user, password);
		 
		 int maxAttempts = 3; // Set the maximum number of login attempts
		 int attempts = 0; // Initialize the attempt counter
		 
		 while (gui.getUsrinp() == null && !control.isFound() && attempts < maxAttempts) {
	            try {
	            	if (control.isFound()) {
	    	        	System.out.println("Found.");
	    	        	gui.contentPane.setVisible(false);
	    	        	gui.userpage();
	    	        } 
	    	       else {
	    	            System.out.println("Not Found");
	    	        }
	                Thread.sleep(100); // Wait for 100 milliseconds before checking again
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
		 
		 
		 

	       control.enterbtn(user, password);
	   
		 
		 
	     }
			
	}




