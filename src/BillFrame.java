import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class BillFrame implements ActionListener{
	JFrame f;
	JPanel panel = new JPanel();
	JPanel panel1 = new MyPanel1h();
	
	JLabel label1_2_1 = new JLabel();
	JTextField textField1_2_1 = new JTextField();

	JButton button1_2_3= new JButton("DELETE");
	JButton button1_2_4= new JButton("SEARCH");
	JButton back= new JButton("Back");

	JPanel panel2_1;
	JTable jt;

	String tname;
	
	BillFrame(String str){
		f = new JFrame();
		
		tname = str;

		panel.setBounds(0, 0, 1900, 1000);
		panel.setLayout(null);
		panel.setVisible(true);
		panel.setBackground(Color.cyan);
		
		
		setPanel1();
		
		
		panel.add(panel1);
		
		f.add(panel);
		f.setSize(1900, 1000);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == back){
			new FirstFrame(tname);
			f.dispose();
		}
		
		if(e.getSource() == button1_2_3){
			Connection con3 = null;
			PreparedStatement insert = null;
			try{
				String id = textField1_2_1.getText();
				
				int dialogResult = JOptionPane.showConfirmDialog(panel1, "Do you want to delete the record","Warning",JOptionPane.YES_NO_OPTION);
				
				if(dialogResult == JOptionPane.YES_OPTION){
				
					Class.forName("com.mysql.cj.jdbc.Driver");
					con3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "");
					insert = con3.prepareStatement("delete from "+ tname +" where id=? ");
				
					insert.setString(1, id);
				
					insert.executeUpdate();
					
					setPanel2_1();
					
					JOptionPane.showMessageDialog(panel1, "Record Deleted");
				
					
					
					setPanelValue2();
				
					textField1_2_1.requestFocus();
				
				
					con3.close();
		
				}
				else{

					setPanelValue2();
				
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
				con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "");
				Statement state = con2.createStatement();
				ResultSet rs = state.executeQuery("select * from "+tname);
				
				while(rs.next()){
					if(id.equals(rs.getString(1))){
						String str = rs.getString(2) + rs.getString(3) + rs.getString(4) + rs.getString(5);

					}
				}
				
			}
			catch(Exception ae){}
			
		}

	}
	
	
	private void setPanel1(){
		setPanelValue2();
		setBoundsInPanel2();
		setbgInPanel2();
		setTextPanel2();
		addInPanel2();
		
		setBack();
		
		setPanel2_1();
		addActionInPanel2();
	}

	private void setBack(){
		back.setFont(new Font("Arial", Font.BOLD, 19));
		back.setBackground(Color.cyan);
		back.setForeground(Color.black);
		back.setFocusable(false);
		back.setOpaque(true);
		back.setBorderPainted(false);
		back.setBorder(null);
		back.setContentAreaFilled(true);
		back.setBounds(180, 700, 100, 50);
		back.setBorder(BorderFactory.createBevelBorder(1, Color.black, Color.darkGray));
		back.addActionListener(this);
		panel.add(back);
	}

	private void addActionInPanel2(){
		button1_2_3.addActionListener(this);
		button1_2_4.addActionListener(this);
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
		panel1.add(panel2_1);
		
	}
	
	private void setTable(){
		DefaultTableModel model = new DefaultTableModel();
		jt = new JTable(){
			public boolean isCellEditable(int d, int c){
				return false;
			}
			
		};
		
		Object[] column = {"ID","PRODUCT NAME","QUANTITY","PRICE","TOTAL PRICE"};
		model.setColumnIdentifiers(column);
		
		/*
		TableColumnModel columnModel1 = jt.getColumnModel();
		columnModel1.getColumn(0).setPreferredWidth(100);
		columnModel1.getColumn(1).setPreferredWidth(300);
		columnModel1.getColumn(2).setPreferredWidth(140);
		columnModel1.getColumn(3).setPreferredWidth(140);
		columnModel1.getColumn(4).setPreferredWidth(140);
*/
		/*
		TableColumnModel columnModel1 = jt.getColumnModel();
        columnModel.getColumn(1).setPreferredWidth(170);
        columnModel.getColumn(1).setMaxWidth(170);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(2).setMaxWidth(150);
        columnModel.getColumn(3).setPreferredWidth(40);
        columnModel.getColumn(3).setMaxWidth(40);
		*/
		Connection con2 = null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "");
			Statement state = con2.createStatement();
			ResultSet rs = state.executeQuery("select * from "+tname);
			
			while(rs.next()){
				Object[] row2 = new Object[8];
				row2[0] = rs.getString(1);
				row2[1] = rs.getString(2);
				row2[2] = rs.getString(3);
				row2[3] = rs.getString(4);
				row2[4] = rs.getString(5);
				
				model.addRow(row2);	
			}
			
			jt.setModel(model);

			con2.close();
		}
		catch(Exception ae){}

	}

	private void defTable(){
		jt.getColumnModel().getColumn(0).setPreferredWidth(120);
		jt.getColumnModel().getColumn(1).setPreferredWidth(300);
		jt.getColumnModel().getColumn(2).setPreferredWidth(95);
		jt.getColumnModel().getColumn(3).setPreferredWidth(40);
		jt.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
		
		jt.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 17));
		jt.getTableHeader().setOpaque(false);
		jt.getTableHeader().setBackground(Color.lightGray);
		jt.getTableHeader().setForeground(Color.black);
		jt.setRowHeight(jt.getRowHeight() +10);
		jt.setFont(new Font("Arial", Font.PLAIN,17));
		jt.setFillsViewportHeight(true);

	}

	private void setPanelValue2(){
		label1_2_1.setText("My Cart");
		label1_2_1.setFont(new Font("SansSerif", Font.BOLD, 27));
		textField1_2_1.setText("Id");
		textField1_2_1.setFont(new Font("Monospaced", Font.PLAIN, 17));
	}

	private void setBoundsInPanel2(){
		label1_2_1.setBounds(210, 33, 200, 40);
		textField1_2_1.setBounds(120, 120, 120, 50);
		button1_2_3.setBounds(370, 600, 110, 40);
		button1_2_4.setBounds(250, 125, 110, 40);
	}

	private void setbgInPanel2(){
		label1_2_1.setForeground(Color.white);
		
		textField1_2_1.setForeground(Color.white);
		textField1_2_1.setCaretColor(Color.white);
		
		button1_2_3.setForeground(Color.black);
		button1_2_4.setForeground(Color.black);
		
		button1_2_3.setBackground(Color.red);
		button1_2_4.setBackground(Color.lightGray);
	}

	private void setTextPanel2(){
		textField1_2_1.setHorizontalAlignment(JTextField.CENTER);
	}
	
	private void addInPanel2(){
		
		textField1_2_1.setOpaque(false);

		button1_2_3.setBorder(BorderFactory.createBevelBorder(1, Color.black, Color.darkGray));
		button1_2_3.setFocusable(false);
		button1_2_4.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.darkGray));
		button1_2_4.setFocusable(false);
		
		panel1.add(label1_2_1);
		panel1.add(textField1_2_1);
		
		panel1.add(button1_2_3);
		panel1.add(button1_2_4);
		
		
	}


}

class MyPanel1h extends RoundedPanel{
	
	
	public MyPanel1h(){
		super(40);
		this.setBounds(50,200,1800,700);
		this.setLayout(null);
		this.setOpaque(false);
		this.setBackground(Color.darkGray);
	}
}
