import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Final implements ActionListener{
	JFrame f = new JFrame();
	JPanel panel = new JPanel();
	JLayeredPane pane = new JLayeredPane();
	JPanel panel1 = new MyPanel1();
	JPanel panel2 = new MyPanel2();
	JPanel panel3 = new MyPanel3();
	
	
	JButton button0_1;
	JButton buttun0_2;
	JButton button0_3;
	ImageIcon empty_pizza1;
	ImageIcon empty_pizza2;
	ImageIcon empty_pizza3;
	ImageIcon full_pizza;
	
	JPanel panel1_1 = new RoundedPanel(150);
	JPanel panel1_2 = new RoundedPanel(20);
	JPanel panel2_1 = new RoundedPanel(150);
	JPanel panel2_2 = new RoundedPanel(20);
	JPanel panel3_1 = new RoundedPanel(150);
	JPanel panel3_2 = new RoundedPanel(20);
	
	
	
	
	JLabel label1_2_1;
	JTextField textField1_2_1;
	JPasswordField textField1_2_2;
	JCheckBox checkbox1_2_1;
	JButton button1_2_1;
	
	JLabel label2_2_1;
	JTextField textField2_2_1;
	JPasswordField textField2_2_2;
	JCheckBox checkbox2_2_1;
	JButton button2_2_1;
	
	JLabel label3_2_1;
	JTextField textField3_2_1;
	JPasswordField textField3_2_2;
	JCheckBox checkbox3_2_1;
	JButton button3_2_1;
	JButton button3_2_2;
	
	JLabel lbg = new JLabel();
	ImageIcon bg;
	
	JLabel lbg1 = new JLabel();
	ImageIcon bg1;
	
	JLabel lbg2 = new JLabel();
	ImageIcon bg2;
	
	JLabel lbg3 = new JLabel();
	ImageIcon bg3;
	

	
	Final() {
	pane.setBounds(400, 300, 1300, 600);

	panel.setBounds(0, 0, 1900, 1000);
	panel.setLayout(null);
	panel.setVisible(true);
	panel.setBackground(Color.cyan);

	controlPanel();
	
	panel1_1.setLayout(null);
	panel1_2.setLayout(null);
	panel2_1.setLayout(null);
	panel2_2.setLayout(null);
	panel3_1.setLayout(null);
	panel3_2.setLayout(null);
	
	panel1_1.setOpaque(false);
	panel1_2.setOpaque(false);
	panel2_1.setOpaque(false);
	panel2_2.setOpaque(false);
	panel3_1.setOpaque(false);
	panel3_2.setOpaque(false);	
	
	panel1_1.setBounds(100, 150, 300, 300);
	panel1_2.setBounds(600, 50, 600, 500);
	panel2_1.setBounds(100, 150, 300, 300);
	panel2_2.setBounds(600, 50, 600, 500);
	panel3_1.setBounds(100, 150, 300, 300);
	panel3_2.setBounds(600, 50, 600, 500);
	
	panel1_1.setBackground(Color.black);
	panel1_2.setBackground(Color.black);
	panel2_1.setBackground(Color.black);
	panel2_2.setBackground(Color.black);
	panel3_1.setBackground(Color.black);
	panel3_2.setBackground(Color.black);
	
	panel1_1.setVisible(true);
	panel1_2.setVisible(true);
	panel2_1.setVisible(true);
	panel2_2.setVisible(true);
	panel3_1.setVisible(true);
	panel3_2.setVisible(true);
	
	setPanel1();
	setPanel2();
	setPanel3();
	
	button1_2_1.addActionListener(this);
	checkbox1_2_1.addActionListener(this);
	
	panel1.add(panel1_1);
	panel1.add(panel1_2);
	panel2.add(panel2_1);
	panel2.add(panel2_2);
	panel3.add(panel3_1);
	panel3.add(panel3_2);
	
	pane.add(panel1);
	pane.add(panel2);
	pane.add(panel3);
	panel.add(pane);
	
	bg = new ImageIcon("bg.jpg");
	lbg.setIcon(bg);
	lbg.setBounds(0, 0, 1900, 1000);
	panel.add(lbg);
	
	setFontHere();
	
	f.add(panel);
	
    f.setSize(1900, 1000);
	f.setLocationRelativeTo(null);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setLayout(null);
	f.setVisible(true);
  }
  
  private void setFontHere(){
	  label1_2_1.setFont(new Font("Arial", Font.BOLD, 17));
	  textField1_2_1.setFont(new Font("Arial", Font.BOLD, 17));
	  textField1_2_2.setFont(new Font("Arial", Font.BOLD, 17));
	  checkbox1_2_1.setFont(new Font("Arial", Font.BOLD, 15));
	  button1_2_1.setFont(new Font("Arial", Font.BOLD, 17));
	  button0_1.setFont(new Font("Arial", Font.BOLD, 17));
	  
	  label2_2_1.setFont(new Font("Arial", Font.BOLD, 17));
	  textField2_2_1.setFont(new Font("Arial", Font.BOLD, 17));
	  textField2_2_2.setFont(new Font("Arial", Font.BOLD, 17));
	  checkbox2_2_1.setFont(new Font("Arial", Font.BOLD, 15));
	  button2_2_1.setFont(new Font("Arial", Font.BOLD, 17));
	  buttun0_2.setFont(new Font("Arial", Font.BOLD, 17));
	  
	  label3_2_1.setFont(new Font("Arial", Font.BOLD, 17));
	  textField3_2_1.setFont(new Font("Arial", Font.BOLD, 17));
	  textField3_2_2.setFont(new Font("Arial", Font.BOLD, 17));
	  checkbox3_2_1.setFont(new Font("Arial", Font.BOLD, 15));
	  button3_2_1.setFont(new Font("Arial", Font.BOLD, 17));
	  button3_2_2.setFont(new Font("Arial", Font.BOLD, 17));
	  button0_3.setFont(new Font("Arial", Font.BOLD, 17));
	  
  }
  
	private void setPanel1(){
		setPanel1_1();
		setValuePanel1_2();
		setPanel1_2();
	}
	
	private void setPanel1_1(){
		bg1 = new ImageIcon("bg1.jpeg");
		lbg1.setIcon(bg1);
		lbg1.setBounds(10, 10, 280, 280);
		panel1_1.add(lbg1);
	}
	
	private void setValuePanel1_2(){
		button1_2_1 = new JButton("Log In");
		textField1_2_1 = new JTextField("Enter Your Id");
		textField1_2_2 = new JPasswordField("Enter Password");
		label1_2_1 = new JLabel("Administrator Login");
		checkbox1_2_1 = new JCheckBox("show password", true);
	}
	
	private void setPanel1_2(){
		setBoundsInPanel1_2();
		setbgInPanel1_2();
		setTextPanel1_2();
		addInPanel1_2();
	}
	
	private void setBoundsInPanel1_2(){
		button1_2_1.setBounds(230, 350, 150, 70);
		textField1_2_1.setBounds(113, 120, 375, 60);
		
		textField1_2_2.setBounds(113, 220, 375, 60);
		label1_2_1.setBounds(113, 30, 375,60);
		label1_2_1.setHorizontalAlignment(JLabel.CENTER);
		
		checkbox1_2_1.setBounds(250, 290, 200, 40);
	}
	
	private void setbgInPanel1_2(){
		button1_2_1.setBackground(Color.cyan);
		
		textField1_2_1.setForeground(Color.white);
		textField1_2_1.setCaretColor(Color.white);
		textField1_2_2.setForeground(Color.white);
		textField1_2_2.setCaretColor(Color.white);
		
		label1_2_1.setForeground(Color.white);
		button1_2_1.setForeground(Color.black);
		
		checkbox1_2_1.setForeground(Color.white);
		checkbox1_2_1.setBackground(Color.black);
	}
	
	private void setTextPanel1_2(){
		textField1_2_1.setHorizontalAlignment(JTextField.CENTER);
		textField1_2_2.setHorizontalAlignment(JPasswordField.CENTER);
		textField1_2_2.setEchoChar((char) 0);
	}
	
	private void addInPanel1_2(){
		button1_2_1.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.black));		
		
		textField1_2_1.setOpaque(false);
		textField1_2_2.setOpaque(false);
		
		panel1_2.add(button1_2_1);
		panel1_2.add(textField1_2_1);
		panel1_2.add(textField1_2_2);
		panel1_2.add(label1_2_1);
		panel1_2.add(checkbox1_2_1);
		
		
		button1_2_1.setFocusable(false);
		checkbox1_2_1.setFocusable(false);
		
		
	}
	
	
	
	private void setPanel2(){
		
		setPanel2_1();
		setValuePanel2_2();
		setPanel2_2();
	}
	
	private void setPanel2_1(){
		bg2 = new ImageIcon("bg2.jpeg");
		lbg2.setIcon(bg2);
		lbg2.setBounds(10, 10, 280, 280);
		panel2_1.add(lbg2);
	}
  
	private void setValuePanel2_2(){
		button2_2_1 = new JButton("Log In");
		textField2_2_1 = new JTextField("Enter Your Id");
		textField2_2_2 = new JPasswordField("Enter Password");
		label2_2_1 = new JLabel("Staff Login");
		checkbox2_2_1 = new JCheckBox("show password", true);
	}
	
	private void setPanel2_2(){
		setBoundsInPanel2_2();
		setbgInPanel2_2();
		setTextPanel2_2();
		addInPanel2_2();
		button2_2_1.addActionListener(this);
	}
	
	private void setBoundsInPanel2_2(){
		button2_2_1.setBounds(230, 350, 150, 70);
		textField2_2_1.setBounds(113, 120, 375, 60);
		
		textField2_2_2.setBounds(113, 220, 375, 60);
		label2_2_1.setBounds(113, 30, 375,60);
		label2_2_1.setHorizontalAlignment(JLabel.CENTER);
		
		checkbox2_2_1.setBounds(250, 290, 200, 40);
	}
	
	private void setbgInPanel2_2(){
		button2_2_1.setBackground(Color.cyan);
		
		textField2_2_1.setForeground(Color.white);
		textField2_2_1.setCaretColor(Color.white);
		textField2_2_2.setForeground(Color.white);
		textField2_2_2.setCaretColor(Color.white);
		
		label2_2_1.setForeground(Color.white);
		button2_2_1.setForeground(Color.black);
		
		checkbox2_2_1.setForeground(Color.white);
		checkbox2_2_1.setBackground(Color.black);
	}
	
	private void setTextPanel2_2(){
		textField2_2_1.setHorizontalAlignment(JTextField.CENTER);
		textField2_2_2.setHorizontalAlignment(JPasswordField.CENTER);
		textField2_2_2.setEchoChar((char) 0);
	}
	
	private void addInPanel2_2(){
		button2_2_1.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.black));		
		
		textField2_2_1.setOpaque(false);
		textField2_2_2.setOpaque(false);
		
		panel2_2.add(button2_2_1);
		panel2_2.add(textField2_2_1);
		panel2_2.add(textField2_2_2);
		panel2_2.add(label2_2_1);
		panel2_2.add(checkbox2_2_1);
		
		
		button2_2_1.setFocusable(false);
		checkbox2_2_1.setFocusable(false);
		checkbox2_2_1.addActionListener(this);
		
		
	}
	
	private void setPanel3(){
		
		setPanel3_1();
		setValuePanel3_2();
		setPanel3_2();
	}
	
	private void setPanel3_1(){
		bg3 = new ImageIcon("bg3.jpeg");
		lbg3.setIcon(bg3);
		lbg3.setBounds(10, 10, 280, 280);
		panel3_1.add(lbg3);
	}
  
	private void setValuePanel3_2(){
		button3_2_1 = new JButton("Log In");
		button3_2_2 = new JButton("Sign Up");
		textField3_2_1 = new JTextField("Enter Your Id");
		textField3_2_2 = new JPasswordField("Enter Password");
		label3_2_1 = new JLabel("Customer Login");
		checkbox3_2_1 = new JCheckBox("show password", true);
	}
	
	private void setPanel3_2(){
		setBoundsInPanel3_2();
		setbgInPanel3_2();
		setTextPanel3_2();
		addInPanel3_2();
		addActionListenerInPanel3_2();
	}
	
	private void addActionListenerInPanel3_2(){
		button3_2_1.addActionListener(this);
		button3_2_2.addActionListener(this);
		checkbox3_2_1.addActionListener(this);
	}
	
	private void setBoundsInPanel3_2(){
		button3_2_1.setBounds(150, 350, 150, 70);
		button3_2_2.setBounds(320, 350, 150, 70);
		textField3_2_1.setBounds(113, 120, 375, 60);
		
		textField3_2_2.setBounds(113, 220, 375, 60);
		label3_2_1.setBounds(113, 30, 375,60);
		label3_2_1.setHorizontalAlignment(JLabel.CENTER);
		
		checkbox3_2_1.setBounds(250, 290, 200, 40);
	}
	
	private void setbgInPanel3_2(){
		button3_2_1.setBackground(Color.cyan);
		button3_2_2.setBackground(Color.red);
		button3_2_2.setForeground(Color.white);
		
		textField3_2_1.setForeground(Color.white);
		textField3_2_1.setCaretColor(Color.white);
		textField3_2_2.setForeground(Color.white);
		textField3_2_2.setCaretColor(Color.white);
		
		label3_2_1.setForeground(Color.white);
		button3_2_1.setForeground(Color.black);
		
		checkbox3_2_1.setForeground(Color.white);
		checkbox3_2_1.setBackground(Color.black);
	}
	
	private void setTextPanel3_2(){
		textField3_2_1.setHorizontalAlignment(JTextField.CENTER);
		textField3_2_2.setHorizontalAlignment(JPasswordField.CENTER);
		textField3_2_2.setEchoChar((char) 0);
	}
	
	private void addInPanel3_2(){
		button3_2_1.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.black));	
		button3_2_2.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.black));	
		
		textField3_2_1.setOpaque(false);
		textField3_2_2.setOpaque(false);
		
		panel3_2.add(button3_2_1);
		panel3_2.add(button3_2_2);
		panel3_2.add(textField3_2_1);
		panel3_2.add(textField3_2_2);
		panel3_2.add(label3_2_1);
		panel3_2.add(checkbox3_2_1);
		
		button3_2_2.setFocusable(false);
		button3_2_1.setFocusable(false);
		checkbox3_2_1.setFocusable(false);
		
		
	}
	
	private void controlPanel(){
		empty_pizza1 = new ImageIcon("pizza1.png");
		empty_pizza2 = new ImageIcon("pizza2.png");
		empty_pizza3 = new ImageIcon("pizza3.png");
		full_pizza = new ImageIcon("pizza4.png");
		
		button0_1 = new JButton();
		buttun0_2 = new JButton();
		button0_3 = new JButton();
		
		button0_1.setIcon(empty_pizza1);
		buttun0_2.setIcon(empty_pizza2);
		button0_3.setIcon(full_pizza);

		button0_1.setOpaque(false);
		button0_1.setBorder(null);
		button0_1.setBorderPainted(false);
		button0_1.setContentAreaFilled(false);
		
		buttun0_2.setOpaque(false);
		buttun0_2.setBorder(null);
		buttun0_2.setBorderPainted(false);
		buttun0_2.setContentAreaFilled(false);
		
		button0_3.setOpaque(false);
		button0_3.setBorder(null);
		button0_3.setBorderPainted(false);
		button0_3.setContentAreaFilled(false);
		
		button0_1.setBounds(280, 340, 200, 189);
		buttun0_2.setBounds(280, 540, 200, 189);
		button0_3.setBounds(280, 720, 200, 189);
		
		button0_1.setFocusable(false);
		buttun0_2.setFocusable(false);
		button0_3.setFocusable(false);
		
		button0_1.addActionListener(this);
		buttun0_2.addActionListener(this);
		button0_3.addActionListener(this);
		
		panel.add(button0_1);
		panel.add(buttun0_2);
		panel.add(button0_3);
		
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == button0_1){
			button0_1.setIcon(full_pizza);
			buttun0_2.setIcon(empty_pizza2);
			button0_3.setIcon(empty_pizza3);
			panel3.setVisible(false);
			panel2.setVisible(false);
			
			panel1.setVisible(true);
		}
		
		else if(e.getSource() == buttun0_2){
			buttun0_2.setIcon(full_pizza);
			button0_1.setIcon(empty_pizza1);
			button0_3.setIcon(empty_pizza3);
			panel1.setVisible(false);
			panel3.setVisible(false);
			
			panel2.setVisible(true);
		}
		
		else if(e.getSource() == button0_3){
			button0_3.setIcon(full_pizza);
			button0_1.setIcon(empty_pizza1);
			buttun0_2.setIcon(empty_pizza2);
			panel1.setVisible(false);
			panel2.setVisible(false);
			panel3.setVisible(true);
		}
		else if(e.getSource() == button1_2_1){
			
			String user = textField1_2_1.getText();
			char[] ar = textField1_2_2.getPassword();
			String pass = String.valueOf(ar);
			boolean userMatch = false;
			Connection con = null;
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_sample", "root", "");
				Statement state = con.createStatement();
				ResultSet rs = state.executeQuery("select * from logintable_sample");
				
				while(rs.next()){
					if(user.equals(rs.getString(2))){
						userMatch = true;
						if(pass.equals(rs.getString(3))){
							new AdministratorFrame();
							f.dispose();
						}
						else{
							JOptionPane.showMessageDialog(panel3_2, "Invalid Password");
						}
						break;
					}
				}
				con.close();
				if(! userMatch){
					panel.setBackground(Color.blue);
					JOptionPane.showMessageDialog(panel3_2, "Invalid ID");
				}
			}
			catch(Exception ae){System.out.print(ae);}
					
		}
		
		else if(e.getSource() == checkbox1_2_1){
			if(checkbox1_2_1.isSelected())
				textField1_2_2.setEchoChar((char) 0);
			else
				textField1_2_2.setEchoChar('*');
		}
		
		if(e.getSource() == button3_2_2){
			new SignUp();
		}
		
		if(e.getSource() == checkbox2_2_1){
			if(checkbox2_2_1.isSelected())
				textField2_2_2.setEchoChar((char) 0);
			else
				textField2_2_2.setEchoChar('*');
		}
		
		if(e.getSource() == checkbox3_2_1){
			if(checkbox3_2_1.isSelected())
				textField3_2_2.setEchoChar((char) 0);
			else
				textField3_2_2.setEchoChar('*');
		}
		if(e.getSource() == button3_2_1){
			String user = textField3_2_1.getText();
			char[] ar = textField3_2_2.getPassword();
			String pass = String.valueOf(ar);
			boolean userMatch = false;
			Connection cone = null;
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "");
				Statement state = cone.createStatement();
				ResultSet rs = state.executeQuery("select * from signup");
				
				while(rs.next()){
					if(user.equals(rs.getString(1))){
						userMatch = true;
						if(pass.equals(rs.getString(2))){
							new FirstFrame(rs.getString(3)+rs.getString(1));
							f.dispose();
						}
						else
							JOptionPane.showMessageDialog(panel3_2, "Invalid Password");
						break;
					}
				}
				cone.close();
				if(! userMatch)
					JOptionPane.showMessageDialog(panel3_2, "Invalid ID");
			}
			catch(Exception ae2){System.out.println(ae2);}
		}
		
		if(e.getSource() == button2_2_1){
			String user = textField2_2_1.getText();
			char[] ar = textField2_2_2.getPassword();
			String pass = String.valueOf(ar);
			boolean userMatch = false;
			Connection cone = null;
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/staff", "root", "");
				Statement state = cone.createStatement();
				ResultSet rs = state.executeQuery("select * from stafftable");
				
				while(rs.next()){
					if(user.equals(rs.getString(1))){
						userMatch = true;
						if(pass.equals(rs.getString(9))){
							new BillingFrame();
							f.dispose();
						}
						else
							JOptionPane.showMessageDialog(panel2_2, "Invalid Password");
						break;
					}
				}
				cone.close();
				if(! userMatch)
					JOptionPane.showMessageDialog(panel2_2, "Invalid ID");
			}
			catch(Exception ae2){System.out.println(ae2);}
		}
	}
  
  public static void main(String[] args) {  
      new  Final(); 
  
  }  
} 

class MyPanel1 extends RoundedPanel{
	
	
	public MyPanel1(){
		super(40);
		this.setBounds(0,0,1300,600);
		this.setLayout(null);
		this.setOpaque(false);
		this.setBackground(Color.white);
		this.setVisible(false);
		
	}
}

class MyPanel2 extends RoundedPanel{
	
	
	public MyPanel2(){
		super(40);
		this.setBounds(0,0,1300,600);
		this.setLayout(null);
		this.setOpaque(false);
		this.setBackground(Color.white);
		this.setVisible(false);
	}
}

class MyPanel3 extends RoundedPanel{
	
	
	public MyPanel3(){
		super(40);
		this.setBounds(0,0,1300,600);
		this.setLayout(null);
		this.setOpaque(false);
		this.setBackground(Color.white);
		this.setVisible(true);
	}
}