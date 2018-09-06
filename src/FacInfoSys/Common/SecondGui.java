package FacInfoSys.Common;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.TitledBorder;

import org.omg.PortableServer.ImplicitActivationPolicyOperations;

import FacInfoSys.Views.MainGui;

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


public class SecondGui extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_1;
	private JPanel panel;

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
					SecondGui frame = new SecondGui();
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
	public SecondGui() {
		getContentPane().setFont(new Font("SansSerif", Font.BOLD, 18));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(500, 150, 1181, 714);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setToolTipText("Devoloped by Ahsan & Sakib");
		panel.setBounds(0, 0, 1163, 667);
		contentPane.add(panel);
		panel.setLayout(null);
	
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(SecondGui.class.getResource("/FacInfoSys/Resources/F.png")));
		lblNewLabel.setBounds(288, 6, 529, 115);
		panel.add(lblNewLabel);
	
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.setBackground(SystemColor.info);
		btnNewButton.setForeground(SystemColor.textInactiveText);
		btnNewButton.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 23));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
				
					
				}
			});
		
		/////////////////////////////////////////////////////////////////////////////////////
		//////////////////Cnditional Logics///////
		////////////
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1="amc", s2="aqu", s3="ara2", s4="asd", s5="huz", s6="hzr",s7 = "kas",s8="kmm",s9 = "lih",s10 = "mtd",s11="nsv",s12="nva",s13="rjp",s14="rkz",s15="rrn",s16="rzb",s17="sl",s18="szz",s20,
						
						
						
						s40="ach",s41="cak",s42="hbr", s43="jrh", s44="jsj", s45="klq", s46="knh",s47 = "mh1",s48="mqn",s49 = "nbb",s50 = "nsi",s51="orr",s52="sdl",s53="sfa2",s54="skk",s55="stb",s56="un";
				
				String s= textField_1.getText();
				s = s.toLowerCase();
				BufferedReader br = null;
				
				
				
				//////////////////////////////////
				///////BioChemistry
				////////////////////////////////
				
				
				 if(s.equals(s40) || s.equals("Abhinandan Chowdhury")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Department of biochemistry and microbiology\\ach.txt"));
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

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("ach.jpg"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				
				
				
				else if(s.equals(s41) || s.equals("Dr. Chaman Ara Keya")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Department of biochemistry and microbiology\\cak.txt"));
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

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("cak.jpg"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				
				
				else if(s.equals(s42) || s.equals("Md. Habibur Rahaman")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Department of biochemistry and microbiology\\hbr.txt"));
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

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("hbr.jpg"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				
				
				else if(s.equals(s43) || s.equals("Jurrat Hasan")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Department of biochemistry and microbiology\\jrh.txt"));
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

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("jrh.jpg"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				
				
				else if(s.equals(s44) || s.equals("Dr. Jinath Sultana Jime")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Department of biochemistry and microbiology\\jsj.txt"));
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

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("jsj.jpg"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				
				
				else if(s.equals(s45) || s.equals("Dr. Abdul Khaleque")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Department of biochemistry and microbiology\\klq.txt"));
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

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("klq.jpg"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				
				
				else if(s.equals(s46) || s.equals("Dr. Kazi Nadim Hasan")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Department of biochemistry and microbiology\\knh.txt"));
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

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("knh.jpg"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				
				
				else if(s.equals(s47) || s.equals("Dr. Md. Mainul Hossainy")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Department of biochemistry and microbiology\\mh1.txt"));
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

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("mh1.jpg"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				
				
				else if(s.equals(s48) || s.equals("Dr. Muhammad Maqsud Hossain")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Department of biochemistry and microbiology\\mqn.txt"));
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

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("mqn.jpg"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				
				
				else if(s.equals(s49) || s.equals("Dr. Nayeema Bulbul")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Department of biochemistry and microbiology\\nbb.txt"));
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

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("nbb.jpg"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				
				
				else if(s.equals(s50) || s.equals("Ms. Nishat Shayala Islam")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Department of biochemistry and microbiology\\nsi.txt"));
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

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("nsi.jpg"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				
				
				
				
				else if(s.equals(s51) || s.equals("Dr. Obaidur Rahman")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Department of biochemistry and microbiology\\orr.txt"));
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

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("orr.png"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}				
				else if(s.equals(s52) || s.equals("Dr. Sohidul Islam")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Department of biochemistry and microbiology\\sdl.txt"));
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

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("sdl.jpg"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}				
				else if(s.equals(s53) || s.equals("Ms. Syeda Farhana Afroz")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Department of biochemistry and microbiology\\sfa2.txt"));
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

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("sfa2.jpg"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}				
				else if(s.equals(s54) || s.equals("Dr S M Mostafa Kamal Khan")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Department of biochemistry and microbiology\\skk.txt"));
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

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("skk.jpg"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}				
				else if(s.equals(s55) || s.equals("Dr. Shiblee Ratan Barua")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Department of biochemistry and microbiology\\stb.txt"));
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

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("stb.jpg"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							if (br != null)br.close();
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				
				else if(s.equals(s56) || s.equals("Mrs. Ishrat Jabeen")){
					try {
						String sCurrentLine;
						
						br = new BufferedReader(new FileReader("C:\\Users\\Ahsan\\workspace\\FacultyInformstionSystem\\src\\FacInfoSys\\Resources\\Department of biochemistry and microbiology\\un.txt"));
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

					                ImageIcon icon = new ImageIcon(SecondGui.class.getResource("un.png"));					             
					                JOptionPane.showMessageDialog(null,sb,"Information", JOptionPane.INFORMATION_MESSAGE, icon);
					                        					                       
					            }
					        });
						}
					} catch (IOException e) {
						e.printStackTrace();
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
		btnNewButton.setBounds(827, 363, 169, 56);
		panel.add(btnNewButton);
		

		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(204, 255, 255));
		textField_1.setBounds(353, 290, 506, 43);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Faculty Name/Initial :");
		lblNewLabel_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(130, 288, 190, 43);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("      Faculty Information System");
		lblNewLabel_2.setForeground(SystemColor.control);
		lblNewLabel_2.setFont(new Font("Microsoft YaHei UI", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_2.setBounds(368, 133, 392, 44);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
			
		});
		btnNewButton_1.setBackground(new Color(0, 102, 153));
		btnNewButton_1.setFont(new Font("MV Boli", Font.BOLD | Font.ITALIC, 17));
		btnNewButton_1.setBounds(1004, 578, 131, 43);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("Biochemistry");
		lblNewLabel_4.setForeground(new Color(51, 204, 255));
		lblNewLabel_4.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_4.setBounds(471, 189, 145, 71);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(SecondGui.class.getResource("/FacInfoSys/Resources/maxresdefault1.jpg")));
		lblNewLabel_3.setBounds(0, 0, 1163, 661);
		
		panel.add(lblNewLabel_3);
		
		
		
		
	}
}
