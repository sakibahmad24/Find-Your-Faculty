package FacInfoSys.Views;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

import FacInfoSys.Common.SecondGui;

import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.awt.SystemColor;


public class MainGui {

	public JFrame frmAhsan;
	private JComboBox comboBox_2;
	private JPanel panel;
	private JLabel lblNewLabel_5;
	private JButton btnNewButton;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblSchoolOfEngineering;

	/**
	 * Launch the application.
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGui window = new MainGui();
					window.frmAhsan.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public MainGui() {
		initComponents();
		createEvents();
	
	}
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////This method contains all the code for creating and initializing components....
//////////////////////////////////////////////////////////////////////////////////////////////////////
	

	private void initComponents() {
		// TODO Auto-generated method stub
		frmAhsan = new JFrame();
		frmAhsan.setUndecorated(true);
		
		frmAhsan.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		frmAhsan.setTitle("INFORMATION SYSTEM");
		frmAhsan.setIconImage(Toolkit.getDefaultToolkit().getImage(MainGui.class.getResource("/FacInfoSys/Resources/game_of_thrones_season_1_icon_by_beerovios-d8zpd3u.png")));
		frmAhsan.setBounds(500, 150, 1019, 597);
		frmAhsan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAhsan.setUndecorated(true);
		panel = new JPanel();
		panel.setToolTipText("");
		panel.setForeground(new Color(204, 255, 0));
		frmAhsan.getContentPane().add(panel, BorderLayout.CENTER);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBackground(UIManager.getColor("TitledBorder.titleColor"));
		comboBox_2.setBounds(614, 288, 248, 39);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"", "Electrical & Computer Engineering", "BioChemistry"}));
		
		
		comboBox_2.setSelectedIndex(1);
		lblNewLabel_5 = new JLabel("FACULTY INFORMATION SYSTEM");
		lblNewLabel_5.setBounds(304, 140, 435, 52);
		lblNewLabel_5.setFont(new Font("Arial Black", Font.ITALIC, 22));
		lblNewLabel_5.setForeground(SystemColor.menuText);
		lblNewLabel_5.setBackground(Color.GRAY);

		
		
		
	}
	
	
/////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////This code contains all the codes for creating events....
//////////////////////////////////////////////////////////////////////////////////
	
	
	private void createEvents() {

		btnNewButton = new JButton("Confirm");
		btnNewButton.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.setForeground(SystemColor.scrollbar);
		btnNewButton.setBackground(SystemColor.inactiveCaptionText);
		btnNewButton.setBounds(791, 375, 151, 52);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int s1 = comboBox_2.getSelectedIndex();

				if(s1==2){
				frmAhsan.dispose();
				
				SecondGui guiTwo = new SecondGui();
				guiTwo.setVisible(true);
				
				}
				else if(s1==1){
					frmAhsan.dispose();
					
					thirdGui guiFour = new thirdGui();
					guiFour.setVisible(true);
					
				}
				
				
			}
		});
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(267, 20, 540, 112);
		lblNewLabel_6.setIcon(new ImageIcon(MainGui.class.getResource("/FacInfoSys/Resources/F.png")));
		panel.setLayout(null);
		panel.add(comboBox_2);
		panel.add(btnNewButton);
		panel.add(lblNewLabel_5);
		panel.add(lblNewLabel_6);
		
		JButton btnNewButton_1 = new JButton("Devoloper");
		btnNewButton_1.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_1.setBackground(SystemColor.controlDkShadow);
		btnNewButton_1.setForeground(SystemColor.controlText);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				frmAhsan.dispose();
				forthGui guiFour = new forthGui();
				guiFour.setVisible(true);
				
				
				
			}
		});
		btnNewButton_1.setBounds(864, 528, 134, 52);
		panel.add(btnNewButton_1);
		
		lblSchoolOfEngineering = new JLabel("School of Engineering & Physical Sciences & Biochemistry\r\n: ");
		lblSchoolOfEngineering.setForeground(SystemColor.info);
		lblSchoolOfEngineering.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 20));
		lblSchoolOfEngineering.setBounds(31, 278, 571, 52);
		panel.add(lblSchoolOfEngineering);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(Color.BLACK);
		btnExit.setForeground(Color.WHITE);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frmAhsan.dispose();
			}
		});
		btnExit.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 18));
		btnExit.setBounds(16, 545, 122, 39);
		panel.add(btnExit);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(MainGui.class.getResource("/FacInfoSys/Resources/campus1.jpg")));
		lblNewLabel_1.setBounds(0, 0, 1019, 597);
		panel.add(lblNewLabel_1);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
