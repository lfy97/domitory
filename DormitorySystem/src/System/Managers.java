package System;

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

import ButtonFrame.GradeRefer;
import TableManager.DormTable;
import TableManager.GradeTable;
import TableManager.PartStudentTable;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class Managers extends JFrame {

	private JPanel jpl = null;
	private MoveLabel label = null;
	JButton logout, exit;
	JLabel lab1, lab2, lab3, lab4, lab5;

	public Managers() {
		super("�������ϵͳ");
		jpl = new JPanel();
		jpl.setBackground(UIManager.getColor("Panel.background"));
		label = new MoveLabel(
				"��ӭ��¼�������ϵͳ                                                                                                    ��ӭ��¼�������ϵͳ                                                                                                    ��ӭ��¼�������ϵͳ");
		label.setOpaque(false); // ͸��
		label.setForeground(Color.white);
		label.setFont(new Font("����", Font.BOLD, 20));
		
		label.setSize(1366, 20);
		label.setBackground(Color.gray);

		lab1 = new JLabel("<HTML><U>ѧ����Ϣ</U></HTML>");
		lab1.setFont(new Font("������", Font.BOLD, 23));
		lab1.setBounds(35, 50, 100, 50);
		lab1.setForeground(Color.black);
		lab1.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				//System.out.println("����");
				PartStudentTable.jp.setVisible(true);
				DormTable.jp.setVisible(false);
				GradeTable.jp.setVisible(false);
				lab1.setForeground(Color.white);
				lab2.setForeground(Color.black);
				lab3.setForeground(Color.black);
				lab4.setForeground(Color.black);
				lab5.setForeground(Color.black);
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

		lab2 = new JLabel("<HTML><U>������Ϣ</U></HTML>");
		lab2.setFont(new Font("������", Font.BOLD, 23));
		lab2.setBounds(35, 150, 100, 50);
		lab2.setForeground(Color.black);
		lab2.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				//System.out.println("����");
				PartStudentTable.jp.setVisible(false);
				GradeTable.jp.setVisible(false);
				DormTable.jp.setVisible(true);
				lab1.setForeground(Color.black);
				lab2.setForeground(Color.white);
				lab3.setForeground(Color.black);
				lab4.setForeground(Color.black);
				lab5.setForeground(Color.black);
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

		lab3 = new JLabel("<HTML><U>��������</U></HTML>");
		lab3.setFont(new Font("������", Font.BOLD, 23));
		lab3.setBounds(35, 250, 100, 50);
		lab3.setForeground(Color.black);
		lab3.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				//System.out.println("����");
				PartStudentTable.jp.setVisible(false);
				DormTable.jp.setVisible(false);
				GradeTable.jp.setVisible(true);
				lab1.setForeground(Color.black);
				lab2.setForeground(Color.black);
				lab3.setForeground(Color.white);
				lab4.setForeground(Color.black);
				lab5.setForeground(Color.black);
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
		lab4 = new JLabel("<HTML><U>�����ύ</U></HTML>");
		lab4.setFont(new Font("������", Font.BOLD, 23));
		lab4.setBounds(35, 350, 100, 50);
		lab4.setForeground(Color.black);
		lab4.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				//System.out.println("����");
				PartStudentTable.jp.setVisible(false);
				DormTable.jp.setVisible(false);
				GradeTable.jp.setVisible(false);
				new GradeRefer();
				lab1.setForeground(Color.black);
				lab2.setForeground(Color.black);
				lab3.setForeground(Color.black);
				lab4.setForeground(Color.white);
				lab5.setForeground(Color.black);
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
		lab5 = new JLabel("<HTML><U>�޸�����</U></HTML>");
		lab5.setFont(new Font("������", Font.BOLD, 23));
		lab5.setBounds(35, 450, 100, 50);
		lab5.setForeground(Color.black);
		lab5.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				//System.out.println("����");
				PartStudentTable.jp.setVisible(false);
				DormTable.jp.setVisible(false);
				GradeTable.jp.setVisible(false);
				new ChangePassword();
				lab1.setForeground(Color.black);
				lab2.setForeground(Color.black);
				lab3.setForeground(Color.black);
				lab4.setForeground(Color.black);
				lab5.setForeground(Color.white);
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

		JLabel lab = new JLabel(new ImageIcon("image\\back.jpg"));
		jpl.add(lab);

		ImageIcon ilogout = new ImageIcon("image\\logout.png");
		logout = new JButton(ilogout);
		logout.setBounds(240, 550, 100, 45);
		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == logout) {
					String[] options = new String[] { "��", "��" };
					int n = JOptionPane.showOptionDialog(null, "ȷ��ע��ϵͳ������", "��ʾ", JOptionPane.DEFAULT_OPTION,
							JOptionPane.WARNING_MESSAGE, null, options, options[0]);
					// ����ǵĻ���ע��
					if (n == JOptionPane.YES_OPTION) {
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
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == exit) {
					String[] options = new String[] { "��", "��" };
					int n = JOptionPane.showOptionDialog(null, "ȷ���˳�ϵͳ������", "��ʾ", JOptionPane.DEFAULT_OPTION,
							JOptionPane.WARNING_MESSAGE, null, options, options[0]);
					// ����ǵĻ���ֱ���˳�
					if (n == JOptionPane.YES_OPTION) {
						setVisible(false);
						System.exit(0);
					}
				}

			}
		});
		getContentPane().add(exit);

		getContentPane().add(new PartStudentTable().getpanel());
		getContentPane().add(new DormTable().getpanel());
		getContentPane().add(new GradeTable().getpanel());
		getContentPane().add(lab1);
		getContentPane().add(lab2);
		getContentPane().add(lab3);
		getContentPane().add(lab4);
		getContentPane().add(lab5);
		getContentPane().add(label);
		getContentPane().add(jpl);
		Image image = this.getToolkit().getImage("image\\icon.png");
		this.setIconImage(image);
		this.setSize(960, 640); // ����Ĵ�С
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �رմ���
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}

	/**
	 * ���й���Ч����Label��ǩ
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