import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class AdministratorFrame implements ActionListener{
	JFrame f;
	JPanel panel = new JPanel();
	JLayeredPane pane = new JLayeredPane();
	JPanel panel1 = new MyPanel1qq();
	JPanel panel2 = new MyPanel2qq();
	JButton button0_1 = new JButton("Manage Staff");
	JButton button0_2 = new JButton("Finish");
	
	ImageIcon empty_pizza1;
	ImageIcon empty_pizza2;
	ImageIcon full_pizza;
	
	JLabel label1_2_1 = new JLabel();
	JTextField textField1_2_1 = new JTextField();
	JTextField textField1_2_2 = new JTextField();
	JTextField textField1_2_3 = new JTextField();
	JTextField textField1_2_4 = new JTextField();
	JTextField textField1_2_5 = new JTextField();
	JRadioButton radiobutton1_2_1 = new JRadioButton();
	JRadioButton radiobutton1_2_2 = new JRadioButton();
	JCheckBox checkbox1_2_1 = new JCheckBox();
	JCheckBox checkbox1_2_2 = new JCheckBox();
	JTextField passwordField1_2_1 = new JTextField();
	JButton button1_2_1= new JButton("ADD");
	JButton button1_2_2= new JButton("EDIT");
	JButton button1_2_3= new JButton("DELETE");
	JButton button1_2_4= new JButton("SEARCH");

	JPanel panel2_1;
	JTable jt;

	
	String gender;
	String tamil;
	String english;
	
	ButtonGroup bug;
	
	JButton back = new JButton("BACK");
	
	ImageIcon i1;
	JLabel label = new JLabel();

	
	
	AdministratorFrame(){
		f = new JFrame();
		
		
		pane.setBounds(50, 200, 1800, 700);
		
		panel.setBounds(0, 0, 1900, 1000);
		panel.setLayout(null);
		panel.setVisible(true);
		panel.setBackground(Color.cyan);
		
		controlPanel();
		
		setPanel1();
		setPanel2();
		
		
		pane.add(panel1);
		pane.add(panel2);
		panel.add(pane);
		
		//setIcon();
		
		setBack();
		
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
		back.setBounds(1700, 50, 80, 50);
		back.addActionListener(this);
		panel.add(back);
	}
	
	private void controlPanel(){

		button0_1.setFont(new Font("Arial", Font.BOLD, 19));
		button0_1.setBackground(Color.white);
		button0_1.setForeground(Color.black);
		button0_1.setFocusable(false);
		button0_1.setOpaque(true);
		button0_1.setBorderPainted(false);
		button0_1.setBorder(null);
		button0_1.setContentAreaFilled(true);
		button0_1.setBounds(800, 70, 200, 50);
		button0_1.addActionListener(this);
		panel.add(button0_1);
	
		
		button0_2.setFont(new Font("Arial", Font.BOLD, 19));
		button0_2.setBackground(Color.black);
		button0_2.setForeground(Color.white);
		button0_2.setFocusable(false);
		button0_2.setOpaque(true);
		button0_2.setBorderPainted(false);
		button0_2.setBorder(null);
		button0_2.setContentAreaFilled(true);
		button0_2.setBounds(1000, 70, 100, 50);
		button0_2.addActionListener(this);
		panel.add(button0_2);
		
		
		panel.add(button0_1);
		panel.add(button0_2);
		
	}
	
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource() == back){
			new Final();
			f.dispose();
		}
		
		if(radiobutton1_2_1.isSelected())
			gender = "male";
		else if(radiobutton1_2_2.isSelected())
			gender = "female";
		if(checkbox1_2_1.isSelected())
			tamil = "yes";
		else
			tamil = "no";
		if(checkbox1_2_2.isSelected())
			english = "yes";
		else
			english = "no";
		
		if(e.getSource() == button0_1){
			
			button0_1.setBackground(Color.black);
			button0_1.setForeground(Color.white);
			button0_2.setForeground(Color.black);
			button0_2.setBackground(Color.white);
			
			
			panel1.setVisible(false);
			panel2.setVisible(true);
		}
		
		else if(e.getSource() == button0_2){
			button0_1.setBackground(Color.white);
			button0_1.setForeground(Color.black);
			button0_2.setForeground(Color.white);
			button0_2.setBackground(Color.black);

			panel2.setVisible(false);
			
			panel1.setVisible(true);
		}
		
		
		else if(e.getSource() == button1_2_1){
			String id = textField1_2_1.getText();
			String name = textField1_2_2.getText();
			String age = textField1_2_3.getText();
			String number = textField1_2_4.getText();
			
			String place = textField1_2_5.getText();
			String password = passwordField1_2_1.getText();
			
			Connection con1 = null;
			PreparedStatement insert = null;
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/staff", "root", "");
				insert = con1.prepareStatement("insert into stafftable(id, name, age, phoneNum, gender, tamil, english, place, password) values(?,?,?,?,?,?,?,?,?)");
				
				insert.setString(1, id);
				insert.setString(2, name);
				insert.setString(3, age);
				insert.setString(4, number);
				insert.setString(5, gender);
				insert.setString(6, tamil);
				insert.setString(7, english);
				insert.setString(8, place);
				insert.setString(9, password);
				
				insert.executeUpdate();
				
				JOptionPane.showMessageDialog(panel2, "Record Added");
				
				
				setPanel2_1();
				
				setPanelValue2();
				bug.clearSelection();
				if(checkbox1_2_1.isSelected())
					checkbox1_2_1.setSelected(false);
				if(checkbox1_2_2.isSelected())
					checkbox1_2_2.setSelected(false);
				
				textField1_2_1.requestFocus();
				
				
				con1.close();
			}
			catch(Exception ae){}
		}
		
		else if(e.getSource() == button1_2_2){
			
			Connection con3 = null;
			PreparedStatement insert = null;
			try{
				String id = textField1_2_1.getText();
				String name = textField1_2_2.getText();
				String age = textField1_2_3.getText();
				String number = textField1_2_4.getText();
			
				String place = textField1_2_5.getText();
				String password = passwordField1_2_1.getText();
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				con3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/staff", "root", "");
				insert = con3.prepareStatement("update stafftable set name=?, age=?, phoneNum=?, gender=?, tamil=?, english=?, place=?, password=? where id=? ");
				
				
				insert.setString(1, name);
				insert.setString(2, age);
				insert.setString(3, number);
				insert.setString(4, gender);
				insert.setString(5, tamil);
				insert.setString(6, english);
				insert.setString(7, place);
				insert.setString(8, password);
				
				insert.setString(9, id);
				
				insert.executeUpdate();
				
				JOptionPane.showMessageDialog(panel2, "Record Updated");
				
				setPanel2_1();
				
				setPanelValue2();
				bug.clearSelection();
				if(checkbox1_2_1.isSelected())
					checkbox1_2_1.setSelected(false);
				if(checkbox1_2_2.isSelected())
					checkbox1_2_2.setSelected(false);
				
				textField1_2_1.requestFocus();
				
				
				con3.close();

			}
			catch(Exception ae){}
		
			
		}
		else if(e.getSource() == button1_2_3){
			Connection con3 = null;
			PreparedStatement insert = null;
			try{
				String id = textField1_2_1.getText();
				
				int dialogResult = JOptionPane.showConfirmDialog(panel2, "Do you want to delete the record","Warning",JOptionPane.YES_NO_OPTION);
				
				if(dialogResult == JOptionPane.YES_OPTION){
				
					Class.forName("com.mysql.cj.jdbc.Driver");
					con3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/staff", "root", "");
					insert = con3.prepareStatement("delete from stafftable where id=? ");
				
					insert.setString(1, id);
				
					insert.executeUpdate();
					
					JOptionPane.showMessageDialog(panel2, "Record Deleted");
				
					setPanel2_1();
					
					setPanelValue2();
					bug.clearSelection();
					if(checkbox1_2_1.isSelected())
						checkbox1_2_1.setSelected(false);
					if(checkbox1_2_2.isSelected())
						checkbox1_2_2.setSelected(false);
				
					textField1_2_1.requestFocus();
				
				
					con3.close();
		
				}
				else{

					setPanelValue2();
					bug.clearSelection();
					if(checkbox1_2_1.isSelected())
						checkbox1_2_1.setSelected(false);
					if(checkbox1_2_2.isSelected())
						checkbox1_2_2.setSelected(false);
				
					textField1_2_1.requestFocus();
				}

			}
			catch(Exception ae){}

		}

		else if(e.getSource() == button1_2_4){
			String id = textField1_2_1.getText();
			Connection con2 = null;
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/staff", "root", "");
				Statement state = con2.createStatement();
				ResultSet rs = state.executeQuery("select * from stafftable");
				
				while(rs.next()){
					if(id.equals(rs.getString(1))){
						textField1_2_2.setText(rs.getString(2));
						textField1_2_3.setText(rs.getString(3));
						textField1_2_4.setText(rs.getString(4));
						textField1_2_5.setText(rs.getString(8));
						passwordField1_2_1.setText(rs.getString(9));
						String gender = rs.getString(5);
						String tamil = rs.getString(6);
						String english = rs.getString(7);
						
						if(gender.equals("male"))
							radiobutton1_2_1.setSelected(true);
						else
							radiobutton1_2_2.setSelected(true);
						if(tamil.equals("yes"))
							checkbox1_2_1.setSelected(true);
						else
							checkbox1_2_1.setSelected(false);
						if(english.equals("yes"))
							checkbox1_2_2.setSelected(true);
						else
							checkbox1_2_2.setSelected(false);
					}
				}
				
			}
			catch(Exception ae){}
			
		}

	}
	

	private void setPanel1(){
		i1 = new ImageIcon("dream.jpg");
		label.setIcon(i1);
		label.setBounds(10, 10, 1780, 680);
		panel1.add(label);
	}
	
	private void setPanel2(){
		setPanelValue2();
		setBoundsInPanel2();
		setbgInPanel2();
		setTextPanel2();
		addInPanel2();
		
		setPanel2_1();
		addActionInPanel2();
	}

	private void addActionInPanel2(){
		button1_2_1.addActionListener(this);
		button1_2_2.addActionListener(this);
		button1_2_3.addActionListener(this);
		button1_2_4.addActionListener(this);
		radiobutton1_2_1.addActionListener(this);
		radiobutton1_2_2.addActionListener(this);
		checkbox1_2_1.addActionListener(this);
		checkbox1_2_2.addActionListener(this);
		
	}

	private void setPanel2_1(){

		panel2_1 = new JPanel();
		
		panel2_1.setVisible(true);
		panel2_1.setBounds(700, 50, 1030, 600);
		
		setTable();
		defTable();
		
		
		panel2_1.setLayout(new BorderLayout());
		JScrollPane sp=new JScrollPane(jt);    
		panel2_1.add(sp);
		panel2.add(panel2_1);
		
	}
	
	private void setTable(){
		DefaultTableModel model = new DefaultTableModel();
		jt = new JTable(){
			public boolean isCellEditable(int d, int c){
				return false;
			}
			
		};
		
		Object[] column = {"ID","NAME","AGE","PHONE NUM","GENDER","TAMIL","ENGLISH","PLACE"};
		model.setColumnIdentifiers(column);
		
		Connection con2 = null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/staff", "root", "");
			Statement state = con2.createStatement();
			ResultSet rs = state.executeQuery("select * from stafftable");
			
			while(rs.next()){
				Object[] row2 = new Object[8];
				row2[0] = rs.getString(1);
				row2[1] = rs.getString(2);
				row2[2] = rs.getString(3);
				row2[3] = rs.getString(4);
				row2[4] = rs.getString(5);
				row2[5] = rs.getString(6);
				row2[6] = rs.getString(7);
				row2[7] = rs.getString(8);
				
				model.addRow(row2);	
			}
			
			jt.setModel(model);
			
			
			
			con2.close();
		}
		catch(Exception ae){}

	}

	private void defTable(){
		jt.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 17));
		jt.getTableHeader().setOpaque(false);
		jt.getTableHeader().setBackground(Color.lightGray);
		jt.getTableHeader().setForeground(Color.black);
		jt.setRowHeight(jt.getRowHeight() +10);
		jt.setFont(new Font("Arial", Font.PLAIN,17));
		jt.setFillsViewportHeight(true);

	}

	private void setPanelValue2(){
		label1_2_1.setText("User Details");
		label1_2_1.setFont(new Font("SansSerif", Font.BOLD, 27));
		textField1_2_1.setText("Id");
		textField1_2_1.setFont(new Font("Monospaced", Font.PLAIN, 17));
		textField1_2_2.setText("Name");
		textField1_2_1.setFont(new Font("Monospaced", Font.PLAIN, 17));
		textField1_2_3.setText("Age");
		textField1_2_1.setFont(new Font("Monospaced", Font.PLAIN, 17));
		textField1_2_4.setText("Phone Number");
		textField1_2_1.setFont(new Font("Monospaced", Font.PLAIN, 17));
		textField1_2_5.setText("Place");
		textField1_2_1.setFont(new Font("Monospaced", Font.PLAIN, 17));
		passwordField1_2_1.setText("Password");
		radiobutton1_2_1.setText("male");
		
		radiobutton1_2_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		radiobutton1_2_2.setText("female");
		
		radiobutton1_2_2.setFont(new Font("SansSerif", Font.BOLD, 17));
		checkbox1_2_1.setText("tamil");
		
		checkbox1_2_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		checkbox1_2_2.setText("english");
		
		checkbox1_2_2.setFont(new Font("SansSerif", Font.BOLD, 17));

	}

	private void setBoundsInPanel2(){
		label1_2_1.setBounds(210, 33, 200, 40);
		textField1_2_1.setBounds(120, 120, 120, 50);
		textField1_2_2.setBounds(80, 220, 250, 50);
		textField1_2_3.setBounds(350, 220, 120, 50);
		textField1_2_4.setBounds(300, 500, 250, 50);
		textField1_2_5.setBounds(120, 400, 300, 60);
		passwordField1_2_1.setBounds(60, 500, 200, 50);
		radiobutton1_2_1.setBounds(170, 290, 70, 50);
		radiobutton1_2_2.setBounds(270, 290, 90, 50);
		checkbox1_2_1.setBounds(170, 340, 70, 50);
		checkbox1_2_2.setBounds(270, 340, 100, 50);
		button1_2_1.setBounds(87, 600, 110, 40);
		button1_2_2.setBounds(230, 600, 110, 40);
		button1_2_3.setBounds(370, 600, 110, 40);
		button1_2_4.setBounds(250, 125, 110, 40);
	}

	private void setbgInPanel2(){
		label1_2_1.setForeground(Color.white);
		
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
		
		passwordField1_2_1.setForeground(Color.white);
		passwordField1_2_1.setCaretColor(Color.white);
		
		radiobutton1_2_1.setForeground(Color.white);
		radiobutton1_2_1.setBackground(Color.darkGray);
		
		radiobutton1_2_2.setForeground(Color.white);
		radiobutton1_2_2.setBackground(Color.darkGray);
		
		checkbox1_2_1.setForeground(Color.white);
		checkbox1_2_1.setBackground(Color.darkGray);
		
		checkbox1_2_2.setForeground(Color.white);
		checkbox1_2_2.setBackground(Color.darkGray);
		
		button1_2_1.setForeground(Color.black);
		button1_2_2.setForeground(Color.black);
		button1_2_3.setForeground(Color.black);
		button1_2_4.setForeground(Color.black);
		
		button1_2_1.setBackground(Color.cyan);
		button1_2_2.setBackground(Color.white);
		button1_2_3.setBackground(Color.red);
		button1_2_4.setBackground(Color.lightGray);
	}

	private void setTextPanel2(){
		textField1_2_1.setHorizontalAlignment(JTextField.CENTER);
		textField1_2_2.setHorizontalAlignment(JTextField.CENTER);
		textField1_2_3.setHorizontalAlignment(JTextField.CENTER);
		textField1_2_4.setHorizontalAlignment(JTextField.CENTER);
		textField1_2_5.setHorizontalAlignment(JTextField.CENTER);
		passwordField1_2_1.setHorizontalAlignment(JTextField.CENTER);
	}
	
	private void addInPanel2(){
		
		textField1_2_1.setOpaque(false);
		textField1_2_2.setOpaque(false);
		textField1_2_3.setOpaque(false);
		textField1_2_4.setOpaque(false);
		textField1_2_5.setOpaque(false);
		
		passwordField1_2_1.setOpaque(false);
		
		radiobutton1_2_1.setFocusable(false);
		radiobutton1_2_2.setFocusable(false);
		
		checkbox1_2_1.setFocusable(false);
		checkbox1_2_2.setFocusable(false);
		
		button1_2_1.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.darkGray));
		button1_2_1.setFocusable(false);
		button1_2_2.setBorder(BorderFactory.createBevelBorder(1, Color.gray, Color.darkGray));
		button1_2_2.setFocusable(false);
		button1_2_3.setBorder(BorderFactory.createBevelBorder(1, Color.black, Color.darkGray));
		button1_2_3.setFocusable(false);
		button1_2_4.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.darkGray));
		button1_2_4.setFocusable(false);
		
		panel2.add(label1_2_1);
		panel2.add(textField1_2_1);
		panel2.add(textField1_2_2);
		panel2.add(textField1_2_3);
		panel2.add(textField1_2_4);
		panel2.add(textField1_2_5);
		panel2.add(passwordField1_2_1);
		bug = new ButtonGroup();
		bug.add(radiobutton1_2_1);
		bug.add(radiobutton1_2_2);
		panel2.add(radiobutton1_2_1);
		panel2.add(radiobutton1_2_2);
		panel2.add(checkbox1_2_1);
		panel2.add(checkbox1_2_2);
		panel2.add(button1_2_1);
		panel2.add(button1_2_2);
		panel2.add(button1_2_3);
		panel2.add(button1_2_4);
		
		
	}


}

class MyPanel1qq extends RoundedPanel{
	
	
	public MyPanel1qq(){
		super(40);
		this.setBounds(0,0,1800,700);
		this.setLayout(null);
		this.setOpaque(false);
		this.setBackground(Color.darkGray);
	}
}

class MyPanel2qq extends RoundedPanel{
	
	
	public MyPanel2qq(){
		super(40);
		this.setBounds(0,0,1800,700);
		this.setLayout(null);
		this.setOpaque(false);
		this.setBackground(Color.darkGray);
		
	}
}