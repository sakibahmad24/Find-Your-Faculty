package FacInfoSys.Common;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import FacInfoSys.Views.forthGui;

	public class fifthGui extends JFrame {

	public static void main(String[] args) {
		fifthGui frameTabel = new fifthGui();
	}

		JLabel welcome = new JLabel("Welcome to a New Frame");
		JPanel panel = new JPanel();
		private JTextField textField;
		
		public fifthGui(){
		super("Welcome");
		setSize(1034,590);
		setLocation(500,150);
		panel.setLayout (null); 
		
		getContentPane().add(panel);
		
		
		JLabel lblNewLabel = new JLabel("Welcome Ahsan Ahmed Sojib / Kazi Sakib Ahmed");
		
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(234, 83, 593, 48);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Add a Faculty:");
		lblNewLabel_1.setFont(new Font("Nirmala UI", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(182, 244, 153, 48);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		
		textField.setBounds(358, 273, 397, 103);
		panel.add(textField);
		textField.setColumns(10);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(734, 273, 21, 103);
		panel.add(scrollBar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(481, 253, 249, -64);
		panel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(358, 180, 417, 80);
		panel.add(textArea);
		
		welcome.setIcon(new ImageIcon(fifthGui.class.getResource("/FacInfoSys/Resources/7939197034_7b46d92050_o1111.jpg")));
		
		welcome.setBounds(0,0,1016,543);
		
		panel.add(welcome);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(358, 255, 417, -82);
		panel.add(scrollPane_1);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
