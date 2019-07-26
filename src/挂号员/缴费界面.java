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

public class 缴费界面 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					缴费界面 frame = new 缴费界面();
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
	public 缴费界面() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1060, 651);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(40, 13, 963, 78);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBackground(new Color(224, 255, 255));
		
		JLabel lblHis = new JLabel("HIS\u533B\u7597\u7CFB\u7EDF-\u7F34\u8D39\u754C\u9762");
		lblHis.setBounds(339, 0, 317, 78);
		panel_1.add(lblHis);
		lblHis.setFont(new Font("微软雅黑", Font.BOLD, 28));
		lblHis.setBackground(Color.LIGHT_GRAY);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(40, 110, 963, 443);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		
		JLabel label_1 = new JLabel("\u60A3\u8005\u4FE1\u606F\u67E5\u8BE2:");
		label_1.setBounds(30, 13, 186, 43);
		panel_2.add(label_1);
		label_1.setFont(new Font("宋体", Font.PLAIN, 24));
		
		JLabel label_2 = new JLabel("\u75C5\u5386\u53F7:");
		label_2.setBounds(52, 79, 72, 18);
		panel_2.add(label_2);
		label_2.setFont(new Font("宋体", Font.PLAIN, 18));
		
		textField = new JTextField();
		textField.setBounds(138, 78, 118, 24);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("\u67E5\u8BE2");
		button.setBounds(297, 67, 118, 43);
		panel_2.add(button);
		button.setFont(new Font("宋体", Font.PLAIN, 20));
		button.setBackground(new Color(204, 255, 255));
		
		JLabel label_3 = new JLabel("\u60A3 \u8005 \u4FE1 \u606F :");
		label_3.setBounds(30, 140, 186, 43);
		panel_2.add(label_3);
		label_3.setFont(new Font("宋体", Font.PLAIN, 24));
		
		JButton button_1 = new JButton("\u7F34\u8D39");
		button_1.setBounds(416, 368, 110, 43);
		panel_2.add(button_1);
		button_1.setFont(new Font("宋体", Font.PLAIN, 20));
		button_1.setBackground(new Color(204, 255, 255));
	}
}
