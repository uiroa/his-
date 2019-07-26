package 挂号员;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

public class 退费界面 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					退费界面 frame = new 退费界面();
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
	public 退费界面() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1058, 648);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(40, 26, 963, 78);
		contentPane.add(panel);
		
		JLabel label = new JLabel("HIS\u533B\u7597\u7CFB\u7EDF-\u7F34\u8D39\u754C\u9762");
		label.setFont(new Font("微软雅黑", Font.BOLD, 28));
		label.setBackground(Color.LIGHT_GRAY);
		label.setBounds(339, 0, 317, 78);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(40, 123, 963, 443);
		contentPane.add(panel_1);
		
		JLabel label_1 = new JLabel("\u60A3\u8005\u4FE1\u606F\u67E5\u8BE2:");
		label_1.setFont(new Font("宋体", Font.PLAIN, 24));
		label_1.setBounds(30, 13, 186, 43);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("\u75C5\u5386\u53F7:");
		label_2.setFont(new Font("宋体", Font.PLAIN, 18));
		label_2.setBounds(52, 79, 72, 18);
		panel_1.add(label_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(138, 78, 118, 24);
		panel_1.add(textField);
		
		JButton button = new JButton("\u67E5\u8BE2");
		button.setFont(new Font("宋体", Font.PLAIN, 20));
		button.setBackground(new Color(204, 255, 255));
		button.setBounds(297, 67, 118, 43);
		panel_1.add(button);
		
		JLabel label_3 = new JLabel("\u60A3 \u8005 \u4FE1 \u606F :");
		label_3.setFont(new Font("宋体", Font.PLAIN, 24));
		label_3.setBounds(30, 140, 186, 43);
		panel_1.add(label_3);
		
		JButton button_1 = new JButton("\u7F34\u8D39");
		button_1.setFont(new Font("宋体", Font.PLAIN, 20));
		button_1.setBackground(new Color(204, 255, 255));
		button_1.setBounds(416, 368, 110, 43);
		panel_1.add(button_1);
	}
}
