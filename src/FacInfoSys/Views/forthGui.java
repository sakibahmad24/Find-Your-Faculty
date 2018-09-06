package FacInfoSys.Views;
import javax.swing.*;

import FacInfoSys.Common.fifthGui;

import java.awt.*;
import java.awt.event.*;

public class forthGui extends JFrame {

public static void main(String[] args) {
		forthGui frameTabel = new forthGui();
	}
	
	JButton blogin = new JButton("Login");
		JPanel panel = new JPanel();
		public JTextField txuser = new JTextField(15);
		JPasswordField pass = new JPasswordField(15);
		private final JLabel lblNewLabel = new JLabel("Name:");
		
		private final JLabel lblNewLabel_1 = new JLabel("Password:");
		private final JLabel label = new JLabel("");
		
		public forthGui(){
		super("Login Autentification");
		setSize(819,457);
		setLocation(500,150);
		panel.setLayout (null); 
		txuser.setForeground(new Color(0, 0, 0));
		txuser.setBackground(new Color(230, 230, 250));
		
		
		txuser.setBounds(326,133,208,42);
		pass.setForeground(new Color(0, 0, 0));
		pass.setBackground(new Color(230, 230, 250));
		pass.setBounds(326,187,208,42);
		blogin.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 19));
		blogin.setBackground(new Color(100, 149, 237));
		blogin.setBounds(501,259,119,42);
		
		panel.add(blogin);
		panel.add(txuser);
		panel.add(pass);
		
		getContentPane().add(panel);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel.setBounds(207, 131, 97, 42);
		panel.add(lblNewLabel);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_1.setBounds(183, 185, 131, 42);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainGui a =new MainGui();
				a.setVisible(true);dispose();

			}
		});
		btnNewButton.setBounds(46, 349, 90, 28);
		panel.add(btnNewButton);
		label.setIcon(new ImageIcon(forthGui.class.getResource("/FacInfoSys/Resources/hack-code-hacker-computer-background-166263.jpg")));
		label.setBounds(0, 6, 801, 404);
		panel.add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		actionlogin();
		}
		
		public void actionlogin(){
		blogin.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
		String puname = txuser.getText(); 
		String ppaswd = pass.getText();
		if((puname.equals("ahsan") && ppaswd.equals("admin")) ||(puname.equals("sakib") && ppaswd.equals("admin")) ) {
			fifthGui regFace =new fifthGui();
			regFace.setVisible(true);dispose();
		} else {
		
		JOptionPane.showMessageDialog(null,"Wrong Password / Username");
		txuser.setText("");
		pass.setText("");
		txuser.requestFocus();
				}
			
			}
		});
	}
}
