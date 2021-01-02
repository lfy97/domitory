
package System;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import Control.RegisterControl;
import Model.RegisterModel;
import Operation.StudentsOperation;
import TableStudent.PersonInformation;
import java.awt.SystemColor;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class Login extends JFrame implements ActionListener {

	Managers managers;
	public static JTextField text1;
	JPasswordField text2 = new JPasswordField();

	private JButton enter = new JButton("登   录");
	Font butfont = new Font("宋体", Font.BOLD, 20);
	

	private JFrame frame = new JFrame();
	private JPanel jpl = new JPanel();
	JComboBox comboBox;

	@SuppressWarnings("unchecked")
	public Login() {

		JLabel lab1 = new JLabel("身份:");
		jpl.setForeground(Color.black);
		jpl.add(lab1);
		lab1.setBounds(70, 203, 100, 50);
		lab1.setFont(new Font("新宋体", Font.BOLD, 18));

		comboBox = new JComboBox();
		comboBox.setForeground(Color.DARK_GRAY);
		comboBox.setBounds(138, 212, 150, 30);
		comboBox.addItem("管理员");
		comboBox.addItem("宿管");
		comboBox.addItem("学生");
		comboBox.setFont(new Font("微软雅黑 Light", Font.PLAIN, 17));
		jpl.add(comboBox);
		// 背景
		JLabel label = new JLabel(new ImageIcon("E:\\eclipse\\workspace\\DormitorySystem\\image\\logo.png"));
		label.setLocation(37, 28);
		label.setSize(150, 136);
		Image image = this.getToolkit().getImage("image\\icon.png");

		jpl.setLayout(null);
		enter.setForeground(UIManager.getColor("CheckBox.darkShadow"));
		jpl.add(enter);
		jpl.add(label);

		// 窗体
		frame.getContentPane().add(jpl);
		frame.setForeground(Color.LIGHT_GRAY);
		frame.setIconImage(image);
		frame.setTitle("登录");
		frame.setSize(415, 565);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		// 登录
		enter.setBounds(154, 412, 120, 40); // 设置按钮大小
		enter.setBackground(SystemColor.inactiveCaptionBorder);
		enter.setVisible(true);
		enter.setLayout(null);
		enter.setFont(new Font("新宋体", Font.BOLD, 20));
		
				JLabel label0 = new JLabel("宿舍管理系统");
				jpl.add(label0);
				label0.setBounds(159, 67, 150, 50);
				label0.setFont(new Font("新宋体", Font.BOLD, 23));
				// 标签
				JLabel label2 = new JLabel("账号:");
				jpl.add(label2);
				label2.setBounds(70, 263, 100, 50);
				label2.setFont(new Font("新宋体", Font.BOLD, 18));
				
						// 账号
						text1 = new JTextField();
						text1.setBackground(UIManager.getColor("Button.background"));
						jpl.add(text1);
						text1.setBounds(138, 276, 150, 30);
						text1.setFont(new Font("黑体", Font.BOLD, 18));
						
								JLabel label3 = new JLabel("密码:");
								jpl.add(label3);
								label3.setBounds(70, 334, 100, 50);
								label3.setFont(new Font("新宋体", Font.BOLD, 18));
								
										JLabel label4 = new JLabel();
										jpl.add(label4);
										label4.setText("<HTML><U>忘记密码？</U></HTMl>");
										label4.setBounds(299, 338, 100, 50);
										label4.setForeground(Color.LIGHT_GRAY);
										label4.setFont(new Font("微软雅黑", Font.BOLD, 13));
										label4.setToolTipText("你是不是傻！！！密码都能忘？？？");
												text2.setBackground(UIManager.getColor("Button.background"));
												jpl.add(text2);
										
												// 密码
												text2.setBounds(138, 344, 150, 30);
												text2.setFont(new Font("", Font.BOLD, 24));
												text2.setEchoChar('*');
										label4.addMouseListener(new MouseListener() {

											public void mouseReleased(MouseEvent e) {
											}
											public void mousePressed(MouseEvent e) {
											}
											public void mouseExited(MouseEvent e) {
											}
											public void mouseEntered(MouseEvent e) {
											}
											public void mouseClicked(MouseEvent e) {
												JOptionPane.showMessageDialog(null, "请到管理处重置密码", "友情提示", JOptionPane.INFORMATION_MESSAGE);

											}
										});
		enter.addActionListener(new ButtonListener());
		enter.registerKeyboardAction(new ButtonListener(), KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0),
				JComponent.WHEN_IN_FOCUSED_WINDOW);

	}

	public static void main(String[] args) {
		new Login();

	}

	// 登录监听
	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			RegisterControl r = new RegisterControl();
			RegisterModel rr = null;
			boolean bb = false;
			if (text1.getText().length() == 0 || text2.getText().length() == 0) {
				JOptionPane.showMessageDialog(null, "账号或密码为空", "系统提示", JOptionPane.ERROR_MESSAGE);
				return;
			} else {
				try {
					rr = r.get(Integer.parseInt(text1.getText()));
				} catch (NumberFormatException e1) {
				} catch (Exception e1) {

					return;
				}
				if (rr != null) {
					bb = rr.getPassword().equals(text2.getText());
					//System.out.println(rr.getPassword() + "数据库中的密码");
				} else {
					JOptionPane.showMessageDialog(null, "账号密码有误", "系统提示", JOptionPane.ERROR_MESSAGE);
					text1.setText(null);
					text2.setText(null);
					return;
				}
				if (bb) {
//					System.out.println(comboBox.getSelectedItem().toString().equals(rr.getIdentity()));
					if (comboBox.getSelectedIndex()==rr.getIdentity()){
						frame.dispose();

						if (comboBox.getSelectedIndex()==2) {
							new Students();
							PersonInformation.jpl.setVisible(true);

						} else if (comboBox.getSelectedIndex()==1) {
							new Managers();
						} else {
							new Administrator();
						}
						return;
					} else {
						JOptionPane.showOptionDialog(managers, "身份有误！！！", "提示", JOptionPane.DEFAULT_OPTION,
								JOptionPane.PLAIN_MESSAGE, null, null, null);
						text2.setText(null);
						return;
					}
				}
			}
			JOptionPane.showMessageDialog(null, "账号密码有误", "系统提示", JOptionPane.ERROR_MESSAGE);
			text1.setText(null);
			text2.setText(null);
		}
	}

	public void actionPerformed(ActionEvent e) {

	}
}
