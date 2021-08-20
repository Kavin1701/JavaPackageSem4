import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class ProductFrame_6 implements ActionListener{
	JFrame f;

	String tname;

	JPanel panel = new JPanel();
	JLayeredPane pane = new JLayeredPane();
	JPanel panel1 = new MyPanel1p5();

	JPanel panel1_1 = new MyPanel1_1p6();
	JPanel panel1_2 = new MyPanel1_2p6();
	JPanel panel1_3 = new MyPanel1_3p6();
	JPanel panel1_4 = new MyPanel1_4p6();
	JPanel panel1_5 = new MyPanel1_5p6();
	JPanel panel1_6 = new MyPanel1_6p6();
	
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
	
	final double priceIce1 = 75;
	final double priceIce2 = 99;
	final double priceIce3 = 120;
	final double priceIce4 = 59;
	final double priceIce5 = 99;
	final double priceIce6 = 99;

	JButton button1_1_1 = new JButton("Add to Cart");
	JButton button1_1_2 = new JButton("-");
	JButton button1_1_3 = new JButton("+");
	JButton button1_1_4 = new JButton("||||");
	JLabel label1_1_1 = new JLabel("0");
	JLabel label1_1_2 = new JLabel("Rs.");
	JLabel label1_1_3 = new JLabel("0");
	
	JButton button1_2_1 = new JButton("Add to Cart");
	JButton button1_2_2 = new JButton("-");
	JButton button1_2_3 = new JButton("+");
	JButton button1_2_4 = new JButton("||||");
	JLabel label1_2_1 = new JLabel("0");
	JLabel label1_2_2 = new JLabel("Rs.");
	JLabel label1_2_3 = new JLabel("0");
	
	JButton button1_3_1 = new JButton("Add to Cart");
	JButton button1_3_2 = new JButton("-");
	JButton button1_3_3 = new JButton("+");
	JButton button1_3_4 = new JButton("||||");
	JLabel label1_3_1 = new JLabel("0");
	JLabel label1_3_2 = new JLabel("Rs.");
	JLabel label1_3_3 = new JLabel("0");
	
	JButton button1_4_1 = new JButton("Add to Cart");
	JButton button1_4_2 = new JButton("-");
	JButton button1_4_3 = new JButton("+");
	JButton button1_4_4 = new JButton("||||");
	JLabel label1_4_1 = new JLabel("0");
	JLabel label1_4_2 = new JLabel("Rs.");
	JLabel label1_4_3 = new JLabel("0");
	
	JButton button1_5_1 = new JButton("Add to Cart");
	JButton button1_5_2 = new JButton("-");
	JButton button1_5_3 = new JButton("+");
	JButton button1_5_4 = new JButton("||||");
	JLabel label1_5_1 = new JLabel("0");
	JLabel label1_5_2 = new JLabel("Rs.");
	JLabel label1_5_3 = new JLabel("0");
	
	JButton button1_6_1 = new JButton("Add to Cart");
	JButton button1_6_2 = new JButton("-");
	JButton button1_6_3 = new JButton("+");
	JButton button1_6_4 = new JButton("||||");
	JLabel label1_6_1 = new JLabel("0");
	JLabel label1_6_2 = new JLabel("Rs.");
	JLabel label1_6_3 = new JLabel("0");

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
	
	JLabel label1_1_4 = new JLabel("Vanilla Ice Cream");
	JLabel label1_2_4 = new JLabel("Strawberry Ice Cream");
	JLabel label1_3_4 = new JLabel("Chocolate Ice Cream");
	JLabel label1_4_4 = new JLabel("Brownie Fastasy");
	JLabel label1_5_4 = new JLabel("Butterscotch Mousse Cake");
	JLabel label1_6_4 = new JLabel("Choco Lava Cake");

	JButton back = new JButton("Back");

	ProductFrame_6(String str){
		f = new JFrame();
		tname = str;
		pane.setBounds(50, 130, 1800, 800);
		
		panel.setBounds(0, 0, 1900, 1000);
		panel.setLayout(null);
		panel.setVisible(true);
		panel.setBackground(Color.cyan);
		
		
		setPanel1();

		
		setPanel1_1();
		setPanel1_2();
		setPanel1_3();
		setPanel1_4();
		setPanel1_5();
		setPanel1_6();

		setName();
		
		pane.add(panel1);

		setBack();

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
		
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == back){
			new FirstFrame(tname);
			f.dispose();
		}
		
		if(e.getSource() == button1_1_1){
			String productname = "";
			String quantity = "";
			String price = "";
			String totalprice = "";
			if(radiobutton1_1_1.isSelected()){
				productname = "Vanilla Ice Cream - regular";
				quantity = label1_1_1.getText();
				totalprice = label1_1_3.getText();
			}
			else if(radiobutton1_1_2.isSelected()){
				productname = "Vanilla Ice Cream - medium";
				quantity = label1_1_1.getText();
				totalprice = label1_1_3.getText();
			}
			else if(radiobutton1_1_3.isSelected()){
				productname = "Vanilla Ice Cream - large";
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
				productname = "Strawberry Ice Cream - regular";
				quantity = label1_2_1.getText();
				totalprice = label1_2_3.getText();
			}
			else if(radiobutton1_2_2.isSelected()){
				productname = "Strawberry Ice Cream - medium";
				quantity = label1_2_1.getText();
				totalprice = label1_2_3.getText();
			}
			else if(radiobutton1_2_3.isSelected()){
				productname = "Strawberry Ice Cream - large";
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
				productname = "Chocolate Ice Cream - regular";
				quantity = label1_3_1.getText();
				totalprice = label1_3_3.getText();
			}
			else if(radiobutton1_3_2.isSelected()){
				productname = "Chocolate Ice Cream - medium";
				quantity = label1_3_1.getText();
				totalprice = label1_3_3.getText();
			}
			else if(radiobutton1_3_3.isSelected()){
				productname = "Chocolate Ice Cream - large";
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
				productname = "Brownie Fastasy - regular";
				quantity = label1_4_1.getText();
				totalprice = label1_4_3.getText();
			}
			else if(radiobutton1_4_2.isSelected()){
				productname = "Brownie Fastasy - medium";
				quantity = label1_4_1.getText();
				totalprice = label1_4_3.getText();
			}
			else if(radiobutton1_4_3.isSelected()){
				productname = "Brownie Fastasy - large";
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
				productname = "Butterscotch Mousse Cake - regular";
				quantity = label1_5_1.getText();
				totalprice = label1_5_3.getText();
			}
			else if(radiobutton1_5_2.isSelected()){
				productname = "Butterscotch Mousse Cake - medium";
				quantity = label1_5_1.getText();
				totalprice = label1_5_3.getText();
			}
			else if(radiobutton1_5_3.isSelected()){
				productname = "Butterscotch Mousse Cake - large";
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
				productname = "Choco Lava Cake - regular";
				quantity = label1_6_1.getText();
				totalprice = label1_6_3.getText();
			}
			else if(radiobutton1_6_2.isSelected()){
				productname = "Choco Lava Cake - medium";
				quantity = label1_6_1.getText();
				totalprice = label1_6_3.getText();
			}
			else if(radiobutton1_6_3.isSelected()){
				productname = "Choco Lava Cake - large";
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
		i1_1 = new ImageIcon("ice1.jpg");
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
		i1_2 = new ImageIcon("ice2.jpg");
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
		i1_3 = new ImageIcon("ice3.jpg");
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
		i1_4 = new ImageIcon("cake1.jpg");
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
		i1_5 = new ImageIcon("cake2.jpg");
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
		i1_6 = new ImageIcon("cake3.jpg");
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
	


	private void setPanel1(){
		panel1.add(panel1_1);
		panel1.add(panel1_2);
		panel1.add(panel1_3);
		panel1.add(panel1_4);
		panel1.add(panel1_5);
		panel1.add(panel1_6);
		
	}
}
class MyPanel1p6 extends RoundedPanel{
	
	
	public MyPanel1p6(){
		super(20);
		this.setBounds(0,0,1800,800);
		this.setLayout(null);
		this.setOpaque(false);
		this.setBackground(Color.white);
	}
}


class MyPanel1_1p6 extends RoundedPanel{
	
	
	public MyPanel1_1p6(){
		super(40);
		this.setBounds(40,30,546,355);
		this.setLayout(null);
		this.setOpaque(false);
		this.setBackground(Color.black);
	}
}

class MyPanel1_2p6 extends RoundedPanel{
	
	
	public MyPanel1_2p6(){
		super(40);
		this.setBounds(626,30,546,355);
		this.setLayout(null);
		this.setOpaque(false);
		this.setBackground(Color.black);
	}
}

class MyPanel1_3p6 extends RoundedPanel{
	
	
	public MyPanel1_3p6(){
		super(40);
		this.setBounds(1212,30,546,355);
		this.setLayout(null);
		this.setOpaque(false);
		this.setBackground(Color.black);
	}
}

class MyPanel1_4p6 extends RoundedPanel{
	
	
	public MyPanel1_4p6(){
		super(40);
		this.setBounds(40,415,546,355);
		this.setLayout(null);
		this.setOpaque(false);
		this.setBackground(Color.black);
	}
}

class MyPanel1_5p6 extends RoundedPanel{
	
	
	public MyPanel1_5p6(){
		super(40);
		this.setBounds(626,415,546,355);
		this.setLayout(null);
		this.setOpaque(false);
		this.setBackground(Color.black);
	}
}

class MyPanel1_6p6 extends RoundedPanel{
	
	
	public MyPanel1_6p6(){
		super(40);
		this.setBounds(1212,415,546,355);
		this.setLayout(null);
		this.setOpaque(false);
		this.setBackground(Color.black);
	}
}