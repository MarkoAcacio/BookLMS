package main;

import javax.swing.*;
import java.util.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;

public class Gui {
	
	private logic control;
	private Bookandusers data;
	private Main main;
	public static JPanel contentPane;
	public static JPanel userPane;
	public static JPanel adminPane;
	public static JPanel lendingPane;
	private JButton enterbtn;
	private String user;
	private String password;
	private JTextField userinp;
	private JPasswordField passinp;
	private JFrame mainFrame;
	public JButton adminBtn;
	
	private String selectedBook;
	private String selectedBook2;
	private String selectedBook3;
	private JLabel bookselected;
	private JLabel bookselected2;
	private JLabel bookselected3;
	private String Status = " ";
	private JLabel status;
	private String Status2 = " ";
	private JLabel status2;
	private String Status3 = " ";
	private JLabel status3;
	private String Accepted = "Please return at the given time.";
	private String Denied = "Denied...";
	private String[] bookStatuses;
	private int selectedNum;
	private Calendar date = Calendar.getInstance();
	private JTextField cdate;
	private String cdget;
	private int cdgconvert;
	private JButton entrD;
	
	public void login() {
		// instances are important! very.
		
		main = new Main(); // instance of main class
		control = new logic(); // instance of logic class
		data = new Bookandusers(); // instance of Book class
		mainFrame = Main.getFrame();
		
		this.contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(237, 237, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		mainFrame.setContentPane(contentPane);
		
		JLabel logbg2 = new JLabel("");
	    logbg2.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\names.png"));
	    logbg2.setBounds(807, 615, 324, 100);
	    contentPane.add(logbg2);

	    JLabel idt = new JLabel("User ID: ");
	    idt.setFont(new Font("Century Gothic", Font.PLAIN, 13));
	    idt.setBounds(80, 500, 58, 14);
	    contentPane.add(idt);
	    
	    this.userinp = new JTextField();  // id input
		userinp.setForeground(new Color(73, 73, 73));
		userinp.setBounds(80, 527, 181, 20);
		contentPane.add(userinp);
		userinp.setColumns(10);
		
		this.passinp = new JPasswordField();  // password input
		passinp.setForeground(new Color(73, 73, 73));
		passinp.setBounds(80, 601, 181, 20);
		contentPane.add(passinp);

	    enterbtn = new JButton();
	    enterbtn.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\loginbtn.png"));
	    enterbtn.setOpaque(false);
	    enterbtn.setContentAreaFilled(false);
	    enterbtn.setBorderPainted(false);
	    enterbtn.setFocusable(false);
	    enterbtn.setVisible(true);
	    enterbtn.setBounds(76, 658, 117, 47);
	    
	    ImageIcon anim1 = new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\CO\\images\\loginbtn.png"); // animation
		ImageIcon anim = new ImageIcon ("C:\\Users\\tanner\\eclipse-workspace\\CO\\images\\loginbtn1.png");  // animation
		enterbtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                enterbtn.setIcon(anim);
            }
		@Override
		public void mouseReleased(MouseEvent e) {
            enterbtn.setIcon(anim1);
		}
		});
		enterbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				user = userinp.getText();  // gets userid info in the textbox
				password = String.valueOf(passinp.getPassword());  // gets password info in the textbox
				control.enterbtn(user, password);	// Passing of data with the usage of parameters.	
			}
		});
		
	    contentPane.add(enterbtn);	
		
		JLabel pwt = new JLabel("Password: ");
		pwt.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		pwt.setBounds(80, 575, 74, 14);
		contentPane.add(pwt);
		
		JLabel logbg = new JLabel("");
		logbg.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\loginbg.png"));
		logbg.setBounds(504, 0, 800, 800);
		contentPane.add(logbg);
		
		JLabel lblNewLabel = new JLabel("Welcome Back!");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 33));
		lblNewLabel.setBounds(50, 401, 256, 63);
		contentPane.add(lblNewLabel);
		
		JLabel lblLogin = new JLabel("Login to Continue");
		lblLogin.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblLogin.setBounds(60, 452, 144, 23);
		contentPane.add(lblLogin);
		
		JLabel logbg1 = new JLabel("");
		logbg1.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\bllog.png"));
		logbg1.setBounds(26, 25, 450, 395);
		contentPane.add(logbg1);
		
		JLabel whbg = new JLabel("");
		whbg.setBackground(new Color(255, 255, 255));
		whbg.setOpaque(true);
		whbg.setBounds(504, 0, 800, 800);
		contentPane.add(whbg);
		
		mainFrame.setVisible(true); // makes frame visible
	}

	public void userpage() {
		
		this.userPane = new JPanel();
		userPane.setLayout(null);
		userPane.setBackground(new Color(237, 237, 237));
		userPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		userPane.setLayout(null);
		userPane.setVisible(true);
		
		mainFrame.setContentPane(userPane);
		mainFrame.repaint();
		mainFrame.revalidate();
		
		JLabel qlbl = new JLabel("Which book are you looking to borrow?");
        qlbl.setBackground(new Color(255, 255, 255));
        qlbl.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        qlbl.setBounds(128, 265, 388, 25);
        userPane.add(qlbl);
        
        JLabel usrid = new JLabel("Hi, " + user);
        usrid.setBackground(new Color(255, 255, 255));
        usrid.setFont(new Font("Century Gothic", Font.BOLD, 32));
        usrid.setBounds(115, 215, 200, 50);
        userPane.add(usrid);
        
        JLabel logo = new JLabel();
        logo.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\uppericon.png"));
        logo.setBounds(70, 58, 276, 69);
        userPane.add(logo);
        
        JLabel header = new JLabel("");
        header.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\header.png"));
        header.setBounds(70, 111, 1040, 256);
        userPane.add(header);
        
        
        JLabel search = new JLabel("");
        search.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\search.png"));
        search.setBounds(270, 382, 11, 15);
        userPane.add(search);
        
        JLabel Overview = new JLabel("OVERVIEW");
        Overview.setFont(new Font("Century Gothic", Font.BOLD, 16));
        Overview.setBounds(348, 63, 169, 36);
        userPane.add(Overview);
        
        JLabel welcometext = new JLabel("Welcome to BookLend");
        welcometext.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        welcometext.setBounds(350, 88, 212, 36);
        userPane.add(welcometext);
        
        JLabel browse = new JLabel("Browse available books");
        browse.setFont(new Font("Century Gothic", Font.BOLD, 16));
        browse.setBackground(Color.WHITE);
        browse.setBounds(70, 375, 200, 25);
        userPane.add(browse);
        
        JLabel usrnm = new JLabel(user);
        usrnm.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        usrnm.setBounds(1062, 60, 58, 28);
        userPane.add(usrnm);
        
        // GUMAWA NG NEW PANEL PARA HINDI MA-ISCROLL ANG MAIN PANEL WHICH IS SI CONTENT PANEL
        
        JPanel bookpanel = new JPanel(null); // NULL TO SET THE PANEL AS ABSOLUTE LAYOUT PARA MAS EASY SA FOR LOOP
        bookpanel.setForeground(new Color(255, 255, 255));
        bookpanel.setBackground(new Color(255, 255, 255));
        bookpanel.setPreferredSize(new Dimension(1040, 3000)); // change this value to generate all of the books!
        userPane.add(bookpanel);
        
        // SCROLL
        JScrollPane bookscroll = new JScrollPane(bookpanel);
        
        this.adminBtn = new JButton("admin"); // ADMIN BUTTON
        adminBtn.setBounds(900, 10, 89, 23);
        
	     adminBtn.addActionListener(new ActionListener() {
	    		@Override
				public void actionPerformed(ActionEvent e) {
	    			if (main == null) {
	    				System.out.println("main is null");
	    			}	
	    			main.adminBtn();	// goes to admin button logic in main
	    		}
	    	 
	    	 
	     });
        
        userPane.add(adminBtn);
        
        bookscroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); // VERTICAL ONLY
        bookscroll.setBounds(68, 428, 1040, 350);
        userPane.add(bookscroll);
        
 
        
        
        for (int z = 0; z < data.bookname.length; z++) { // count to 50
        	final int indx = z;
         // iterates each book in the array to check the true value for the button
        	 JLabel[] book = new JLabel[data.books.length]; // length of jlabels to be made for book cover
             JButton[] borrowbtn = new JButton[50]; // 50 buttons to be made
             
        	borrowbtn[z] = new JButton();
        	borrowbtn[z].setBounds(43 + (z % 5) * 197,270 + (z / 5) * 300, 140, 24); //spacing, modulus para makuha ma-seperate
        	borrowbtn[z].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\borrow.png"));
        	borrowbtn[z].setOpaque(false);
    		borrowbtn[z].setContentAreaFilled(false);
    		borrowbtn[z].setBorderPainted(false);
    		borrowbtn[z].setFocusable(false);
  
    		 bookStatuses = new String[data.books.length];
    		    for (int i = 0; i < bookStatuses.length; i++) {
    		        bookStatuses[i] = "Pending...";
    		    }
    		
    		borrowbtn[z].addActionListener(new ActionListener() {
    			@Override
				public void actionPerformed(ActionEvent e) {
    				selectedNum++;
    				
    				switch (selectedNum) {
    				 case 1:
    					Status = "Pending...";
    					borrowbtn[indx].setVisible(false);
     					selectedBook = data.bookname[indx];
    					 break;
    					 
    				 case 2:
    					 Status2 = "Pending...";
    					 borrowbtn[indx].setVisible(false);
     					selectedBook2 = data.bookname[indx];
     						break;
    				 case 3:
    					 Status3 = "Pending...";
    					 borrowbtn[indx].setVisible(false);
     					selectedBook3 = data.bookname[indx];
     						break;
    				 case 4:
    					 System.out.println("Maximum books reached");
    					 break;
     						
    				}
    				
    				
					// if canceled
					
					// if more than 3 na, selected book will not work
					
					// MAKE THIS SO IT WILL BE EXCLUSIVE ONLY TO 1 BOOK
					
					Status = bookStatuses[indx];
	            	status.setText(getStatus());
	            	status.repaint();
	            	status.revalidate();
					// when clicked change the place holder ( maximum of 3 only )
					 	
				System.out.print("\n"+getSelectedBook()+"\n" + getSelectedBook2() + "\n" + getSelectedBook3() + "\n");
			        
				}
        	}); 
        	
    		
        	book[z] = new JLabel("");
        	book[z].setBounds(50 + (z % 5) * 197, 25 + (z/5) * 300, 125, 250);
        	book[z].setFont(new Font("Century Gothic", Font.BOLD, 10));
        	book[z].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\CO\\images\\placeholder.png"));
        	book[z].setHorizontalTextPosition(JLabel.CENTER);
            book[z].setVerticalTextPosition(JLabel.BOTTOM);
            book[z].setHorizontalAlignment(JLabel.CENTER);
        	book[z].setText(("<html><center>" + data.bookname[z] + "</center></html>")); 
        	
        	bookpanel.add(borrowbtn[z]);
        	bookpanel.add(book[z]);	
        	bookpanel.revalidate();
        }
        
        JButton lending = new JButton("");
        lending.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\CO\\images\\lending.png"));
        lending.setOpaque(false);
        lending.setContentAreaFilled(false);
        lending.setBorderPainted(false);
        lending.setFocusable(false);
        lending.setBounds(990, 365, 130, 48);
        userPane.add(lending);
        lending.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	main.goLend();
                
            }
        });
        
        
        JLabel bgscrl = new JLabel("");
        bgscrl.setBackground(new Color(255, 255, 255));
        bgscrl.setOpaque(true);
        bgscrl.setBounds(70, 428, 1040, 1000);
        userPane.add(bgscrl);

        JLabel bg = new JLabel("");
        bg.setForeground(new Color(255, 255, 255));
        bg.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\CO\\images\\allbg.png"));
        bg.setBounds(-186, -164, 1500, 1000);
        userPane.add(bg);
        
        mainFrame.repaint();
        mainFrame.revalidate();
		
	}
	
	public void adminpage() {
		control = new logic(); // instance of logic class
		data = new Bookandusers(); // instance of Book class
		
		this.adminPane = new JPanel();
		adminPane.setLayout(null);
		adminPane.setBackground(new Color(237, 237, 237));
		adminPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		adminPane.setLayout(null);
		adminPane.setVisible(true);
		
		mainFrame.setContentPane(adminPane);
		
		JLabel logo = new JLabel();
        logo.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\CO\\images\\uppericon.png"));
        logo.setBounds(915, 30, 235, 50);
        adminPane.add(logo);

        
        JLabel usrid = new JLabel("Welcome back, Admin!");
        usrid.setFont(new Font("Century Gothic", Font.BOLD, 32));
        usrid.setBounds(42, 21, 413, 68);
        adminPane.add(usrid);        
        
        JPanel userpanel = new JPanel();
        userpanel.setOpaque(true);
        userpanel.setBackground(new Color(255, 255, 255));
        userpanel.setBounds(42, 100, 1096, 616);
        adminPane.add(userpanel);
        userpanel.setLayout(null);
        
        JLabel usr = new JLabel("");
        usr.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\CO\\images\\lendme.png"));
        usr.setBounds(39, 45, 145, 120);
        userpanel.add(usr);

        
        bookselected = new JLabel(selectedBook);
        bookselected.setFont(new Font("Century Gothic", Font.BOLD, 25));
        bookselected.setBounds(182, 79, 850, 50);
        userpanel.add(bookselected);
        
        bookselected2 = new JLabel(selectedBook2);
        bookselected2.setFont(new Font("Century Gothic", Font.BOLD, 25));
        bookselected2.setBounds(182, 179, 850, 50);
        userpanel.add(bookselected2);
        
        bookselected3 = new JLabel(selectedBook3);
        bookselected3.setFont(new Font("Century Gothic", Font.BOLD, 25));
        bookselected3.setBounds(182, 279, 850, 50);		
		
        this.cdate = new JTextField();  // INPUT FOR CUSTOM DATE!
		cdate.setForeground(new Color(73, 73, 73));
		cdate.setBounds(80, 527, 181, 20);
		userpanel.add(cdate);
		cdate.setColumns(10);
		
		
		
		entrD = new JButton();
		entrD.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\loginbtn.png"));
		entrD.setOpaque(false);
		entrD.setContentAreaFilled(false);
		entrD.setBorderPainted(false);
		entrD.setFocusable(false);
		entrD.setVisible(true);
		entrD.setBounds(120, 527, 117, 47);
		userpanel.add(entrD);
		    	
		entrD.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cdget = cdate.getText(); // gets text from the cdate box
				cdgconvert = Integer.parseInt(cdget);
			}
		});

		
        JButton approve = new JButton("");
        approve.setBounds(889, 150, 89, 80);
    	approve.setOpaque(false);
		approve.setContentAreaFilled(false);
		approve.setBorderPainted(false);
		approve.setFocusable(false);
        approve.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\CO\\images\\accept.png"));
        userpanel.add(approve);
        approve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	String month = date.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()); // long is a get display name, and locale gets the local time and default is the pc time
        		date.add(Calendar.DAY_OF_MONTH, getdate());
        		
        		if (date.get(Calendar.DAY_OF_MONTH) < 31) {
        			date.add(Calendar.MONTH, 1);
        			month =  date.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
        		}
        		
        		Accepted = "Please Return On |  " + month + " " + date.get(Calendar.DAY_OF_MONTH)  + ", " + date.get(Calendar.YEAR);
        		
        		
            	Status = Accepted;
            	status.setText(getStatus());
            	status.repaint();
            	status.revalidate();
            	
                }
           });
        
        JButton denied = new JButton("");
        denied.setBounds(800, 150, 89, 80);
    	denied.setOpaque(false);
		denied.setContentAreaFilled(false);
		denied.setBorderPainted(false);
		denied.setFocusable(false);
        denied.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\no.png"));
        userpanel.add(denied);
        denied.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	Status = Denied;
            	status.setText(getStatus());
            	status.repaint();
            	status.revalidate();
            	
                }
        });
        
        JButton approve2 = new JButton("");
        approve2.setBounds(889, 350, 89, 80);
    	approve2.setOpaque(false);
		approve2.setContentAreaFilled(false);
		approve2.setBorderPainted(false);
		approve2.setFocusable(false);
        approve2.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\CO\\images\\accept.png"));
        userpanel.add(approve2);
        approve2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	Status2 = Accepted;
            	status2.setText(getStatus());
            	status2.repaint();
            	status2.revalidate();
            	
                }
           });
        
        JButton denied2 = new JButton("");
        denied2.setBounds(800, 350, 89, 80);
    	denied2.setOpaque(false);
		denied2.setContentAreaFilled(false);
		denied2.setBorderPainted(false);
		denied2.setFocusable(false);
        denied2.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\no.png"));
        userpanel.add(denied2);
        denied2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	Status2 = Denied;
            	status2.setText(getStatus());
            	status2.repaint();
            	status2.revalidate();
            	
                }
        });
        
        JButton approve3 = new JButton("");
        approve3.setBounds(889, 550, 89, 80);
    	approve3.setOpaque(false);
		approve3.setContentAreaFilled(false);
		approve3.setBorderPainted(false);
		approve3.setFocusable(false);
        approve3.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\CO\\images\\accept.png"));
        userpanel.add(approve3);
        approve3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	Status3 = Accepted;
            	status2.setText(getStatus());
            	status2.repaint();
            	status2.revalidate();
            	
                }
           });
        
        JButton denied3 = new JButton("");
        denied3.setBounds(800, 550, 89, 80);
    	denied3.setOpaque(false);
		denied3.setContentAreaFilled(false);
		denied3.setBorderPainted(false);
		denied3.setFocusable(false);
        denied3.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\no.png"));
        userpanel.add(denied3);
        denied3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	Status3 = Denied;
            	status3.setText(getStatus());
            	status3.repaint();
            	status3.revalidate();
            	
                }
        });
        
        JLabel bg = new JLabel("New label");
        bg.setForeground(new Color(255, 255, 255));
        bg.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\CO\\images\\allbg.png"));
        bg.setBounds(-186, -164, 1500, 1000);
        adminPane.add(bg);
        
        
        JButton lend = new JButton("lend");
        lend.setBounds(600, 50, 89, 23);
        adminPane.add(lend);
       lend.addActionListener(new ActionListener() {

 			public void actionPerformed(ActionEvent e) {
 				main.backToUser();
 			}
        	
        });
        
        JButton user = new JButton("user");
        user.setBounds(636, 32, 89, 23);
        adminPane.add(user); 
      /* user.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userpage userpagee = new userpage(selectedBook, lendpopup);
				userpagee.setVisible(true);
				adminpage.super.dispose();
		
		
	} */
        
        mainFrame.revalidate();
        mainFrame.repaint();
        adminPane.revalidate();
        adminPane.repaint();
	}
	
	public void lendingpage() {
		
		this.lendingPane = new JPanel();
		lendingPane.setLayout(null);
		lendingPane.setBackground(new Color(237, 237, 237));
		lendingPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		lendingPane.setLayout(null);
		lendingPane.setVisible(true);
		
		mainFrame.setContentPane(lendingPane);
		
	//	String month = date.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()); // long is a get display name, and locale gets the local time and default is the pc time
	//	date.add(Calendar.DAY_OF_MONTH, 3);
	//	JLabel dated = new JLabel("Return On |  " 
	//	+ month + " " + date.get(Calendar.DAY_OF_MONTH)  + ", " + date.get(Calendar.YEAR));
   //     dated.setFont(new Font("Century Gothic", Font.PLAIN, 17));
   //     dated.setBounds(125, 310, 442, 27);
    //    lendingPane.add(dated);	
        
        bookselected = new JLabel(selectedBook);
        bookselected.setText(selectedBook);
        bookselected.setFont(new Font("Century Gothic", Font.BOLD, 24));
        bookselected.setBounds(120, 270, 700, 55);
        lendingPane.add(bookselected);
        
        bookselected2 = new JLabel(selectedBook2);
        bookselected2.setText(selectedBook2);
        bookselected2.setFont(new Font("Century Gothic", Font.BOLD, 24));
        bookselected2.setBounds(120, 370, 700, 55);
        lendingPane.add(bookselected2);
        
        bookselected3 = new JLabel(selectedBook3);
        bookselected3.setText(selectedBook3);
        bookselected3.setFont(new Font("Century Gothic", Font.BOLD, 24));
        bookselected3.setBounds(120, 470, 700, 55);
        lendingPane.add(bookselected3);
      
        
        // values here are absolute!
  	  status = new JLabel(""); // put the status giver here
  	  status.setText(getStatus());
  	  
  	  status2 = new JLabel(""); // put the status giver here
 	  status2.setText(getStatus2());
 	  
 	  status3 = new JLabel(""); // put the status giver here
 	  status3.setText(getStatus3());
  	  
  	  // make an if statement to check if the book is new, if new change back the status to pending
  	  // or a logic that finds the index number and change it correspondingly
  	  // do this in the button thingy
 	  
 	 if (status.getText().equals("Pending...")) {
 		 status.setForeground(new Color(128, 128, 128));
 	  } 
 	 else if (status.getText().equals(Denied)) {
  		status.setForeground(new Color(199, 71,71));
  	  }
  	 else if (status.getText().equals(Accepted)) {
  		status.setForeground(new Color(103, 172, 96));
  	  }
  	  
 	 
 	 
 	 if (status2.getText().equals("Pending...")) {
 		 status2.setForeground(new Color(128, 128, 128));
 	  } 
 	 else if (status2.getText().equals(null)) {
 	  }
  	 if (status2.getText().equals(Denied)) {
 		status2.setForeground(new Color(199, 71,71));
 	  }
 	 else if (status2.getText().equals(Accepted)) {
 		status2.setForeground(new Color(103, 172, 96));
 	  }
  	
  	 
  	 
  	 if (status3.getText().equals("Pending...")) {
 		 status3.setForeground(new Color(128, 128, 128));
 	  } 
 	 else if (status3.getText().equals(Denied)) {
 		status3.setForeground(new Color(199, 71,71));
 	  }
 	 else if (status3.getText().equals(Accepted)) {
 		status3.setForeground(new Color(103, 172, 96));
 	  } 
  	  
	  status.setFont(new Font("Century Gothic", Font.BOLD, 17));
	  status.setBounds(125, 335, 442, 27);
	  lendingPane.add(status);
	  status.setVisible(true);
	  
	  status2.setFont(new Font("Century Gothic", Font.BOLD, 17));
	  status2.setBounds(125, 435, 442, 27);
	  lendingPane.add(status2);
	  status2.setVisible(true);
	  
	  status3.setFont(new Font("Century Gothic", Font.BOLD, 17));
	  status3.setBounds(125, 535, 442, 27);
	  lendingPane.add(status3);
	  status3.setVisible(true);
        
        JLabel grp = new JLabel();
        grp.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\CO\\images\\group8.png"));
        grp.setBounds(962, 150, 155, 340);
        lendingPane.add(grp);
        
        JLabel logo = new JLabel();
        logo.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\CO\\images\\uppericon.png"));
        logo.setBounds(80, 158, 276, 69);
        lendingPane.add(logo);

        JLabel qlbl = new JLabel("PENDING BOOKS");
        qlbl.setBackground(new Color(255, 255, 255));
        qlbl.setFont(new Font("Century Gothic", Font.BOLD, 32));
        qlbl.setBounds(80, 61, 355, 75);
        lendingPane.add(qlbl);
        
        JLabel wlcm = new JLabel("Welcome to BookLend");
        wlcm.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        wlcm.setBackground(Color.WHITE);
        wlcm.setBounds(80, 116, 247, 25);
        lendingPane.add(wlcm);
        
        JLabel oute = new JLabel();
        oute.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\CO\\images\\quote.png"));
        oute.setBounds(940, 500, 180, 198);
        lendingPane.add(oute);
        
        JPanel bookpanel = new JPanel();
        bookpanel.setBackground(new Color(255, 255, 255));
        bookpanel.setOpaque(true);
        bookpanel.setBounds(80, 238, 804, 562);
        lendingPane.add(bookpanel);
        bookpanel.setLayout(null);
        
		
        JButton lending = new JButton("");
        lending.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            	main.lendbackToUser();
            	
                
            }
        }); 
        
        lending.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\CO\\images\\back.png"));
		lending.setOpaque(false);
		lending.setContentAreaFilled(false);
		lending.setBorderPainted(false);
		lending.setFocusable(false);
        lending.setBounds(708, 150, 176, 65);
        lendingPane.add(lending);
        
        JLabel quote = new JLabel();
        quote.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\CO\\images\\qoute.png"));
        quote.setBounds(935, 504, 176, 192);
        lendingPane.add(quote);
		
        JLabel bg = new JLabel(" ");
        bg.setForeground(new Color(255, 255, 255));
        bg.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\CO\\images\\allbg.png"));
        bg.setBounds(-186, -164, 1500, 1000);
        lendingPane.add(bg);
        
        
        mainFrame.revalidate();
        mainFrame.repaint();
        lendingPane.revalidate();
        lendingPane.repaint();
        
	}
	
	public String getStatus() {
		
		System.out.println("Current Status: " + Status);
		return Status;
		
		
	}
	
	public String getStatus2() {
		
		System.out.println("Current Status: " + Status);	
		return Status2;
		
		
	}
	
	public String getStatus3() {
		
		System.out.println("Current Status: " + Status);
		return Status3;
		
		
	}
	
	  public JButton getAdminButton() {
	        return adminBtn; 
	    }
	
	public String getSelectedBook() {
		return selectedBook;
	}
	
	public String getSelectedBook2() {
		return selectedBook2;
	}
	
	public String getSelectedBook3() {
		return selectedBook3;
	}
	
	public JButton getLoginButton() {
		return enterbtn;
	}
	
	public int getdate() {
        return cdgconvert;
    }
	
    public String getUsrinp() {
        return user;
    }

    public String getPassinp() {
        return password;
    }
	
}
