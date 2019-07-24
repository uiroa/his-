package nsyun;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class 欢迎界面 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					欢迎界面 frame = new 欢迎界面();
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
	public 欢迎界面() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 696, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u6B22\u8FCE:");
		label.setFont(new Font("宋体", Font.PLAIN, 22));
		label.setBounds(14, 54, 95, 35);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.PLAIN, 22));
		textField.setBounds(74, 54, 135, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u6302\u53F7\u754C\u9762");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(204, 255, 255));
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 26));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(97, 146, 187, 58);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\u7F34\u8D39\u754C\u9762");
		button.setBackground(new Color(204, 255, 255));
		button.setFont(new Font("宋体", Font.PLAIN, 26));
		button.setBounds(373, 146, 187, 58);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u9000\u8D39\u754C\u9762");
		button_1.setBackground(new Color(204, 255, 255));
		button_1.setFont(new Font("宋体", Font.PLAIN, 26));
		button_1.setBounds(373, 255, 187, 58);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u9000\u53F7\u754C\u9762");
		button_2.setBackground(new Color(204, 255, 255));
		button_2.setFont(new Font("宋体", Font.PLAIN, 26));
		button_2.setBounds(97, 255, 187, 58);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("\u6CE8\u9500");
		button_3.setBounds(536, 13, 113, 27);
		contentPane.add(button_3);
	}

}
