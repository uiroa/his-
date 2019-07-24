package 挂号员;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class 退号界面 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					退号界面 frame = new 退号界面();
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
	public 退号界面() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1045, 625);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(29, 19, 963, 78);
		contentPane.add(panel);
		
		JLabel lblHis = new JLabel("HIS\u533B\u7597\u7CFB\u7EDF-\u9000\u53F7\u754C\u9762");
		lblHis.setFont(new Font("微软雅黑", Font.BOLD, 28));
		lblHis.setBackground(Color.LIGHT_GRAY);
		lblHis.setBounds(311, 0, 317, 78);
		panel.add(lblHis);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(29, 109, 963, 443);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u60A3\u8005\u4FE1\u606F\u67E5\u8BE2:");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 24));
		lblNewLabel.setBounds(24, 13, 186, 43);
		panel_1.add(lblNewLabel);
		
		JLabel label = new JLabel("\u75C5\u5386\u53F7:");
		label.setFont(new Font("宋体", Font.PLAIN, 18));
		label.setBounds(55, 69, 72, 18);
		panel_1.add(label);
		
		textField = new JTextField();
		textField.setBounds(121, 68, 118, 24);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("\u67E5\u8BE2");
		button.setFont(new Font("宋体", Font.PLAIN, 20));
		button.setBounds(276, 57, 118, 43);
		panel_1.add(button);
		
		JLabel label_1 = new JLabel("\u60A3 \u8005 \u4FE1 \u606F :");
		label_1.setFont(new Font("宋体", Font.PLAIN, 24));
		label_1.setBounds(24, 122, 186, 43);
		panel_1.add(label_1);
		
		table = new JTable();
		table.setBackground(new Color(0, 0, 0));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(80, 307, 192, -114);
		panel_1.add(table);
	}
}
