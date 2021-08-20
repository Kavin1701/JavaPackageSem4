import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class BillingFrame implements ActionListener{
	JFrame f;
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JLabel label1_1_1 = new JLabel("Billing Here");
	JLabel label1_1_2 = new JLabel("Enter Name");
	JLabel label1_1_3 = new JLabel("Enter ID");
	JLabel label1_1_4 = new JLabel("Total Amount");
	JLabel label1_1_5 = new JLabel("");
	JTextField textField1_1_1 = new JTextField();
	JTextField textField1_1_2 = new JTextField();

	JButton button1_1_1= new JButton("SEARCH");
	JButton button1_1_2= new JButton("PAID");

	JButton back = new JButton();

	JScrollPane sp;
	JTextArea ja;
	
	BillingFrame(){
		f = new JFrame();
		panel.setBounds(0, 0, 1900, 1000);
		panel.setLayout(null);
		panel.setVisible(true);
		panel.setBackground(Color.black);
		
		
		panel1.setBounds(55, 30, 1780, 900);
		panel1.setLayout(null);
		panel1.setVisible(true);
		panel1.setBackground(Color.white);
		
		setPanel1();
		setPanel2();
		
		panel.add(panel1);
		f.add(panel);
		f.setSize(1900, 1000);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	private void setPanel1(){
		setLabel();
		setButton();
		setTextField();
	}
	
	private void setPanel2(){
		panel2.setBounds(200, 300, 1500, 600);
		panel2.setBackground(Color.black);
		ja = new JTextArea(1500, 600);
		ja.setFont(new Font("Arial", Font.BOLD, 20));
		panel2.setLayout(new BorderLayout());
		sp=new JScrollPane(ja);    
		panel2.add(sp);
		panel.add(panel2);
	}
	
	private void setTextField(){
		textField1_1_1.setHorizontalAlignment(JTextField.CENTER);
		textField1_1_1.setOpaque(false);
		textField1_1_1.setForeground(Color.black);
		textField1_1_1.setCaretColor(Color.black);
		textField1_1_1.setFont(new Font("Monospaced", Font.PLAIN, 23));
		textField1_1_1.setBounds(230, 115, 240, 40);
		panel1.add(textField1_1_1);
		
		textField1_1_2.setHorizontalAlignment(JTextField.CENTER);
		textField1_1_2.setOpaque(false);
		textField1_1_2.setForeground(Color.black);
		textField1_1_2.setCaretColor(Color.black);
		textField1_1_2.setFont(new Font("Monospaced", Font.PLAIN, 23));
		textField1_1_2.setBounds(660, 115, 240, 40);
		panel1.add(textField1_1_2);
		
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == button1_1_1){
			String name = textField1_1_1.getText();
			String id = textField1_1_2.getText();
			
			String tname = name + id;
			
			Connection con = null;
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "");
				Statement state = con.createStatement();
				ResultSet rs = state.executeQuery("select * from "+tname);
				
				float total = 0f;
				ja.setText("\nGenerating Bill...........\n\n"
				+"----------------------------------------------------------------------------------------------\n");
				while(rs.next()){
					String c1 = rs.getString(1);
					String c2 = rs.getString(2);
					String c3 = rs.getString(3);
					String c4 = rs.getString(4);
					String c5 = rs.getString(5);
					
					total += Float.parseFloat(c5);

					String r = c1+"   ..   "+c2+"    ->   "+c3+"     *    "+c4+"    =    "+c5+"\n";
					ja.setText(ja.getText()+r);
				}
				con.close();
				ja.setText(ja.getText()+"----------------------------------------------------------------------------------------------\n"+
							"                   Total Amount = Rs. " + Float.toString(total));
				label1_1_5.setText(Float.toString(total));
			}
			catch(Exception aee){}
		}
		
		if(e.getSource() == button1_1_2){
			String name = textField1_1_1.getText();
			String id = textField1_1_2.getText();
			
			String tname = name + id;
			
			Connection conn = null;
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "");
				Statement stmt = conn.createStatement();
				String sql = "DELETE FROM "+tname;
				stmt.executeUpdate(sql);
				
				JOptionPane.showMessageDialog(panel1, "Refreshed");
				ja.setText("");
				
				conn.close();
			}
			catch(Exception aee){}
		}
		
		if(e.getSource() == back){
			new Final();
			f.dispose();
		}
		
	}
	
	private void setButton(){
		button1_1_1.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.darkGray));
		button1_1_1.setFocusable(false);
		button1_1_1.setBackground(Color.red);
		button1_1_1.setForeground(Color.black);
		button1_1_1.setBounds(30, 30, 100, 55);
		button1_1_1.addActionListener(this);
		panel1.add(button1_1_1);
		
		button1_1_2.setForeground(Color.black);
		button1_1_2.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.darkGray));
		button1_1_2.setFocusable(false);
		button1_1_2.setBackground(Color.cyan);
		button1_1_2.setBounds(1650, 30, 100, 55);
		button1_1_2.addActionListener(this);
		panel1.add(button1_1_2);
		
		back.setForeground(Color.black);
		back.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.darkGray));
		back.setFocusable(false);
		back.setBackground(Color.yellow);
		back.setBounds(30, 300, 100, 55);
		back.addActionListener(this);
		panel1.add(back);
	}
	
	
	
	private void setLabel(){
		label1_1_1.setFont(new Font("SansSerif", Font.BOLD, 32));
		label1_1_1.setForeground(Color.black);
		label1_1_1.setOpaque(false);
		label1_1_1.setBounds(750, 20, 200, 40);
		label1_1_1.setFocusable(false);
		label1_1_1.setHorizontalAlignment(JTextField.CENTER);
		panel1.add(label1_1_1);
		
		label1_1_2.setFont(new Font("SansSerif", Font.BOLD, 23));
		label1_1_2.setForeground(Color.black);
		label1_1_2.setOpaque(false);
		label1_1_2.setBounds(50, 120, 200, 30);
		label1_1_2.setFocusable(false);
		label1_1_2.setHorizontalAlignment(JTextField.CENTER);
		panel1.add(label1_1_2);
		
		label1_1_3.setFont(new Font("SansSerif", Font.BOLD, 23));
		label1_1_3.setForeground(Color.black);
		label1_1_3.setOpaque(false);
		label1_1_3.setBounds(500, 120, 200, 30);
		label1_1_3.setFocusable(false);
		label1_1_3.setHorizontalAlignment(JTextField.CENTER);
		panel1.add(label1_1_3);
		
		label1_1_4.setFont(new Font("SansSerif", Font.BOLD, 23));
		label1_1_4.setForeground(Color.black);
		label1_1_4.setOpaque(false);
		label1_1_4.setBounds(1200, 120, 200, 30);
		label1_1_4.setFocusable(false);
		label1_1_4.setHorizontalAlignment(JTextField.CENTER);
		panel1.add(label1_1_4);
		
		label1_1_5.setFont(new Font("SansSerif", Font.BOLD, 23));
		label1_1_5.setForeground(Color.red);
		label1_1_5.setBackground(Color.lightGray);
		label1_1_5.setOpaque(true);
		label1_1_5.setBounds(1400, 115, 200, 40);
		label1_1_5.setFocusable(false);
		label1_1_5.setHorizontalAlignment(JTextField.CENTER);
		panel1.add(label1_1_5);
	}
}
