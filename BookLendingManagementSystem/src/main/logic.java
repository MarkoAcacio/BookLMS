package main;

import javax.swing.*;


public class logic {
	private Gui gui;
	private Bookandusers data;
	public boolean found;
	public static int i;
	private String[] userId;
	private String[] passW;

	public void enterbtn(String user, String password) {	
		data = new Bookandusers();
		userId = data.id;
		passW = data.password;
		
		found = false;
		
		for ( i = 0; i < userId.length; i++) 	{	
			if (user.equals(userId[i]) && password.equals(passW[i])) // Checks each index if it is equal to the same index of password 
				{
				this.found = true;
				System.out.println("Login Success!");
				break;
			}
		}
		
		if (!found) {
			System.out.println("Invalid Credentials.");
		}
		
	}
	
	// admin button 
	
	public boolean isFound() {

		return found;
	}
	
}
