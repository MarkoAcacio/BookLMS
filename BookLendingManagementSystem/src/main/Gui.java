package main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.util.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import javax.swing.border.Border;

public class Gui {
	
	private static logic control;
	private static Bookandusers data;
	private static Main main;
	public static JPanel contentPane;
	public static JPanel userPane;
	public static JPanel adminPane;
	public static JPanel lendingPane;
	public static JPanel bookpanel;
	private JButton enterbtn;
	private String user;
	private String password;
	private JTextField userinp;
	private JPasswordField passinp;
	private JFrame mainFrame;	
	public JButton adminBtn;
	private JButton[] recbtn;
	private String[] selbooks;
	private JLabel cbrain;
	private JLabel ptext;

	private JButton[] Edu_btn;
	private JLabel[] genre_Edu;
	private JLabel[] book;
	private JButton[] borrowbtn;
	private JButton edu;
	private JButton History;
	private JButton[] History_btn;
	private JLabel[] genre_History;
	private Boolean eduL = false;
	private Boolean HisL = false;
	private JLabel[] genre_Comedy;
	private JButton[] Comedy_btn;
	private Boolean ComL = false;
	private JLabel[] genre_Nfic;
	private JButton[] Nfic_btn;
	private Boolean NficL = false;
	private JLabel[] genre_Fiction;
	private JButton[] Fiction_btn;
	private Boolean FicL = false;
	private JButton Comedy;
	private JButton Fiction;
	private JButton Nfic;
	private JButton allG;
	private boolean all = false;
	private JLabel[] genre_All;
	private JButton[] All_btn;
	private int bookcan = -1;
	private int bookcan2 = -1;
	private int bookcan3 = -1;
	private int fcan=-1;
	private int fcan2=-1;
	private int fcan3=-1;
	private int nfcan=-1;
	private int nfcan2=-1;
	private int nfcan3=-1;
	private int educan=-1;
	private int educan2=-1;
	private int educan3=-1;
	private int hiscan=-1;
	private int hiscan2=-1;
	private int hiscan3=-1;	
	private int comcan=-1;
	private int comcan2=-1;
	private int comcan3=-1;
	private int bookret = -1;
	private int bookret2 = -1;
	private int bookret3 = -1;
	private int fret=-1;
	private int fret2=-1;
	private int fret3=-1;
	private int nfret=-1;
	private int nfret2=-1;
	private int nfret3=-1;
	private int eduret=-1;
	private int eduret2=-1;
	private int eduret3=-1;
	private int hisret=-1;
	private int hisret2=-1;
	private int hisret3=-1;	
	private int comret=-1;
	private int comret2=-1;
	private int comret3=-1;
	private int recret=-1;
	private int recret2=-1;
	private int recret3=-1;
	private int reccan=-1;
	private int reccan2=-1;
	private int reccan3=-1;
	private int borrow=-1;
	private int borrow2=-1;
	private int borrow3 = -1;
	private int bor=-1;
	private int bor2=-1;
	private int bor3 = -1;
	private int combor=-1;
	private int combor2=-1;
	private int combor3 = -1;
	private int hisbor=-1;
	private int hisbor2=-1;
	private int hisbor3 = -1;
	private int ficbor=-1;
	private int ficbor2=-1;
	private int ficbor3 = -1;
	private int nficbor=-1;
	private int nficbor2=-1;
	private int nficbor3 = -1;
	private int edubor=-1;
	private int edubor2=-1;
	private int edubor3 = -1;
	private int boden=-1;
	private int boden2=-1;
	private int boden3 = -1;
	private int den=-1;
	private int den2=-1;
	private int den3 = -1;
	private int comden=-1;
	private int comden2=-1;
	private int comden3 = -1;
	private int hisden=-1;
	private int hisden2=-1;
	private int hisden3 = -1;
	private int ficden=-1;
	private int ficden2=-1;
	private int ficden3 = -1;
	private int nficden=-1;
	private int nficden2=-1;
	private int nficden3 = -1;
	private int eduden=-1;
	private int eduden2=-1;
	private int eduden3 = -1;
	
	
	private JLabel[] recbook;
	private JLabel bookselecteda;
	private JLabel bookselecteda2;
	private JLabel bookselecteda3;
	private String selectedBook;
	private String selectedBook2;
	private String selectedBook3;
	private JLabel bookselected;
	private JLabel bookselected2;
	private JLabel bookselected3;
	private String Status = "";
	public JLabel status;
	private String Status2 = "";
	private JLabel status2;
	private String Status3 = "";
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
	private int bf1;
	private int bf2;
	private int bf3;
	private boolean canc = false;
	private JLabel anime;
	
	public void login() {
		// instances are important! very. 
		main = new Main(); // instance of main class
		control = new logic(); // instance of logic class
		data = new Bookandusers(); // instance of Book class
		mainFrame = Main.getFrame();
		
		this.contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(204,208,237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		mainFrame.setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Welcome!");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 40));
		lblNewLabel.setBounds(500, 208, 211, 51);
		contentPane.add(lblNewLabel);
		
		JLabel lblLogin = new JLabel("Login to Continue");
		lblLogin.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblLogin.setBounds(540, 256, 144, 20);
		contentPane.add(lblLogin);
		
	    JLabel idt = new JLabel("User ID: ");
	    idt.setFont(new Font("Century Gothic", Font.PLAIN, 13));
	    idt.setBounds(480, 317, 74, 14);
	    contentPane.add(idt);
	    
	    JLabel pwt = new JLabel("Password: ");
		pwt.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		pwt.setBounds(480, 380, 74, 14);
		contentPane.add(pwt);
	    
	    this.userinp = new JTextField();  // id input
		userinp.setForeground(new Color(73, 73, 73));	
		userinp.setBounds(480, 338, 240, 20);
		contentPane.add(userinp);
		userinp.setColumns(10);
		
		this.passinp = new JPasswordField();  // password input
		passinp.setForeground(new Color(73, 73, 73));
		passinp.setBounds(480, 400, 240, 20);
		contentPane.add(passinp);

	    enterbtn = new JButton();
	    enterbtn.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\lbtn.png"));
	    enterbtn.setOpaque(false);
	    enterbtn.setContentAreaFilled(false);
	    enterbtn.setBorderPainted(false);
	    enterbtn.setFocusable(false);
	    enterbtn.setVisible(true);
	    enterbtn.setBounds(480, 448, 240, 40);
	    
	    ImageIcon anim1 = new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\lbtn.png"); // animation
		ImageIcon anim = new ImageIcon ("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\slbtn.png");  // animation
		
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
		
	    JLabel logbg2 = new JLabel("");
		logbg2.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\bookwv.png"));
		logbg2.setBounds(2, -60, 1201, 882);  
		contentPane.add(logbg2);
	    
		anime = new JLabel("");
		anime.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\pguy.gif"));
		anime.setBounds(687, 370, 295, 345);
		contentPane.add(anime);
		
		
		JLabel logbg = new JLabel("");
		logbg.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\mbg.png"));
		logbg.setBounds(-159, 44, 1389, 1160);
		contentPane.add(logbg);
		
		
		mainFrame.setVisible(true); // makes frame visible
	}

	public void userpage() {
		
		this.userPane = new JPanel();
		userPane.setLayout(null);
		userPane.setBackground(new Color(231,230,235));
		userPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		userPane.setLayout(null);
		userPane.setVisible(true);
		
		mainFrame.setContentPane(userPane);
		mainFrame.repaint();
		mainFrame.revalidate();
		
        // GUMAWA NG NEW PANEL PARA HINDI MA-ISCROLL ANG MAIN PANEL WHICH IS SI CONTENT PANEL
        
			this.bookpanel = new JPanel(null); // NULL TO SET THE PANEL AS ABSOLUTE LAYOUT PARA MAS EASY SA FOR LOOP
	        bookpanel.setBackground(new Color(255,254,254));
	        bookpanel.setForeground(new Color(255,254,254));
	        bookpanel.setPreferredSize(new Dimension(500, 2500)); // change this value to generate all of the books!
	        bookpanel.setBorder(null);
	        userPane.add(bookpanel);
	        // SCROLL
	        JScrollPane bookscroll = new JScrollPane(bookpanel);
	        bookscroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); // VERTICAL ONLY
	        bookscroll.setBounds(130, 455, 621, 316);
	        bookscroll.setBorder(null);
	        userPane.add(bookscroll);
	        
			cbrain = new JLabel("");
			cbrain.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\cnorm1.gif"));
			cbrain.setBounds(516, 225, 230, 225);
			userPane.add(cbrain);
	        
	        ptext = new JLabel();
	        ptext.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\ptext2.png"));
			ptext.setBounds(125, 140, 611, 300);
			userPane.add(ptext);

	        
        this.adminBtn = new JButton("admin"); // ADMIN BUTTON
        adminBtn.setBounds(42, 707, 104, 44);
        adminBtn.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\admbtn.png"));
        adminBtn.setOpaque(false);
        adminBtn.setContentAreaFilled(false);
        adminBtn.setBorderPainted(false);
        adminBtn.setFocusable(false);
        
	     adminBtn.addActionListener(new ActionListener() {
	    		@Override
				public void actionPerformed(ActionEvent e) {
	    			main.adminBtn();}});
	     
        userPane.add(adminBtn);

        JButton logo = new JButton("");
        logo.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\logo.png"));
        logo.setOpaque(false);
        logo.setContentAreaFilled(false);
        logo.setBorderPainted(false);
        logo.setFocusable(false);
        logo.setBounds(28, 32, 51, 42);
        userPane.add(logo);
        
        JButton hbtn = new JButton("");
        hbtn.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\hbtn.png"));
        hbtn.setOpaque(false);
        hbtn.setContentAreaFilled(false);
        hbtn.setBorderPainted(false);
        hbtn.setFocusable(false);
        hbtn.setBounds(25, 186, 55, 55);
        userPane.add(hbtn);
        
        ImageIcon seth = new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\hbtn.png"); // animation
		ImageIcon sethh = new ImageIcon ("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\hhover.png");  // animation
        
        hbtn.addMouseListener(new MouseAdapter() {
            @Override
           public void mouseEntered(MouseEvent e) {
            	hbtn.setBounds(14, 170, 78, 78);
            	hbtn.setIcon(sethh);
            }
		@Override
		public void mouseExited(MouseEvent e) {
			hbtn.setBounds(25, 186, 55, 55);
			hbtn.setIcon(seth);
		}
		});
  

        JButton lending = new JButton("");
        lending.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\lnbtn.png"));
        lending.setOpaque(false);
        lending.setContentAreaFilled(false);
        lending.setBorderPainted(false);	
        lending.setFocusable(false);
        lending.setBounds(25, 276, 55, 55);
        userPane.add(lending);
        lending.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	main.goLend();}});
        
        ImageIcon sety = new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\lnbtn.png"); // animation
		ImageIcon setyy = new ImageIcon ("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\bhover.png");  // animation
        
        lending.addMouseListener(new MouseAdapter() {
            @Override
           public void mouseEntered(MouseEvent e) {
            	lending.setBounds(14, 258, 78, 78);
            	lending.setIcon(setyy);
            }
		@Override
		public void mouseExited(MouseEvent e) {
			lending.setBounds(25, 276, 55, 55);
			lending.setIcon(sety);
		}
		});
        
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    
	    this.book = new JLabel[data.books.length]; // length of jlabels to be made for book cover
        this.borrowbtn = new JButton[50];
        this.genre_Edu = new JLabel[data.genre_Educational.length];
        this.Edu_btn = new JButton[data.genre_Educational.length];
        this.genre_History = new JLabel[data.genre_History.length];
        this.History_btn = new JButton[data.genre_History.length];
        this.genre_Comedy = new JLabel[data.genre_Comedy.length];
        this.Comedy_btn = new JButton[data.genre_Comedy.length];
        this.genre_Fiction = new JLabel[data.genre_Fiction.length];
        this.Fiction_btn = new JButton[data.genre_Fiction.length];
        this.genre_Nfic = new JLabel[data.genre_NonFiction.length];
        this.Nfic_btn = new JButton[data.genre_NonFiction.length];
        
        edu = new JButton();
        edu.setOpaque(false);
	    edu.setContentAreaFilled(false);
	    edu.setBorderPainted(false);
	    edu.setFocusable(false);
	    edu.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\eduG.png"));
        edu.setBounds(266, 100, 82, 86);
        userPane.add(edu);
        
        Comedy = new JButton();
        Comedy.setOpaque(false);
	    Comedy.setContentAreaFilled(false);
	    Comedy.setBorderPainted(false);
	    Comedy.setFocusable(false);
        Comedy.setBounds(447, 100, 82, 86);
        Comedy.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\comG.png"));
        userPane.add(Comedy);
        
        History = new JButton();
        History.setOpaque(false);
	    History.setContentAreaFilled(false);
	    History.setBorderPainted(false);
	    History.setFocusable(false);
        History.setBounds(359, 100, 82, 86);
        History.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\hisG.png"));
        userPane.add(History);
        
        Fiction = new JButton();
        Fiction.setOpaque(false);
	    Fiction.setContentAreaFilled(false);
	    Fiction.setBorderPainted(false);
	    Fiction.setFocusable(false);
        Fiction.setBounds(639, 100, 82, 86);
        Fiction.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\ficG.png"));
        userPane.add(Fiction);
        
        
        Nfic = new JButton();
        Nfic.setOpaque(false);
	    Nfic.setContentAreaFilled(false);
	    Nfic.setBorderPainted(false);
	    Nfic.setFocusable(false);
	    Nfic.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\nfG.png"));
        Nfic.setBounds(546, 100, 82, 86);
        userPane.add(Nfic);
        
        allG = new JButton();
        allG.setOpaque(false);
	    allG.setContentAreaFilled(false);
	    allG.setBorderPainted(false);
	    allG.setFocusable(false);
        allG.setBounds(160, 100, 85, 92);
        allG.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\allG.png"));
        userPane.add(allG);
        
        for (int z = 0; z < data.bookname.length; z++) {
        	   
        	final int indx = z;
        	borrowbtn[z] = new JButton();
        	borrowbtn[z].setBounds(-10 + (z % 5) * 120,215 + (z / 5) * 240, 140, 24); //spacing, modulus para makuha ma-seperate
        	borrowbtn[z].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\bbtn.png"));
        	borrowbtn[z].setOpaque(false);
    		borrowbtn[z].setContentAreaFilled(false);
    		borrowbtn[z].setBorderPainted(false);
    		borrowbtn[z].setFocusable(false);
    	     
    		book[z] = new JLabel("");
        	book[z].setBounds(0 + (z % 5) * 120, 0 + (z/5) * 240, 125, 250);
        	book[z].setFont(new Font("Century Gothic", Font.BOLD, 10));
        	book[z].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\sb.png"));
        	book[z].setHorizontalTextPosition(JLabel.CENTER);
            book[z].setVerticalTextPosition(JLabel.BOTTOM);
            book[z].setHorizontalAlignment(JLabel.CENTER);
        	book[z].setText(("<html><center>" + data.bookname[z] + "</center></html>")); 
        	
        	bookpanel.add(borrowbtn[z]);
        	bookpanel.add(book[z]);	
        	bookpanel.revalidate();
        	bookpanel.repaint();
           }
        this.recbook = new JLabel[data.books.length]; // length of jlabels to be made for book cover
        this.recbtn = new JButton[50]; // 50 buttons to be made 
         
        for (int z = 0; z < 3; z++) { // count to 50
        	 int indx = z;
        	
             
             Random randbook = new Random();
             
             int row = z / 3;
             int yOffset = 70; 
             
             int arnum = randbook.nextInt(data.bookname.length); // randomizer
            
        	recbtn[z] = new JButton();
        	recbtn[z].setBounds(823 + (z % 3) * 122, 295 + (z / 3) * 225, 78, 33); //spacing, modulus para makuha ma-seperate
        	recbtn[z].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\recbtn.png"));
        	recbtn[z].setOpaque(false);
    		recbtn[z].setContentAreaFilled(false);
    		recbtn[z].setBorderPainted(false);
    		recbtn[z].setFocusable(false);
  
    		
    		recbtn[z].addActionListener(new ActionListener() {
    			@Override
				public void actionPerformed(ActionEvent e) {
    				
    				selectedNum++;
    				
    				switch (selectedNum) {
    				 case 1:
    					 if (canc) {
     						System.out.println("canc1");
     						selectedNum=3;
     						canc = false;
     					}
    					 den = indx;
    					 borrow = indx;
    					 recret = indx;
    					 reccan = indx;
    					Status = "Pending...";
    					recbtn[indx].setVisible(false);
    					bookpanel.remove(Edu_btn[indx]);
    					recbook[indx].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\penS.png"));
    						selectedBook = data.bookname[arnum];
    					 break;
    					 
    				 case 2:
    					 if (canc) {
	       						System.out.println("canc2");
	       						selectedNum++;
	       						canc = false;
	       					}
    					 den2 = indx;
    					 borrow2 = indx;
    					 recret2 = indx;
    					 reccan2 = indx;
    					 Status2 = "Pending...";
    					 recbtn[indx].setVisible(false);
	    					bookpanel.remove(recbtn[indx]);
	    					recbook[indx].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\penS.png"));
    						selectedBook2 = data.bookname[arnum];
    							break;
    				 case 3:
    					 den3 = indx;
    					 borrow3 = indx;
    					 recret3 = indx;
    					 reccan3 = indx;
    					 Status3 = "Pending...";
    					 	recbtn[indx].setVisible(false);
    					 	bookpanel.remove(recbtn[indx]);
	    					recbook[indx].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\penS.png"));
    						selectedBook3 = data.bookname[arnum];
    							break;
    				 case 4:
    					 System.out.println("Maximum books reached");
    					 
    					 break;		
    				}
	            	status.setText(getStatus());
	            	status.repaint();
	            	status.revalidate();
					// when clicked change the place holder ( maximum of 3 only )
					 	
				
			        
				}
        	}); 
    		
        	recbook[z] = new JLabel("");
        	recbook[z].setBounds(800 + (z % 3) * 130, yOffset + (z / 3) * 280, 125, 260);
        	recbook[z].setFont(new Font("Century Gothic", Font.BOLD, 11));
        	recbook[z].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\sb.png"));
        	recbook[z].setHorizontalTextPosition(JLabel.CENTER);
            recbook[z].setVerticalTextPosition(JLabel.BOTTOM);
            recbook[z].setHorizontalAlignment(JLabel.CENTER);
        	recbook[z].setText(("<html><center>" + data.bookname[arnum] + "</center></html>")); 
        	userPane.add(recbtn[z]);
        	userPane.add(recbook[z]);	
        	userPane.revalidate();
        	userPane.repaint();
        }

        
        for (int z = 0; z < data.genre_Educational.length; z++) {
        	String[] imagePath = { "C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\eduS1.png",
       			 "C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\eduS2.png", 
       			 "C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\eduS3.png", 
       			 "C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\eduS4.png", 
       			 "C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\eduS5.png"};       
 	      Random rando1Path = new Random();
      	 int randoPath = rando1Path.nextInt(imagePath.length);
      	 String randPath = imagePath[randoPath];
 	      
     	Edu_btn[z] = new JButton();
    	Edu_btn[z].setBounds(-10 + (z % 5) * 120,215 + (z / 5) * 240, 140, 24); //spacing, modulus para makuha ma-seperate
    	Edu_btn[z].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\bbtn.png"));
    	Edu_btn[z].setOpaque(false);
		Edu_btn[z].setContentAreaFilled(false);
		Edu_btn[z].setBorderPainted(false);
		Edu_btn[z].setFocusable(false);
		
		
		genre_Edu[z] = new JLabel("");
    	genre_Edu[z].setBounds(0 + (z % 5) * 120, 0 + (z/5) * 240, 125, 250);
    	genre_Edu[z].setFont(new Font("Century Gothic", Font.BOLD, 10));
    	genre_Edu[z].setIcon(new ImageIcon(randPath));
    	genre_Edu[z].setHorizontalTextPosition(JLabel.CENTER);
        genre_Edu[z].setVerticalTextPosition(JLabel.BOTTOM);
        genre_Edu[z].setHorizontalAlignment(JLabel.CENTER);
    	genre_Edu[z].setText(("<html><center>" + data.genre_Educational[z] + "</center></html>"));  
     	bookpanel.add(Edu_btn[z]);
        bookpanel.add(genre_Edu[z]);
     	bookpanel.revalidate();
     	bookpanel.repaint();
     	   
     	   genre_Edu[z].setVisible(false);
     	   Edu_btn[z].setVisible(false);
        } 
        
        for (int z = 0; z < data.genre_Comedy.length; z++) {
        	String[] imagePath = { "C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\comS1.png",
       			 "C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\comS2.png", 
       			 "C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\comS3.png", 
       			 "C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\comS4.png", 
       			 "C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\comS5.png"};       
 	      Random rando1Path = new Random();
      	 int randoPath = rando1Path.nextInt(imagePath.length);
      	 String randPath = imagePath[randoPath];
 	      
     	Comedy_btn[z] = new JButton();
    	Comedy_btn[z].setBounds(-10 + (z % 5) * 120,215 + (z / 5) * 240, 140, 24); //spacing, modulus para makuha ma-seperate
    	Comedy_btn[z].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\bbtn.png"));
    	Comedy_btn[z].setOpaque(false);
		Comedy_btn[z].setContentAreaFilled(false);
		Comedy_btn[z].setBorderPainted(false);
		Comedy_btn[z].setFocusable(false);
		genre_Comedy[z] = new JLabel("");
    	genre_Comedy[z].setBounds(0 + (z % 5) * 120, 0 + (z/5) * 240, 125, 250);
    	genre_Comedy[z].setFont(new Font("Century Gothic", Font.BOLD, 10));
    	genre_Comedy[z].setIcon(new ImageIcon(randPath));
    	genre_Comedy[z].setHorizontalTextPosition(JLabel.CENTER);
        genre_Comedy[z].setVerticalTextPosition(JLabel.BOTTOM);
        genre_Comedy[z].setHorizontalAlignment(JLabel.CENTER);
    	genre_Comedy[z].setText(("<html><center>" + data.genre_Comedy[z] + "</center></html>"));  
     	bookpanel.add(Comedy_btn[z]);
        bookpanel.add(genre_Comedy[z]);
     	bookpanel.revalidate();
     	bookpanel.repaint();
     	   System.out.print("comedy loaded");
     	   genre_Comedy[z].setVisible(false);
     	   Comedy_btn[z].setVisible(false);
        } 
        
        for (int z = 0; z < data.genre_History.length; z++) {
     	   
  	      String[] imagePath = { "C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\hisS1.png",
  	       "C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\hisS2.png", 
  	        "C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\hisS3.png", 
  	        "C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\hisS4.png", 
  	      "C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\hisS5.png"}; 
  	      Random rando1Path = new Random();
       	 int randoPath = rando1Path.nextInt(imagePath.length);
       	 String randPath = imagePath[randoPath];
  	      
  	    History_btn[z] = new JButton();
        	History_btn[z].setBounds(-10 + (z % 5) * 120,215 + (z / 5) * 240, 140, 24); //spacing, modulus para makuha ma-seperate
        	History_btn[z].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\bbtn.png"));
        	History_btn[z].setOpaque(false);
    		History_btn[z].setContentAreaFilled(false);
    		History_btn[z].setBorderPainted(false);
    		History_btn[z].setFocusable(false);
    		
    		genre_History[z] = new JLabel("");
      	genre_History[z].setBounds(0 + (z % 5) * 120, 0 + (z/5) * 240, 125, 250);
      	genre_History[z].setFont(new Font("Century Gothic", Font.BOLD, 10));
      	genre_History[z].setIcon(new ImageIcon(randPath));
      	genre_History[z].setHorizontalTextPosition(JLabel.CENTER);
          genre_History[z].setVerticalTextPosition(JLabel.BOTTOM);
          genre_History[z].setHorizontalAlignment(JLabel.CENTER);
      	genre_History[z].setText(("<html><center>" + data.genre_History[z] + "</center></html>")); 
      	bookpanel.add(History_btn[z]);
          bookpanel.add(genre_History[z]);
      	bookpanel.revalidate();
      	bookpanel.repaint();
      	   
      	   genre_History[z].setVisible(false);
      	   History_btn[z].setVisible(false);
         }
        
        for (int z = 0; z < data.genre_Fiction.length; z++) {
      	   
    	      String[] imagePath = { "C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\ficS1.png",
    	       "C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\ficS2.png", 
    	        "C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\ficS3.png", 
    	        "C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\ficS4.png", 
    	      "C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\ficS5.png"}; 
    	      Random rando1Path = new Random();
         	 int randoPath = rando1Path.nextInt(imagePath.length);
         	 String randPath = imagePath[randoPath];
    	      
    	    Fiction_btn[z] = new JButton();
          	Fiction_btn[z].setBounds(-10 + (z % 5) * 120,215 + (z / 5) * 240, 140, 24); //spacing, modulus para makuha ma-seperate
          	Fiction_btn[z].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\bbtn.png"));
          	Fiction_btn[z].setOpaque(false);
      		Fiction_btn[z].setContentAreaFilled(false);
      		Fiction_btn[z].setBorderPainted(false);
      		Fiction_btn[z].setFocusable(false);
      		
      		genre_Fiction[z] = new JLabel("");
        	genre_Fiction[z].setBounds(0 + (z % 5) * 120, 0 + (z/5) * 240, 125, 250);
        	genre_Fiction[z].setFont(new Font("Century Gothic", Font.BOLD, 10));
        	genre_Fiction[z].setIcon(new ImageIcon(randPath));
        	genre_Fiction[z].setHorizontalTextPosition(JLabel.CENTER);
            genre_Fiction[z].setVerticalTextPosition(JLabel.BOTTOM);
            genre_Fiction[z].setHorizontalAlignment(JLabel.CENTER);
        	genre_Fiction[z].setText(("<html><center>" + data.genre_Fiction[z] + "</center></html>")); 
        	bookpanel.add(Fiction_btn[z]);
            bookpanel.add(genre_Fiction[z]);
        	bookpanel.revalidate();
        	bookpanel.repaint();
        	   
        	   genre_Fiction[z].setVisible(false);
        	   Fiction_btn[z].setVisible(false);
           }
        
        for (int z = 0; z < data.genre_NonFiction.length; z++) {
       	   
  	      String[] imagePath = { "C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\nficS1.png",
  	       "C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\nficS2.png", 
  	        "C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\nficS3.png", 
  	        "C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\nficS4.png", 
  	      "C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\nficS5.png"}; 
  	      Random rando1Path = new Random();
       	 int randoPath = rando1Path.nextInt(imagePath.length);
       	 String randPath = imagePath[randoPath];
  	      
  	    Nfic_btn[z] = new JButton();
        	Nfic_btn[z].setBounds(-10 + (z % 5) * 120,215 + (z / 5) * 240, 140, 24); //spacing, modulus para makuha ma-seperate
        	Nfic_btn[z].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\bbtn.png"));
        	Nfic_btn[z].setOpaque(false);
    		Nfic_btn[z].setContentAreaFilled(false);
    		Nfic_btn[z].setBorderPainted(false);
    		Nfic_btn[z].setFocusable(false);
    		
    		genre_Nfic[z] = new JLabel("");
      	genre_Nfic[z].setBounds(0 + (z % 5) * 120, 0 + (z/5) * 240, 125, 250);
      	genre_Nfic[z].setFont(new Font("Century Gothic", Font.BOLD, 10));
      	genre_Nfic[z].setIcon(new ImageIcon(randPath));
      	genre_Nfic[z].setHorizontalTextPosition(JLabel.CENTER);
          genre_Nfic[z].setVerticalTextPosition(JLabel.BOTTOM);
          genre_Nfic[z].setHorizontalAlignment(JLabel.CENTER);
      	genre_Nfic[z].setText(("<html><center>" + data.genre_NonFiction[z] + "</center></html>")); 
      	bookpanel.add(Nfic_btn[z]);
        bookpanel.add(genre_Nfic[z]);
      	bookpanel.revalidate();
      	bookpanel.repaint();
      	   
      	   genre_Nfic[z].setVisible(false);
      	   Nfic_btn[z].setVisible(false);
         }
 
       edu.addActionListener(new ActionListener() {

 			public void actionPerformed(ActionEvent e) {
 				
 			       edu.setEnabled(false);
 			       Comedy.setEnabled(true);
 			      Fiction.setEnabled(true);
 			       History.setEnabled(true);
 			      Nfic.setEnabled(true);
 			     allG.setEnabled(true);
 			       eduL = true;
 			       
 			       //hides other genre
 			     hideAll();
 			     hideNonFiction();
 			     hideFiction();
 			     hideHistory();
 				 hideComedy();
 			       
 				 
 				for (int z = 0; z < data.bookname.length; z++) {
					borrowbtn[z].setVisible(false);
					book[z].setVisible(false);
				}

		        
				for (int z = 0; z < Edu_btn.length; z++) { // count to 50
					final int indx = z;
					genre_Edu[z].setVisible(true);
		     	   Edu_btn[z].setVisible(true);
		         // iterates each book in the array to check the true value for the button

		    		Edu_btn[z].addActionListener(new ActionListener() {
		    			@Override
						public void actionPerformed(ActionEvent e) {
		    				selectedNum++;
		    				
		    				switch (selectedNum) {
		    				 case 1:
		    					 if (canc) {
		        						System.out.println("canc1");
		        						selectedNum=3;
		        						canc = false;
		        					}
		    					 eduden = indx;
		    					 edubor = indx;
		    					 educan = indx;
		    					 eduret = indx;
		    					Status = "Pending...";
		    					Edu_btn[indx].setVisible(false);
		    					bookpanel.remove(Edu_btn[indx]);
		    					genre_Edu[indx].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\penS.png"));
		    					selectedBook = data.genre_Educational[indx]; 
		    					break;
		    					 
		    				 case 2:
		    					 if (canc) {
			       						System.out.println("canc2");
			       						selectedNum++;
			       						canc = false;
			       					}
		    					 eduden2 = indx;
		    					 edubor2 = indx;
		    					 educan2 = indx;
		    					 eduret2 = indx;
		    					 Status2 = "Pending...";
		    					 Edu_btn[indx].setVisible(false);
			    					bookpanel.remove(Edu_btn[indx]);
			    					genre_Edu[indx].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\penS.png"));
			    					selectedBook2 = data.genre_Educational[indx];
			    					break;
		    				 case 3:
		    					 eduden3 = indx;
		    					 edubor3 = indx;
		    					 educan3 = indx;
		    					 eduret3 = indx;
		    					 Status3 = "Pending...";
		    					 Edu_btn[indx].setVisible(false);
			    					bookpanel.remove(Edu_btn[indx]);
			    					genre_Edu[indx].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\penS.png"));
		     					selectedBook3 = data.genre_Educational[indx];
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
		        	bookpanel.revalidate();
		        	bookpanel.repaint();
					}
				}
			});
       
      History.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				edu.setEnabled(true);
				Comedy.setEnabled(true);
				History.setEnabled(false);   
				Fiction.setEnabled(true);
				Nfic.setEnabled(true);
				allG.setEnabled(true);
				HisL = true;
				
				for (int z = 0; z < data.bookname.length; z++) {
					borrowbtn[z].setVisible(false);
					book[z].setVisible(false);
				}

				
				 hideAll();
				hideNonFiction();
				hideFiction();
				hideComedy();
				hideEduc();
				
				for (int z = 0; z < data.genre_History.length; z++) { // count to 50
		        	final int indx = z;
		        	genre_History[z].setVisible(true);
		     	   History_btn[z].setVisible(true);
		      

		    		History_btn[z].addActionListener(new ActionListener() {
		    			@Override
						public void actionPerformed(ActionEvent e) {
		    				selectedNum++;

		    				switch (selectedNum) {
		    				
		    				
		    				 case 1:
		    					 if (canc) {
		        						System.out.println("canc1");
		        						selectedNum=3;
		        						canc = false;
		        					}
		    					 hisden = indx;
		    					hisbor = indx;
		    					hiscan = indx;
		    					hisret = indx;
		    					Status = "Pending...";
		    					History_btn[indx].setVisible(false);
		    					bookpanel.remove(History_btn[indx]);
		    					genre_History[indx].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\penS.png"));
		     					selectedBook = data.genre_History[indx];
		    					 break;
		    					 
		    				 case 2:
		    					 if (canc) {
			       						System.out.println("canc2");
			       						selectedNum++;
			       						canc = false;
			       					}
		    					 hisden2 = indx;
		    					 hisbor2 = indx;
		    					 hiscan2 = indx;
		    					 hisret2 = indx;
		    					 Status2 = "Pending...";
		    					 History_btn[indx].setVisible(false);
		    					 bookpanel.remove(History_btn[indx]);
		    					 genre_History[indx].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\penS.png"));
		     					selectedBook2 = data.genre_History[indx];
		     						break;
		    				 case 3:
		    					 hisden3 = indx;
		    					 hisbor3 = indx;
		    					 hiscan3 = indx;
		    					 hisret3 = indx;
		    					 Status3 = "Pending...";
		    					 History_btn[indx].setVisible(false);
		    					 genre_History[indx].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\penS.png"));
		    					 bookpanel.remove(History_btn[indx]);	
		     					selectedBook3 = data.genre_History[indx];
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
		       
		        }
				hideEduc(); // will only run if educ is true
				}
			});
      
      
      
     Comedy.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// enable - disable buttons
				edu.setEnabled(true);
				History.setEnabled(true);
				Fiction.setEnabled(true);
				Comedy.setEnabled(false);   
				Nfic.setEnabled(true);
				allG.setEnabled(true);
				ComL = true;
				
				for (int z = 0; z < data.bookname.length; z++) {
					borrowbtn[z].setVisible(false);
					book[z].setVisible(false);
				}

				
				// hide other genre
				 hideAll();
				hideNonFiction();
				hideFiction();
				hideEduc();
				hideHistory();
		          for (int z = 0; z < data.genre_Comedy.length; z++) {
		        	  
		        	Comedy_btn[z].setVisible(true);
		        	genre_Comedy[z].setVisible(true);
		        	
					final int indx = z;
		        	Comedy_btn[z].addActionListener(new ActionListener() {
		    			@Override
						public void actionPerformed(ActionEvent e) {
		    				selectedNum++;
		    				
		    				switch (selectedNum) {
		    				 case 1:
		    					 if (canc) {
		        						System.out.println("canc1");
		        						selectedNum=3;
		        						canc = false;
		        					}
		    					 comden = indx;
		    					 combor = indx;
		    					 comcan = indx;
		    					 comret = indx;
		    					Status = "Pending...";
		    					Comedy_btn[indx].setVisible(false);
		    					bookpanel.remove(Comedy_btn[indx]);
		    					genre_Comedy[indx].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\penS.png"));
		     					selectedBook = data.genre_Comedy[indx];
		    					 break;
		    					 
		    				 case 2:
		    					 if (canc) {
			       						System.out.println("canc2");
			       						selectedNum++;
			       						canc = false;
			       					}
		    					 comden2 = indx;
		    					 combor2 = indx;
		    					 comcan2 = indx;
		    					 comret2 = indx;
		    					 Status2 = "Pending...";
		    					 Comedy_btn[indx].setVisible(false);
			    					bookpanel.remove(Comedy_btn[indx]);
			    					genre_Comedy[indx].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\penS.png"));
		     					selectedBook2 = data.genre_Comedy[indx];
		     						break;
		    				 case 3:
		    					 comden3 = indx;
		    					 combor3 = indx;
		    					 comcan3 = indx;
		    					 comret3 = indx;
		    					 Status3 = "Pending...";
		    					 Comedy_btn[indx].setVisible(false);
			    					bookpanel.remove(Comedy_btn[indx]);
			    					genre_Comedy[indx].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\penS.png"));
		     					selectedBook3 = data.genre_Comedy[indx];
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
		        }
				bookpanel.revalidate();
	        	bookpanel.repaint();
			
				}
			});
     
     Fiction.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				//add here
				edu.setEnabled(true);
				Comedy.setEnabled(true);
				History.setEnabled(true);
				Fiction.setEnabled(false);   
				Nfic.setEnabled(true);
				allG.setEnabled(true);
				
				FicL = true; // change this
				for (int z = 0; z < data.bookname.length; z++) {
					borrowbtn[z].setVisible(false);
					book[z].setVisible(false);
				}

				
				//add here
				 hideAll();
				hideNonFiction();
				hideHistory();
				hideComedy();
				hideEduc();
				
				
				for (int z = 0; z < data.genre_Fiction.length; z++) { // count to 50
		        	final int indx = z;
		        	
		        	// change this
		        	
		        	genre_Fiction[z].setVisible(true);
		        	Fiction_btn[z].setVisible(true);
		      

		    		Fiction_btn[z].addActionListener(new ActionListener() {
		    			@Override
						public void actionPerformed(ActionEvent e) {
		    				selectedNum++;

		    				switch (selectedNum) {
		    				
		    				// change this
		    				
		    				 case 1:
		    					 if (canc) {
		        						System.out.println("canc1");
		        						selectedNum=3;
		        						canc = false;
		        					}
		    					 ficden = indx;
		    					 ficbor = indx;
		    					 fcan = indx;
		    					 fret = indx;
		    					Status = "Pending...";
		    					Fiction_btn[indx].setVisible(false);
		    					bookpanel.remove(Fiction_btn[indx]);
		    					genre_Fiction[indx].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\penS.png"));
		     					selectedBook = data.genre_Fiction[indx];
		    					 break;
		    					 
		    				 case 2:
		    					 if (canc) {
			       						System.out.println("canc2");
			       						selectedNum++;
			       						canc = false;
			       					}
		    					 ficden2 = indx;
		    					 ficbor2 = indx;
		    					 fcan2 = indx;
		    					 fret2 = indx;
		    					 Status2 = "Pending...";
		    					 Fiction_btn[indx].setVisible(false);
		    					 bookpanel.remove(Fiction_btn[indx]);
		    					 genre_Fiction[indx].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\penS.png"));
		     					selectedBook2 = data.genre_Fiction[indx];
		     						break;
		    				 case 3:
		    					 ficden3 = indx;
		    					 ficbor3 = indx;
		    					 fcan3 = indx;
		    					 fret3 = indx;
		    					 Status3 = "Pending...";
		    					 Fiction_btn[indx].setVisible(false);
		    					 genre_Fiction[indx].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\penS.png"));
		    					 bookpanel.remove(Fiction_btn[indx]);	
		     					selectedBook3 = data.genre_Fiction[indx];
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
		       
		        }
				}
			});
     
     Nfic.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				//add here
				edu.setEnabled(true);
				Comedy.setEnabled(true);
				History.setEnabled(true);
				Fiction.setEnabled(true);   
				Nfic.setEnabled(false);
				allG.setEnabled(true);
				
				NficL = true; // change this
				
				for (int z = 0; z < data.bookname.length; z++) {
					borrowbtn[z].setVisible(false);
					book[z].setVisible(false);
				}

				//add here
				hideAll();
				hideFiction();
				hideHistory();
				hideComedy();
				hideEduc();
				
				for (int z = 0; z < data.genre_NonFiction.length; z++) { // count to 50
		        	final int indx = z;
		        	
		        	// change this
		        	
		        	genre_Nfic[z].setVisible(true);
		        	Nfic_btn[z].setVisible(true);
		      

		    		Nfic_btn[z].addActionListener(new ActionListener() {
		    			@Override
						public void actionPerformed(ActionEvent e) {
		    				selectedNum++;

		    				switch (selectedNum) {
		    				
		    				// change this
		    				
		    				 case 1:
		    					 if (canc) {
		        						System.out.println("canc1");
		        						selectedNum=3;
		        						canc = false;
		        					}
		    					 nficden = indx;
		    					nficbor = indx;
		    					nfcan = indx;
		    					nfret = indx;
		    					Status = "Pending...";
		    					Nfic_btn[indx].setVisible(false); // visibility to false
		    					bookpanel.remove(Nfic_btn[indx]);
		    					genre_Nfic[indx].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\penS.png"));
		     					selectedBook = data.genre_NonFiction[indx];
		    					 break;
		    					 
		    				 case 2:
		    					 if (canc) {
		       						System.out.println("canc2");
		       						selectedNum++;
		       						canc = false;
		       					}
		    					 nficden2 = indx;
		    					 nficbor2 = indx;
		    					 nfcan2 = indx;
		    					 nfret2 = indx;
		    					 Status2 = "Pending...";
		    					 Nfic_btn[indx].setVisible(false);
		    					 bookpanel.remove(Nfic_btn[indx]);
		    					 genre_Nfic[indx].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\penS.png"));
		     					selectedBook2 = data.genre_NonFiction[indx];
		     						break;
		    				 case 3:
		    					 nficden3 = indx;
		    					 nficbor3 = indx;
		    					 nfcan3 = indx;
		    					 nfret3 =indx;
		    					 Status3 = "Pending...";
		    					 Nfic_btn[indx].setVisible(false);
		    					 genre_Nfic[indx].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\penS.png"));
		    					 bookpanel.remove(Nfic_btn[indx]);	
		     					selectedBook3 = data.genre_NonFiction[indx];
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
		       
		        }
				bookpanel.repaint();
				bookpanel.revalidate();				
				}
			});
     
     
     allG.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			     edu.setEnabled(true);
			       Comedy.setEnabled(true);
			       Fiction.setEnabled(true);
			       History.setEnabled(true);
			       Nfic.setEnabled(true);
			       allG.setEnabled(false);
			       all = true;
			       
			       //hides other genre
			     hideEduc();
			     hideNonFiction();
			     hideFiction();
			     hideHistory();
				 hideComedy();
				 for (int z = 0; z < data.bookname.length; z++) {
				 borrowbtn[z].setVisible(true);
					book[z].setVisible(true);}
				
			}
     });
     
     
	 for (int z = 0; z < data.bookname.length; z++) {  // all books logic
		 final int indx = z;
			borrowbtn[z].setVisible(true);
			book[z].setVisible(true);
			
    		borrowbtn[z].addActionListener(new ActionListener() {
    			@Override
				public void actionPerformed(ActionEvent e) {
    				selectedNum++;
    				
    				
    				switch (selectedNum) {
    				 case 1:
    					 if (canc) {
    						 
       						System.out.println("canc1");
       						selectedNum=3;
       						canc = false;
       					}
    					 boden = indx;
    					 bor = indx;
    					 bookcan = indx;
    					 bookret = indx;
    					Status = "Pending...";
    					borrowbtn[indx].setVisible(false);
    					 bookpanel.remove(borrowbtn[indx]);
    					 book[indx].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\penS.png"));
     					selectedBook = data.bookname[indx];
     					System.out.print(selectedNum);
     					
    					 break; 
    				 case 2:
    					 if (canc) {
      						System.out.println("canc2");
      						selectedNum++;
      						canc = false;
      					}
    					 boden2=indx;
    					 bor2 = indx;
    					 bookcan2 = indx;
    					 bookret2 = indx;
    					 Status2 = "Pending...";
    					borrowbtn[indx].setVisible(false);
    					bookpanel.remove(borrowbtn[indx]);
    					book[indx].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\penS.png"));
     					selectedBook2 = data.bookname[indx];
     					System.out.print(selectedNum);

     						break;
    				 case 3:
    					 boden3=indx;
    					 bor3 = indx;
    					 bookcan3 = indx;
    					 bookret3 = indx;
    					 Status3 = "Pending...";
    					 borrowbtn[indx].setVisible(false);
    					 bookpanel.remove(borrowbtn[indx]);
    					 book[indx].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\penS.png"));
     					selectedBook3 = data.bookname[indx];
     					System.out.print(selectedNum);
     						break;
    				 case 4:
    					 System.out.println("Maximum books reached");
    					 break;
    				}
					// if canceled
					// if more than 3 na, selected book will not work
					// MAKE THIS SO IT WILL BE EXCLUSIVE ONLY TO 1 BOOK
	            	status.setText(getStatus());
	            	status.repaint();
	            	status.revalidate();
					// when clicked change the place holder ( maximum of 3 only )
					 	
				System.out.print("\n"+getSelectedBook()+"\n" + getSelectedBook2() + "\n" + getSelectedBook3() + "\n");
			        
				}
        	}); 
    		 bookpanel.repaint();
    			bookpanel.revalidate();
        }

        JLabel qlbl = new JLabel();
		qlbl.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\upg2.png"));
        qlbl.setBounds(103,-60, 1326, 912);
        userPane.add(qlbl);   
        
        cbrain = new JLabel();
		cbrain.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\upg2.png"));
        cbrain.setBounds(103,-60, 1326, 912);
        userPane.add(cbrain); 
 
        mainFrame.repaint();
        mainFrame.revalidate();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void adminpage() {
		control = new logic(); // instance of logic class
		data = new Bookandusers(); // instance of Book class
		
		this.adminPane = new JPanel();
		adminPane.setLayout(null);
		adminPane.setBackground(new Color(255, 255, 255));
		adminPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		adminPane.setLayout(null);
		adminPane.setVisible(true);
		
		mainFrame.setContentPane(adminPane);

        bookselecteda = new JLabel(selectedBook);
        bookselecteda.setFont(new Font("Century Gothic", Font.BOLD, 16));
        bookselecteda.setBounds(355, 435, 850, 50);
        adminPane.add(bookselecteda);
        
        bookselecteda2 = new JLabel(selectedBook2);
        bookselecteda2.setFont(new Font("Century Gothic", Font.BOLD, 16));
        bookselecteda2.setBounds(355, 500, 850, 50);
        adminPane.add(bookselecteda2);
        
        bookselecteda3 = new JLabel(selectedBook3);
        bookselecteda3.setFont(new Font("Century Gothic", Font.BOLD, 16));
        bookselecteda3.setBounds(355, 562, 850, 50);		
        adminPane.add(bookselecteda3);   
        
		JLabel warn = new JLabel("Maximum of 3-Days Only | If you need to exceed 3-Days, please report it.");
		        warn.setForeground(Color.RED);
		        warn.setFont(new Font("Century Gothic", Font.BOLD, 13));
				warn.setBounds(356, 200, 900, 22);
				warn.setVisible(true);
				adminPane.add(warn);
        
        this.cdate = new JTextField();  // INPUT FOR CUSTOM DATE!
		cdate.setForeground(new Color(73, 73, 73));
		cdate.setBounds(356, 198, 489, 42);
		cdate.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		adminPane.add(cdate);
		cdate.setColumns(10);
		
		entrD = new JButton();
		entrD.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\images\\setB.png"));
		entrD.setOpaque(false);
		entrD.setContentAreaFilled(false);
		entrD.setBorderPainted(false);
		entrD.setFocusable(false);
		entrD.setVisible(true);
		entrD.setBounds(865, 198, 101, 44);
		adminPane.add(entrD);

				cdget = cdate.getText();
		entrD.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cdget = cdate.getText();
				cdgconvert = Integer.parseInt(cdget);
				System.out.println("\n\n"+cdgconvert);
			}
		});
		
		  ImageIcon sety = new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\smals.png"); // animation
			ImageIcon setyy = new ImageIcon ("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\setb.png");  // animation
			
			entrD.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mousePressed(MouseEvent e) {
	            	entrD.setIcon(sety);
	            }
			@Override
			public void mouseReleased(MouseEvent e) {
				entrD.setIcon(setyy);
			}
			});
		
        JButton approve = new JButton("");
        approve.setBounds(935, 445, 26, 24);
    	approve.setOpaque(false);
		approve.setContentAreaFilled(false);
		approve.setBorderPainted(false);
		approve.setFocusable(false);
        approve.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\chk.png"));
        adminPane.add(approve);
        approve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	

        		if (borrow != -1) {
    				recbook[borrow].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\bL.png"));
    				borrow = -1;
    			}
            	
            	if (combor != -1) {
    				genre_Comedy[combor].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\bL.png"));
    				combor = -1;
    			}
    			
    			if (hisbor != -1) {
    				genre_History[hisbor].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\bL.png"));
    				hisbor = -1;
    			}
    			
    			if (edubor != -1) {
    				genre_Edu[edubor].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\bL.png"));
    				edubor= -1;
    			}
    			
    			if (ficbor != -1) {
    				ficbor = -1;
    				genre_Fiction[ficbor].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\bL.png"));
    			
    			}
    			
    			if (nficbor != -1) {
    				genre_Nfic[nficbor].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\bL.png"));
    				nficbor = -1;
    			}
    			
    			
    			if (bor != -1) {
    				book[bor].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\bL.png"));
    				bor = -1;
    			}
    			
    			int daystoadd = getdate();
    			
    			date = Calendar.getInstance();
    			
    			date.add(Calendar.DAY_OF_MONTH, daystoadd);
    			
            		String month = date.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()); // long is a get display name, and locale gets the local time and default is the pc time
        	        int dayOfMonth = date.get(Calendar.DAY_OF_MONTH);
        	        int year = date.get(Calendar.YEAR);
        	        
        	        System.out.println("updated Date: " + date.getTime());

        		
        	      Accepted = "Please Return On |  " + month + " " + date.get(Calendar.DAY_OF_MONTH)  + ", " + date.get(Calendar.YEAR);
        		Status = Accepted;
            	status.setText(getStatus());
            	status.repaint();
            	status.revalidate();
        		
            	userPane.repaint();
            	userPane.revalidate();
            	bookselecteda.setText("");
            	
            	bookselecteda.setFont(new Font("Century Gothic", Font.BOLD, 11));
    			bookselecteda.setText(" To Be Returned On: " + month + " " + dayOfMonth  + ", " + year + " | " + selectedBook);
            	
    			
                }
           });
        
        
	    ImageIcon anim1 = new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\chk.png"); // animation
		ImageIcon anim = new ImageIcon ("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\sac.png");  // animation

	    ImageIcon xanim1 = new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\xmk.png"); // animation
		ImageIcon xanim = new ImageIcon ("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\sde.png");  // animation
		
		approve.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                approve.setIcon(anim);
            }
		@Override
		public void mouseReleased(MouseEvent e) {
            approve.setIcon(anim1);
		}
		});

        
        JButton denied = new JButton("");
        denied.setBounds(903, 445, 25, 25);
    	denied.setOpaque(false);
		denied.setContentAreaFilled(false);
		denied.setBorderPainted(false);
		denied.setFocusable(false);
        denied.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\xmk.png"));
        adminPane.add(denied);
        denied.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	

        		if (boden != -1) {
    				book[boden].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\sb.png"));
    				boden = -1;
    			}
            	
            	if (comden != -1) {
    				genre_Comedy[comden].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\comS5.png"));
    				comden = -1;
    			}
    			
    			if (hisden != -1) {
    				genre_History[hisden].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\hisS3.png"));
    				hisden = -1;
    			}
    			
    			if (eduden != -1) {
    				genre_Edu[eduden].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\eduS3.png"));
    				eduden= -1;
    			}
    			
    			if (ficden != -1) {
    				ficden = -1;
    				genre_Fiction[ficden].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\ficS1.png"));
    			
    			}
    			
    			if (nficden != -1) {
    				genre_Nfic[nficden].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\denied.png"));
    				nficden = -1;
    			}
    			
    			
    			if (den != -1) {
    				recbook[den].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\sb.png"));
    				den = -1;
    			}
    			
            	
            	selectedNum=0;
            	canc=true;
            	bookselecteda.setText(" ");
            	selectedNum--;
            	Status = Denied;
            	status.setText(getStatus());
            	status.repaint();
            	status.revalidate();
                }
        });
        
        denied.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                denied.setIcon(xanim);
            }
		@Override
		public void mouseReleased(MouseEvent e) {
            denied.setIcon(xanim1);
		}
		});
        
        JButton approve2 = new JButton("");
        approve2.setBounds(935, 510, 25, 25);
    	approve2.setOpaque(false);
		approve2.setContentAreaFilled(false);
		approve2.setBorderPainted(false);
		approve2.setFocusable(false);
        approve2.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\chk.png"));
        adminPane.add(approve2);
        approve2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	int daystoadd = getdate();
            	date = Calendar.getInstance();
    			
    			date.add(Calendar.DAY_OF_MONTH, daystoadd);
    			
            		String month = date.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()); // long is a get display name, and locale gets the local time and default is the pc time
        	        int dayOfMonth = date.get(Calendar.DAY_OF_MONTH);
        	        int year = date.get(Calendar.YEAR);
        	        
        	        System.out.println("updated Date: " + date.getTime());

        	        bookselecteda2.setFont(new Font("Century Gothic", Font.BOLD, 11));
        			bookselecteda2.setText(" To Be Returned On: " + month + " " + dayOfMonth  + ", " + year + " | " + selectedBook2);
        	        
        		
        		Accepted = "Please Return On |  " + month + " " + date.get(Calendar.DAY_OF_MONTH)  + ", " + date.get(Calendar.YEAR);
            	

        		if (borrow2 != -1) {
    				recbook[borrow2].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\bL.png"));
    				borrow2 = -1;
    			}
            	
            	if (combor2 != -1) {
    				genre_Comedy[combor2].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\bL.png"));
    				combor2 = -1;
    			}
    			
    			if (hisbor2 != -1) {
    				genre_History[hisbor2].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\bL.png"));
    				hisbor2 = -1;
    			}
    			
    			if (edubor2 != -1) {
    				genre_Edu[edubor2].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\bL.png"));
    				edubor2= -1;
    			}
    			
    			if (ficbor2 != -1) {
    				genre_Fiction[ficbor2].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\bL.png"));
    				ficbor2 = -1;
    			}
    			
    			if (nficbor2 != -1) {
    				genre_Nfic[nficbor2].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\bL.png"));
    				nficbor2 = -1;
    			}
    			
    			
    			if (bor2 != -1) {
    				book[bor2].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\bL.png"));
    				bor2 = -1;
    			}
    			
                
    			userPane.repaint();
    			userPane.revalidate();
    			Status2 = Accepted;
            	status2.setText(getStatus());
            	status2.repaint();
            	status.revalidate();
    			
            	
                }
           });
        
        approve2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                approve2.setIcon(anim);
            }
		@Override
		public void mouseReleased(MouseEvent e) {
            approve2.setIcon(anim1);
		}
		});
        
        JButton denied2 = new JButton("");
        denied2.setBounds(903, 510, 25, 25);
    	denied2.setOpaque(false);
		denied2.setContentAreaFilled(false);
		denied2.setBorderPainted(false);
		denied2.setFocusable(false);
        denied2.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\xmk.png"));
        adminPane.add(denied2);
        denied2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	if (boden2 != -1) {
    				book[boden2].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\sb.png"));
    				boden2 = -1;
    			}
            	
            	if (comden2 != -1) {
    				genre_Comedy[comden2].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\comS1.png"));
    				comden2 = -1;
    			}
    			
    			if (hisden2 != -1) {
    				genre_History[hisden2].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\hisS1.png"));
    				hisden2 = -1;
    			}
    			
    			if (eduden2 != -1) {
    				genre_Edu[eduden2].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\eduS1.png"));
    				eduden2= -1;
    			}
    			
    			if (ficden2 != -1) {
    				ficden2 = -1;
    				genre_Fiction[ficden2].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\ficS2.png"));
    			
    			}
    			
    			if (nficden2 != -1) {
    				genre_Nfic[nficden2].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\nficS5.png"));
    				nficden2 = -1;
    			}
    			
    			
    			if (den2 != -1) {
    				recbook[den2].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\sb.png"));
    				den2 = -1;
    			}
            	
            	bookselecteda2.setText(" ");
            	selectedNum=1;
            	canc=true;
            	Status2 = Denied;
            	status2.setText(getStatus());
            	status2.repaint();
            	status2.revalidate();
            	
                }
        });
        
        denied2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                denied2.setIcon(xanim);
            }
		@Override
		public void mouseReleased(MouseEvent e) {
            denied2.setIcon(xanim1);
		}
		});
        
        JButton approve3 = new JButton("");
        approve3.setBounds(935, 572, 25, 24);
    	approve3.setOpaque(false);
		approve3.setContentAreaFilled(false);
		approve3.setBorderPainted(false);
		approve3.setFocusable(false);
        approve3.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\chk.png"));
        adminPane.add(approve3);
        approve3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	int daystoadd = getdate();
            	date = Calendar.getInstance();
    			
    			date.add(Calendar.DAY_OF_MONTH, daystoadd);
    			
            		String month = date.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()); // long is a get display name, and locale gets the local time and default is the pc time
        	        int dayOfMonth = date.get(Calendar.DAY_OF_MONTH);
        	        int year = date.get(Calendar.YEAR);
        	        
        	        System.out.println("updated Date: " + date.getTime());

        	        bookselecteda3.setFont(new Font("Century Gothic", Font.BOLD, 11));
        			bookselecteda3.setText(" To Be Returned On: " + month + " " + dayOfMonth  + ", " + year + " | " + selectedBook3);
        		
        		Accepted = "Please Return On |  " + month + " " + date.get(Calendar.DAY_OF_MONTH)  + ", " + date.get(Calendar.YEAR);
            	
        		if (borrow3 != -1) {
    				recbook[borrow3].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\bL.png"));
    				borrow3 = -1;
    			}
        		
            	if (combor3 != -1) {
    				genre_Comedy[combor3].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\b	L.png"));
    				combor3 = -1;
    			}
    			
    			if (hisbor3 != -1) {
    				genre_History[hisbor3].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\bL.png"));
    				hisbor3 = -1;
    			}
    			
    			if (edubor3 != -1) {
    				genre_Edu[edubor3].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\bL.png"));
    				edubor3= -1;
    			}
    			
    			if (ficbor3 != -1) {
    				genre_Fiction[ficbor3].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\bL.png"));
    				ficbor3 = -1;
    			}
    			
    			if (nficbor3 != -1) {
    				genre_Nfic[nficbor3].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\bL.png"));
    				nficbor3 = -1;
    			}
    			
    			
    			if (bor3 != -1) {
    				book[bor3].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\bL.png"));
    				bor3 = -1;
    			}
    			Status3 = Accepted;
            	status3.setText(getStatus());
            	status3.repaint();
            	status.revalidate();
            	
    			userPane.repaint();
            	userPane.revalidate();
    			
                }
           });
        
        approve3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                approve3.setIcon(anim);
            }
		@Override
		public void mouseReleased(MouseEvent e) {
            approve3.setIcon(anim1);
		}
		});
        
        JButton denied3 = new JButton("");
        denied3.setBounds(903, 572, 25, 25);
    	denied3.setOpaque(false);
		denied3.setContentAreaFilled(false);
		denied3.setBorderPainted(false);
		denied3.setFocusable(false);
        denied3.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\xmk.png"));
        adminPane.add(denied3);
        denied3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	

            	if (boden3 != -1) {
    				book[boden3].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\sb.png"));
    				boden3 = -1;
    			}
            	
            	if (comden3 != -1) {
    				genre_Comedy[comden3].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\comS3.png"));
    				comden3 = -1;
    			}
    			
    			if (hisden3 != -1) {
    				genre_History[hisden3].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\hisS4.png"));
    				hisden3 = -1;
    			}
    			
    			if (eduden3 != -1) {
    				genre_Edu[eduden3].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\eduS5.png"));
    				eduden3= -1;
    			}
    			
    			if (ficden3 != -1) {
    				ficden3 = -1;
    				genre_Fiction[ficden3].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\ficS3.png"));
    			
    			}
    			
    			if (nficden3 != -1) {
    				genre_Nfic[nficden3].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\nficS4.png"));
    				nficden3 = -1;
    			}
    			
    			
    			if (den3 != -1) {
    				recbook[den3].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\sb.png"));
    				den3 = -1;
    			}
            	
            	bookselecteda3.setText(" ");
            	selectedNum--;
            	Status3 = Denied;
            	status3.setText(getStatus());
            	status3.repaint();
            	status3.revalidate();
            	
                }
        });
        
        denied3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                denied3.setIcon(xanim);
            }
		@Override
		public void mouseReleased(MouseEvent e) {
            denied3.setIcon(xanim1);
		}
		});
        
        JButton lend = new JButton("");
        lend.setOpaque(false);
		lend.setContentAreaFilled(false);
		lend.setBorderPainted(false);
		lend.setFocusable(false);
        lend.setBounds(42, 707, 104, 44);
        lend.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\bckt.png"));
        adminPane.add(lend);
       lend.addActionListener(new ActionListener() {

 			public void actionPerformed(ActionEvent e) {
 				main.backToUser();
 			}
        	
        });
        
        mainFrame.revalidate();
        mainFrame.repaint();
        adminPane.revalidate();
        adminPane.repaint();
        
        JLabel bg2 = new JLabel("");
        bg2.setForeground(new Color(255, 255, 255));
        bg2.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\adm5.png"));
        bg2.setBounds(38, 0, 1121, 968);
        adminPane.add(bg2);
        
      /*  JLabel bg = new JLabel("");
        bg.setForeground(new Color(255, 255, 255));
        bg.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\adm3.png"));
        bg.setBounds(262, -21, 804, 882);
        adminPane.add(bg); */
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
        bookselected.setBounds(180, 158, 700, 55);
        lendingPane.add(bookselected);
        
        bookselected2 = new JLabel(selectedBook2);
        bookselected2.setText(selectedBook2);
        bookselected2.setFont(new Font("Century Gothic", Font.BOLD, 24));
        bookselected2.setBounds(180, 242, 700, 55);
        lendingPane.add(bookselected2);
        
        bookselected3 = new JLabel(selectedBook3);
        bookselected3.setText(selectedBook3);
        bookselected3.setFont(new Font("Century Gothic", Font.BOLD, 24));
        bookselected3.setBounds(180, 330, 700, 55);
        lendingPane.add(bookselected3);
      
        JButton hbtn = new JButton("");
        hbtn.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\hbtn.png"));
        hbtn.setOpaque(false);
        hbtn.setContentAreaFilled(false);
        hbtn.setBorderPainted(false);
        hbtn.setFocusable(false);
        hbtn.setBounds(25, 186, 55, 55);
        lendingPane.add(hbtn);
        
        hbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	main.lendbackToUser();}});
        
        JButton lending = new JButton("");
        lending.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\lnbtn.png"));
        lending.setOpaque(false);
        lending.setContentAreaFilled(false);
        lending.setBorderPainted(false);	
        lending.setFocusable(false);
        lending.setBounds(25, 276, 55, 55);
        lendingPane.add(lending);
        ImageIcon sety = new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\lnbtn.png"); // animation
		ImageIcon setyy = new ImageIcon ("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\bhover.png");  // animation
        
        lending.addMouseListener(new MouseAdapter() {
            @Override
           public void mouseEntered(MouseEvent e) {
            	lending.setBounds(14, 258, 78, 78);
            	lending.setIcon(setyy);
            }
		@Override
		public void mouseExited(MouseEvent e) {
			lending.setBounds(25, 276, 55, 55);
			lending.setIcon(sety);
		}
		});
        
        
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
  	 
  	 JButton cancel= new JButton();
  	 cancel.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\cancel.png"));
     cancel.setOpaque(false);
     cancel.setBorderPainted(false);
     cancel.setFocusable(false);
     cancel.setContentAreaFilled(false);
     cancel.setBounds(185, 222	, 25, 25);
     lendingPane.add(cancel);
     cancel.addActionListener(new ActionListener () {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (getbookcan() != -1 ) {
				book[getbookcan()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\cancelled.png"));
			}
			
			if (geteducan() != -1) {
				genre_Edu[geteducan()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\cancelled.png"));
			}
			
			if (gethiscan() != -1) {
				genre_History[gethiscan()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\cancelled.png"));
			}
			
			if (getcomcan() != -1) {
				genre_Comedy[getcomcan()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\cancelled.png"));
			}
			
			if (getfcan() != -1) {
				genre_Fiction[getfcan()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\cancelled.png"));
			}
			
			if (getnfcan() != -1) {
				genre_Nfic[getnfcan()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\cancelled.png"));
			}

			if (getreccan() != -1) {
				recbook[getreccan()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\cancelled.png"));
				reccan = -1;
			}
			
			selectedBook = " ";
			selectedNum = 0;
			canc = true;
			Status=" ";
			status.setText("BOOK CANCELLED");
			status.setForeground(Color.RED);
			bookselected.setText(getSelectedBook());
			lendingPane.repaint();
			lendingPane.revalidate();
			
		}
    	 
     });
     
     JButton cancel1= new JButton();
     cancel1.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\cancel.png"));
     cancel1.setOpaque(false);
     cancel1.setBorderPainted(false);
     cancel1.setFocusable(false);
     cancel1.setContentAreaFilled(false);
     cancel1.setBounds(185, 310, 25, 25);
     lendingPane.add(cancel1);
     cancel1.addActionListener(new ActionListener () {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (getbookcan2() != -1) {
				book[getbookcan2()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\cancelled.png"));
				bookcan2 = -1;
			}
			
			if (geteducan2() != -1) {
				genre_Edu[geteducan2()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\cancelled.png"));
				educan2 = -1;
			}
			
			if (gethiscan2() != -1) {
				genre_History[gethiscan2()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\cancelled.png"));
				hiscan2 = -1;
			}
			
			if (getcomcan2() != -1) {
				genre_Comedy[getcomcan2()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\cancelled.png"));
				comcan2 = -1;
			}
			
			if (getfcan2() != -1) {
				genre_Fiction[getfcan2()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\cancelled.png"));
				fcan2 = -1;
			}
			
			if (getnfcan2() != -1) {
				genre_Nfic[getnfcan2()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\cancelled.png"));
				nfcan2 = -1;
			}
			
			if (getreccan2() != -1) {
				recbook[getreccan2()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\cancelled.png"));
				reccan2 = -1;
			}
			
			selectedBook2 = null;
			
			selectedNum = 1;
			canc = true;  // GAME CHANGER FOR THE BORROW THINGY
			
			Status2=" ";
			System.out.println(selectedNum);
			status2.setForeground(Color.RED);
			bookselected2.setText(getSelectedBook2());
			status2.setText("BOOK CANCELLED");
			lendingPane.repaint();
			lendingPane.revalidate();
			
		}
    	 
     });
     
     JButton cancel2= new JButton();
     cancel2.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\cancel.png"));
     cancel2.setOpaque(false);
     cancel2.setBorderPainted(false);
     cancel2.setFocusable(false);
     cancel2.setContentAreaFilled(false);
     cancel2.setBounds(185, 398, 25, 25);
     lendingPane.add(cancel2);
     cancel2.addActionListener(new ActionListener () {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (getbookcan3() != -1) {
				book[getbookcan3()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\cancelled.png"));
				bookcan3 = -1;
			}
			
			if (geteducan3() != -1) {
				genre_Edu[geteducan3()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\cancelled.png"));
				educan3 = -1;
			}
			
			if (gethiscan3() != -1) {
				genre_History[gethiscan3()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\cancelled.png"));
				hiscan3 = -1;
			}
			
			if (getcomcan3() != -1) {
				genre_Comedy[getcomcan3()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\cancelled.png"));
				comcan3 = -1;
			}
			
			if (getfcan3() != -1) {
				genre_Fiction[getfcan3()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\cancelled.png"));
				fcan3 = -1;
			}
			
			if (getnfcan3() != -1) {
				genre_Nfic[getnfcan3()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\cancelled.png"));
				nfcan3 = -1;
			}
			
			if (getreccan3() != -1) {
				recbook[getreccan3()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\cancelled.png"));
				reccan3 = -1;
			}
		    
			selectedBook3 = null;
			selectedNum = 2;
			Status3=" ";
			status3.setForeground(Color.RED);
			status3.setText("BOOK CANCELLED");
			bookselected3.setText(getSelectedBook3());
			lendingPane.repaint();
			lendingPane.revalidate();
			
		}
    	 
     });
     
     JButton ret = new JButton();
     ret.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\returned.png"));
     ret.setOpaque(false);
     ret.setBorderPainted(false);
     ret.setFocusable(false);
     ret.setContentAreaFilled(false);
     ret.setBounds(218, 222, 25, 25);
     lendingPane.add(ret);
     ret.addActionListener(new ActionListener () {
		public void actionPerformed(ActionEvent e) {
			
			
			if (getbookret() != -1) {
				book[getbookret()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\retL.png"));
				bookret = -1;
			}
			
			if (geteduret() != -1) {
				genre_Edu[geteduret()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\retL.png"));
				eduret = -1;
			}
			
			if (gethisret() != -1) {
				genre_History[gethisret()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\retL.png"));
				hisret = -1;
			}
			
			if (getcomret() != -1) {
				genre_Comedy[getcomret()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\retL.png"));
				comret = -1;
			}
			
			if (getfret() != -1) {
				genre_Fiction[getfret()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\retL.png"));
				fret = -1;
			}
			
			if (getnfret() != -1) {
				genre_Nfic[getnfret()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\retL.png"));
				nfcan = -1;
			}
			
			if (getrecret() != -1) {
				recbook[getrecret()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\retL.png"));
				recret = -1;
			}
			
			selectedBook = " ";
			selectedNum--;
			status.setForeground(new Color(103, 172, 96));
			Status=" ";
			bookselected.setText(getSelectedBook());
			status.setText("BOOK RETURNED");
			lendingPane.repaint();
			lendingPane.revalidate();
			
		}
    	 
     });
     
     JButton ret2 = new JButton();
     ret2.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\returned.png"));
     ret2.setOpaque(false);
     ret2.setBorderPainted(false);
     ret2.setFocusable(false);
     ret2.setContentAreaFilled(false);
     ret2.setBounds(218, 310, 25, 25);
     lendingPane.add(ret2);
     ret2.addActionListener(new ActionListener () {
		public void actionPerformed(ActionEvent e) {
			

			if (getbookret2() != -1) {
				book[getbookret2()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\retL.png"));
				bookret2 = -1;
			}
			
			if (geteduret2() != -1) {
				genre_Edu[geteduret2()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\retL.png"));
				eduret2 = -1;
			}
			
			if (gethisret2() != -1) {
				genre_History[gethisret2()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\retL.png"));
				hisret2 = -1;
			}
			
			if (getcomret2() != -1) {
				genre_Comedy[getcomret2()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\retL.png"));
				comret2 = -1;
			}
			
			if (getfret2() != -1) {
				genre_Fiction[getfret2()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\retL.png"));
				fret2 = -1;
			}
			
			if (getnfret2() != -1) {
				genre_Nfic[getnfret2()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\retL.png"));
				nfcan2 = -1;
			}
			
			if (getrecret2() != -1) {
				recbook[getrecret2()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\retL.png"));
				recret2 = -1;
			}
			
			selectedBook2 = " ";
			selectedNum--;
			Status2=" ";
			status2.setForeground(new Color(103, 172, 96));
			bookselected2.setText(getSelectedBook2());
			status2.setText("BOOK RETURNED");
			lendingPane.repaint();
			lendingPane.revalidate();
			
		}
    	 
     });
     
     JButton ret3 = new JButton();
     ret3.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\returned.png"));
     ret3.setOpaque(false);
     ret3.setBorderPainted(false);
     ret3.setFocusable(false);
     ret3.setContentAreaFilled(false);
     ret3.setBounds(218, 398, 25, 25);
     lendingPane.add(ret3);
     ret3.addActionListener(new ActionListener () {
		public void actionPerformed(ActionEvent e) {
			

			if (getbookret3() != -1) {
				book[getbookret3()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\retL.png"));
				bookret3 = -1;
			}
			
			if (geteduret3() != -1) {
				genre_Edu[geteduret3()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\retL.png"));
				eduret3 = -1;
			}
			
			if (gethisret3() != -1) {
				genre_History[gethisret3()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\retL.png"));
				hisret3 = -1;
			}
			
			if (getcomret3() != -1) {
				genre_Comedy[getcomret3()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\retL.png"));
				comret3 = -1;
			}
			
			if (getfret3() != -1) {
				genre_Fiction[getfret3()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\retL.png"));
				fret3 = -1;
			}
			
			if (getnfret3() != -1) {
				genre_Nfic[getnfret3()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\retL.png"));
				nfret3 = -1;
			}
			
			if (getrecret3() != -1) {
				recbook[getrecret3()].setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\retL.png"));
				recret3 = -1;
			}
			
			selectedBook3 = " ";
			selectedNum--;
			Status3=" ";
			status3.setForeground(new Color(103, 172, 96));
			bookselected3.setText(getSelectedBook2());
			status3.setText("BOOK RETURNED");
			lendingPane.repaint();
			lendingPane.revalidate();
			
		}
    	 
     });
  	  
  	  
	  status.setFont(new Font("Century Gothic", Font.BOLD, 14));
	  status.setBounds(182 , 197, 442, 27);
	  lendingPane.add(status);
	  status.setVisible(true);
	  
	  status2.setFont(new Font("Century Gothic", Font.BOLD, 14));
	  status2.setBounds(182, 282, 442, 27);
	  lendingPane.add(status2);
	  status2.setVisible(true);
	  
	  status3.setFont(new Font("Century Gothic", Font.BOLD, 14));
	  status3.setBounds(182, 367, 442, 27);
	  lendingPane.add(status3);
	  status3.setVisible(true);
        
       
        
        
        ImageIcon seth = new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\hbtn.png"); // animation
		ImageIcon sethh = new ImageIcon ("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\hhover.png");  // animation
        
        hbtn.addMouseListener(new MouseAdapter() {
        	
            @Override
           public void mouseEntered(MouseEvent e) {
            	hbtn.setBounds(14, 170, 78, 78);
            	hbtn.setIcon(sethh);
            }
		@Override
		public void mouseExited(MouseEvent e) {
			hbtn.setBounds(25, 186, 55, 55);
			hbtn.setIcon(seth);
		}
		});
        
       
        JLabel lendingg = new JLabel("");
        lendingg.setForeground(new Color(255, 255, 255));
        lendingg.setIcon(new ImageIcon("C:\\Users\\tanner\\eclipse-workspace\\BookLendingManagementSystem\\Images\\lending.png"));
        lendingg.setBounds(25, -40, 1311, 896);
        lendingPane.add(lendingg);
        
        
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
	
	public JLabel[] getBookV() {
		return book;
	}
	
	public JButton[] getBBtn() {
		return borrowbtn;
	}
	
	public int getdate() {
        return cdgconvert;
    }
	
	public int getSnum() {
		return selectedNum;
	}
	
	public JLabel[] getGenre_edu() {
		return genre_Edu;
	}
	
    public String getUsrinp() {
        return user;
    }
    
    public String[] getBookstat() {
    	return bookStatuses;
    }
    
    public JButton[] getHistory_btn() {
    	return History_btn;
    }
    
    public int getbookcan() {
    	return bookcan;
    }
    public int getbookcan2() {
    	return bookcan2;
    }
    public int getbookcan3() {
    	return bookcan3;
    }
    
    public int getcomcan() {
    	return comcan;
    }
    public int getcomcan2() {
    	return comcan2;
    }
    public int getcomcan3() {
    	return comcan3;
    }
    
    public int getfcan() {
    	return fcan;
    }
    public int getfcan2() {
    	return fcan2;
    }
    public int getfcan3() {
    	return fcan3;
    }
    
    public int getnfcan() {
    	return nfcan;
    }
    public int getnfcan2() {
    	return nfcan2;
    }
    public int getnfcan3() {
    	return nfcan3;
    }
    
    public int gethiscan() {
    	return hiscan;
    }
    
    public int getbor() {
    	return borrow;
    }
    
    public int getbor2() {
    	return borrow2;
    }
    
    public int getbor3() {
    	return borrow3;
    }
    
    public int gethiscan2() {
    	return hiscan2;
    }
    public int gethiscan3() {
    	return hiscan3;
    }
    
    public int geteducan() {
    	return educan;
    }
    public int geteducan2() {
    	return educan2;
    }
    public int geteducan3() {
    	return educan3;
    }
    
    public int getreccan() {
    	return reccan;
    }
    
    public int getreccan2() {
    	return reccan2;
    }
    
    public int getreccan3() {
    	return reccan3;
    }
    
    public int getrecret() {
    	return recret;
    } 
    public int getrecret2() {
    	return recret2;
    } 
    public int getrecret3() {
    	return recret3;
    }
    
    public int getbookret() {
    	return bookret;
    }
    public int getbookret2() {
    	return bookret2;
    }
    public int getbookret3() {
    	return bookret3;
    }
    
    public int getcomret() {
    	return comret;
    }
    public int getcomret2() {
    	return comret2;
    }
    public int getcomret3() {
    	return comret3;
    }
    
    public int getfret() {
    	return fret;
    }
    public int getfret2() {
    	return fret2;
    }
    public int getfret3() {
    	return fret3;
    }
    
    public int getnfret() {
    	return nfret;
    }
    public int getnfret2() {
    	return nfret2;
    }
    public int getnfret3() {
    	return nfret3;
    }
    
    public int gethisret() {
    	return hisret;
    }
    public int gethisret2() {
    	return hisret2;
    }
    public int gethisret3() {
    	return hisret3;
    }
    
    public int geteduret() {
    	return eduret;
    }
    public int geteduret2() {
    	return eduret2;
    }
    public int geteduret3() {
    	return eduret3;
    }
    
    private void hideHistory() {
    	if ( HisL ) {
        for (int z = 0; z < data.genre_History.length; z++) {
            if (z < History_btn.length && z < genre_History.length) {
            	History_btn[z].setVisible(false);
            	genre_History[z].setVisible(false);
            	}
        	}
    		}
        }
    
    private void hideEduc() {
    	if ( eduL ) {
        for (int z = 0; z < data.genre_Educational.length; z++) {
            if (z < Edu_btn.length && z < genre_Edu.length) {
            	Edu_btn[z].setVisible(false);
            	genre_Edu[z].setVisible(false);
            	}
        	}
    	}	
        }
    private void hideComedy() {
    	if ( ComL  ) {
        for (int z = 0; z < data.genre_Comedy.length; z++) {
            if (z < Comedy_btn.length && z < genre_Comedy.length) {
            	Comedy_btn[z].setVisible(false);
            	genre_Comedy[z].setVisible(false);
            		}
        		}
    		}
        }
    
    private void hideFiction() {
    	if ( FicL  ) {
        for (int z = 0; z < data.genre_Fiction.length; z++) {
            if (z < Fiction_btn.length && z < genre_Fiction.length) {
            	Fiction_btn[z].setVisible(false);
            	genre_Fiction[z].setVisible(false);
            		}
        		}
    		}
        }
    
    
    private void hideNonFiction() {
    	if ( NficL  ) {
        for (int z = 0; z < data.genre_NonFiction.length; z++) {
            if (z < Nfic_btn.length && z < genre_Nfic.length) {
            	Nfic_btn[z].setVisible(false);
            	genre_Nfic[z].setVisible(false);
            		}
        		}
    		}
        }
    
    private void hideAll() {
    	if ( all ) {
        for (int z = 0; z < data.bookname.length; z++) {
            if (z < book.length && z < borrowbtn.length) {
            	book[z].setVisible(false);
            	borrowbtn[z].setVisible(false);
            		}
        		}
    		}
        }
    

    
    public JLabel[] getgenre_History() {
    	return genre_History;
    }
    
    public JPanel getBookpanel() {
    	return bookpanel;
    }

    public String getPassinp() {
        return password;
    }
	
}
