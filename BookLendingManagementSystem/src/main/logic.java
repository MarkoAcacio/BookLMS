package main;

import javax.swing.*;


public class logic {
	private Gui gui;
	private Bookandusers data;
	public boolean found;
	
	
	public void enterbtn(String user, String password) {	
		gui = new Gui();
		data = new Bookandusers();
		String[] userId = data.id;
		String[] passW = data.password;
		
		found = false;
		
		for (int i = 0; i < userId.length; i++) 	{	
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
	
	public boolean isFound() {
		return found;
	}
	
}
