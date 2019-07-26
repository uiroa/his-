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
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;

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
		button.setBackground(new Color(204, 255, 255));
		button.setFont(new Font("宋体", Font.PLAIN, 20));
		button.setBounds(276, 57, 118, 43);
		panel_1.add(button);
		
		JLabel label_1 = new JLabel("\u60A3 \u8005 \u4FE1 \u606F :");
		label_1.setFont(new Font("宋体", Font.PLAIN, 24));
		label_1.setBounds(24, 122, 186, 43);
		panel_1.add(label_1);
		
		JButton button_1 = new JButton("\u9000\u53F7");
		button_1.setBackground(new Color(204, 255, 255));
		button_1.setFont(new Font("宋体", Font.PLAIN, 20));
		button_1.setBounds(418, 371, 110, 43);
		panel_1.add(button_1);
		
		table = new JTable();
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setFillsViewportHeight(true);
		table.setSurrendersFocusOnKeystroke(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(55, 178, 851, 162);
		panel_1.add(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(885, 178, 21, 162);
		panel_1.add(scrollBar);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setOrientation(JScrollBar.HORIZONTAL);
		scrollBar_1.setBounds(55, 316, 851, 24);
		panel_1.add(scrollBar_1);
	}
}
