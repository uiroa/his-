package 挂号员;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JSplitPane;
import javax.swing.JMenuBar;
import javax.swing.JSlider;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

public class 挂号界面 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					挂号界面 window = new 挂号界面();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public 挂号界面() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.control);
		frame.setBounds(100, 100, 1082, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u75C5\u5386\u53F7:");
		label.setBounds(80, 141, 91, 18);
		label.setFont(new Font("宋体", Font.PLAIN, 18));
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setBounds(148, 138, 143, 24);
		textField.setFont(new Font("宋体", Font.PLAIN, 18));
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("\u59D3    \u540D:");
		label_1.setBounds(318, 141, 88, 18);
		label_1.setFont(new Font("宋体", Font.PLAIN, 18));
		frame.getContentPane().add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(404, 138, 129, 24);
		textField_1.setFont(new Font("宋体", Font.PLAIN, 18));
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_2 = new JLabel("\u6027\u522B:");
		label_2.setBounds(562, 141, 72, 18);
		label_2.setFont(new Font("宋体", Font.PLAIN, 18));
		frame.getContentPane().add(label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(614, 138, 98, 24);
		comboBox.setFont(new Font("宋体", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u7537", "\u5973"}));
		frame.getContentPane().add(comboBox);
		
		JList list = new JList();
		list.setBounds(347, 185, 119, -39);
		frame.getContentPane().add(list);
		
		JLabel label_3 = new JLabel("\u51FA\u751F\u65E5\u671F:");
		label_3.setBounds(741, 141, 113, 18);
		label_3.setFont(new Font("宋体", Font.PLAIN, 18));
		frame.getContentPane().add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(827, 138, 151, 24);
		textField_2.setFont(new Font("宋体", Font.PLAIN, 18));
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_4 = new JLabel("\u7535  \u8BDD:");
		label_4.setBounds(80, 254, 72, 18);
		label_4.setFont(new Font("宋体", Font.PLAIN, 18));
		frame.getContentPane().add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(148, 251, 143, 24);
		textField_3.setFont(new Font("宋体", Font.PLAIN, 18));
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_5 = new JLabel("\u5E74  \u9F84:");
		label_5.setBounds(80, 198, 72, 18);
		label_5.setFont(new Font("宋体", Font.PLAIN, 18));
		frame.getContentPane().add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(148, 195, 86, 24);
		textField_4.setFont(new Font("宋体", Font.PLAIN, 18));
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_6 = new JLabel("\u8EAB\u4EFD\u8BC1\u53F7:");
		label_6.setBounds(318, 201, 113, 18);
		label_6.setFont(new Font("宋体", Font.PLAIN, 18));
		frame.getContentPane().add(label_6);
		
		textField_5 = new JTextField();
		textField_5.setBounds(404, 198, 308, 24);
		textField_5.setFont(new Font("宋体", Font.PLAIN, 18));
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel label_7 = new JLabel("\u5BB6\u5EAD\u4F4F\u5740:");
		label_7.setBounds(318, 257, 88, 18);
		label_7.setFont(new Font("宋体", Font.PLAIN, 18));
		frame.getContentPane().add(label_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(404, 254, 308, 24);
		textField_6.setFont(new Font("宋体", Font.PLAIN, 18));
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(248, 195, 44, 24);
		comboBox_1.setFont(new Font("宋体", Font.PLAIN, 18));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\u5C81", "\u6708", "\u5929"}));
		frame.getContentPane().add(comboBox_1);
		
		JLabel label_8 = new JLabel("\u7ED3\u7B97\u7C7B\u522B:");
		label_8.setBounds(80, 316, 119, 18);
		label_8.setFont(new Font("宋体", Font.PLAIN, 18));
		frame.getContentPane().add(label_8);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setBounds(166, 313, 125, 24);
		comboBox_2.setFont(new Font("宋体", Font.PLAIN, 18));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"\u81EA\u8D39", "\u5E02\u533B\u4FDD", "\u65B0\u519C\u5408"}));
		frame.getContentPane().add(comboBox_2);
		
		JLabel label_9 = new JLabel("\u770B\u8BCA\u65E5\u671F:");
		label_9.setBounds(741, 313, 113, 18);
		label_9.setFont(new Font("宋体", Font.PLAIN, 18));
		frame.getContentPane().add(label_9);
		
		textField_7 = new JTextField();
		textField_7.setBounds(827, 310, 151, 24);
		textField_7.setFont(new Font("宋体", Font.PLAIN, 18));
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel label_10 = new JLabel("\u79D1    \u5BA4:");
		label_10.setBounds(318, 316, 113, 18);
		label_10.setFont(new Font("宋体", Font.PLAIN, 18));
		frame.getContentPane().add(label_10);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBackground(Color.WHITE);
		comboBox_3.setBounds(404, 313, 129, 24);
		comboBox_3.setFont(new Font("宋体", Font.PLAIN, 18));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"\u5185\u79D1", "\u5916\u79D1", "\u9AA8\u79D1", "\u513F\u79D1", "\u773C\u79D1", "\u8033\u9F3B\u5589\u79D1", "\u5176\u4ED6\u79D1\u5BA4"}));
		frame.getContentPane().add(comboBox_3);
		
		JLabel label_11 = new JLabel("\u53F7\u522B:");
		label_11.setBounds(556, 313, 72, 18);
		label_11.setFont(new Font("宋体", Font.PLAIN, 18));
		frame.getContentPane().add(label_11);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBackground(Color.WHITE);
		comboBox_4.setBounds(608, 310, 104, 24);
		comboBox_4.setFont(new Font("宋体", Font.PLAIN, 18));
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"\u666E\u901A\u53F7", "\u4E13\u5BB6\u53F7", "\u6025\u8BCA\u53F7"}));
		frame.getContentPane().add(comboBox_4);
		
		JLabel label_12 = new JLabel("\u770B\u8BCA\u533B\u751F:");
		label_12.setBounds(80, 376, 119, 18);
		label_12.setFont(new Font("宋体", Font.PLAIN, 18));
		frame.getContentPane().add(label_12);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBackground(Color.WHITE);
		comboBox_5.setBounds(166, 373, 135, 24);
		frame.getContentPane().add(comboBox_5);
		
		JRadioButton radioButton = new JRadioButton("\u662F\u5426\u9700\u8981\u75C5\u5386\u672C");
		radioButton.setBackground(Color.WHITE);
		radioButton.setBounds(318, 372, 157, 27);
		radioButton.setFont(new Font("宋体", Font.PLAIN, 18));
		frame.getContentPane().add(radioButton);
		
		JLabel label_13 = new JLabel("\u5E94\u6536\u91D1\u989D:");
		label_13.setBounds(272, 464, 91, 18);
		label_13.setFont(new Font("宋体", Font.PLAIN, 18));
		frame.getContentPane().add(label_13);
		
		textField_8 = new JTextField();
		textField_8.setBounds(365, 463, 86, 24);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel label_14 = new JLabel("\u6536\u8D39\u65B9\u5F0F:");
		label_14.setBounds(480, 464, 91, 18);
		label_14.setFont(new Font("宋体", Font.PLAIN, 18));
		frame.getContentPane().add(label_14);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBackground(Color.WHITE);
		comboBox_6.setBounds(585, 461, 97, 24);
		comboBox_6.setFont(new Font("宋体", Font.PLAIN, 18));
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"\u73B0\u91D1", "\u5FAE\u4FE1", "\u652F\u4ED8\u5B9D"}));
		frame.getContentPane().add(comboBox_6);
		
		JButton button = new JButton("\u6302\u53F7");
		button.setBounds(302, 544, 129, 38);
		button.setFont(new Font("宋体", Font.PLAIN, 21));
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u6E05\u7A7A");
		button_1.setBounds(593, 544, 126, 38);
		button_1.setFont(new Font("宋体", Font.PLAIN, 21));
		frame.getContentPane().add(button_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(51, 101, 963, 512);
		frame.getContentPane().add(panel_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(51, 13, 963, 78);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblHis = new JLabel("HIS\u533B\u7597\u7CFB\u7EDF-\u6302\u53F7\u754C\u9762");
		lblHis.setBounds(304, 0, 317, 78);
		panel.add(lblHis);
		lblHis.setBackground(Color.LIGHT_GRAY);
		lblHis.setFont(new Font("微软雅黑", Font.BOLD, 28));
	}
}
