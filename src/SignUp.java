import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class SignUp implements ActionListener{
	
	JFrame f;
	JPanel panel1 = new JPanel();
	
	JTextField textField1_2_1 = new JTextField();
	JTextField textField1_2_2 = new JTextField();
	JTextField textField1_2_3 = new JTextField();
	JTextField textField1_2_4 = new JTextField();
	JTextField textField1_2_5 = new JTextField();

	JButton button1_2_1= new JButton("ADD");
	
	JLabel label1_2_1 = new JLabel();
	JLabel label1_2_2 = new JLabel();

	
	SignUp(){
		f = new JFrame();
		panel1.setBackground(Color.black);
		panel1.setBounds(0,0,620,700);
		panel1.setLayout(null);
		setPanel1();
		
		f.add(panel1);
		f.setSize(620, 700);
		f.setLocationRelativeTo(null);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				//new Final();
				f.dispose();
				}
		});
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){

		// handling add button
		if(e.getSource() == button1_2_1){
			boolean Vid = true;
			boolean Vpassword = true;
			boolean Vnumber = true;
			String id = textField1_2_1.getText();
			
			Connection connn = null;
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				connn = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "");
				Statement state = connn.createStatement();
				ResultSet rs = state.executeQuery("select * from signup");
				
				while(rs.next()){
					if(id.equals(rs.getString(1))){
						JOptionPane.showMessageDialog(panel1, "Id Already exit");
						textField1_2_1.setText("Create Id");
						Vid = false;
						break;
					}
				}
				connn.close();
			}
			catch(Exception aee){}
			
			String password1 = textField1_2_2.getText();
			String password = textField1_2_3.getText();
			if(Vid){
			if(!password1.equals(password)){
				JOptionPane.showMessageDialog(panel1, "Password Mismatch");
				Vpassword = false;
				textField1_2_2.setText("Create Password");
				textField1_2_3.setText("Re Enter Password");
			}
			}
			
			String number = textField1_2_5.getText();
			if(Vid && Vpassword){
				if(!(number.length() == 10)){
					JOptionPane.showMessageDialog(panel1, "Invalid Number");
					Vnumber = false;
					textField1_2_5.setText("Phone Number");
				}
			}
			
			if(Vid && Vpassword && Vnumber){
			String name = textField1_2_4.getText();
			
			Connection con1 = null;
			PreparedStatement insert = null;
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "");
				insert = con1.prepareStatement("insert into signUp(id, password, name, number) values(?,?,?,?)");
				insert.setString(1, id);
				insert.setString(2, password);
				insert.setString(3, name);
				insert.setString(4, number);
				insert.executeUpdate();
				
				Connection conn = null;
				Statement stmt = null;
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "");
					stmt = conn.createStatement();
      
					String sql = "CREATE TABLE "+name+id+" " +
									"(id INTEGER not NULL AUTO_INCREMENT, " +
									" productname VARCHAR(255), " + 
									" quantity INTEGER, " +
									" price FLOAT(12, 2), " +
									" totalprice FLOAT(7, 2), " +									
									" PRIMARY KEY ( id ))"; 

					stmt.executeUpdate(sql);
					conn.close();
				}
				catch(Exception aee){}
				
				JOptionPane.showMessageDialog(panel1, "Record Added");
				setPanelValue1();
				textField1_2_1.requestFocus();
				con1.close();
			}
			catch(Exception ae){
				
			}
			}
		}
	}
	
	private void setPanel1(){
		setPanelValue1();
		setBoundsInPanel1();
		setbgInPanel1();
		setTextPanel1();
		addInPanel1();
		addActionInPanel1();
	}

	// add listeners to buttons
	private void addActionInPanel1(){
		button1_2_1.addActionListener(this);

	}


	//initializing panel values
	private void setPanelValue1(){
		label1_2_1.setText("Sign Up");
		label1_2_1.setFont(new Font("SansSerif", Font.BOLD, 37));
		label1_2_2.setText("please enter valid number");
		label1_2_2.setFont(new Font("SansSerif", Font.BOLD, 16));
		label1_2_2.setVisible(false);
		textField1_2_1.setText("Create Id");
		textField1_2_1.setFont(new Font("Monospaced", Font.PLAIN, 17));
		textField1_2_2.setText("Create Password");
		textField1_2_2.setFont(new Font("Monospaced", Font.PLAIN, 17));
		textField1_2_3.setText("Re Enter Password");
		textField1_2_3.setFont(new Font("Monospaced", Font.PLAIN, 17));
		textField1_2_4.setText("Name");
		textField1_2_4.setFont(new Font("Monospaced", Font.PLAIN, 17));
		textField1_2_5.setText("Phone Number");
		textField1_2_5.setFont(new Font("Monospaced", Font.PLAIN, 17));
	}

	// setting bounds for all components
	private void setBoundsInPanel1(){
		label1_2_1.setBounds(240, 33, 200, 40);
		label1_2_2.setBounds(200, 33, 400, 40);
		textField1_2_1.setBounds(150, 100, 300, 50);
		textField1_2_2.setBounds(150, 190, 300, 50);
		textField1_2_3.setBounds(150, 280, 300, 50);
		textField1_2_4.setBounds(150, 370, 300, 50);
		textField1_2_5.setBounds(150, 460, 300, 50);

		button1_2_1.setBounds(260, 550, 110, 50);

	}

	// setting background and foreground colors
	private void setbgInPanel1(){
		label1_2_1.setForeground(Color.white);
		label1_2_2.setForeground(Color.red);
		
		textField1_2_1.setForeground(Color.white);
		textField1_2_1.setCaretColor(Color.white);
		
		textField1_2_2.setForeground(Color.white);
		textField1_2_2.setCaretColor(Color.white);
		
		textField1_2_3.setForeground(Color.white);
		textField1_2_3.setCaretColor(Color.white);
		
		textField1_2_4.setForeground(Color.white);
		textField1_2_4.setCaretColor(Color.white);
		
		textField1_2_5.setForeground(Color.white);
		textField1_2_5.setCaretColor(Color.white);
		
		button1_2_1.setForeground(Color.black);

		
		button1_2_1.setBackground(Color.cyan);

	}

	// setting textfield
	private void setTextPanel1(){
		textField1_2_1.setHorizontalAlignment(JTextField.CENTER);
		textField1_2_2.setHorizontalAlignment(JTextField.CENTER);
		textField1_2_3.setHorizontalAlignment(JTextField.CENTER);
		textField1_2_4.setHorizontalAlignment(JTextField.CENTER);
		textField1_2_5.setHorizontalAlignment(JTextField.CENTER);
		
	}
	
	// adding components to data field
	private void addInPanel1(){
		
		textField1_2_1.setOpaque(false);
		textField1_2_2.setOpaque(false);
		textField1_2_3.setOpaque(false);
		textField1_2_4.setOpaque(false);
		textField1_2_5.setOpaque(false);
		
		button1_2_1.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.darkGray));
		button1_2_1.setFocusable(false);

		panel1.add(label1_2_1);
		panel1.add(label1_2_2);
		panel1.add(textField1_2_1);
		panel1.add(textField1_2_2);
		panel1.add(textField1_2_3);
		panel1.add(textField1_2_4);
		panel1.add(textField1_2_5);
		panel1.add(button1_2_1);
			
	}
}