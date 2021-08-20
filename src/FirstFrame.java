import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FirstFrame implements ActionListener{
	JFrame f = new JFrame();
	JPanel panel = new JPanel();
	
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new RoundedPanel(250);
	JPanel panel4 = new RoundedPanel(200);
	
	ImageIcon i1;
	JLabel l1 = new JLabel();
	ImageIcon i2;
	JLabel l2 = new JLabel();
	ImageIcon i3;
	JLabel l3 = new JLabel();
	ImageIcon i4;
	JLabel l4 = new JLabel();
	
	
	ImageIcon i1_1;
	JButton button2_1 = new JButton();
	ImageIcon i1_2;
	JButton button2_2 = new JButton();
	ImageIcon i1_3;
	JButton button2_3 = new JButton();
	ImageIcon i1_4;
	JButton button2_4 = new JButton();
	ImageIcon i1_5;
	JButton button2_5 = new JButton();
	ImageIcon i1_6;
	JButton button2_6 = new JButton();
	
	JLabel label1_1_1 = new JLabel("Pizza");
	JLabel label1_1_2 = new JLabel("Burger");
	JLabel label1_1_3 = new JLabel("Pasta");
	JLabel label1_1_4 = new JLabel("Sides");
	JLabel label1_1_5 = new JLabel("Beverages");
	JLabel label1_1_6 = new JLabel("Ice & Cakes");
	
	JButton cart = new JButton("Go To Cart");
	JButton logout = new JButton("Log Out");
	
	String tname;
	
	FirstFrame(String str){
		tname = str;
		
		panel.setBounds(0, 0, 1950, 1100);
		panel.setLayout(null);
		panel.setVisible(true);
		panel.setBackground(Color.black);
		f.add(panel);
	
		setPanel1();
		
		setPanel3();
		
		setPanel2();

		f.setSize(1950, 1100);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public void setPanel1(){
		i1 = new ImageIcon("nextback.jpg");
		l1.setIcon(i1);
		l1.setBounds(10,10,400,400);
		panel1.add(l1);
		panel1.setBounds(40, 40, 420, 420);
		panel1.setLayout(null);
		panel1.setVisible(true);
		panel1.setBackground(Color.white);
		panel.add(panel1);
	}
	
	public void setPanel3(){
		panel3.setOpaque(false);
		panel3.setBounds(1200, 240, 600, 600);
		panel3.setLayout(null);
		panel3.setVisible(true);
		panel3.setBackground(Color.white);
		setPanel4();
		panel.add(panel3);
	}
	
	public void setPanel4(){
		setButtonInPanel4();
		setLabelInPanel4();
		addListenerInPanel4();
		panel4.setOpaque(false);
		panel4.setBounds(10, 10, 580, 580);
		panel4.setLayout(null);
		panel4.setVisible(true);
		panel4.setBackground(Color.black);
		panel3.add(panel4);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == button2_1){
			new ProductFrame_1(tname);
			f.dispose();
		}
		else if(e.getSource() == button2_2){
			new ProductFrame_2(tname);
			f.dispose();
		}
		else if(e.getSource() == button2_3){
			new ProductFrame_3(tname);
			f.dispose();
		}
		else if(e.getSource() == button2_4){
			new ProductFrame_4(tname);
			f.dispose();
		}
		
		else if(e.getSource() == button2_5){
			new ProductFrame_5(tname);
			f.dispose();
		}
		else if(e.getSource() == button2_6){
			new ProductFrame_6(tname);
			f.dispose();
		}
		
		else if(e.getSource() == cart){
			new BillFrame(tname);
			f.dispose();
		}
		else if(e.getSource() == logout){
			new Final();
			f.dispose();
		}
	}
	
	private void addListenerInPanel4(){
		button2_1.addActionListener(this);
		button2_2.addActionListener(this);
		button2_3.addActionListener(this);
		button2_4.addActionListener(this);
		button2_5.addActionListener(this);
		button2_6.addActionListener(this);
	}
	
	private void setLabelInPanel4(){
		label1_1_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		label1_1_1.setForeground(Color.white);
		label1_1_1.setOpaque(false);
		label1_1_1.setBounds(239, 125, 100, 40);
		label1_1_1.setFocusable(false);
		label1_1_1.setHorizontalAlignment(JTextField.CENTER);
		panel4.add(label1_1_1);
		
		label1_1_2.setFont(new Font("SansSerif", Font.BOLD, 16));
		label1_1_2.setForeground(Color.white);
		label1_1_2.setOpaque(false);
		label1_1_2.setBounds(420, 225, 100, 40);
		label1_1_2.setFocusable(false);
		label1_1_2.setHorizontalAlignment(JTextField.CENTER);
		panel4.add(label1_1_2);
		
		label1_1_3.setFont(new Font("SansSerif", Font.BOLD, 16));
		label1_1_3.setForeground(Color.white);
		label1_1_3.setOpaque(false);
		label1_1_3.setBounds(60, 225, 100, 40);
		label1_1_3.setFocusable(false);
		label1_1_3.setHorizontalAlignment(JTextField.CENTER);
		panel4.add(label1_1_3);
		
		label1_1_4.setFont(new Font("SansSerif", Font.BOLD, 16));
		label1_1_4.setForeground(Color.white);
		label1_1_4.setOpaque(false);
		label1_1_4.setBounds(420, 398, 100, 40);
		label1_1_4.setFocusable(false);
		label1_1_4.setHorizontalAlignment(JTextField.CENTER);
		panel4.add(label1_1_4);
		
		label1_1_5.setFont(new Font("SansSerif", Font.BOLD, 16));
		label1_1_5.setForeground(Color.white);
		label1_1_5.setOpaque(false);
		label1_1_5.setBounds(60, 398, 100, 40);
		label1_1_5.setFocusable(false);
		label1_1_5.setHorizontalAlignment(JTextField.CENTER);
		panel4.add(label1_1_5);
		
		label1_1_6.setFont(new Font("SansSerif", Font.BOLD, 16));
		label1_1_6.setForeground(Color.white);
		label1_1_6.setOpaque(false);
		label1_1_6.setBounds(243, 527, 100, 40);
		label1_1_6.setFocusable(false);
		label1_1_6.setHorizontalAlignment(JTextField.CENTER);
		panel4.add(label1_1_6);
		
		i4 = new ImageIcon("spoon.png");
		l4.setIcon(i4);
		l4.setBounds(230,210,150,150);
		panel4.add(l4);
	}
	
	private void setButtonInPanel4(){
		i1_1 =new ImageIcon("menu1.png");
		button2_1.setFocusable(false);
		button2_1.setOpaque(false);
		button2_1.setBorder(null);
		button2_1.setBorderPainted(false);
		button2_1.setContentAreaFilled(false);
		button2_1.setIcon(i1_1);
		button2_1.setBounds(250, 50, 80, 80);
		panel4.add(button2_1);
		
		i1_2 =new ImageIcon("menu2.png");
		button2_2.setFocusable(false);
		button2_2.setOpaque(false);
		button2_2.setBorder(null);
		button2_2.setBorderPainted(false);
		button2_2.setContentAreaFilled(false);
		button2_2.setIcon(i1_2);
		button2_2.setBounds(430, 150, 80, 80);
		panel4.add(button2_2);
		
		i1_3 =new ImageIcon("menu3.png");
		button2_3.setFocusable(false);
		button2_3.setOpaque(false);
		button2_3.setBorder(null);
		button2_3.setBorderPainted(false);
		button2_3.setContentAreaFilled(false);
		button2_3.setIcon(i1_3);
		button2_3.setBounds(70, 150, 80, 80);
		panel4.add(button2_3);
		
		i1_4 =new ImageIcon("menu4.png");
		button2_4.setFocusable(false);
		button2_4.setOpaque(false);
		button2_4.setBorder(null);
		button2_4.setBorderPainted(false);
		button2_4.setContentAreaFilled(false);
		button2_4.setIcon(i1_4);
		button2_4.setBounds(430, 320, 80, 80);
		panel4.add(button2_4);
		
		i1_5 =new ImageIcon("menu5.png");
		button2_5.setFocusable(false);
		button2_5.setOpaque(false);
		button2_5.setBorder(null);
		button2_5.setBorderPainted(false);
		button2_5.setContentAreaFilled(false);
		button2_5.setIcon(i1_5);
		button2_5.setBounds(70, 320, 80, 80);
		panel4.add(button2_5);
		
		i1_6 =new ImageIcon("menu6.png");
		button2_6.setFocusable(false);
		button2_6.setOpaque(false);
		button2_6.setBorder(null);
		button2_6.setBorderPainted(false);
		button2_6.setContentAreaFilled(false);
		button2_6.setIcon(i1_6);
		button2_6.setBounds(250, 450, 80, 80);
		panel4.add(button2_6);
		
	}
	
	public void setPanel2(){
		i2 = new ImageIcon("firstback.jpg");
		l2.setIcon(i2);
		l2.setBounds(5,5,1300,780);
		
		cart.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.darkGray));
		cart.setFocusable(false);
		cart.setBackground(Color.red);
		cart.setForeground(Color.black);
		cart.setBounds(500, 630, 200, 55);
		cart.setFont(new Font("Arial", Font.BOLD, 18));
		cart.addActionListener(this);
		l2.add(cart);
		
		logout.setForeground(Color.black);
		logout.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.darkGray));
		logout.setFocusable(false);
		logout.setBackground(Color.cyan);
		logout.setBounds(100, 630, 200, 55);
		logout.setFont(new Font("Arial", Font.BOLD, 18));
		logout.addActionListener(this);
		l2.add(logout);
		
		
		panel2.add(l2);
		panel2.setBounds(145, 140, 1310, 790);
		panel2.setLayout(null);
		panel2.setVisible(true);
		panel2.setBackground(Color.white);
		panel.add(panel2);
	}
	

}