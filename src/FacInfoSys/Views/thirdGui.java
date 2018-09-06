package FacInfoSys.Views;

import java.awt.BorderLayout;
import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.TitledBorder;

import org.omg.PortableServer.ImplicitActivationPolicyOperations;


import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JScrollPane;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import FacInfoSys.Common.SecondGui;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class thirdGui extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textField;

	/**
	 * Launch the application.
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
					thirdGui frame = new thirdGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public thirdGui() {
		setForeground(UIManager.getColor("TextField.foreground"));
		setBackground(UIManager.getColor("TextPane.foreground"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 150, 1028, 656);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(153, 255, 204));
		textField.setBounds(380, 254, 345, 42);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Faculty Name/Initial:");
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 21));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(157, 253, 228, 42);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	String s1="amc", s2="aqu", s3="ara2", s4="asd", s5="huz", s6="hzr",s7 = "kas",s8="kmm",s9 = "lih",s10 = "mtd",s11="nsv",s12="nva",s13="rjp",s14="rkz",s15="rrn",s16="rzb",s17="sl",s18="szz",s20,
						
						
						
						s40="ach",s41="cak",s42="hbr", s43="jrh", s44="jsj", s45="klq", s46="knh",s47 = "mh1",s48="mqn",s49 = "nbb",s50 = "nsi",s51="orr",s52="sdl",s53="sfa2",s54="skk",s55="stb",s56="un";
				
				String s= textField.getText();
				s = s.toLowerCase();
				BufferedReader br = null;
				
				
				if(s.equals(s1) || s.equals("arshad m chowdhury")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Java Project files\\amc.txt"));
						
						while ((sCurrentLine = br.readLine()) != null) {
							StringBuilder sb = new StringBuilder();
							while((sCurrentLine = br.readLine()) != null){
									sb.append(sCurrentLine+"\n");
									
									
								
							}
							EventQueue.invokeLater(new Runnable() {
					            @Override
					            public void run() {
					                try {
					                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
					                }

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("amc.jpg"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
							
							
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				
				
				else if(s.equals(s2) || s.equals("atiqur rahman")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Java Project files\\Aqu.txt"));
						while ((sCurrentLine = br.readLine()) != null) {
							StringBuilder sb = new StringBuilder();
							while((sCurrentLine = br.readLine()) != null){
									sb.append(sCurrentLine+"\n");
									
									
								
							}
							EventQueue.invokeLater(new Runnable() {
					            @Override
					            public void run() {
					                try {
					                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
					                }

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("aqu.jpg"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				
				
				
				else if(s.equals(s3) || s.equals("ahsanur rahman")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Java Project files\\Ara2.txt"));
						while ((sCurrentLine = br.readLine()) != null) {
							StringBuilder sb = new StringBuilder();
							while((sCurrentLine = br.readLine()) != null){
									sb.append(sCurrentLine+"\n");
									
									
								
							}
							EventQueue.invokeLater(new Runnable() {
					            @Override
					            public void run() {
					                try {
					                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
					                }

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("ara2.jpg"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				
				else if(s.equals(s4) || s.equals("Dr. Asad Jamil")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Java Project files\\asd.txt"));
						while ((sCurrentLine = br.readLine()) != null) {
							StringBuilder sb = new StringBuilder();
							while((sCurrentLine = br.readLine()) != null){
									sb.append(sCurrentLine+"\n");
									
									
								
							}
							EventQueue.invokeLater(new Runnable() {
					            @Override
					            public void run() {
					                try {
					                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
					                }

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("asd.png"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				
				
				
				else if(s.equals(s5) || s.equals("hasan uz zaman")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Java Project files\\huz.txt"));
						while ((sCurrentLine = br.readLine()) != null) {
							StringBuilder sb = new StringBuilder();
							while((sCurrentLine = br.readLine()) != null){
									sb.append(sCurrentLine+"\n");
									
									
								
							}
							EventQueue.invokeLater(new Runnable() {
					            @Override
					            public void run() {
					                try {
					                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
					                }

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("huz.jpg"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				
				else if(s.equals(s6) || s.equals("hafiz abdur rahman")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Java Project files\\hrz.txt"));
						while ((sCurrentLine = br.readLine()) != null) {
							StringBuilder sb = new StringBuilder();
							while((sCurrentLine = br.readLine()) != null){
									sb.append(sCurrentLine+"\n");
									
									
								
							}
							EventQueue.invokeLater(new Runnable() {
					            @Override
					            public void run() {
					                try {
					                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
					                }

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("hzr.jpg"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				
				else if(s.equals(s7) || s.equals("kazi mohammad abdus salam")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Java Project files\\kas.txt"));
						while ((sCurrentLine = br.readLine()) != null) {
							StringBuilder sb = new StringBuilder();
							while((sCurrentLine = br.readLine()) != null){
									sb.append(sCurrentLine+"\n");
									
									
								
							}
							EventQueue.invokeLater(new Runnable() {
					            @Override
					            public void run() {
					                try {
					                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
					                }

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("kas.jpg"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				
				else if(s.equals(s8) || s.equals("mohammad monirujjaman khan")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Java Project files\\kmm.txt"));
						while ((sCurrentLine = br.readLine()) != null) {
							StringBuilder sb = new StringBuilder();
							while((sCurrentLine = br.readLine()) != null){
									sb.append(sCurrentLine+"\n");
									
									
								
							}
							EventQueue.invokeLater(new Runnable() {
					            @Override
					            public void run() {
					                try {
					                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
					                }

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("kmm.jpg"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				
				else if(s.equals(s9) || s.equals("lamia iftekhar")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Java Project files\\lih.txt"));
						while ((sCurrentLine = br.readLine()) != null) {
							StringBuilder sb = new StringBuilder();
							while((sCurrentLine = br.readLine()) != null){
									sb.append(sCurrentLine+"\n");
									
									
								
							}
							EventQueue.invokeLater(new Runnable() {
					            @Override
					            public void run() {
					                try {
					                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
					                }

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("Lih.png"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				
				else if(s.equals(s10) || s.equals("shah mostafa khaled")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Java Project files\\mtd.txt"));
						while ((sCurrentLine = br.readLine()) != null) {
							StringBuilder sb = new StringBuilder();
							while((sCurrentLine = br.readLine()) != null){
									sb.append(sCurrentLine+"\n");
									
									
								
							}
							EventQueue.invokeLater(new Runnable() {
					            @Override
					            public void run() {
					                try {
					                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
					                }

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("k.jpg"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				
				else if(s.equals(s11) || (s.equals("nabil shovon ashraf"))){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Java Project files\\Nsv.txt"));
						while ((sCurrentLine = br.readLine()) != null) {
							StringBuilder sb = new StringBuilder();
							while((sCurrentLine = br.readLine()) != null){
									sb.append(sCurrentLine+"\n");
									
									
								
							}
							EventQueue.invokeLater(new Runnable() {
					            @Override
					            public void run() {
					                try {
					                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
					                }

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("Nsv.png"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				
				else if(s.equals(s12) || s.equals("nova ahmed")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Java Project files\\NvA.txt"));
						while ((sCurrentLine = br.readLine()) != null) {
							StringBuilder sb = new StringBuilder();
							while((sCurrentLine = br.readLine()) != null){
									sb.append(sCurrentLine+"\n");
									
									
								
							}
							EventQueue.invokeLater(new Runnable() {
					            @Override
					            public void run() {
					                try {
					                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
					                }

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("nva.png"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				
				else if(s.equals(s13) || s.equals("r;ajesh palit")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Java Project files\\Rjp.txt"));
						while ((sCurrentLine = br.readLine()) != null) {
							StringBuilder sb = new StringBuilder();
							while((sCurrentLine = br.readLine()) != null){
									sb.append(sCurrentLine+"\n");
									
									
								
							}
							EventQueue.invokeLater(new Runnable() {
					            @Override
					            public void run() {
					                try {
					                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
					                }

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("Rjp.jpg"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				
				else if(s.equals(s14) || s.equals("m. rokonuzzaman")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Java Project files\\rkz.txt"));
						while ((sCurrentLine = br.readLine()) != null) {
							StringBuilder sb = new StringBuilder();
							while((sCurrentLine = br.readLine()) != null){
									sb.append(sCurrentLine+"\n");
									
									
								
							}
							EventQueue.invokeLater(new Runnable() {
					            @Override
					            public void run() {
					                try {
					                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
					                }

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("rkz.jpg"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				
				else if(s.equals(s15) || s.equals("mohammad rashedur rahman")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Java Project files\\rrn.txt"));
						while ((sCurrentLine = br.readLine()) != null) {
							StringBuilder sb = new StringBuilder();
							while((sCurrentLine = br.readLine()) != null){
									sb.append(sCurrentLine+"\n");
									
									
								
							}
							EventQueue.invokeLater(new Runnable() {
					            @Override
					            public void run() {
					                try {
					                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
					                }

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("rrn.png"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				
				else if(s.equals(s16) || s.equals("rezaul bari")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Java Project files\\rzb.txt"));
						while ((sCurrentLine = br.readLine()) != null) {
							StringBuilder sb = new StringBuilder();
							while((sCurrentLine = br.readLine()) != null){
									sb.append(sCurrentLine+"\n");
									
									
								
							}
							EventQueue.invokeLater(new Runnable() {
					            @Override
					            public void run() {
					                try {
					                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
					                }

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("rzb.jpg"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				
				else if(s.equals(s17) || s.equals("sharnali islam")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Java Project files\\SL.txt"));
						while ((sCurrentLine = br.readLine()) != null) {
							StringBuilder sb = new StringBuilder();
							while((sCurrentLine = br.readLine()) != null){
									sb.append(sCurrentLine+"\n");
									
									
								
							}
							EventQueue.invokeLater(new Runnable() {
					            @Override
					            public void run() {
					                try {
					                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
					                }

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("SL.jpg"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				
				
								
				
				
				else if(s.equals(s18) || s.equals("shazzad hosain")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Java Project files\\Szz.txt"));
						while ((sCurrentLine = br.readLine()) != null) {
							StringBuilder sb = new StringBuilder();
							while((sCurrentLine = br.readLine()) != null){
									sb.append(sCurrentLine+"\n");
									
									
								
							}
							EventQueue.invokeLater(new Runnable() {
					            @Override
					            public void run() {
					                try {
					                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
					                }

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("szz.jpg"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				else 
				
				
					EventQueue.invokeLater(new Runnable() {
			            @Override
			            public void run() {
			                try {
			                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
			                }

			                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("all.jpg"));	
			                
			                JOptionPane.showMessageDialog(null,"Sorry You have entered Wrong name or initial.\n"+"Or The Information is not found...\n"+"\nPlease Contact the devoloper.\n"+"Help him add more faculty.\n"+"Thanks...!!!","Error", JOptionPane.INFORMATION_MESSAGE, icon);
			                        					                       
			            }
			        });		
				
				
				
				

			}
		});
		btnNewButton.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 19));
		btnNewButton.setForeground(new Color(0, 51, 102));
		btnNewButton.setBackground(SystemColor.scrollbar);
		btnNewButton.setBounds(689, 327, 130, 42);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("ECE DEPERTMENT");
		lblNewLabel_2.setForeground(SystemColor.textHighlightText);
		lblNewLabel_2.setFont(new Font("Leelawadee UI", Font.BOLD | Font.ITALIC, 29));
		lblNewLabel_2.setBounds(410, 148, 276, 78);
		contentPane.add(lblNewLabel_2);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(thirdGui.class.getResource("/FacInfoSys/Resources/F.png")));
		label.setBounds(269, 13, 529, 122);
		contentPane.add(label);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		btnExit.setForeground(SystemColor.infoText);
		btnExit.setBackground(SystemColor.textHighlight);
		btnExit.setFont(new Font("Cambria Math", Font.BOLD | Font.ITALIC, 17));
		btnExit.setBounds(852, 550, 130, 36);
		contentPane.add(btnExit);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(thirdGui.class.getResource("/FacInfoSys/Resources/ImgSacNacAdm.jpg")));
		lblNewLabel.setBounds(0, 0, 1010, 609);
		contentPane.add(lblNewLabel);
	}
}
