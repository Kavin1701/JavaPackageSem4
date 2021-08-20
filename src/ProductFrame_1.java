import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class ProductFrame_1 implements ActionListener{
	JFrame f;

	String tname;

	JPanel panel = new JPanel();
	JLayeredPane pane = new JLayeredPane();
	JPanel panel1 = new MyPanel1p1();
	JPanel panel2 = new MyPanel2p1();
	JButton button0_1 = new JButton("Veg");
	JButton button0_2 = new JButton("Non-Veg");

	String addon[]={"New Hand Tossed","Wheat Thin Crust","Cheese Burst","Fresh Pan Pizza"};

	JPanel panel1_1 = new MyPanel1_1();
	JPanel panel1_2 = new MyPanel1_2();
	JPanel panel1_3 = new MyPanel1_3();
	JPanel panel1_4 = new MyPanel1_4();
	JPanel panel1_5 = new MyPanel1_5();
	JPanel panel1_6 = new MyPanel1_6();
	
	JRadioButton radiobutton1_1_1 = new JRadioButton();
	JRadioButton radiobutton1_1_2 = new JRadioButton();
	JRadioButton radiobutton1_1_3 = new JRadioButton();
	ButtonGroup bug1_1 = new ButtonGroup();
	
	JRadioButton radiobutton1_2_1 = new JRadioButton();
	JRadioButton radiobutton1_2_2 = new JRadioButton();
	JRadioButton radiobutton1_2_3 = new JRadioButton();
	ButtonGroup bug1_2 = new ButtonGroup();
	
	JRadioButton radiobutton1_3_1 = new JRadioButton();
	JRadioButton radiobutton1_3_2 = new JRadioButton();
	JRadioButton radiobutton1_3_3 = new JRadioButton();
	ButtonGroup bug1_3 = new ButtonGroup();
	
	JRadioButton radiobutton1_4_1 = new JRadioButton();
	JRadioButton radiobutton1_4_2 = new JRadioButton();
	JRadioButton radiobutton1_4_3 = new JRadioButton();
	ButtonGroup bug1_4 = new ButtonGroup();
	
	JRadioButton radiobutton1_5_1 = new JRadioButton();
	JRadioButton radiobutton1_5_2 = new JRadioButton();
	JRadioButton radiobutton1_5_3 = new JRadioButton();
	ButtonGroup bug1_5 = new ButtonGroup();
	
	JRadioButton radiobutton1_6_1 = new JRadioButton();
	JRadioButton radiobutton1_6_2 = new JRadioButton();
	JRadioButton radiobutton1_6_3 = new JRadioButton();
	ButtonGroup bug1_6 = new ButtonGroup();
	


	JButton button1_1_1 = new JButton("Add to Cart");
	JButton button1_1_2 = new JButton("-");
	JButton button1_1_3 = new JButton("+");
	JButton button1_1_4 = new JButton("||||");
	JLabel label1_1_1 = new JLabel("0");
	
	JButton button1_2_1 = new JButton("Add to Cart");
	JButton button1_2_2 = new JButton("-");
	JButton button1_2_3 = new JButton("+");
	JButton button1_2_4 = new JButton("||||");
	JLabel label1_2_1 = new JLabel("0");
	
	JButton button1_3_1 = new JButton("Add to Cart");
	JButton button1_3_2 = new JButton("-");
	JButton button1_3_3 = new JButton("+");
	JButton button1_3_4 = new JButton("||||");
	JLabel label1_3_1 = new JLabel("0");
	
	JButton button1_4_1 = new JButton("Add to Cart");
	JButton button1_4_2 = new JButton("-");
	JButton button1_4_3 = new JButton("+");
	JButton button1_4_4 = new JButton("||||");
	JLabel label1_4_1 = new JLabel("0");
	
	JButton button1_5_1 = new JButton("Add to Cart");
	JButton button1_5_2 = new JButton("-");
	JButton button1_5_3 = new JButton("+");
	JButton button1_5_4 = new JButton("||||");
	JLabel label1_5_1 = new JLabel("0");
	
	JButton button1_6_1 = new JButton("Add to Cart");
	JButton button1_6_2 = new JButton("-");
	JButton button1_6_3 = new JButton("+");
	JButton button1_6_4 = new JButton("||||");
	JLabel label1_6_1 = new JLabel("0");
	
	final double priceIce1 = 305;
	final double priceIce2 = 305;
	final double priceIce3 = 215;
	final double priceIce4 = 185;
	final double priceIce5 = 215;
	final double priceIce6 = 185;
	
	JLabel label1_1_2 = new JLabel("Rs.");
	JLabel label1_1_3 = new JLabel("0");
	JLabel label1_2_2 = new JLabel("Rs.");
	JLabel label1_2_3 = new JLabel("0");
	JLabel label1_3_2 = new JLabel("Rs.");
	JLabel label1_3_3 = new JLabel("0");
	JLabel label1_4_2 = new JLabel("Rs.");
	JLabel label1_4_3 = new JLabel("0");
	JLabel label1_5_2 = new JLabel("Rs.");
	JLabel label1_5_3 = new JLabel("0");
	JLabel label1_6_2 = new JLabel("Rs.");
	JLabel label1_6_3 = new JLabel("0");
	
	final double priceIce11 = 235;
	final double priceIce12 = 215;
	final double priceIce13 = 165;
	final double priceIce14 = 215;
	final double priceIce15 = 99;
	final double priceIce16 = 115;
	
	JLabel label2_1_2 = new JLabel("Rs.");
	JLabel label2_1_3 = new JLabel("0");
	JLabel label2_2_2 = new JLabel("Rs.");
	JLabel label2_2_3 = new JLabel("0");
	JLabel label2_3_2 = new JLabel("Rs.");
	JLabel label2_3_3 = new JLabel("0");
	JLabel label2_4_2 = new JLabel("Rs.");
	JLabel label2_4_3 = new JLabel("0");
	JLabel label2_5_2 = new JLabel("Rs.");
	JLabel label2_5_3 = new JLabel("0");
	JLabel label2_6_2 = new JLabel("Rs.");
	JLabel label2_6_3 = new JLabel("0");
	
	JPanel panel2_1 = new MyPanel2_1();
	JPanel panel2_2 = new MyPanel2_2();
	JPanel panel2_3 = new MyPanel2_3();
	JPanel panel2_4 = new MyPanel2_4();
	JPanel panel2_5 = new MyPanel2_5();
	JPanel panel2_6 = new MyPanel2_6();
	
	JRadioButton radiobutton2_1_1 = new JRadioButton();
	JRadioButton radiobutton2_1_2 = new JRadioButton();
	JRadioButton radiobutton2_1_3 = new JRadioButton();
	ButtonGroup bug2_1 = new ButtonGroup();
	
	JRadioButton radiobutton2_2_1 = new JRadioButton();
	JRadioButton radiobutton2_2_2 = new JRadioButton();
	JRadioButton radiobutton2_2_3 = new JRadioButton();
	ButtonGroup bug2_2 = new ButtonGroup();
	
	JRadioButton radiobutton2_3_1 = new JRadioButton();
	JRadioButton radiobutton2_3_2 = new JRadioButton();
	JRadioButton radiobutton2_3_3 = new JRadioButton();
	ButtonGroup bug2_3 = new ButtonGroup();
	
	JRadioButton radiobutton2_4_1 = new JRadioButton();
	JRadioButton radiobutton2_4_2 = new JRadioButton();
	JRadioButton radiobutton2_4_3 = new JRadioButton();
	ButtonGroup bug2_4 = new ButtonGroup();
	
	JRadioButton radiobutton2_5_1 = new JRadioButton();
	JRadioButton radiobutton2_5_2 = new JRadioButton();
	JRadioButton radiobutton2_5_3 = new JRadioButton();
	ButtonGroup bug2_5 = new ButtonGroup();
	
	JRadioButton radiobutton2_6_1 = new JRadioButton();
	JRadioButton radiobutton2_6_2 = new JRadioButton();
	JRadioButton radiobutton2_6_3 = new JRadioButton();
	ButtonGroup bug2_6 = new ButtonGroup();


	
	JButton button2_1_1 = new JButton("Add to Cart");
	JButton button2_1_2 = new JButton("-");
	JButton button2_1_3 = new JButton("+");
	JButton button2_1_4 = new JButton("||||");
	JLabel label2_1_1 = new JLabel("0");
	
	JButton button2_2_1 = new JButton("Add to Cart");
	JButton button2_2_2 = new JButton("-");
	JButton button2_2_3 = new JButton("+");
	JButton button2_2_4 = new JButton("||||");
	JLabel label2_2_1 = new JLabel("0");
	
	JButton button2_3_1 = new JButton("Add to Cart");
	JButton button2_3_2 = new JButton("-");
	JButton button2_3_3 = new JButton("+");
	JButton button2_3_4 = new JButton("||||");
	JLabel label2_3_1 = new JLabel("0");
	
	JButton button2_4_1 = new JButton("Add to Cart");
	JButton button2_4_2 = new JButton("-");
	JButton button2_4_3 = new JButton("+");
	JButton button2_4_4 = new JButton("||||");
	JLabel label2_4_1 = new JLabel("0");
	
	JButton button2_5_1 = new JButton("Add to Cart");
	JButton button2_5_2 = new JButton("-");
	JButton button2_5_3 = new JButton("+");
	JButton button2_5_4 = new JButton("||||");
	JLabel label2_5_1 = new JLabel("0");
	
	JButton button2_6_1 = new JButton("Add to Cart");
	JButton button2_6_2 = new JButton("-");
	JButton button2_6_3 = new JButton("+");
	JButton button2_6_4 = new JButton("||||");
	JLabel label2_6_1 = new JLabel("0");
	
	ImageIcon i1;
	ImageIcon i2;

	ImageIcon i1_1;
	JLabel label1_1 = new JLabel();
	ImageIcon i1_2;
	JLabel label1_2 = new JLabel();
	ImageIcon i1_3;
	JLabel label1_3 = new JLabel();
	ImageIcon i1_4;
	JLabel label1_4 = new JLabel();
	ImageIcon i1_5;
	JLabel label1_5 = new JLabel();
	ImageIcon i1_6;
	JLabel label1_6 = new JLabel();

	ImageIcon i2_1;
	JLabel label2_1 = new JLabel();
	ImageIcon i2_2;
	JLabel label2_2 = new JLabel();
	ImageIcon i2_3;
	JLabel label2_3 = new JLabel();
	ImageIcon i2_4;
	JLabel label2_4 = new JLabel();
	ImageIcon i2_5;
	JLabel label2_5 = new JLabel();
	ImageIcon i2_6;
	JLabel label2_6 = new JLabel();

	JLabel label1_1_4 = new JLabel("Creamy Tomato Pasta Pizza");
	JLabel label1_2_4 = new JLabel("Veg Extravaganza");
	JLabel label1_3_4 = new JLabel("Farmhouse");
	JLabel label1_4_4 = new JLabel("Margherita");
	JLabel label1_5_4 = new JLabel("Moroccan Spice Pasta Pizza");
	JLabel label1_6_4 = new JLabel("Peppy Paneer");
	
	JLabel label2_1_4 = new JLabel("Chicken Dominator");
	JLabel label2_2_4 = new JLabel("Chicken Pepperoni");
	JLabel label2_3_4 = new JLabel("Creamy Tomato Pasta Pizza");
	JLabel label2_4_4 = new JLabel("Moroccan Spice Pasta Pizza");
	JLabel label2_5_4 = new JLabel("Pepper Barbecue & Onion");
	JLabel label2_6_4 = new JLabel("Pepper Barbecue Chicken");

	JButton back = new JButton("Back");

	ProductFrame_1(String str){
		tname = str;
		
		f = new JFrame();

		pane.setBounds(50, 130, 1800, 800);
		
		panel.setBounds(0, 0, 1900, 1000);
		panel.setLayout(null);
		panel.setVisible(true);
		panel.setBackground(Color.gray);
		
		
		setPanel();
		
		setPanel1();
		setPanel2();
		
		setPanel1_1();
		setPanel1_2();
		setPanel1_3();
		setPanel1_4();
		setPanel1_5();
		setPanel1_6();
		
		setPanel2_1();
		setPanel2_2();
		setPanel2_3();
		setPanel2_4();
		setPanel2_5();
		setPanel2_6();

		setName();
		setBack();
		
		pane.add(panel1);
		pane.add(panel2);
		panel.add(pane);
		 
		f.add(panel);
		f.setSize(1900, 1000);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	private void setBack(){
		back.setFont(new Font("Arial", Font.BOLD, 19));
		back.setBackground(Color.black);
		back.setForeground(Color.white);
		back.setFocusable(false);
		back.setOpaque(true);
		back.setBorderPainted(false);
		back.setBorder(null);
		back.setContentAreaFilled(true);
		back.setBounds(80, 50, 80, 50);
		back.addActionListener(this);
		panel.add(back);
	}

	private void setName(){
		label1_1_4.setFont(new Font("SansSerif", Font.BOLD, 19));
		label1_1_4.setForeground(Color.white);
		label1_1_4.setOpaque(false);
		label1_1_4.setBounds(50, 20, 400, 30);
		label1_1_4.setFocusable(false);
		label1_1_4.setHorizontalAlignment(JTextField.CENTER);
		panel1_1.add(label1_1_4);
		
		label1_2_4.setFont(new Font("SansSerif", Font.BOLD, 19));
		label1_2_4.setForeground(Color.white);
		label1_2_4.setOpaque(false);
		label1_2_4.setBounds(50, 20, 400, 30);
		label1_2_4.setFocusable(false);
		label1_2_4.setHorizontalAlignment(JTextField.CENTER);
		panel1_2.add(label1_2_4);
		
		label1_3_4.setFont(new Font("SansSerif", Font.BOLD, 19));
		label1_3_4.setForeground(Color.white);
		label1_3_4.setOpaque(false);
		label1_3_4.setBounds(50, 20, 400, 30);
		label1_3_4.setFocusable(false);
		label1_3_4.setHorizontalAlignment(JTextField.CENTER);
		panel1_3.add(label1_3_4);
		
		label1_4_4.setFont(new Font("SansSerif", Font.BOLD, 19));
		label1_4_4.setForeground(Color.white);
		label1_4_4.setOpaque(false);
		label1_4_4.setBounds(50, 20, 400, 30);
		label1_4_4.setFocusable(false);
		label1_4_4.setHorizontalAlignment(JTextField.CENTER);
		panel1_4.add(label1_4_4);
		
		label1_5_4.setFont(new Font("SansSerif", Font.BOLD, 19));
		label1_5_4.setForeground(Color.white);
		label1_5_4.setOpaque(false);
		label1_5_4.setBounds(50, 20, 400, 30);
		label1_5_4.setFocusable(false);
		label1_5_4.setHorizontalAlignment(JTextField.CENTER);
		panel1_5.add(label1_5_4);
		
		label1_6_4.setFont(new Font("SansSerif", Font.BOLD, 19));
		label1_6_4.setForeground(Color.white);
		label1_6_4.setOpaque(false);
		label1_6_4.setBounds(50, 20, 400, 30);
		label1_6_4.setFocusable(false);
		label1_6_4.setHorizontalAlignment(JTextField.CENTER);
		panel1_6.add(label1_6_4);
		
		label2_1_4.setFont(new Font("SansSerif", Font.BOLD, 19));
		label2_1_4.setForeground(Color.white);
		label2_1_4.setOpaque(false);
		label2_1_4.setBounds(50, 20, 400, 30);
		label2_1_4.setFocusable(false);
		label2_1_4.setHorizontalAlignment(JTextField.CENTER);
		panel2_1.add(label2_1_4);
		
		label2_2_4.setFont(new Font("SansSerif", Font.BOLD, 19));
		label2_2_4.setForeground(Color.white);
		label2_2_4.setOpaque(false);
		label2_2_4.setBounds(50, 20, 400, 30);
		label2_2_4.setFocusable(false);
		label2_2_4.setHorizontalAlignment(JTextField.CENTER);
		panel2_2.add(label2_2_4);
		
		label2_3_4.setFont(new Font("SansSerif", Font.BOLD, 19));
		label2_3_4.setForeground(Color.white);
		label2_3_4.setOpaque(false);
		label2_3_4.setBounds(50, 20, 400, 30);
		label2_3_4.setFocusable(false);
		label2_3_4.setHorizontalAlignment(JTextField.CENTER);
		panel2_3.add(label2_3_4);
		
		label2_4_4.setFont(new Font("SansSerif", Font.BOLD, 19));
		label2_4_4.setForeground(Color.white);
		label2_4_4.setOpaque(false);
		label2_4_4.setBounds(50, 20, 400, 30);
		label2_4_4.setFocusable(false);
		label2_4_4.setHorizontalAlignment(JTextField.CENTER);
		panel2_4.add(label2_4_4);
		
		label2_5_4.setFont(new Font("SansSerif", Font.BOLD, 19));
		label2_5_4.setForeground(Color.white);
		label2_5_4.setOpaque(false);
		label2_5_4.setBounds(50, 20, 400, 30);
		label2_5_4.setFocusable(false);
		label2_5_4.setHorizontalAlignment(JTextField.CENTER);
		panel2_5.add(label2_5_4);
		
		label2_6_4.setFont(new Font("SansSerif", Font.BOLD, 19));
		label2_6_4.setForeground(Color.white);
		label2_6_4.setOpaque(false);
		label2_6_4.setBounds(50, 20, 400, 30);
		label2_6_4.setFocusable(false);
		label2_6_4.setHorizontalAlignment(JTextField.CENTER);
		panel2_6.add(label2_6_4);
		
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == back){
			new FirstFrame(tname);
			f.dispose();
			
		}
		
		if(e.getSource() == button0_1){
			panel1.setVisible(true);
			panel2.setVisible(false);
			button0_1.setForeground(Color.white);
			button0_1.setBackground(Color.black);
			button0_2.setForeground(Color.black);
			button0_2.setBackground(Color.white);
		}
		else if(e.getSource() == button0_2){
			panel2.setVisible(true);
			panel1.setVisible(false);
			button0_1.setForeground(Color.black);
			button0_1.setBackground(Color.white);
			button0_2.setForeground(Color.white);
			button0_2.setBackground(Color.black);
			
		}
		
		if(e.getSource() == button1_1_1){
			String productname = "";
			String quantity = "";
			String price = "";
			String totalprice = "";
			if(radiobutton1_1_1.isSelected()){
				productname = "Creamy Tomato Pasta Pizza - regular";
				quantity = label1_1_1.getText();
				totalprice = label1_1_3.getText();
			}
			else if(radiobutton1_1_2.isSelected()){
				productname = "Creamy Tomato Pasta Pizza - medium";
				quantity = label1_1_1.getText();
				totalprice = label1_1_3.getText();
			}
			else if(radiobutton1_1_3.isSelected()){
				productname = "Creamy Tomato Pasta Pizza - large";
				quantity = label1_1_1.getText();
				totalprice = label1_1_3.getText();
			}
			
			price = Double.toString(Double.parseDouble(totalprice) / Integer.parseInt(quantity));
			
			
			Connection con1 = null;
			PreparedStatement insert = null;
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "");
				insert = con1.prepareStatement("insert into "+tname+"(productname, quantity, price, totalprice) values(?,?,?,?)");
				
				insert.setString(1, productname);
				insert.setString(2, quantity);
				insert.setString(3, price);
				insert.setString(4, totalprice);
				
				insert.executeUpdate();
				
				JOptionPane.showMessageDialog(panel1_1, "Product Added");
				
				label1_1_1.setText("0");
				label1_1_3.setText("0");
				bug1_1.clearSelection();
				
				con1.close();
			}
			catch(Exception ae){}
		}
		
		if(e.getSource() == button1_2_1){
			String productname = "";
			String quantity = "";
			String price = "";
			String totalprice = "";
			if(radiobutton1_2_1.isSelected()){
				productname = "Veg Extravaganza - regular";
				quantity = label1_2_1.getText();
				totalprice = label1_2_3.getText();
			}
			else if(radiobutton1_2_2.isSelected()){
				productname = "Veg Extravaganza - medium";
				quantity = label1_2_1.getText();
				totalprice = label1_2_3.getText();
			}
			else if(radiobutton1_2_3.isSelected()){
				productname = "Veg Extravaganza - large";
				quantity = label1_2_1.getText();
				totalprice = label1_2_3.getText();
			}
			
			price = Double.toString(Double.parseDouble(totalprice) / Integer.parseInt(quantity));
			
			
			Connection con1 = null;
			PreparedStatement insert = null;
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "");
				insert = con1.prepareStatement("insert into "+tname+"(productname, quantity, price, totalprice) values(?,?,?,?)");
				
				insert.setString(1, productname);
				insert.setString(2, quantity);
				insert.setString(3, price);
				insert.setString(4, totalprice);
				
				insert.executeUpdate();
				
				JOptionPane.showMessageDialog(panel1_2, "Product Added");
				
				label1_2_1.setText("0");
				label1_2_3.setText("0");
				bug1_2.clearSelection();
				
				con1.close();
			}
			catch(Exception ae){}
		}
		
		if(e.getSource() == button1_3_1){
			String productname = "";
			String quantity = "";
			String price = "";
			String totalprice = "";
			if(radiobutton1_3_1.isSelected()){
				productname = "Farmhouse - regular";
				quantity = label1_3_1.getText();
				totalprice = label1_3_3.getText();
			}
			else if(radiobutton1_3_2.isSelected()){
				productname = "Farmhouse - medium";
				quantity = label1_3_1.getText();
				totalprice = label1_3_3.getText();
			}
			else if(radiobutton1_3_3.isSelected()){
				productname = "Farmhouse - large";
				quantity = label1_3_1.getText();
				totalprice = label1_3_3.getText();
			}
			
			price = Double.toString(Double.parseDouble(totalprice) / Integer.parseInt(quantity));
			
			
			Connection con1 = null;
			PreparedStatement insert = null;
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "");
				insert = con1.prepareStatement("insert into "+tname+"(productname, quantity, price, totalprice) values(?,?,?,?)");
				
				insert.setString(1, productname);
				insert.setString(2, quantity);
				insert.setString(3, price);
				insert.setString(4, totalprice);
				
				insert.executeUpdate();
				
				JOptionPane.showMessageDialog(panel1_3, "Product Added");
				
				label1_3_1.setText("0");
				label1_3_3.setText("0");
				bug1_3.clearSelection();
				
				con1.close();
			}
			catch(Exception ae){}
		}
		
		if(e.getSource() == button1_4_1){
			String productname = "";
			String quantity = "";
			String price = "";
			String totalprice = "";
			if(radiobutton1_4_1.isSelected()){
				productname = "Margherita - regular";
				quantity = label1_4_1.getText();
				totalprice = label1_4_3.getText();
			}
			else if(radiobutton1_4_2.isSelected()){
				productname = "Margherita - medium";
				quantity = label1_4_1.getText();
				totalprice = label1_4_3.getText();
			}
			else if(radiobutton1_4_3.isSelected()){
				productname = "Margherita - large";
				quantity = label1_4_1.getText();
				totalprice = label1_4_3.getText();
			}
			
			price = Double.toString(Double.parseDouble(totalprice) / Integer.parseInt(quantity));
			
			
			Connection con1 = null;
			PreparedStatement insert = null;
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "");
				insert = con1.prepareStatement("insert into "+tname+"(productname, quantity, price, totalprice) values(?,?,?,?)");
				
				insert.setString(1, productname);
				insert.setString(2, quantity);
				insert.setString(3, price);
				insert.setString(4, totalprice);
				
				insert.executeUpdate();
				
				JOptionPane.showMessageDialog(panel1_4, "Product Added");
				
				label1_4_1.setText("0");
				label1_4_3.setText("0");
				bug1_4.clearSelection();
				
				con1.close();
			}
			catch(Exception ae){}
		}
		
		if(e.getSource() == button1_5_1){
			String productname = "";
			String quantity = "";
			String price = "";
			String totalprice = "";
			if(radiobutton1_5_1.isSelected()){
				productname = "Moroccan Spice Pasta Pizza - regular";
				quantity = label1_5_1.getText();
				totalprice = label1_5_3.getText();
			}
			else if(radiobutton1_5_2.isSelected()){
				productname = "Moroccan Spice Pasta Pizza - medium";
				quantity = label1_5_1.getText();
				totalprice = label1_5_3.getText();
			}
			else if(radiobutton1_5_3.isSelected()){
				productname = "Moroccan Spice Pasta Pizza - large";
				quantity = label1_5_1.getText();
				totalprice = label1_5_3.getText();
			}
			
			price = Double.toString(Double.parseDouble(totalprice) / Integer.parseInt(quantity));
			
			
			Connection con1 = null;
			PreparedStatement insert = null;
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "");
				insert = con1.prepareStatement("insert into "+tname+"(productname, quantity, price, totalprice) values(?,?,?,?)");
				
				insert.setString(1, productname);
				insert.setString(2, quantity);
				insert.setString(3, price);
				insert.setString(4, totalprice);
				
				insert.executeUpdate();
				
				JOptionPane.showMessageDialog(panel1_5, "Product Added");
				
				label1_5_1.setText("0");
				label1_5_3.setText("0");
				bug1_5.clearSelection();
				
				con1.close();
			}
			catch(Exception ae){}
		}
		
		if(e.getSource() == button1_6_1){
			String productname = "";
			String quantity = "";
			String price = "";
			String totalprice = "";
			if(radiobutton1_6_1.isSelected()){
				productname = "Peppy Paneer - regular";
				quantity = label1_6_1.getText();
				totalprice = label1_6_3.getText();
			}
			else if(radiobutton1_6_2.isSelected()){
				productname = "Peppy Paneer - medium";
				quantity = label1_6_1.getText();
				totalprice = label1_6_3.getText();
			}
			else if(radiobutton1_6_3.isSelected()){
				productname = "Peppy Paneer - large";
				quantity = label1_6_1.getText();
				totalprice = label1_6_3.getText();
			}
			
			price = Double.toString(Double.parseDouble(totalprice) / Integer.parseInt(quantity));
			
			
			Connection con1 = null;
			PreparedStatement insert = null;
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "");
				insert = con1.prepareStatement("insert into "+tname+"(productname, quantity, price, totalprice) values(?,?,?,?)");
				
				insert.setString(1, productname);
				insert.setString(2, quantity);
				insert.setString(3, price);
				insert.setString(4, totalprice);
				
				insert.executeUpdate();
				
				JOptionPane.showMessageDialog(panel1_6, "Product Added");
				
				label1_6_1.setText("0");
				label1_6_3.setText("0");
				bug1_6.clearSelection();
				
				con1.close();
			}
			catch(Exception ae){}
		}
		
		if(radiobutton1_1_1.isSelected()){
			label1_1_3.setText(Double.toString(Integer.parseInt(label1_1_1.getText()) * priceIce1));
		}
		if(radiobutton1_1_2.isSelected()){
			label1_1_3.setText(Double.toString(Integer.parseInt(label1_1_1.getText()) * priceIce1 * 1.7));
		}
		if(radiobutton1_1_3.isSelected()){
			label1_1_3.setText(Double.toString(Integer.parseInt(label1_1_1.getText()) * priceIce1 * 2.5));
		}
		
		if(radiobutton1_2_1.isSelected()){
			label1_2_3.setText(Double.toString(Integer.parseInt(label1_2_1.getText()) * priceIce2));
		}
		if(radiobutton1_2_2.isSelected()){
			label1_2_3.setText(Double.toString(Integer.parseInt(label1_2_1.getText()) * priceIce2 * 1.7));
		}
		if(radiobutton1_2_3.isSelected()){
			label1_2_3.setText(Double.toString(Integer.parseInt(label1_2_1.getText()) * priceIce2 * 2.5));
		}
		
		if(radiobutton1_3_1.isSelected()){
			label1_3_3.setText(Double.toString(Integer.parseInt(label1_3_1.getText()) * priceIce3));
		}
		if(radiobutton1_3_2.isSelected()){
			label1_3_3.setText(Double.toString(Integer.parseInt(label1_3_1.getText()) * priceIce3 * 1.7));
		}
		if(radiobutton1_3_3.isSelected()){
			label1_3_3.setText(Double.toString(Integer.parseInt(label1_3_1.getText()) * priceIce3 * 2.5));
		}
		if(radiobutton1_4_1.isSelected()){
			label1_4_3.setText(Double.toString(Integer.parseInt(label1_4_1.getText()) * priceIce4));
		}
		if(radiobutton1_4_2.isSelected()){
			label1_4_3.setText(Double.toString(Integer.parseInt(label1_4_1.getText()) * priceIce4 * 1.7));
		}
		if(radiobutton1_4_3.isSelected()){
			label1_4_3.setText(Double.toString(Integer.parseInt(label1_4_1.getText()) * priceIce4 * 2.5));
		}
		if(radiobutton1_5_1.isSelected()){
			label1_5_3.setText(Double.toString(Integer.parseInt(label1_5_1.getText()) * priceIce5));
		}
		if(radiobutton1_5_2.isSelected()){
			label1_5_3.setText(Double.toString(Integer.parseInt(label1_5_1.getText()) * priceIce5 * 1.7));
		}
		if(radiobutton1_5_3.isSelected()){
			label1_5_3.setText(Double.toString(Integer.parseInt(label1_5_1.getText()) * priceIce5 * 2.5));
		}
		if(radiobutton1_6_1.isSelected()){
			label1_6_3.setText(Double.toString(Integer.parseInt(label1_6_1.getText()) * priceIce6));
		}
		if(radiobutton1_6_2.isSelected()){
			label1_6_3.setText(Double.toString(Integer.parseInt(label1_6_1.getText()) * priceIce6 * 1.7));
		}
		if(radiobutton1_6_3.isSelected()){
			label1_6_3.setText(Double.toString(Integer.parseInt(label1_6_1.getText()) * priceIce6 * 2.5));
		}
		
		if(e.getSource() == button1_1_3 && Integer.parseInt(label1_1_1.getText()) < 15){
			label1_1_1.setText(Integer.toString(Integer.parseInt(label1_1_1.getText()) + 1));
			if(radiobutton1_1_1.isSelected()){
				label1_1_3.setText(Double.toString(Integer.parseInt(label1_1_1.getText()) * priceIce1));
			}
			else if(radiobutton1_1_2.isSelected()){
				label1_1_3.setText(Double.toString(Integer.parseInt(label1_1_1.getText()) * priceIce1 * 1.7));
			}
			else if(radiobutton1_1_3.isSelected()){
				label1_1_3.setText(Double.toString(Integer.parseInt(label1_1_1.getText()) * priceIce1 * 2.5));
			}
		}
		
		else if(e.getSource() == button1_1_2 && Integer.parseInt(label1_1_1.getText()) > 0){
			label1_1_1.setText(Integer.toString(Integer.parseInt(label1_1_1.getText()) - 1));
			if(radiobutton1_1_1.isSelected()){
				label1_1_3.setText(Double.toString(Integer.parseInt(label1_1_1.getText()) * priceIce1));
			}
			else if(radiobutton1_1_2.isSelected()){
				label1_1_3.setText(Double.toString(Integer.parseInt(label1_1_1.getText()) * priceIce1 * 1.7));
			}
			else if(radiobutton1_1_3.isSelected()){
				label1_1_3.setText(Double.toString(Integer.parseInt(label1_1_1.getText()) * priceIce1 * 2.5));
			}
		}
		
		else if(e.getSource() == button1_2_3 && Integer.parseInt(label1_2_1.getText()) < 15){
			label1_2_1.setText(Integer.toString(Integer.parseInt(label1_2_1.getText()) + 1));
			if(radiobutton1_2_1.isSelected()){
				label1_2_3.setText(Double.toString(Integer.parseInt(label1_2_1.getText()) * priceIce2));
			}
			else if(radiobutton1_2_2.isSelected()){
				label1_2_3.setText(Double.toString(Integer.parseInt(label1_2_1.getText()) * priceIce2 * 1.7));
			}
			else if(radiobutton1_2_3.isSelected()){
				label1_2_3.setText(Double.toString(Integer.parseInt(label1_2_1.getText()) * priceIce2 * 2.5));
			}
		}
		
		else if(e.getSource() == button1_2_2 && Integer.parseInt(label1_2_1.getText()) > 0){
			label1_2_1.setText(Integer.toString(Integer.parseInt(label1_2_1.getText()) - 1));
			if(radiobutton1_2_1.isSelected()){
				label1_2_3.setText(Double.toString(Integer.parseInt(label1_2_1.getText()) * priceIce2));
			}
			else if(radiobutton1_2_2.isSelected()){
				label1_2_3.setText(Double.toString(Integer.parseInt(label1_2_1.getText()) * priceIce2 * 1.7));
			}
			else if(radiobutton1_2_3.isSelected()){
				label1_2_3.setText(Double.toString(Integer.parseInt(label1_2_1.getText()) * priceIce2 * 2.5));
			}
		}
		
		else if(e.getSource() == button1_3_3 && Integer.parseInt(label1_3_1.getText()) < 15){
			label1_3_1.setText(Integer.toString(Integer.parseInt(label1_3_1.getText()) + 1));
			if(radiobutton1_3_1.isSelected()){
				label1_3_3.setText(Double.toString(Integer.parseInt(label1_3_1.getText()) * priceIce3));
			}
			else if(radiobutton1_3_2.isSelected()){
				label1_3_3.setText(Double.toString(Integer.parseInt(label1_3_1.getText()) * priceIce3 * 1.7));
			}
			else if(radiobutton1_3_3.isSelected()){
				label1_3_3.setText(Double.toString(Integer.parseInt(label1_3_1.getText()) * priceIce3 * 2.5));
			}
		}
		
		else if(e.getSource() == button1_3_2 && Integer.parseInt(label1_3_1.getText()) > 0){
			label1_3_1.setText(Integer.toString(Integer.parseInt(label1_3_1.getText()) - 1));
			if(radiobutton1_3_1.isSelected()){
				label1_3_3.setText(Double.toString(Integer.parseInt(label1_3_1.getText()) * priceIce3));
			}
			else if(radiobutton1_3_2.isSelected()){
				label1_3_3.setText(Double.toString(Integer.parseInt(label1_3_1.getText()) * priceIce3 * 1.7));
			}
			else if(radiobutton1_3_3.isSelected()){
				label1_3_3.setText(Double.toString(Integer.parseInt(label1_3_1.getText()) * priceIce3 * 2.5));
			}
		}
		
		else if(e.getSource() == button1_4_3 && Integer.parseInt(label1_4_1.getText()) < 15){
			label1_4_1.setText(Integer.toString(Integer.parseInt(label1_4_1.getText()) + 1));
			if(radiobutton1_4_1.isSelected()){
				label1_4_3.setText(Double.toString(Integer.parseInt(label1_4_1.getText()) * priceIce4));
			}
			else if(radiobutton1_4_2.isSelected()){
				label1_4_3.setText(Double.toString(Integer.parseInt(label1_4_1.getText()) * priceIce4 * 1.7));
			}
			else if(radiobutton1_4_3.isSelected()){
				label1_4_3.setText(Double.toString(Integer.parseInt(label1_4_1.getText()) * priceIce4 * 2.5));
			}
		}
		
		else if(e.getSource() == button1_4_2 && Integer.parseInt(label1_4_1.getText()) > 0){
			label1_4_1.setText(Integer.toString(Integer.parseInt(label1_4_1.getText()) - 1));
			if(radiobutton1_4_1.isSelected()){
				label1_4_3.setText(Double.toString(Integer.parseInt(label1_4_1.getText()) * priceIce4));
			}
			else if(radiobutton1_4_2.isSelected()){
				label1_4_3.setText(Double.toString(Integer.parseInt(label1_4_1.getText()) * priceIce4 * 1.7));
			}
			else if(radiobutton1_4_3.isSelected()){
				label1_4_3.setText(Double.toString(Integer.parseInt(label1_4_1.getText()) * priceIce4 * 2.5));
			}
		}
		
		else if(e.getSource() == button1_5_3 && Integer.parseInt(label1_5_1.getText()) < 15){
			label1_5_1.setText(Integer.toString(Integer.parseInt(label1_5_1.getText()) + 1));
			if(radiobutton1_5_1.isSelected()){
				label1_5_3.setText(Double.toString(Integer.parseInt(label1_5_1.getText()) * priceIce5));
			}
			else if(radiobutton1_5_2.isSelected()){
				label1_5_3.setText(Double.toString(Integer.parseInt(label1_5_1.getText()) * priceIce5 * 1.7));
			}
			else if(radiobutton1_5_3.isSelected()){
				label1_5_3.setText(Double.toString(Integer.parseInt(label1_5_1.getText()) * priceIce5 * 2.5));
			}
		}
		
		else if(e.getSource() == button1_5_2 && Integer.parseInt(label1_5_1.getText()) > 0){
			label1_5_1.setText(Integer.toString(Integer.parseInt(label1_5_1.getText()) - 1));
			if(radiobutton1_5_1.isSelected()){
				label1_5_3.setText(Double.toString(Integer.parseInt(label1_5_1.getText()) * priceIce5));
			}
			else if(radiobutton1_5_2.isSelected()){
				label1_5_3.setText(Double.toString(Integer.parseInt(label1_5_1.getText()) * priceIce5 * 1.7));
			}
			else if(radiobutton1_5_3.isSelected()){
				label1_5_3.setText(Double.toString(Integer.parseInt(label1_5_1.getText()) * priceIce5 * 2.5));
			}
		}
		
		else if(e.getSource() == button1_6_3 && Integer.parseInt(label1_6_1.getText()) < 15){
			label1_6_1.setText(Integer.toString(Integer.parseInt(label1_6_1.getText()) + 1));
			if(radiobutton1_6_1.isSelected()){
				label1_6_3.setText(Double.toString(Integer.parseInt(label1_6_1.getText()) * priceIce6));
			}
			else if(radiobutton1_6_2.isSelected()){
				label1_6_3.setText(Double.toString(Integer.parseInt(label1_6_1.getText()) * priceIce6 * 1.7));
			}
			else if(radiobutton1_6_3.isSelected()){
				label1_6_3.setText(Double.toString(Integer.parseInt(label1_6_1.getText()) * priceIce6 * 2.5));
			}
		}
		
		else if(e.getSource() == button1_6_2 && Integer.parseInt(label1_6_1.getText()) > 0){
			label1_6_1.setText(Integer.toString(Integer.parseInt(label1_6_1.getText()) - 1));
			if(radiobutton1_6_1.isSelected()){
				label1_6_3.setText(Double.toString(Integer.parseInt(label1_6_1.getText()) * priceIce6));
			}
			else if(radiobutton1_6_2.isSelected()){
				label1_6_3.setText(Double.toString(Integer.parseInt(label1_6_1.getText()) * priceIce6 * 1.7));
			}
			else if(radiobutton1_6_3.isSelected()){
				label1_6_3.setText(Double.toString(Integer.parseInt(label1_6_1.getText()) * priceIce6 * 2.5));
			}
		}
		
		
		if(e.getSource() == button2_1_1){
			String productname = "";
			String quantity = "";
			String price = "";
			String totalprice = "";
			if(radiobutton2_1_1.isSelected()){
				productname = "Chicken Dominator - regular";
				quantity = label2_1_1.getText();
				totalprice = label2_1_3.getText();
			}
			else if(radiobutton2_1_2.isSelected()){
				productname = "Chicken Dominator - medium";
				quantity = label2_1_1.getText();
				totalprice = label2_1_3.getText();
			}
			else if(radiobutton2_1_3.isSelected()){
				productname = "Chicken Dominator - large";
				quantity = label2_1_1.getText();
				totalprice = label2_1_3.getText();
			}
			
			price = Double.toString(Double.parseDouble(totalprice) / Integer.parseInt(quantity));
			
			
			Connection con1 = null;
			PreparedStatement insert = null;
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "");
				insert = con1.prepareStatement("insert into "+tname+"(productname, quantity, price, totalprice) values(?,?,?,?)");
				
				insert.setString(1, productname);
				insert.setString(2, quantity);
				insert.setString(3, price);
				insert.setString(4, totalprice);
				
				insert.executeUpdate();
				
				JOptionPane.showMessageDialog(panel2_1, "Product Added");
				
				label2_1_1.setText("0");
				label2_1_3.setText("0");
				bug2_1.clearSelection();
				
				con1.close();
			}
			catch(Exception ae){}
		}
		
		if(e.getSource() == button2_2_1){
			String productname = "";
			String quantity = "";
			String price = "";
			String totalprice = "";
			if(radiobutton2_2_1.isSelected()){
				productname = "Chicken Pepperoni - regular";
				quantity = label2_2_1.getText();
				totalprice = label2_2_3.getText();
			}
			else if(radiobutton2_2_2.isSelected()){
				productname = "Chicken Pepperoni - medium";
				quantity = label2_2_1.getText();
				totalprice = label2_2_3.getText();
			}
			else if(radiobutton2_2_3.isSelected()){
				productname = "Chicken Pepperoni - large";
				quantity = label2_2_1.getText();
				totalprice = label2_2_3.getText();
			}
			
			price = Double.toString(Double.parseDouble(totalprice) / Integer.parseInt(quantity));
			
			
			Connection con1 = null;
			PreparedStatement insert = null;
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "");
				insert = con1.prepareStatement("insert into "+tname+"(productname, quantity, price, totalprice) values(?,?,?,?)");
				
				insert.setString(1, productname);
				insert.setString(2, quantity);
				insert.setString(3, price);
				insert.setString(4, totalprice);
				
				insert.executeUpdate();
				
				JOptionPane.showMessageDialog(panel2_2, "Product Added");
				
				label2_2_1.setText("0");
				label2_2_3.setText("0");
				bug2_2.clearSelection();
				
				con1.close();
			}
			catch(Exception ae){}
		}
		
		if(e.getSource() == button2_3_1){
			String productname = "";
			String quantity = "";
			String price = "";
			String totalprice = "";
			if(radiobutton2_3_1.isSelected()){
				productname = "Creamy Tomato Pasta Pizza - regular";
				quantity = label2_3_1.getText();
				totalprice = label2_3_3.getText();
			}
			else if(radiobutton2_3_2.isSelected()){
				productname = "Creamy Tomato Pasta Pizza - medium";
				quantity = label2_3_1.getText();
				totalprice = label2_3_3.getText();
			}
			else if(radiobutton2_3_3.isSelected()){
				productname = "Creamy Tomato Pasta Pizza - large";
				quantity = label2_3_1.getText();
				totalprice = label2_3_3.getText();
			}
			
			price = Double.toString(Double.parseDouble(totalprice) / Integer.parseInt(quantity));
			
			
			Connection con1 = null;
			PreparedStatement insert = null;
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "");
				insert = con1.prepareStatement("insert into "+tname+"(productname, quantity, price, totalprice) values(?,?,?,?)");
				
				insert.setString(1, productname);
				insert.setString(2, quantity);
				insert.setString(3, price);
				insert.setString(4, totalprice);
				
				insert.executeUpdate();
				
				JOptionPane.showMessageDialog(panel2_3, "Product Added");
				
				label2_3_1.setText("0");
				label2_3_3.setText("0");
				bug2_3.clearSelection();
				
				con1.close();
			}
			catch(Exception ae){}
		}
		
		if(e.getSource() == button2_4_1){
			String productname = "";
			String quantity = "";
			String price = "";
			String totalprice = "";
			if(radiobutton2_4_1.isSelected()){
				productname = "Moroccan Spice Pasta Pizza - regular";
				quantity = label2_4_1.getText();
				totalprice = label2_4_3.getText();
			}
			else if(radiobutton2_4_2.isSelected()){
				productname = "Moroccan Spice Pasta Pizza - medium";
				quantity = label2_4_1.getText();
				totalprice = label2_4_3.getText();
			}
			else if(radiobutton2_4_3.isSelected()){
				productname = "Moroccan Spice Pasta Pizza - large";
				quantity = label2_4_1.getText();
				totalprice = label2_4_3.getText();
			}
			
			price = Double.toString(Double.parseDouble(totalprice) / Integer.parseInt(quantity));
			
			
			Connection con1 = null;
			PreparedStatement insert = null;
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "");
				insert = con1.prepareStatement("insert into "+tname+"(productname, quantity, price, totalprice) values(?,?,?,?)");
				
				insert.setString(1, productname);
				insert.setString(2, quantity);
				insert.setString(3, price);
				insert.setString(4, totalprice);
				
				insert.executeUpdate();
				
				JOptionPane.showMessageDialog(panel2_4, "Product Added");
				
				label2_4_1.setText("0");
				label2_4_3.setText("0");
				bug2_4.clearSelection();
				
				con1.close();
			}
			catch(Exception ae){}
		}
		
		if(e.getSource() == button2_5_1){
			String productname = "";
			String quantity = "";
			String price = "";
			String totalprice = "";
			if(radiobutton2_5_1.isSelected()){
				productname = "Pepper Barbecue & Onion - regular";
				quantity = label2_5_1.getText();
				totalprice = label2_5_3.getText();
			}
			else if(radiobutton2_5_2.isSelected()){
				productname = "Pepper Barbecue & Onion - medium";
				quantity = label2_5_1.getText();
				totalprice = label2_5_3.getText();
			}
			else if(radiobutton2_5_3.isSelected()){
				productname = "Pepper Barbecue & Onion - large";
				quantity = label2_5_1.getText();
				totalprice = label2_5_3.getText();
			}
			
			price = Double.toString(Double.parseDouble(totalprice) / Integer.parseInt(quantity));
			
			
			Connection con1 = null;
			PreparedStatement insert = null;
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "");
				insert = con1.prepareStatement("insert into "+tname+"(productname, quantity, price, totalprice) values(?,?,?,?)");
				
				insert.setString(1, productname);
				insert.setString(2, quantity);
				insert.setString(3, price);
				insert.setString(4, totalprice);
				
				insert.executeUpdate();
				
				JOptionPane.showMessageDialog(panel2_5, "Product Added");
				
				label2_5_1.setText("0");
				label2_5_3.setText("0");
				bug2_5.clearSelection();
				
				con1.close();
			}
			catch(Exception ae){}
		}
		
		if(e.getSource() == button2_6_1){
			String productname = "";
			String quantity = "";
			String price = "";
			String totalprice = "";
			if(radiobutton2_6_1.isSelected()){
				productname = "Pepper Barbecue Chicken - regular";
				quantity = label2_6_1.getText();
				totalprice = label2_6_3.getText();
			}
			else if(radiobutton2_6_2.isSelected()){
				productname = "Pepper Barbecue Chicken - medium";
				quantity = label2_6_1.getText();
				totalprice = label2_6_3.getText();
			}
			else if(radiobutton2_6_3.isSelected()){
				productname = "Pepper Barbecue Chicken - large";
				quantity = label2_6_1.getText();
				totalprice = label2_6_3.getText();
			}
			
			price = Double.toString(Double.parseDouble(totalprice) / Integer.parseInt(quantity));
			
			
			Connection con1 = null;
			PreparedStatement insert = null;
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "");
				insert = con1.prepareStatement("insert into "+tname+"(productname, quantity, price, totalprice) values(?,?,?,?)");
				
				insert.setString(1, productname);
				insert.setString(2, quantity);
				insert.setString(3, price);
				insert.setString(4, totalprice);
				
				insert.executeUpdate();
				
				JOptionPane.showMessageDialog(panel2_6, "Product Added");
				
				label2_6_1.setText("0");
				label2_6_3.setText("0");
				bug2_6.clearSelection();
				
				con1.close();
			}
			catch(Exception ae){}
		}
		
		if(radiobutton2_1_1.isSelected()){
			label2_1_3.setText(Double.toString(Integer.parseInt(label2_1_1.getText()) * priceIce11));
		}
		if(radiobutton2_1_2.isSelected()){
			label2_1_3.setText(Double.toString(Integer.parseInt(label2_1_1.getText()) * priceIce11 * 1.7));
		}
		if(radiobutton2_1_3.isSelected()){
			label2_1_3.setText(Double.toString(Integer.parseInt(label2_1_1.getText()) * priceIce11 * 2.5));
		}
		
		if(radiobutton2_2_1.isSelected()){
			label2_2_3.setText(Double.toString(Integer.parseInt(label2_2_1.getText()) * priceIce12));
		}
		if(radiobutton2_2_2.isSelected()){
			label2_2_3.setText(Double.toString(Integer.parseInt(label2_2_1.getText()) * priceIce12 * 1.7));
		}
		if(radiobutton2_2_3.isSelected()){
			label2_2_3.setText(Double.toString(Integer.parseInt(label2_2_1.getText()) * priceIce12 * 2.5));
		}
		
		if(radiobutton2_3_1.isSelected()){
			label2_3_3.setText(Double.toString(Integer.parseInt(label2_3_1.getText()) * priceIce13));
		}
		if(radiobutton2_3_2.isSelected()){
			label2_3_3.setText(Double.toString(Integer.parseInt(label2_3_1.getText()) * priceIce13 * 1.7));
		}
		if(radiobutton2_3_3.isSelected()){
			label2_3_3.setText(Double.toString(Integer.parseInt(label2_3_1.getText()) * priceIce13 * 2.5));
		}
		if(radiobutton2_4_1.isSelected()){
			label2_4_3.setText(Double.toString(Integer.parseInt(label2_4_1.getText()) * priceIce14));
		}
		if(radiobutton2_4_2.isSelected()){
			label2_4_3.setText(Double.toString(Integer.parseInt(label2_4_1.getText()) * priceIce14 * 1.7));
		}
		if(radiobutton2_4_3.isSelected()){
			label2_4_3.setText(Double.toString(Integer.parseInt(label2_4_1.getText()) * priceIce14 * 2.5));
		}
		if(radiobutton2_5_1.isSelected()){
			label2_5_3.setText(Double.toString(Integer.parseInt(label2_5_1.getText()) * priceIce15));
		}
		if(radiobutton2_5_2.isSelected()){
			label2_5_3.setText(Double.toString(Integer.parseInt(label2_5_1.getText()) * priceIce15 * 1.7));
		}
		if(radiobutton2_5_3.isSelected()){
			label2_5_3.setText(Double.toString(Integer.parseInt(label2_5_1.getText()) * priceIce15 * 2.5));
		}
		if(radiobutton2_6_1.isSelected()){
			label2_6_3.setText(Double.toString(Integer.parseInt(label2_6_1.getText()) * priceIce16));
		}
		if(radiobutton2_6_2.isSelected()){
			label2_6_3.setText(Double.toString(Integer.parseInt(label2_6_1.getText()) * priceIce16 * 1.7));
		}
		if(radiobutton2_6_3.isSelected()){
			label2_6_3.setText(Double.toString(Integer.parseInt(label2_6_1.getText()) * priceIce16 * 2.5));
		}
		
		if(e.getSource() == button2_1_3 && Integer.parseInt(label2_1_1.getText()) < 15){
			label2_1_1.setText(Integer.toString(Integer.parseInt(label2_1_1.getText()) + 1));
			if(radiobutton2_1_1.isSelected()){
				label2_1_3.setText(Double.toString(Integer.parseInt(label2_1_1.getText()) * priceIce11));
			}
			else if(radiobutton2_1_2.isSelected()){
				label2_1_3.setText(Double.toString(Integer.parseInt(label2_1_1.getText()) * priceIce11 * 1.7));
			}
			else if(radiobutton2_1_3.isSelected()){
				label2_1_3.setText(Double.toString(Integer.parseInt(label2_1_1.getText()) * priceIce11 * 2.5));
			}
		}
		
		else if(e.getSource() == button2_1_2 && Integer.parseInt(label2_1_1.getText()) > 0){
			label2_1_1.setText(Integer.toString(Integer.parseInt(label2_1_1.getText()) - 1));
			if(radiobutton2_1_1.isSelected()){
				label2_1_3.setText(Double.toString(Integer.parseInt(label2_1_1.getText()) * priceIce11));
			}
			else if(radiobutton2_1_2.isSelected()){
				label2_1_3.setText(Double.toString(Integer.parseInt(label2_1_1.getText()) * priceIce11 * 1.7));
			}
			else if(radiobutton2_1_3.isSelected()){
				label2_1_3.setText(Double.toString(Integer.parseInt(label2_1_1.getText()) * priceIce11 * 2.5));
			}
		}
		
		else if(e.getSource() == button2_2_3 && Integer.parseInt(label2_2_1.getText()) < 15){
			label2_2_1.setText(Integer.toString(Integer.parseInt(label2_2_1.getText()) + 1));
			if(radiobutton2_2_1.isSelected()){
				label2_2_3.setText(Double.toString(Integer.parseInt(label2_2_1.getText()) * priceIce12));
			}
			else if(radiobutton2_2_2.isSelected()){
				label2_2_3.setText(Double.toString(Integer.parseInt(label2_2_1.getText()) * priceIce12 * 1.7));
			}
			else if(radiobutton2_2_3.isSelected()){
				label2_2_3.setText(Double.toString(Integer.parseInt(label2_2_1.getText()) * priceIce12 * 2.5));
			}
		}
		
		else if(e.getSource() == button2_2_2 && Integer.parseInt(label2_2_1.getText()) > 0){
			label2_2_1.setText(Integer.toString(Integer.parseInt(label2_2_1.getText()) - 1));
			if(radiobutton2_2_1.isSelected()){
				label2_2_3.setText(Double.toString(Integer.parseInt(label2_2_1.getText()) * priceIce12));
			}
			else if(radiobutton2_2_2.isSelected()){
				label2_2_3.setText(Double.toString(Integer.parseInt(label2_2_1.getText()) * priceIce12 * 1.7));
			}
			else if(radiobutton2_2_3.isSelected()){
				label2_2_3.setText(Double.toString(Integer.parseInt(label2_2_1.getText()) * priceIce12 * 2.5));
			}
		}
		
		else if(e.getSource() == button2_3_3 && Integer.parseInt(label2_3_1.getText()) < 15){
			label2_3_1.setText(Integer.toString(Integer.parseInt(label2_3_1.getText()) + 1));
			if(radiobutton2_3_1.isSelected()){
				label2_3_3.setText(Double.toString(Integer.parseInt(label2_3_1.getText()) * priceIce13));
			}
			else if(radiobutton2_3_2.isSelected()){
				label2_3_3.setText(Double.toString(Integer.parseInt(label2_3_1.getText()) * priceIce13 * 1.7));
			}
			else if(radiobutton2_3_3.isSelected()){
				label2_3_3.setText(Double.toString(Integer.parseInt(label2_3_1.getText()) * priceIce13 * 2.5));
			}
		}
		
		else if(e.getSource() == button2_3_2 && Integer.parseInt(label2_3_1.getText()) > 0){
			label2_3_1.setText(Integer.toString(Integer.parseInt(label2_3_1.getText()) - 1));
			if(radiobutton2_3_1.isSelected()){
				label2_3_3.setText(Double.toString(Integer.parseInt(label2_3_1.getText()) * priceIce13));
			}
			else if(radiobutton2_3_2.isSelected()){
				label2_3_3.setText(Double.toString(Integer.parseInt(label2_3_1.getText()) * priceIce13 * 1.7));
			}
			else if(radiobutton2_3_3.isSelected()){
				label2_3_3.setText(Double.toString(Integer.parseInt(label2_3_1.getText()) * priceIce13 * 2.5));
			}
		}
		
		else if(e.getSource() == button2_4_3 && Integer.parseInt(label2_4_1.getText()) < 15){
			label2_4_1.setText(Integer.toString(Integer.parseInt(label2_4_1.getText()) + 1));
			if(radiobutton2_4_1.isSelected()){
				label2_4_3.setText(Double.toString(Integer.parseInt(label2_4_1.getText()) * priceIce14));
			}
			else if(radiobutton2_4_2.isSelected()){
				label2_4_3.setText(Double.toString(Integer.parseInt(label2_4_1.getText()) * priceIce14 * 1.7));
			}
			else if(radiobutton2_4_3.isSelected()){
				label2_4_3.setText(Double.toString(Integer.parseInt(label2_4_1.getText()) * priceIce14 * 2.5));
			}
		}
		
		else if(e.getSource() == button2_4_2 && Integer.parseInt(label2_4_1.getText()) > 0){
			label2_4_1.setText(Integer.toString(Integer.parseInt(label2_4_1.getText()) - 1));
			if(radiobutton2_4_1.isSelected()){
				label2_4_3.setText(Double.toString(Integer.parseInt(label2_4_1.getText()) * priceIce14));
			}
			else if(radiobutton2_4_2.isSelected()){
				label2_4_3.setText(Double.toString(Integer.parseInt(label2_4_1.getText()) * priceIce14 * 1.7));
			}
			else if(radiobutton2_4_3.isSelected()){
				label2_4_3.setText(Double.toString(Integer.parseInt(label2_4_1.getText()) * priceIce14 * 2.5));
			}
		}
		
		else if(e.getSource() == button2_5_3 && Integer.parseInt(label2_5_1.getText()) < 15){
			label2_5_1.setText(Integer.toString(Integer.parseInt(label2_5_1.getText()) + 1));
			if(radiobutton2_5_1.isSelected()){
				label2_5_3.setText(Double.toString(Integer.parseInt(label2_5_1.getText()) * priceIce15));
			}
			else if(radiobutton2_5_2.isSelected()){
				label2_5_3.setText(Double.toString(Integer.parseInt(label2_5_1.getText()) * priceIce15 * 1.7));
			}
			else if(radiobutton2_5_3.isSelected()){
				label2_5_3.setText(Double.toString(Integer.parseInt(label2_5_1.getText()) * priceIce15 * 2.5));
			}
		}
		
		else if(e.getSource() == button2_5_2 && Integer.parseInt(label2_5_1.getText()) > 0){
			label2_5_1.setText(Integer.toString(Integer.parseInt(label2_5_1.getText()) - 1));
			if(radiobutton2_5_1.isSelected()){
				label2_5_3.setText(Double.toString(Integer.parseInt(label2_5_1.getText()) * priceIce15));
			}
			else if(radiobutton2_5_2.isSelected()){
				label2_5_3.setText(Double.toString(Integer.parseInt(label2_5_1.getText()) * priceIce15 * 1.7));
			}
			else if(radiobutton2_5_3.isSelected()){
				label2_5_3.setText(Double.toString(Integer.parseInt(label2_5_1.getText()) * priceIce15 * 2.5));
			}
		}
		
		else if(e.getSource() == button2_6_3 && Integer.parseInt(label2_6_1.getText()) < 15){
			label2_6_1.setText(Integer.toString(Integer.parseInt(label2_6_1.getText()) + 1));
			if(radiobutton2_6_1.isSelected()){
				label2_6_3.setText(Double.toString(Integer.parseInt(label2_6_1.getText()) * priceIce16));
			}
			else if(radiobutton2_6_2.isSelected()){
				label2_6_3.setText(Double.toString(Integer.parseInt(label2_6_1.getText()) * priceIce16 * 1.7));
			}
			else if(radiobutton2_6_3.isSelected()){
				label2_6_3.setText(Double.toString(Integer.parseInt(label2_6_1.getText()) * priceIce16 * 2.5));
			}
		}
		
		else if(e.getSource() == button2_6_2 && Integer.parseInt(label2_6_1.getText()) > 0){
			label2_6_1.setText(Integer.toString(Integer.parseInt(label2_6_1.getText()) - 1));
			if(radiobutton2_6_1.isSelected()){
				label2_6_3.setText(Double.toString(Integer.parseInt(label2_6_1.getText()) * priceIce16));
			}
			else if(radiobutton2_6_2.isSelected()){
				label2_6_3.setText(Double.toString(Integer.parseInt(label2_6_1.getText()) * priceIce16 * 1.7));
			}
			else if(radiobutton2_6_3.isSelected()){
				label2_6_3.setText(Double.toString(Integer.parseInt(label2_6_1.getText()) * priceIce16 * 2.5));
			}
		}
		
		
	}

	private void setPanel1_1(){
		setRadioButtonInPanel1_1();
		setButtonInPanel1_1();
		setIconInPanel1_1();
		addListenerInPanel1_1();
		setPriceTagInPanel1_1();
	}
	
	private void setPriceTagInPanel1_1(){
		label1_1_2.setFont(new Font("SansSerif", Font.BOLD, 19));
		label1_1_2.setForeground(Color.red);
		label1_1_2.setOpaque(false);
		label1_1_2.setBounds(370, 200, 30, 30);
		label1_1_2.setFocusable(false);
		label1_1_2.setHorizontalAlignment(JTextField.CENTER);
		panel1_1.add(label1_1_2);
		
		label1_1_3.setFont(new Font("SansSerif", Font.BOLD, 19));
		label1_1_3.setForeground(Color.cyan);
		label1_1_3.setOpaque(false);
		label1_1_3.setBounds(410, 200, 80, 30);
		label1_1_3.setFocusable(false);
		panel1_1.add(label1_1_3);
	}
	
	private void addListenerInPanel1_1(){
		button1_1_2.addActionListener(this);
		button1_1_3.addActionListener(this);
		radiobutton1_1_1.addActionListener(this);
		radiobutton1_1_2.addActionListener(this);
		radiobutton1_1_3.addActionListener(this);
		button1_1_1.addActionListener(this);
	}
	
	private void setIconInPanel1_1(){
		i1_1 = new ImageIcon("vegpizza1.jpg");
		label1_1.setIcon(i1_1);
		label1_1.setBounds(50,60,300,195);
		panel1_1.add(label1_1);
	}

	private void setButtonInPanel1_1(){
		button1_1_1.setFont(new Font("SansSerif", Font.BOLD, 19));
		button1_1_1.setBackground(new Color(46, 158, 46));
		button1_1_1.setForeground(Color.white);
		button1_1_1.setBounds(350, 270, 150, 60);
		button1_1_1.setFocusable(false);
		button1_1_1.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button1_1_1.setBorderPainted(true);
		panel1_1.add(button1_1_1);
		
		button1_1_2.setFont(new Font("SansSerif", Font.BOLD, 19));
		button1_1_2.setBackground(Color.black);
		button1_1_2.setForeground(Color.white);
		button1_1_2.setBounds(80, 290, 30, 30);
		button1_1_2.setFocusable(false);
		button1_1_2.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button1_1_2.setBorderPainted(true);
		panel1_1.add(button1_1_2);
		
		button1_1_3.setFont(new Font("SansSerif", Font.BOLD, 19));
		button1_1_3.setBackground(Color.black);
		button1_1_3.setForeground(Color.white);
		button1_1_3.setBounds(180, 290, 30, 30);
		button1_1_3.setFocusable(false);
		button1_1_3.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button1_1_3.setBorderPainted(true);
		panel1_1.add(button1_1_3);
		
		button1_1_4.setFont(new Font("Arial", Font.BOLD, 19));
		button1_1_4.setForeground(Color.white);
		button1_1_4.setBackground(Color.black);
		button1_1_4.setBounds(20, 20, 40, 40);
		button1_1_4.setFocusable(false);
		button1_1_4.setOpaque(false);
		button1_1_4.setBorder(null);
		button1_1_4.setBorderPainted(false);
		button1_1_4.setFocusable(false);
		panel1_1.add(button1_1_4);
		
		label1_1_1.setFont(new Font("SansSerif", Font.BOLD, 19));
		label1_1_1.setBackground(Color.white);
		label1_1_1.setForeground(Color.black);
		label1_1_1.setOpaque(true);
		label1_1_1.setBounds(120, 290, 50, 30);
		label1_1_1.setFocusable(false);
		label1_1_1.setHorizontalAlignment(JTextField.CENTER);
		panel1_1.add(label1_1_1);
		
	}


	private void setRadioButtonInPanel1_1(){
		radiobutton1_1_1.setText("regular");
		radiobutton1_1_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton1_1_1.setBounds(380, 60, 100, 30);
		radiobutton1_1_1.setForeground(Color.white);
		radiobutton1_1_1.setFocusable(false);
		radiobutton1_1_1.setOpaque(false);
		
		radiobutton1_1_2.setText("medium");
		radiobutton1_1_2.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton1_1_2.setBounds(380, 100, 100, 30);
		radiobutton1_1_2.setForeground(Color.white);
		radiobutton1_1_2.setFocusable(false);
		radiobutton1_1_2.setOpaque(false);
		
		radiobutton1_1_3.setText("large");
		radiobutton1_1_3.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton1_1_3.setBounds(380, 140, 100, 30);
		radiobutton1_1_3.setForeground(Color.white);
		radiobutton1_1_3.setFocusable(false);
		radiobutton1_1_3.setOpaque(false);
		
		bug1_1.add(radiobutton1_1_1);
		bug1_1.add(radiobutton1_1_2);
		bug1_1.add(radiobutton1_1_3);
		
		panel1_1.add(radiobutton1_1_1);
		panel1_1.add(radiobutton1_1_2);
		panel1_1.add(radiobutton1_1_3);

	}
	
	private void setPanel1_2(){
		setRadioButtonInPanel1_2();
		setButtonInPanel1_2();
		setIconInPanel1_2();
		addListenerInPanel1_2();
		setPriceTagInPanel1_2();
	}
	
	private void setPriceTagInPanel1_2(){
		label1_2_2.setFont(new Font("SansSerif", Font.BOLD, 19));
		label1_2_2.setForeground(Color.red);
		label1_2_2.setOpaque(false);
		label1_2_2.setBounds(370, 200, 30, 30);
		label1_2_2.setFocusable(false);
		label1_2_2.setHorizontalAlignment(JTextField.CENTER);
		panel1_2.add(label1_2_2);
		
		label1_2_3.setFont(new Font("SansSerif", Font.BOLD, 19));
		label1_2_3.setForeground(Color.cyan);
		label1_2_3.setOpaque(false);
		label1_2_3.setBounds(410, 200, 80, 30);
		label1_2_3.setFocusable(false);
		panel1_2.add(label1_2_3);
	}
	
	private void addListenerInPanel1_2(){
		button1_2_2.addActionListener(this);
		button1_2_3.addActionListener(this);
		radiobutton1_2_1.addActionListener(this);
		radiobutton1_2_2.addActionListener(this);
		radiobutton1_2_3.addActionListener(this);
		button1_2_1.addActionListener(this);
	}
	
	private void setIconInPanel1_2(){
		i1_2 = new ImageIcon("vegpizza2.jpg");
		label1_2.setIcon(i1_2);
		label1_2.setBounds(50,60,300,195);
		panel1_2.add(label1_2);
	}
	
	private void setButtonInPanel1_2(){
		button1_2_1.setFont(new Font("SansSerif", Font.BOLD, 19));
		button1_2_1.setBackground(new Color(46, 158, 46));
		button1_2_1.setForeground(Color.white);
		button1_2_1.setBounds(350, 270, 150, 60);
		button1_2_1.setFocusable(false);
		button1_2_1.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button1_2_1.setBorderPainted(true);
		panel1_2.add(button1_2_1);
		
		button1_2_2.setFont(new Font("SansSerif", Font.BOLD, 19));
		button1_2_2.setBackground(Color.black);
		button1_2_2.setForeground(Color.white);
		button1_2_2.setBounds(80, 290, 30, 30);
		button1_2_2.setFocusable(false);
		button1_2_2.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button1_2_2.setBorderPainted(true);
		panel1_2.add(button1_2_2);
		
		button1_2_3.setFont(new Font("SansSerif", Font.BOLD, 19));
		button1_2_3.setBackground(Color.black);
		button1_2_3.setForeground(Color.white);
		button1_2_3.setBounds(180, 290, 30, 30);
		button1_2_3.setFocusable(false);
		button1_2_3.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button1_2_3.setBorderPainted(true);
		panel1_2.add(button1_2_3);
		
		button1_2_4.setFont(new Font("Arial", Font.BOLD, 19));
		button1_2_4.setForeground(Color.white);
		button1_2_4.setBackground(Color.black);
		button1_2_4.setBounds(20, 20, 40, 40);
		button1_2_4.setFocusable(false);
		button1_2_4.setOpaque(false);
		button1_2_4.setBorder(null);
		button1_2_4.setBorderPainted(false);
		button1_2_4.setFocusable(false);
		panel1_2.add(button1_2_4);
		
		label1_2_1.setFont(new Font("SansSerif", Font.BOLD, 19));
		label1_2_1.setBackground(Color.white);
		label1_2_1.setForeground(Color.black);
		label1_2_1.setOpaque(true);
		label1_2_1.setBounds(120, 290, 50, 30);
		label1_2_1.setFocusable(false);
		label1_2_1.setHorizontalAlignment(JTextField.CENTER);
		panel1_2.add(label1_2_1);
		
	}
	


	private void setRadioButtonInPanel1_2(){
		radiobutton1_2_1.setText("regular");
		radiobutton1_2_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton1_2_1.setBounds(380, 60, 100, 30);
		radiobutton1_2_1.setForeground(Color.white);
		radiobutton1_2_1.setFocusable(false);
		radiobutton1_2_1.setOpaque(false);
		
		radiobutton1_2_2.setText("medium");
		radiobutton1_2_2.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton1_2_2.setBounds(380, 100, 100, 30);
		radiobutton1_2_2.setForeground(Color.white);
		radiobutton1_2_2.setFocusable(false);
		radiobutton1_2_2.setOpaque(false);
		
		radiobutton1_2_3.setText("large");
		radiobutton1_2_3.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton1_2_3.setBounds(380, 140, 100, 30);
		radiobutton1_2_3.setForeground(Color.white);
		radiobutton1_2_3.setFocusable(false);
		radiobutton1_2_3.setOpaque(false);
		
		bug1_2.add(radiobutton1_2_1);
		bug1_2.add(radiobutton1_2_2);
		bug1_2.add(radiobutton1_2_3);
		
		panel1_2.add(radiobutton1_2_1);
		panel1_2.add(radiobutton1_2_2);
		panel1_2.add(radiobutton1_2_3);

	}
	
	private void setPanel1_3(){
		setRadioButtonInPanel1_3();
		setButtonInPanel1_3();
		setIconInPanel1_3();
		addListenerInPanel1_3();
		setPriceTagInPanel1_3();
	}
	
	private void setPriceTagInPanel1_3(){
		label1_3_2.setFont(new Font("SansSerif", Font.BOLD, 19));
		label1_3_2.setForeground(Color.red);
		label1_3_2.setOpaque(false);
		label1_3_2.setBounds(370, 200, 30, 30);
		label1_3_2.setFocusable(false);
		label1_3_2.setHorizontalAlignment(JTextField.CENTER);
		panel1_3.add(label1_3_2);
		
		label1_3_3.setFont(new Font("SansSerif", Font.BOLD, 19));
		label1_3_3.setForeground(Color.cyan);
		label1_3_3.setOpaque(false);
		label1_3_3.setBounds(410, 200, 80, 30);
		label1_3_3.setFocusable(false);
		panel1_3.add(label1_3_3);
	}
	
	private void addListenerInPanel1_3(){
		button1_3_2.addActionListener(this);
		button1_3_3.addActionListener(this);
		radiobutton1_3_1.addActionListener(this);
		radiobutton1_3_2.addActionListener(this);
		radiobutton1_3_3.addActionListener(this);
		button1_3_1.addActionListener(this);
	}

	private void setIconInPanel1_3(){
		i1_3 = new ImageIcon("vegpizza3.jpg");
		label1_3.setIcon(i1_3);
		label1_3.setBounds(50,60,300,195);
		panel1_3.add(label1_3);
	}

	private void setButtonInPanel1_3(){
		button1_3_1.setFont(new Font("SansSerif", Font.BOLD, 19));
		button1_3_1.setBackground(new Color(46, 158, 46));
		button1_3_1.setForeground(Color.white);
		button1_3_1.setBounds(350, 270, 150, 60);
		button1_3_1.setFocusable(false);
		button1_3_1.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button1_3_1.setBorderPainted(true);
		panel1_3.add(button1_3_1);
		
		button1_3_2.setFont(new Font("SansSerif", Font.BOLD, 19));
		button1_3_2.setBackground(Color.black);
		button1_3_2.setForeground(Color.white);
		button1_3_2.setBounds(80, 290, 30, 30);
		button1_3_2.setFocusable(false);
		button1_3_2.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button1_3_2.setBorderPainted(true);
		panel1_3.add(button1_3_2);
		
		button1_3_3.setFont(new Font("SansSerif", Font.BOLD, 19));
		button1_3_3.setBackground(Color.black);
		button1_3_3.setForeground(Color.white);
		button1_3_3.setBounds(180, 290, 30, 30);
		button1_3_3.setFocusable(false);
		button1_3_3.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button1_3_3.setBorderPainted(true);
		panel1_3.add(button1_3_3);
		
		button1_3_4.setFont(new Font("Arial", Font.BOLD, 19));
		button1_3_4.setForeground(Color.white);
		button1_3_4.setBackground(Color.black);
		button1_3_4.setBounds(20, 20, 40, 40);
		button1_3_4.setFocusable(false);
		button1_3_4.setOpaque(false);
		button1_3_4.setBorder(null);
		button1_3_4.setBorderPainted(false);
		button1_3_4.setFocusable(false);
		panel1_3.add(button1_3_4);
		
		label1_3_1.setFont(new Font("SansSerif", Font.BOLD, 19));
		label1_3_1.setBackground(Color.white);
		label1_3_1.setForeground(Color.black);
		label1_3_1.setOpaque(true);
		label1_3_1.setBounds(120, 290, 50, 30);
		label1_3_1.setFocusable(false);
		label1_3_1.setHorizontalAlignment(JTextField.CENTER);
		panel1_3.add(label1_3_1);
		
	}

	private void setRadioButtonInPanel1_3(){
		radiobutton1_3_1.setText("regular");
		radiobutton1_3_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton1_3_1.setBounds(380, 60, 100, 30);
		radiobutton1_3_1.setForeground(Color.white);
		radiobutton1_3_1.setFocusable(false);
		radiobutton1_3_1.setOpaque(false);
		
		radiobutton1_3_2.setText("medium");
		radiobutton1_3_2.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton1_3_2.setBounds(380, 100, 100, 30);
		radiobutton1_3_2.setForeground(Color.white);
		radiobutton1_3_2.setFocusable(false);
		radiobutton1_3_2.setOpaque(false);
		
		radiobutton1_3_3.setText("large");
		radiobutton1_3_3.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton1_3_3.setBounds(380, 140, 100, 30);
		radiobutton1_3_3.setForeground(Color.white);
		radiobutton1_3_3.setFocusable(false);
		radiobutton1_3_3.setOpaque(false);
		
		bug1_3.add(radiobutton1_3_1);
		bug1_3.add(radiobutton1_3_2);
		bug1_3.add(radiobutton1_3_3);
		
		panel1_3.add(radiobutton1_3_1);
		panel1_3.add(radiobutton1_3_2);
		panel1_3.add(radiobutton1_3_3);

	}
	
	private void setPanel1_4(){
		setRadioButtonInPanel1_4();
		setButtonInPanel1_4();
		setIconInPanel1_4();
		addListenerInPanel1_4();
		setPriceTagInPanel1_4();
	}
	
	private void setPriceTagInPanel1_4(){
		label1_4_2.setFont(new Font("SansSerif", Font.BOLD, 19));
		label1_4_2.setForeground(Color.red);
		label1_4_2.setOpaque(false);
		label1_4_2.setBounds(370, 200, 30, 30);
		label1_4_2.setFocusable(false);
		label1_4_2.setHorizontalAlignment(JTextField.CENTER);
		panel1_4.add(label1_4_2);
		
		label1_4_3.setFont(new Font("SansSerif", Font.BOLD, 19));
		label1_4_3.setForeground(Color.cyan);
		label1_4_3.setOpaque(false);
		label1_4_3.setBounds(410, 200, 80, 30);
		label1_4_3.setFocusable(false);
		panel1_4.add(label1_4_3);
	}
	
	private void addListenerInPanel1_4(){
		button1_4_2.addActionListener(this);
		button1_4_3.addActionListener(this);
		radiobutton1_4_1.addActionListener(this);
		radiobutton1_4_2.addActionListener(this);
		radiobutton1_4_3.addActionListener(this);
		button1_4_1.addActionListener(this);
	}

	private void setIconInPanel1_4(){
		i1_4 = new ImageIcon("vegpizza4.jpg");
		label1_4.setIcon(i1_4);
		label1_4.setBounds(50,60,300,195);
		panel1_4.add(label1_4);
	}

	private void setButtonInPanel1_4(){
		button1_4_1.setFont(new Font("SansSerif", Font.BOLD, 19));
		button1_4_1.setBackground(new Color(46, 158, 46));
		button1_4_1.setForeground(Color.white);
		button1_4_1.setBounds(350, 270, 150, 60);
		button1_4_1.setFocusable(false);
		button1_4_1.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button1_4_1.setBorderPainted(true);
		panel1_4.add(button1_4_1);
		
		button1_4_2.setFont(new Font("SansSerif", Font.BOLD, 19));
		button1_4_2.setBackground(Color.black);
		button1_4_2.setForeground(Color.white);
		button1_4_2.setBounds(80, 290, 30, 30);
		button1_4_2.setFocusable(false);
		button1_4_2.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button1_4_2.setBorderPainted(true);
		panel1_4.add(button1_4_2);
		
		button1_4_3.setFont(new Font("SansSerif", Font.BOLD, 19));
		button1_4_3.setBackground(Color.black);
		button1_4_3.setForeground(Color.white);
		button1_4_3.setBounds(180, 290, 30, 30);
		button1_4_3.setFocusable(false);
		button1_4_3.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button1_4_3.setBorderPainted(true);
		panel1_4.add(button1_4_3);
		
		button1_4_4.setFont(new Font("Arial", Font.BOLD, 19));
		button1_4_4.setForeground(Color.white);
		button1_4_4.setBackground(Color.black);
		button1_4_4.setBounds(20, 20, 40, 40);
		button1_4_4.setFocusable(false);
		button1_4_4.setOpaque(false);
		button1_4_4.setBorder(null);
		button1_4_4.setBorderPainted(false);
		button1_4_4.setFocusable(false);
		panel1_4.add(button1_4_4);
		
		label1_4_1.setFont(new Font("SansSerif", Font.BOLD, 19));
		label1_4_1.setBackground(Color.white);
		label1_4_1.setForeground(Color.black);
		label1_4_1.setOpaque(true);
		label1_4_1.setBounds(120, 290, 50, 30);
		label1_4_1.setFocusable(false);
		label1_4_1.setHorizontalAlignment(JTextField.CENTER);
		panel1_4.add(label1_4_1);
		
	}

	private void setRadioButtonInPanel1_4(){
		radiobutton1_4_1.setText("regular");
		radiobutton1_4_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton1_4_1.setBounds(380, 60, 100, 30);
		radiobutton1_4_1.setForeground(Color.white);
		radiobutton1_4_1.setFocusable(false);
		radiobutton1_4_1.setOpaque(false);
		
		radiobutton1_4_2.setText("medium");
		radiobutton1_4_2.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton1_4_2.setBounds(380, 100, 100, 30);
		radiobutton1_4_2.setForeground(Color.white);
		radiobutton1_4_2.setFocusable(false);
		radiobutton1_4_2.setOpaque(false);
		
		radiobutton1_4_3.setText("large");
		radiobutton1_4_3.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton1_4_3.setBounds(380, 140, 100, 30);
		radiobutton1_4_3.setForeground(Color.white);
		radiobutton1_4_3.setFocusable(false);
		radiobutton1_4_3.setOpaque(false);
		
		bug1_4.add(radiobutton1_4_1);
		bug1_4.add(radiobutton1_4_2);
		bug1_4.add(radiobutton1_4_3);
		
		panel1_4.add(radiobutton1_4_1);
		panel1_4.add(radiobutton1_4_2);
		panel1_4.add(radiobutton1_4_3);

	}
	
	private void setPanel1_5(){
		setRadioButtonInPanel1_5();
		setButtonInPanel1_5();
		setIconInPanel1_5();
		addListenerInPanel1_5();
		setPriceTagInPanel1_5();
	}
	
	private void setPriceTagInPanel1_5(){
		label1_5_2.setFont(new Font("SansSerif", Font.BOLD, 19));
		label1_5_2.setForeground(Color.red);
		label1_5_2.setOpaque(false);
		label1_5_2.setBounds(370, 200, 30, 30);
		label1_5_2.setFocusable(false);
		label1_5_2.setHorizontalAlignment(JTextField.CENTER);
		panel1_5.add(label1_5_2);
		
		label1_5_3.setFont(new Font("SansSerif", Font.BOLD, 19));
		label1_5_3.setForeground(Color.cyan);
		label1_5_3.setOpaque(false);
		label1_5_3.setBounds(410, 200, 80, 30);
		label1_5_3.setFocusable(false);
		panel1_5.add(label1_5_3);
	}
	
	private void addListenerInPanel1_5(){
		button1_5_2.addActionListener(this);
		button1_5_3.addActionListener(this);
		radiobutton1_5_1.addActionListener(this);
		radiobutton1_5_2.addActionListener(this);
		radiobutton1_5_3.addActionListener(this);
		button1_5_1.addActionListener(this);
	}
	
	private void setIconInPanel1_5(){
		i1_5 = new ImageIcon("vegpizza5.jpg");
		label1_5.setIcon(i1_5);
		label1_5.setBounds(50,60,300,195);
		panel1_5.add(label1_5);
	}
	
	private void setButtonInPanel1_5(){
		button1_5_1.setFont(new Font("SansSerif", Font.BOLD, 19));
		button1_5_1.setBackground(new Color(46, 158, 46));
		button1_5_1.setForeground(Color.white);
		button1_5_1.setBounds(350, 270, 150, 60);
		button1_5_1.setFocusable(false);
		button1_5_1.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button1_5_1.setBorderPainted(true);
		panel1_5.add(button1_5_1);
		
		button1_5_2.setFont(new Font("SansSerif", Font.BOLD, 19));
		button1_5_2.setBackground(Color.black);
		button1_5_2.setForeground(Color.white);
		button1_5_2.setBounds(80, 290, 30, 30);
		button1_5_2.setFocusable(false);
		button1_5_2.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button1_5_2.setBorderPainted(true);
		panel1_5.add(button1_5_2);
		
		button1_5_3.setFont(new Font("SansSerif", Font.BOLD, 19));
		button1_5_3.setBackground(Color.black);
		button1_5_3.setForeground(Color.white);
		button1_5_3.setBounds(180, 290, 30, 30);
		button1_5_3.setFocusable(false);
		button1_5_3.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button1_5_3.setBorderPainted(true);
		panel1_5.add(button1_5_3);
		
		button1_5_4.setFont(new Font("Arial", Font.BOLD, 19));
		button1_5_4.setForeground(Color.white);
		button1_5_4.setBackground(Color.black);
		button1_5_4.setBounds(20, 20, 40, 40);
		button1_5_4.setFocusable(false);
		button1_5_4.setOpaque(false);
		button1_5_4.setBorder(null);
		button1_5_4.setBorderPainted(false);
		button1_5_4.setFocusable(false);
		panel1_5.add(button1_5_4);
		
		label1_5_1.setFont(new Font("SansSerif", Font.BOLD, 19));
		label1_5_1.setBackground(Color.white);
		label1_5_1.setForeground(Color.black);
		label1_5_1.setOpaque(true);
		label1_5_1.setBounds(120, 290, 50, 30);
		label1_5_1.setFocusable(false);
		label1_5_1.setHorizontalAlignment(JTextField.CENTER);
		panel1_5.add(label1_5_1);
		
	}

	private void setRadioButtonInPanel1_5(){
		radiobutton1_5_1.setText("regular");
		radiobutton1_5_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton1_5_1.setBounds(380, 60, 100, 30);
		radiobutton1_5_1.setForeground(Color.white);
		radiobutton1_5_1.setFocusable(false);
		radiobutton1_5_1.setOpaque(false);
		
		radiobutton1_5_2.setText("medium");
		radiobutton1_5_2.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton1_5_2.setBounds(380, 100, 100, 30);
		radiobutton1_5_2.setForeground(Color.white);
		radiobutton1_5_2.setFocusable(false);
		radiobutton1_5_2.setOpaque(false);
		
		radiobutton1_5_3.setText("large");
		radiobutton1_5_3.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton1_5_3.setBounds(380, 140, 100, 30);
		radiobutton1_5_3.setForeground(Color.white);
		radiobutton1_5_3.setFocusable(false);
		radiobutton1_5_3.setOpaque(false);
		
		bug1_5.add(radiobutton1_5_1);
		bug1_5.add(radiobutton1_5_2);
		bug1_5.add(radiobutton1_5_3);
		
		panel1_5.add(radiobutton1_5_1);
		panel1_5.add(radiobutton1_5_2);
		panel1_5.add(radiobutton1_5_3);

	}

	private void setPanel1_6(){
		setRadioButtonInPanel1_6();
		setButtonInPanel1_6();
		setIconInPanel1_6();
		addListenerInPanel1_6();
		setPriceTagInPanel1_6();
	}

	private void setPriceTagInPanel1_6(){
		label1_6_2.setFont(new Font("SansSerif", Font.BOLD, 19));
		label1_6_2.setForeground(Color.red);
		label1_6_2.setOpaque(false);
		label1_6_2.setBounds(370, 200, 30, 30);
		label1_6_2.setFocusable(false);
		label1_6_2.setHorizontalAlignment(JTextField.CENTER);
		panel1_6.add(label1_6_2);
		
		label1_6_3.setFont(new Font("SansSerif", Font.BOLD, 19));
		label1_6_3.setForeground(Color.cyan);
		label1_6_3.setOpaque(false);
		label1_6_3.setBounds(410, 200, 80, 30);
		label1_6_3.setFocusable(false);
		panel1_6.add(label1_6_3);
	}

	private void addListenerInPanel1_6(){
		button1_6_2.addActionListener(this);
		button1_6_3.addActionListener(this);
		radiobutton1_6_1.addActionListener(this);
		radiobutton1_6_2.addActionListener(this);
		radiobutton1_6_3.addActionListener(this);
		button1_6_1.addActionListener(this);
	}

	private void setIconInPanel1_6(){
		i1_6 = new ImageIcon("vegpizza6.jpg");
		label1_6.setIcon(i1_6);
		label1_6.setBounds(50,60,300,195);
		panel1_6.add(label1_6);
	}

	private void setButtonInPanel1_6(){
		button1_6_1.setFont(new Font("SansSerif", Font.BOLD, 19));
		button1_6_1.setBackground(new Color(46, 158, 46));
		button1_6_1.setForeground(Color.white);
		button1_6_1.setBounds(350, 270, 150, 60);
		button1_6_1.setFocusable(false);
		button1_6_1.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button1_6_1.setBorderPainted(true);
		panel1_6.add(button1_6_1);
		
		button1_6_2.setFont(new Font("SansSerif", Font.BOLD, 19));
		button1_6_2.setBackground(Color.black);
		button1_6_2.setForeground(Color.white);
		button1_6_2.setBounds(80, 290, 30, 30);
		button1_6_2.setFocusable(false);
		button1_6_2.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button1_6_2.setBorderPainted(true);
		panel1_6.add(button1_6_2);
		
		button1_6_3.setFont(new Font("SansSerif", Font.BOLD, 19));
		button1_6_3.setBackground(Color.black);
		button1_6_3.setForeground(Color.white);
		button1_6_3.setBounds(180, 290, 30, 30);
		button1_6_3.setFocusable(false);
		button1_6_3.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button1_6_3.setBorderPainted(true);
		panel1_6.add(button1_6_3);
		
		button1_6_4.setFont(new Font("Arial", Font.BOLD, 19));
		button1_6_4.setForeground(Color.white);
		button1_6_4.setBackground(Color.black);
		button1_6_4.setBounds(20, 20, 40, 40);
		button1_6_4.setFocusable(false);
		button1_6_4.setOpaque(false);
		button1_6_4.setBorder(null);
		button1_6_4.setBorderPainted(false);
		button1_6_4.setFocusable(false);
		panel1_6.add(button1_6_4);
		
		label1_6_1.setFont(new Font("SansSerif", Font.BOLD, 19));
		label1_6_1.setBackground(Color.white);
		label1_6_1.setForeground(Color.black);
		label1_6_1.setOpaque(true);
		label1_6_1.setBounds(120, 290, 50, 30);
		label1_6_1.setFocusable(false);
		label1_6_1.setHorizontalAlignment(JTextField.CENTER);
		panel1_6.add(label1_6_1);
		
	}

	private void setRadioButtonInPanel1_6(){
		radiobutton1_6_1.setText("regular");
		radiobutton1_6_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton1_6_1.setBounds(380, 60, 100, 30);
		radiobutton1_6_1.setForeground(Color.white);
		radiobutton1_6_1.setFocusable(false);
		radiobutton1_6_1.setOpaque(false);
		
		radiobutton1_6_2.setText("medium");
		radiobutton1_6_2.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton1_6_2.setBounds(380, 100, 100, 30);
		radiobutton1_6_2.setForeground(Color.white);
		radiobutton1_6_2.setFocusable(false);
		radiobutton1_6_2.setOpaque(false);
		
		radiobutton1_6_3.setText("large");
		radiobutton1_6_3.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton1_6_3.setBounds(380, 140, 100, 30);
		radiobutton1_6_3.setForeground(Color.white);
		radiobutton1_6_3.setFocusable(false);
		radiobutton1_6_3.setOpaque(false);
		
		bug1_6.add(radiobutton1_6_1);
		bug1_6.add(radiobutton1_6_2);
		bug1_6.add(radiobutton1_6_3);
		
		panel1_6.add(radiobutton1_6_1);
		panel1_6.add(radiobutton1_6_2);
		panel1_6.add(radiobutton1_6_3);

	}
	//hjdgjabdjabkjdak
	
	
	private void setPanel2_1(){
		setRadioButtonInPanel2_1();
		setButtonInPanel2_1();
		setIconInPanel2_1();
		addListenerInPanel2_1();
		setPriceTagInPanel2_1();
	}
	
	private void setPriceTagInPanel2_1(){
		label2_1_2.setFont(new Font("SansSerif", Font.BOLD, 19));
		label2_1_2.setForeground(Color.red);
		label2_1_2.setOpaque(false);
		label2_1_2.setBounds(370, 200, 30, 30);
		label2_1_2.setFocusable(false);
		label2_1_2.setHorizontalAlignment(JTextField.CENTER);
		panel2_1.add(label2_1_2);
		
		label2_1_3.setFont(new Font("SansSerif", Font.BOLD, 19));
		label2_1_3.setForeground(Color.cyan);
		label2_1_3.setOpaque(false);
		label2_1_3.setBounds(410, 200, 80, 30);
		label2_1_3.setFocusable(false);
		panel2_1.add(label2_1_3);
	}
	
	private void addListenerInPanel2_1(){
		button2_1_2.addActionListener(this);
		button2_1_3.addActionListener(this);
		radiobutton2_1_1.addActionListener(this);
		radiobutton2_1_2.addActionListener(this);
		radiobutton2_1_3.addActionListener(this);
		button2_1_1.addActionListener(this);
	}
	
	private void setIconInPanel2_1(){
		i2_1 = new ImageIcon("nonvegpizza1.jpg");
		label2_1.setIcon(i2_1);
		label2_1.setBounds(50,60,300,195);
		panel2_1.add(label2_1);
	}

	private void setButtonInPanel2_1(){
		button2_1_1.setFont(new Font("SansSerif", Font.BOLD, 19));
		button2_1_1.setBackground(new Color(46, 158, 46));
		button2_1_1.setForeground(Color.white);
		button2_1_1.setBounds(350, 270, 150, 60);
		button2_1_1.setFocusable(false);
		button2_1_1.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button2_1_1.setBorderPainted(true);
		panel2_1.add(button2_1_1);
		
		button2_1_2.setFont(new Font("SansSerif", Font.BOLD, 19));
		button2_1_2.setBackground(Color.black);
		button2_1_2.setForeground(Color.white);
		button2_1_2.setBounds(80, 290, 30, 30);
		button2_1_2.setFocusable(false);
		button2_1_2.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button2_1_2.setBorderPainted(true);
		panel2_1.add(button2_1_2);
		
		button2_1_3.setFont(new Font("SansSerif", Font.BOLD, 19));
		button2_1_3.setBackground(Color.black);
		button2_1_3.setForeground(Color.white);
		button2_1_3.setBounds(180, 290, 30, 30);
		button2_1_3.setFocusable(false);
		button2_1_3.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button2_1_3.setBorderPainted(true);
		panel2_1.add(button2_1_3);
		
		button2_1_4.setFont(new Font("Arial", Font.BOLD, 19));
		button2_1_4.setForeground(Color.white);
		button2_1_4.setBackground(Color.black);
		button2_1_4.setBounds(20, 20, 40, 40);
		button2_1_4.setFocusable(false);
		button2_1_4.setOpaque(false);
		button2_1_4.setBorder(null);
		button2_1_4.setBorderPainted(false);
		button2_1_4.setFocusable(false);
		panel2_1.add(button2_1_4);
	
		label2_1_1.setFont(new Font("SansSerif", Font.BOLD, 19));
		label2_1_1.setBackground(Color.white);
		label2_1_1.setForeground(Color.black);
		label2_1_1.setOpaque(true);
		label2_1_1.setBounds(120, 290, 50, 30);
		label2_1_1.setFocusable(false);
		label2_1_1.setHorizontalAlignment(JTextField.CENTER);
		panel2_1.add(label2_1_1);
		
	}


	private void setRadioButtonInPanel2_1(){
		radiobutton2_1_1.setText("regular");
		radiobutton2_1_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton2_1_1.setBounds(380, 60, 100, 30);
		radiobutton2_1_1.setForeground(Color.white);
		radiobutton2_1_1.setFocusable(false);
		radiobutton2_1_1.setOpaque(false);
		
		radiobutton2_1_2.setText("medium");
		radiobutton2_1_2.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton2_1_2.setBounds(380, 100, 100, 30);
		radiobutton2_1_2.setForeground(Color.white);
		radiobutton2_1_2.setFocusable(false);
		radiobutton2_1_2.setOpaque(false);
		
		radiobutton2_1_3.setText("large");
		radiobutton2_1_3.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton2_1_3.setBounds(380, 140, 100, 30);
		radiobutton2_1_3.setForeground(Color.white);
		radiobutton2_1_3.setFocusable(false);
		radiobutton2_1_3.setOpaque(false);
		
		bug2_1.add(radiobutton2_1_1);
		bug2_1.add(radiobutton2_1_2);
		bug2_1.add(radiobutton2_1_3);
		
		panel2_1.add(radiobutton2_1_1);
		panel2_1.add(radiobutton2_1_2);
		panel2_1.add(radiobutton2_1_3);

	}
	
	private void setPanel2_2(){
		setRadioButtonInPanel2_2();
		setButtonInPanel2_2();
		setIconInPanel2_2();
		addListenerInPanel2_2();
		setPriceTagInPanel2_2();
	}
	
	private void setPriceTagInPanel2_2(){
		label2_2_2.setFont(new Font("SansSerif", Font.BOLD, 19));
		label2_2_2.setForeground(Color.red);
		label2_2_2.setOpaque(false);
		label2_2_2.setBounds(370, 200, 30, 30);
		label2_2_2.setFocusable(false);
		label2_2_2.setHorizontalAlignment(JTextField.CENTER);
		panel2_2.add(label2_2_2);
		
		label2_2_3.setFont(new Font("SansSerif", Font.BOLD, 19));
		label2_2_3.setForeground(Color.cyan);
		label2_2_3.setOpaque(false);
		label2_2_3.setBounds(410, 200, 80, 30);
		label2_2_3.setFocusable(false);
		panel2_2.add(label2_2_3);
	}
	
	private void addListenerInPanel2_2(){
		button2_2_2.addActionListener(this);
		button2_2_3.addActionListener(this);
		radiobutton2_2_1.addActionListener(this);
		radiobutton2_2_2.addActionListener(this);
		radiobutton2_2_3.addActionListener(this);
		button2_2_1.addActionListener(this);
	}
	
	private void setIconInPanel2_2(){
		i2_2 = new ImageIcon("nonvegpizza2.jpg");
		label2_2.setIcon(i2_2);
		label2_2.setBounds(50,60,300,195);
		panel2_2.add(label2_2);
	}
	
	private void setButtonInPanel2_2(){
		button2_2_1.setFont(new Font("SansSerif", Font.BOLD, 19));
		button2_2_1.setBackground(new Color(46, 158, 46));
		button2_2_1.setForeground(Color.white);
		button2_2_1.setBounds(350, 270, 150, 60);
		button2_2_1.setFocusable(false);
		button2_2_1.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button2_2_1.setBorderPainted(true);
		panel2_2.add(button2_2_1);
		
		button2_2_2.setFont(new Font("SansSerif", Font.BOLD, 19));
		button2_2_2.setBackground(Color.black);
		button2_2_2.setForeground(Color.white);
		button2_2_2.setBounds(80, 290, 30, 30);
		button2_2_2.setFocusable(false);
		button2_2_2.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button2_2_2.setBorderPainted(true);
		panel2_2.add(button2_2_2);
		
		button2_2_3.setFont(new Font("SansSerif", Font.BOLD, 19));
		button2_2_3.setBackground(Color.black);
		button2_2_3.setForeground(Color.white);
		button2_2_3.setBounds(180, 290, 30, 30);
		button2_2_3.setFocusable(false);
		button2_2_3.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button2_2_3.setBorderPainted(true);
		panel2_2.add(button2_2_3);
		
		button2_2_4.setFont(new Font("Arial", Font.BOLD, 19));
		button2_2_4.setForeground(Color.white);
		button2_2_4.setBackground(Color.black);
		button2_2_4.setBounds(20, 20, 40, 40);
		button2_2_4.setFocusable(false);
		button2_2_4.setOpaque(false);
		button2_2_4.setBorder(null);
		button2_2_4.setBorderPainted(false);
		button2_2_4.setFocusable(false);
		panel2_2.add(button2_2_4);
		
		label2_2_1.setFont(new Font("SansSerif", Font.BOLD, 19));
		label2_2_1.setBackground(Color.white);
		label2_2_1.setForeground(Color.black);
		label2_2_1.setOpaque(true);
		label2_2_1.setBounds(120, 290, 50, 30);
		label2_2_1.setFocusable(false);
		label2_2_1.setHorizontalAlignment(JTextField.CENTER);
		panel2_2.add(label2_2_1);
		
	}
	


	private void setRadioButtonInPanel2_2(){
		radiobutton2_2_1.setText("regular");
		radiobutton2_2_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton2_2_1.setBounds(380, 60, 100, 30);
		radiobutton2_2_1.setForeground(Color.white);
		radiobutton2_2_1.setFocusable(false);
		radiobutton2_2_1.setOpaque(false);
		
		radiobutton2_2_2.setText("medium");
		radiobutton2_2_2.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton2_2_2.setBounds(380, 100, 100, 30);
		radiobutton2_2_2.setForeground(Color.white);
		radiobutton2_2_2.setFocusable(false);
		radiobutton2_2_2.setOpaque(false);
		
		radiobutton2_2_3.setText("large");
		radiobutton2_2_3.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton2_2_3.setBounds(380, 140, 100, 30);
		radiobutton2_2_3.setForeground(Color.white);
		radiobutton2_2_3.setFocusable(false);
		radiobutton2_2_3.setOpaque(false);
		
		bug2_2.add(radiobutton2_2_1);
		bug2_2.add(radiobutton2_2_2);
		bug2_2.add(radiobutton2_2_3);
		
		panel2_2.add(radiobutton2_2_1);
		panel2_2.add(radiobutton2_2_2);
		panel2_2.add(radiobutton2_2_3);

	}
	
	private void setPanel2_3(){
		setRadioButtonInPanel2_3();
		setButtonInPanel2_3();
		setIconInPanel2_3();
		addListenerInPanel2_3();
		setPriceTagInPanel2_3();
	}
	
	private void setPriceTagInPanel2_3(){
		label2_3_2.setFont(new Font("SansSerif", Font.BOLD, 19));
		label2_3_2.setForeground(Color.red);
		label2_3_2.setOpaque(false);
		label2_3_2.setBounds(370, 200, 30, 30);
		label2_3_2.setFocusable(false);
		label2_3_2.setHorizontalAlignment(JTextField.CENTER);
		panel2_3.add(label2_3_2);
		
		label2_3_3.setFont(new Font("SansSerif", Font.BOLD, 19));
		label2_3_3.setForeground(Color.cyan);
		label2_3_3.setOpaque(false);
		label2_3_3.setBounds(410, 200, 80, 30);
		label2_3_3.setFocusable(false);
		panel2_3.add(label2_3_3);
	}
	
	private void addListenerInPanel2_3(){
		button2_3_2.addActionListener(this);
		button2_3_3.addActionListener(this);
		radiobutton2_3_1.addActionListener(this);
		radiobutton2_3_2.addActionListener(this);
		radiobutton2_3_3.addActionListener(this);
		button2_3_1.addActionListener(this);
	}

	private void setIconInPanel2_3(){
		i2_3 = new ImageIcon("nonvegpizza3.jpg");
		label2_3.setIcon(i2_3);
		label2_3.setBounds(50,60,300,195);
		panel2_3.add(label2_3);
	}

	private void setButtonInPanel2_3(){
		button2_3_1.setFont(new Font("SansSerif", Font.BOLD, 19));
		button2_3_1.setBackground(new Color(46, 158, 46));
		button2_3_1.setForeground(Color.white);
		button2_3_1.setBounds(350, 270, 150, 60);
		button2_3_1.setFocusable(false);
		button2_3_1.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button2_3_1.setBorderPainted(true);
		panel2_3.add(button2_3_1);
		
		button2_3_2.setFont(new Font("SansSerif", Font.BOLD, 19));
		button2_3_2.setBackground(Color.black);
		button2_3_2.setForeground(Color.white);
		button2_3_2.setBounds(80, 290, 30, 30);
		button2_3_2.setFocusable(false);
		button2_3_2.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button2_3_2.setBorderPainted(true);
		panel2_3.add(button2_3_2);
		
		button2_3_3.setFont(new Font("SansSerif", Font.BOLD, 19));
		button2_3_3.setBackground(Color.black);
		button2_3_3.setForeground(Color.white);
		button2_3_3.setBounds(180, 290, 30, 30);
		button2_3_3.setFocusable(false);
		button2_3_3.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button2_3_3.setBorderPainted(true);
		panel2_3.add(button2_3_3);
		
		button2_3_4.setFont(new Font("Arial", Font.BOLD, 19));
		button2_3_4.setForeground(Color.white);
		button2_3_4.setBackground(Color.black);
		button2_3_4.setBounds(20, 20, 40, 40);
		button2_3_4.setFocusable(false);
		button2_3_4.setOpaque(false);
		button2_3_4.setBorder(null);
		button2_3_4.setBorderPainted(false);
		button2_3_4.setFocusable(false);
		panel2_3.add(button2_3_4);
		
		label2_3_1.setFont(new Font("SansSerif", Font.BOLD, 19));
		label2_3_1.setBackground(Color.white);
		label2_3_1.setForeground(Color.black);
		label2_3_1.setOpaque(true);
		label2_3_1.setBounds(120, 290, 50, 30);
		label2_3_1.setFocusable(false);
		label2_3_1.setHorizontalAlignment(JTextField.CENTER);
		panel2_3.add(label2_3_1);
		
	}

	private void setRadioButtonInPanel2_3(){
		radiobutton2_3_1.setText("regular");
		radiobutton2_3_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton2_3_1.setBounds(380, 60, 100, 30);
		radiobutton2_3_1.setForeground(Color.white);
		radiobutton2_3_1.setFocusable(false);
		radiobutton2_3_1.setOpaque(false);
		
		radiobutton2_3_2.setText("medium");
		radiobutton2_3_2.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton2_3_2.setBounds(380, 100, 100, 30);
		radiobutton2_3_2.setForeground(Color.white);
		radiobutton2_3_2.setFocusable(false);
		radiobutton2_3_2.setOpaque(false);
		
		radiobutton2_3_3.setText("large");
		radiobutton2_3_3.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton2_3_3.setBounds(380, 140, 100, 30);
		radiobutton2_3_3.setForeground(Color.white);
		radiobutton2_3_3.setFocusable(false);
		radiobutton2_3_3.setOpaque(false);
		
		bug2_3.add(radiobutton2_3_1);
		bug2_3.add(radiobutton2_3_2);
		bug2_3.add(radiobutton2_3_3);
		
		panel2_3.add(radiobutton2_3_1);
		panel2_3.add(radiobutton2_3_2);
		panel2_3.add(radiobutton2_3_3);

	}
	
	private void setPanel2_4(){
		setRadioButtonInPanel2_4();
		setButtonInPanel2_4();
		setIconInPanel2_4();
		addListenerInPanel2_4();
		setPriceTagInPanel2_4();
	}
	
	private void setPriceTagInPanel2_4(){
		label2_4_2.setFont(new Font("SansSerif", Font.BOLD, 19));
		label2_4_2.setForeground(Color.red);
		label2_4_2.setOpaque(false);
		label2_4_2.setBounds(370, 200, 30, 30);
		label2_4_2.setFocusable(false);
		label2_4_2.setHorizontalAlignment(JTextField.CENTER);
		panel2_4.add(label2_4_2);
		
		label2_4_3.setFont(new Font("SansSerif", Font.BOLD, 19));
		label2_4_3.setForeground(Color.cyan);
		label2_4_3.setOpaque(false);
		label2_4_3.setBounds(410, 200, 80, 30);
		label2_4_3.setFocusable(false);
		panel2_4.add(label2_4_3);
	}
	
	private void addListenerInPanel2_4(){
		button2_4_2.addActionListener(this);
		button2_4_3.addActionListener(this);
		radiobutton2_4_1.addActionListener(this);
		radiobutton2_4_2.addActionListener(this);
		radiobutton2_4_3.addActionListener(this);
		button2_4_1.addActionListener(this);
	}

	private void setIconInPanel2_4(){
		i2_4 = new ImageIcon("nonvegpizza4.jpg");
		label2_4.setIcon(i2_4);
		label2_4.setBounds(50,60,300,195);
		panel2_4.add(label2_4);
	}

	private void setButtonInPanel2_4(){
		button2_4_1.setFont(new Font("SansSerif", Font.BOLD, 19));
		button2_4_1.setBackground(new Color(46, 158, 46));
		button2_4_1.setForeground(Color.white);
		button2_4_1.setBounds(350, 270, 150, 60);
		button2_4_1.setFocusable(false);
		button2_4_1.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button2_4_1.setBorderPainted(true);
		panel2_4.add(button2_4_1);
		
		button2_4_2.setFont(new Font("SansSerif", Font.BOLD, 19));
		button2_4_2.setBackground(Color.black);
		button2_4_2.setForeground(Color.white);
		button2_4_2.setBounds(80, 290, 30, 30);
		button2_4_2.setFocusable(false);
		button2_4_2.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button2_4_2.setBorderPainted(true);
		panel2_4.add(button2_4_2);
		
		button2_4_3.setFont(new Font("SansSerif", Font.BOLD, 19));
		button2_4_3.setBackground(Color.black);
		button2_4_3.setForeground(Color.white);
		button2_4_3.setBounds(180, 290, 30, 30);
		button2_4_3.setFocusable(false);
		button2_4_3.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button2_4_3.setBorderPainted(true);
		panel2_4.add(button2_4_3);
		
		button2_4_4.setFont(new Font("Arial", Font.BOLD, 19));
		button2_4_4.setForeground(Color.white);
		button2_4_4.setBackground(Color.black);
		button2_4_4.setBounds(20, 20, 40, 40);
		button2_4_4.setFocusable(false);
		button2_4_4.setOpaque(false);
		button2_4_4.setBorder(null);
		button2_4_4.setBorderPainted(false);
		button2_4_4.setFocusable(false);
		panel2_4.add(button2_4_4);
		
		label2_4_1.setFont(new Font("SansSerif", Font.BOLD, 19));
		label2_4_1.setBackground(Color.white);
		label2_4_1.setForeground(Color.black);
		label2_4_1.setOpaque(true);
		label2_4_1.setBounds(120, 290, 50, 30);
		label2_4_1.setFocusable(false);
		label2_4_1.setHorizontalAlignment(JTextField.CENTER);
		panel2_4.add(label2_4_1);
		
	}

	private void setRadioButtonInPanel2_4(){
		radiobutton2_4_1.setText("regular");
		radiobutton2_4_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton2_4_1.setBounds(380, 60, 100, 30);
		radiobutton2_4_1.setForeground(Color.white);
		radiobutton2_4_1.setFocusable(false);
		radiobutton2_4_1.setOpaque(false);
		
		radiobutton2_4_2.setText("medium");
		radiobutton2_4_2.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton2_4_2.setBounds(380, 100, 100, 30);
		radiobutton2_4_2.setForeground(Color.white);
		radiobutton2_4_2.setFocusable(false);
		radiobutton2_4_2.setOpaque(false);
		
		radiobutton2_4_3.setText("large");
		radiobutton2_4_3.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton2_4_3.setBounds(380, 140, 100, 30);
		radiobutton2_4_3.setForeground(Color.white);
		radiobutton2_4_3.setFocusable(false);
		radiobutton2_4_3.setOpaque(false);
		
		bug2_4.add(radiobutton2_4_1);
		bug2_4.add(radiobutton2_4_2);
		bug2_4.add(radiobutton2_4_3);
		
		panel2_4.add(radiobutton2_4_1);
		panel2_4.add(radiobutton2_4_2);
		panel2_4.add(radiobutton2_4_3);

	}
	
	private void setPanel2_5(){
		setRadioButtonInPanel2_5();
		setButtonInPanel2_5();
		setIconInPanel2_5();
		addListenerInPanel2_5();
		setPriceTagInPanel2_5();
	}
	
	private void setPriceTagInPanel2_5(){
		label2_5_2.setFont(new Font("SansSerif", Font.BOLD, 19));
		label2_5_2.setForeground(Color.red);
		label2_5_2.setOpaque(false);
		label2_5_2.setBounds(370, 200, 30, 30);
		label2_5_2.setFocusable(false);
		label2_5_2.setHorizontalAlignment(JTextField.CENTER);
		panel2_5.add(label2_5_2);
		
		label2_5_3.setFont(new Font("SansSerif", Font.BOLD, 19));
		label2_5_3.setForeground(Color.cyan);
		label2_5_3.setOpaque(false);
		label2_5_3.setBounds(410, 200, 80, 30);
		label2_5_3.setFocusable(false);
		panel2_5.add(label2_5_3);
	}
	
	private void addListenerInPanel2_5(){
		button2_5_2.addActionListener(this);
		button2_5_3.addActionListener(this);
		radiobutton2_5_1.addActionListener(this);
		radiobutton2_5_2.addActionListener(this);
		radiobutton2_5_3.addActionListener(this);
		button2_5_1.addActionListener(this);
	}
	
	private void setIconInPanel2_5(){
		i2_5 = new ImageIcon("nonvegpizza5.jpg");
		label2_5.setIcon(i2_5);
		label2_5.setBounds(50,60,300,195);
		panel2_5.add(label2_5);
	}
	
	private void setButtonInPanel2_5(){
		button2_5_1.setFont(new Font("SansSerif", Font.BOLD, 19));
		button2_5_1.setBackground(new Color(46, 158, 46));
		button2_5_1.setForeground(Color.white);
		button2_5_1.setBounds(350, 270, 150, 60);
		button2_5_1.setFocusable(false);
		button2_5_1.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button2_5_1.setBorderPainted(true);
		panel2_5.add(button2_5_1);
		
		button2_5_2.setFont(new Font("SansSerif", Font.BOLD, 19));
		button2_5_2.setBackground(Color.black);
		button2_5_2.setForeground(Color.white);
		button2_5_2.setBounds(80, 290, 30, 30);
		button2_5_2.setFocusable(false);
		button2_5_2.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button2_5_2.setBorderPainted(true);
		panel2_5.add(button2_5_2);
		
		button2_5_3.setFont(new Font("SansSerif", Font.BOLD, 19));
		button2_5_3.setBackground(Color.black);
		button2_5_3.setForeground(Color.white);
		button2_5_3.setBounds(180, 290, 30, 30);
		button2_5_3.setFocusable(false);
		button2_5_3.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button2_5_3.setBorderPainted(true);
		panel2_5.add(button2_5_3);
		
		button2_5_4.setFont(new Font("Arial", Font.BOLD, 19));
		button2_5_4.setForeground(Color.white);
		button2_5_4.setBackground(Color.black);
		button2_5_4.setBounds(20, 20, 40, 40);
		button2_5_4.setFocusable(false);
		button2_5_4.setOpaque(false);
		button2_5_4.setBorder(null);
		button2_5_4.setBorderPainted(false);
		button2_5_4.setFocusable(false);
		panel2_5.add(button2_5_4);
		
		label2_5_1.setFont(new Font("SansSerif", Font.BOLD, 19));
		label2_5_1.setBackground(Color.white);
		label2_5_1.setForeground(Color.black);
		label2_5_1.setOpaque(true);
		label2_5_1.setBounds(120, 290, 50, 30);
		label2_5_1.setFocusable(false);
		label2_5_1.setHorizontalAlignment(JTextField.CENTER);
		panel2_5.add(label2_5_1);
		
	}

	private void setRadioButtonInPanel2_5(){
		radiobutton2_5_1.setText("regular");
		radiobutton2_5_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton2_5_1.setBounds(380, 60, 100, 30);
		radiobutton2_5_1.setForeground(Color.white);
		radiobutton2_5_1.setFocusable(false);
		radiobutton2_5_1.setOpaque(false);
		
		radiobutton2_5_2.setText("medium");
		radiobutton2_5_2.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton2_5_2.setBounds(380, 100, 100, 30);
		radiobutton2_5_2.setForeground(Color.white);
		radiobutton2_5_2.setFocusable(false);
		radiobutton2_5_2.setOpaque(false);
		
		radiobutton2_5_3.setText("large");
		radiobutton2_5_3.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton2_5_3.setBounds(380, 140, 100, 30);
		radiobutton2_5_3.setForeground(Color.white);
		radiobutton2_5_3.setFocusable(false);
		radiobutton2_5_3.setOpaque(false);
		
		bug2_5.add(radiobutton2_5_1);
		bug2_5.add(radiobutton2_5_2);
		bug2_5.add(radiobutton2_5_3);
		
		panel2_5.add(radiobutton2_5_1);
		panel2_5.add(radiobutton2_5_2);
		panel2_5.add(radiobutton2_5_3);

	}

	private void setPanel2_6(){
		setRadioButtonInPanel2_6();
		setButtonInPanel2_6();
		setIconInPanel2_6();
		addListenerInPanel2_6();
		setPriceTagInPanel2_6();
	}

	private void setPriceTagInPanel2_6(){
		label2_6_2.setFont(new Font("SansSerif", Font.BOLD, 19));
		label2_6_2.setForeground(Color.red);
		label2_6_2.setOpaque(false);
		label2_6_2.setBounds(370, 200, 30, 30);
		label2_6_2.setFocusable(false);
		label2_6_2.setHorizontalAlignment(JTextField.CENTER);
		panel2_6.add(label2_6_2);
		
		label2_6_3.setFont(new Font("SansSerif", Font.BOLD, 19));
		label2_6_3.setForeground(Color.cyan);
		label2_6_3.setOpaque(false);
		label2_6_3.setBounds(410, 200, 80, 30);
		label2_6_3.setFocusable(false);
		panel2_6.add(label2_6_3);
	}

	private void addListenerInPanel2_6(){
		button2_6_2.addActionListener(this);
		button2_6_3.addActionListener(this);
		radiobutton2_6_1.addActionListener(this);
		radiobutton2_6_2.addActionListener(this);
		radiobutton2_6_3.addActionListener(this);
		button2_6_1.addActionListener(this);
	}

	private void setIconInPanel2_6(){
		i2_6 = new ImageIcon("nonvegpizza6.jpg");
		label2_6.setIcon(i2_6);
		label2_6.setBounds(50,60,300,195);
		panel2_6.add(label2_6);
	}

	private void setButtonInPanel2_6(){
		button2_6_1.setFont(new Font("SansSerif", Font.BOLD, 19));
		button2_6_1.setBackground(new Color(46, 158, 46));
		button2_6_1.setForeground(Color.white);
		button2_6_1.setBounds(350, 270, 150, 60);
		button2_6_1.setFocusable(false);
		button2_6_1.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button2_6_1.setBorderPainted(true);
		panel2_6.add(button2_6_1);
		
		button2_6_2.setFont(new Font("SansSerif", Font.BOLD, 19));
		button2_6_2.setBackground(Color.black);
		button2_6_2.setForeground(Color.white);
		button2_6_2.setBounds(80, 290, 30, 30);
		button2_6_2.setFocusable(false);
		button2_6_2.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button2_6_2.setBorderPainted(true);
		panel2_6.add(button2_6_2);
		
		button2_6_3.setFont(new Font("SansSerif", Font.BOLD, 19));
		button2_6_3.setBackground(Color.black);
		button2_6_3.setForeground(Color.white);
		button2_6_3.setBounds(180, 290, 30, 30);
		button2_6_3.setFocusable(false);
		button2_6_3.setBorder(BorderFactory.createBevelBorder(2, new Color(46, 56, 46),new Color(87, 117, 87)));
		button2_6_3.setBorderPainted(true);
		panel2_6.add(button2_6_3);
		
		button2_6_4.setFont(new Font("Arial", Font.BOLD, 19));
		button2_6_4.setForeground(Color.white);
		button2_6_4.setBackground(Color.black);
		button2_6_4.setBounds(20, 20, 40, 40);
		button2_6_4.setFocusable(false);
		button2_6_4.setOpaque(false);
		button2_6_4.setBorder(null);
		button2_6_4.setBorderPainted(false);
		button2_6_4.setFocusable(false);
		panel2_6.add(button2_6_4);
		
		label2_6_1.setFont(new Font("SansSerif", Font.BOLD, 19));
		label2_6_1.setBackground(Color.white);
		label2_6_1.setForeground(Color.black);
		label2_6_1.setOpaque(true);
		label2_6_1.setBounds(120, 290, 50, 30);
		label2_6_1.setFocusable(false);
		label2_6_1.setHorizontalAlignment(JTextField.CENTER);
		panel2_6.add(label2_6_1);
		
	}

	private void setRadioButtonInPanel2_6(){
		radiobutton2_6_1.setText("regular");
		radiobutton2_6_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton2_6_1.setBounds(380, 60, 100, 30);
		radiobutton2_6_1.setForeground(Color.white);
		radiobutton2_6_1.setFocusable(false);
		radiobutton2_6_1.setOpaque(false);
		
		radiobutton2_6_2.setText("medium");
		radiobutton2_6_2.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton2_6_2.setBounds(380, 100, 100, 30);
		radiobutton2_6_2.setForeground(Color.white);
		radiobutton2_6_2.setFocusable(false);
		radiobutton2_6_2.setOpaque(false);
		
		radiobutton2_6_3.setText("large");
		radiobutton2_6_3.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton2_6_3.setBounds(380, 140, 100, 30);
		radiobutton2_6_3.setForeground(Color.white);
		radiobutton2_6_3.setFocusable(false);
		radiobutton2_6_3.setOpaque(false);
		
		bug2_6.add(radiobutton2_6_1);
		bug2_6.add(radiobutton2_6_2);
		bug2_6.add(radiobutton2_6_3);
		
		panel2_6.add(radiobutton2_6_1);
		panel2_6.add(radiobutton2_6_2);
		panel2_6.add(radiobutton2_6_3);

	}
	

	// kjdjkawjdhakjdojwadoq
	private void setPanel1(){
		panel1.add(panel1_1);
		panel1.add(panel1_2);
		panel1.add(panel1_3);
		panel1.add(panel1_4);
		panel1.add(panel1_5);
		panel1.add(panel1_6);
		
	}
	
	private void setPanel2(){
		panel2.add(panel2_1);
		panel2.add(panel2_2);
		panel2.add(panel2_3);
		panel2.add(panel2_4);
		panel2.add(panel2_5);
		panel2.add(panel2_6);
		
	}

	private void setPanel(){
		setButtonInPanel();
		addButtonsToPanel();
	}

	private void setButtonInPanel(){
		setBoundsToButtonInPanel();
		addListenersInPanel();
	
		button0_1.setFont(new Font("Arial", Font.BOLD, 19));
		button0_1.setBackground(Color.black);
		button0_1.setForeground(Color.white);
		button0_1.setFocusable(false);
		button0_1.setOpaque(true);
		button0_1.setBorderPainted(false);
		button0_1.setBorder(null);
		button0_1.setContentAreaFilled(true);
		
		button0_2.setFont(new Font("Arial", Font.BOLD, 19));
		button0_2.setBackground(Color.white);
		button0_2.setForeground(Color.black);
		button0_2.setFocusable(false);
		button0_2.setOpaque(true);
		button0_2.setBorderPainted(false);
		button0_2.setBorder(null);
		button0_2.setContentAreaFilled(true);

	}
	
	
	private void setBoundsToButtonInPanel(){
		button0_1.setBounds(850, 60, 80, 40);
		button0_2.setBounds(930, 60, 100, 40);
		
	}
	
	private void addListenersInPanel(){
		button0_1.addActionListener(this);
		button0_2.addActionListener(this);
	}
	
	private void addButtonsToPanel(){
		panel.add(button0_1);
		panel.add(button0_2);
	}

}

class MyPanel1p1 extends RoundedPanel{
	
	
	public MyPanel1p1(){
		super(20);
		this.setBounds(0,0,1800,800);
		this.setLayout(null);
		this.setOpaque(false);
		this.setBackground(Color.white);
	}
}

class MyPanel2p1 extends RoundedPanel{
	
	
	public MyPanel2p1(){
		super(20);
		this.setBounds(0,0,1800,800);
		this.setLayout(null);
		this.setOpaque(false);
		this.setBackground(Color.white);
	}
}

class MyPanel1_1 extends RoundedPanel{
	
	
	public MyPanel1_1(){
		super(40);
		this.setBounds(40,30,546,355);
		this.setLayout(null);
		this.setOpaque(false);
		this.setBackground(Color.black);
	}
}

class MyPanel1_2 extends RoundedPanel{
	
	
	public MyPanel1_2(){
		super(40);
		this.setBounds(626,30,546,355);
		this.setLayout(null);
		this.setOpaque(false);
		this.setBackground(Color.black);
	}
}

class MyPanel1_3 extends RoundedPanel{
	
	
	public MyPanel1_3(){
		super(40);
		this.setBounds(1212,30,546,355);
		this.setLayout(null);
		this.setOpaque(false);
		this.setBackground(Color.black);
	}
}

class MyPanel1_4 extends RoundedPanel{
	
	
	public MyPanel1_4(){
		super(40);
		this.setBounds(40,415,546,355);
		this.setLayout(null);
		this.setOpaque(false);
		this.setBackground(Color.black);
	}
}

class MyPanel1_5 extends RoundedPanel{
	
	
	public MyPanel1_5(){
		super(40);
		this.setBounds(626,415,546,355);
		this.setLayout(null);
		this.setOpaque(false);
		this.setBackground(Color.black);
	}
}

class MyPanel1_6 extends RoundedPanel{
	
	
	public MyPanel1_6(){
		super(40);
		this.setBounds(1212,415,546,355);
		this.setLayout(null);
		this.setOpaque(false);
		this.setBackground(Color.black);
	}
}

class MyPanel2_1 extends RoundedPanel{
	
	
	public MyPanel2_1(){
		super(40);
		this.setBounds(40,30,546,355);
		this.setLayout(null);
		this.setOpaque(false);
		this.setBackground(Color.black);
	}
}

class MyPanel2_2 extends RoundedPanel{
	
	
	public MyPanel2_2(){
		super(40);
		this.setBounds(626,30,546,355);
		this.setLayout(null);
		this.setOpaque(false);
		this.setBackground(Color.black);
	}
}

class MyPanel2_3 extends RoundedPanel{
	
	
	public MyPanel2_3(){
		super(40);
		this.setBounds(1212,30,546,355);
		this.setLayout(null);
		this.setOpaque(false);
		this.setBackground(Color.black);
	}
}

class MyPanel2_4 extends RoundedPanel{
	
	
	public MyPanel2_4(){
		super(40);
		this.setBounds(40,415,546,355);
		this.setLayout(null);
		this.setOpaque(false);
		this.setBackground(Color.black);
	}
}

class MyPanel2_5 extends RoundedPanel{
	
	
	public MyPanel2_5(){
		super(40);
		this.setBounds(626,415,546,355);
		this.setLayout(null);
		this.setOpaque(false);
		this.setBackground(Color.black);
	}
}

class MyPanel2_6 extends RoundedPanel{
	
	
	public MyPanel2_6(){
		super(40);
		this.setBounds(1212,415,546,355);
		this.setLayout(null);
		this.setOpaque(false);
		this.setBackground(Color.black);
	}
}
