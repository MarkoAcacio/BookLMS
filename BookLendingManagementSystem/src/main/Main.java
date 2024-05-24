package main;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

public class Main {
	private static logic control;
	private static Gui gui;
	private static Bookandusers data;
	private static JFrame frame;

	public static void main(String[] args) {
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("BookLend");
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setBounds(350, 125, 1200, 800);
		
		 gui = new Gui();
		 control = new logic();
		 data = new Bookandusers();
		 
		 SwingUtilities.invokeLater(() -> {
		 gui.login();
		 });
		 
		 boolean found = control.isFound();
		 
		 String user = gui.getUsrinp();
	     String password = gui.getPassinp();
	     
	     while (user == null || password == null) {
	    	    try {	
	    	    	 user = gui.getUsrinp();
	    		     password = gui.getPassinp();
	    	    	if (user != null || password !=null) {
	    	    		control.enterbtn(user, password);
	    	    		found = control.isFound();
	    	    		
	    	    	}
	    			 
	    	        if (found /*&& user.equals(data.getPass()[control.i]) && password.equals(data.getId()[control.i])*/) {
	    	            System.out.println("Found.");
	    	            gui.contentPane.setVisible(false);
	    	            SwingUtilities.invokeLater(() -> {
	    	          		 gui.userpage();
	    	   	     });
	    	            break; // Exit the loop once the user is found
	    	        } else {
	    	        	Thread.sleep(2000);
	    	            System.out.println("Not Found");
	    	        }
	    	        Thread.sleep(100); // Wait for 100 milliseconds before checking again
	    	    } catch (InterruptedException e) {
	    	        e.printStackTrace();
	    	    }
	    	}
     
	     // Run next here
   
}
	
	public void goLend() {
		gui.userPane.setVisible(false);
		System.out.println("Opening lending page");
		SwingUtilities.invokeLater(() -> {
      		 gui.lendingpage();
      		 gui.lendingPane.setVisible(true);
	     });
	}
	
	
	public void backToUser() {
		frame.setContentPane(gui.userPane); // frame is mainFrame
		
		if (gui.adminPane.isVisible()) {
			System.out.println("Closing admin page");
			gui.adminPane.setVisible(false);
		}
		gui.userPane.setVisible(true);
	}
	
	public void lendbackToUser() {
		frame.setContentPane(gui.userPane); // frame is mainFrame
		
		
		if (gui.lendingPane.isVisible()) {
			System.out.println("Closing lending page");
			gui.lendingPane.setVisible(false);
		}
		gui.userPane.setVisible(true);
	}
	
	public void adminBtn() { // admin button logic
		System.out.println("Opening admin page");
		gui.userPane.setVisible(false);	
		  SwingUtilities.invokeLater(() -> {
	       		 gui.adminpage();
	       		 gui.adminPane.setVisible(true);
		     });
		
	}
	
	// put methods here	
	public static JFrame getFrame() {
		return frame;
		}
			
	}
