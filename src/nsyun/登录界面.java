package nsyun;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;

public class 登录界面 extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					登录界面 frame = new 登录界面();
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
	public 登录界面() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 502, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton button = new JButton("\u767B\u5F55");
		button.setFont(new Font("宋体", Font.PLAIN, 18));
		button.setBounds(196, 247, 113, 27);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		contentPane.add(button);
		
		JLabel label = new JLabel("\u8D26\u53F7:");
		label.setBounds(72, 84, 43, 27);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u5BC6\u7801:");
		label_1.setBounds(72, 137, 43, 27);
		contentPane.add(label_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(129, 138, 248, 24);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(129, 85, 248, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblhis = new JLabel("\u6B22\u8FCE\u767B\u9646HIS\u533B\u7597\u7CFB\u7EDF");
		lblhis.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblhis.setBounds(148, 25, 229, 27);
		contentPane.add(lblhis);
		
		JRadioButton radioButton = new JRadioButton("\u6302\u53F7\u5458");
		radioButton.setBounds(86, 194, 73, 27);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("\u533B\u751F");
		radioButton_1.setBounds(202, 194, 65, 27);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("\u836F\u623F\u4EBA\u5458");
		radioButton_2.setBounds(293, 194, 157, 27);
		contentPane.add(radioButton_2);
	}
}
