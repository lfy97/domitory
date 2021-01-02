package System;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import TableAdministrator.DormTable;
import TableAdministrator.GradeTable;
import TableAdministrator.ManagerTable;
import TableAdministrator.StudentTable;
import javax.swing.UIManager;


@SuppressWarnings("serial")
public class Administrator extends JFrame {

	private JPanel jpl = null;
	private MoveLabel label = null;
	JLabel lab1,lab2,lab3,lab4,lab5,lab6;
	JButton logout,exit;
	public Administrator() {
		super("宿舍管理系统");
		jpl = new JPanel();
		jpl.setBackground(UIManager.getColor("Panel.background"));
		label = new MoveLabel(
				"欢迎登录宿舍管理系统                                                                                                      欢迎登录宿舍管理系统                                                                                                    欢迎登录宿舍管理系统");
		label.setOpaque(false); // 透明
		label.setFont(new Font("新宋体", Font.BOLD, 20));
		label.setForeground(Color.white);

		label.setSize(1366, 20);
		label.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(label, BorderLayout.NORTH);

		JLabel lab = new JLabel(new ImageIcon("image\\back.jpg"));
		jpl.add(lab);
		
		lab1 = new JLabel("<HTML><U>学生信息</U></HTML>");
		lab1.setBackground(new Color(204, 204, 153));
		lab1.setFont(new Font("新宋体", Font.BOLD, 23));
		lab1.setBounds(35, 80, 100, 50);
		lab1.setForeground(UIManager.getColor("CheckBox.highlight"));
		lab1.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent e) {
				//System.out.println("学生信息");
					StudentTable.jp.setVisible(true);
					
					lab1.setForeground(Color.WHITE);
					lab2.setForeground(Color.BLACK);
					lab3.setForeground(Color.BLACK);
					lab4.setForeground(Color.BLACK);
//					lab5.setForeground(Color.BLUE);
					lab6.setForeground(Color.BLACK);
			}
			public void mouseEntered(MouseEvent e) {
			}
			public void mouseExited(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {
			}
			public void mouseReleased(MouseEvent e) {
			}

		});

		lab2 = new JLabel("<HTML><U>宿舍信息</U></HTML>");
		lab2.setFont(new Font("新宋体", Font.BOLD, 23));
		lab2.setBounds(35,180, 100, 50);
		lab2.setForeground(UIManager.getColor("CheckBox.highlight"));
		lab2.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println("宿舍信息");
				StudentTable.jp.setVisible(false);
				ManagerTable.jp.setVisible(false);
				DormTable.jp.setVisible(true);
				
				lab1.setForeground(Color.BLACK);
				lab2.setForeground(Color.WHITE);
				lab3.setForeground(Color.BLACK);
				lab4.setForeground(Color.BLACK);
//				lab5.setForeground(Color.BLUE);
				lab6.setForeground(Color.BLACK);

			}

			public void mouseEntered(MouseEvent e) {
			}
			public void mouseExited(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {
			}
			public void mouseReleased(MouseEvent e) {
			}

		});

		lab3 = new JLabel("<HTML><U>宿管信息</U></HTML>");
		lab3.setFont(new Font("新宋体", Font.BOLD, 23));
		lab3.setBounds(35, 280, 100, 50);
		lab3.setForeground(UIManager.getColor("CheckBox.highlight"));
		lab3.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent e) {
				//System.out.println("宿管信息");
				StudentTable.jp.setVisible(false);
				ManagerTable.jp.setVisible(true);
				
				lab1.setForeground(Color.BLACK);
				lab2.setForeground(Color.BLACK);
				lab3.setForeground(Color.WHITE);
				lab4.setForeground(Color.BLACK);
//				lab5.setForeground(Color.BLUE);
				lab6.setForeground(Color.BLACK);
			}
			public void mouseEntered(MouseEvent e) {
			}
			public void mouseExited(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {
			}
			public void mouseReleased(MouseEvent e) {
			}

		});

		lab4 = new JLabel("<HTML><U>宿舍评比</U></HTML>");
		lab4.setFont(new Font("新宋体", Font.BOLD, 23));
		lab4.setBounds(35, 380, 100, 50);
		lab4.setForeground(UIManager.getColor("CheckBox.interiorBackground"));
		lab4.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent e) {
				//System.out.println("宿舍评比");
				StudentTable.jp.setVisible(false);
				ManagerTable.jp.setVisible(false);
				DormTable.jp.setVisible(false);
				GradeTable.jp.setVisible(true);
				
				lab1.setForeground(Color.BLACK);
				lab2.setForeground(Color.BLACK);
				lab3.setForeground(Color.BLACK);
				lab4.setForeground(Color.WHITE);
//				lab5.setForeground(Color.BLUE);
				lab6.setForeground(Color.BLACK);
			}
			public void mouseEntered(MouseEvent e) {
			}
			public void mouseExited(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {
			}
			public void mouseReleased(MouseEvent e) {
			}

		});
//		lab5 = new JLabel("<HTML><U>账号查询</U></HTML>");
//		lab5.setFont(new Font("华文楷体", Font.BOLD, 23));
//		lab5.setBounds(35,430,100,50);
//		lab5.setForeground(Color.BLUE);
//		lab5.addMouseListener(new MouseListener() {
//
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				//System.out.println("账号查询"); 
//				StudentTable.jp.setVisible(false);
//				ManagerTable.jp.setVisible(false);
//				DormTable.jp.setVisible(false);
//				GradeTable.jp.setVisible(false);
//				RegisterTable.jp.setVisible(true);
//				
//				lab1.setForeground(Color.BLUE);
//				lab2.setForeground(Color.BLUE);
//				lab3.setForeground(Color.BLUE);
//				lab4.setForeground(Color.BLUE);
//				lab5.setForeground(Color.RED);
//				lab6.setForeground(Color.BLUE);
//				
//			}
//			public void mouseEntered(MouseEvent e) {
//			}
//			public void mouseExited(MouseEvent e) {
//			}
//			public void mousePressed(MouseEvent e) {
//			}
//			public void mouseReleased(MouseEvent e) {
//			}
//			
//		});
		lab6 = new JLabel("<HTML><U>密码重置</U></HTML>");
		lab6.setFont(new Font("新宋体", Font.BOLD, 23));
		lab6.setBounds(35,480,100,50);
		lab6.setForeground(UIManager.getColor("CheckBox.highlight"));
		lab6.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println("密码重置");
				StudentTable.jp.setVisible(false);
				ManagerTable.jp.setVisible(false);
				DormTable.jp.setVisible(false);
				GradeTable.jp.setVisible(false);
//				RegisterTable.jp.setVisible(false);
				new ResetPassword();
				lab1.setForeground(Color.BLACK);
				lab2.setForeground(Color.BLACK);
				lab3.setForeground(Color.BLACK);
				lab4.setForeground(Color.BLACK);
//				lab5.setForeground(Color.BLUE);
				lab6.setForeground(Color.WHITE);
								
			}
			public void mouseEntered(MouseEvent e) {
			}
			public void mouseExited(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {
			}
			public void mouseReleased(MouseEvent e) {
			}
			
		});
		getContentPane().add(lab6);
		
		ImageIcon ilogout = new ImageIcon("image\\logout.png");
		logout = new JButton(new ImageIcon("E:\\eclipse\\workspace\\DormitorySystem\\image\\logout.png"));
		logout.setBounds(240, 550, 100, 45);
		logout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==logout){
					String[] options=new String[]{"是","否"};
					int n =	JOptionPane.showOptionDialog( null,"确定注销系统？？？","提示",
							JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null,options,options[0]);
					//点击是的话，注销
					if(n == JOptionPane.YES_OPTION){
						setVisible(false);
						new Login();
					}
				}
				
			}
			
		});
		getContentPane().add(logout);
		
		ImageIcon ic = new ImageIcon("image\\exit.png");
		exit = new JButton(ic);
		exit.setBounds(820, 550, 100, 45);
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==exit){
					String[] options=new String[]{"是","否"};
					int n =	JOptionPane.showOptionDialog( null,"确定退出系统？？？","提示",
							JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null,options,options[0]);
					//点击是的话，直接退出
					if(n == JOptionPane.YES_OPTION){
						setVisible(false);
						System.exit(0);
					}
				}
				
			}
		});
		getContentPane().add(exit);
		
		getContentPane().add(new StudentTable().getpanel());
		getContentPane().add(new ManagerTable().getpanel());
		getContentPane().add(new DormTable().getpanel());
		getContentPane().add(new GradeTable().getpanel());
		getContentPane().add(lab1);
		getContentPane().add(lab2);
		getContentPane().add(lab3);
		getContentPane().add(lab4);
//		this.add(lab5);
		getContentPane().add(label);
		getContentPane().add(jpl);
		
		Image image = this.getToolkit().getImage("image\\icon.png");
		this.setIconImage(image);
		this.setSize(960,640); // 窗体的大小
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 关闭窗口
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
	}

	/**
	 * 带有滚动效果的Label标签
	 */
	private class MoveLabel extends JLabel implements Runnable {

		private String text = null;
		private Thread thread = null;
		private int x = 0;
		private int w = 0, h = 0;

		public MoveLabel(String text) {
			super(text);
			this.text = text;
			thread = new Thread(this);
			thread.start();
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			super.setText(text);
			this.text = text;
		}

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(this.getBackground());
			g.fillRect(0, 0, w = this.getWidth(), h = this.getHeight());
			g.setColor(this.getForeground());
			g.setFont(this.getFont());
			g.drawString(text, x, h - 2);
		}

		public void run() {
			while (true) {
				x -= 2;
				if (x < -w) {
					x = w;
				}
				this.repaint();
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}