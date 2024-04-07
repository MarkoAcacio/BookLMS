package main;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

public class Gui {
	
	private logic control;
	private Bookandusers data;
	public static JPanel contentPane;
	private String user;
	private String password;
	private JTextField userinp;
	private JPasswordField passinp;
	
	
	
	public void login() {
		
		control = new logic(); // instance of logic class
		data = new Bookandusers(); // instance of Book class
		
		this.contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(237, 237, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		JFrame frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("BookLend");
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setBounds(100, 100, 1200, 800);
		frame.setContentPane(contentPane);
		
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

	    JButton enterbtn = new JButton();
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
		frame.setVisible(true);		
		
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
		
		
	}

	public void userpage() {
		
	}
	
    public String getUsrinp() {
        return user;
    }

    public String getPassinp() {
        return password;
    }
	
}
