package 医生;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BaseFrameDao.BaseFrameDao;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class 看诊界面 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					看诊界面 frame = new 看诊界面();
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
	public 看诊界面() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1271, 742);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(498, 13, 741, 669);
		contentPane.add(tabbedPane);
		
		JLabel label = new JLabel("");
		label.setVerticalAlignment(SwingConstants.TOP);
		tabbedPane.addTab("病历首页", null, label, null);
		
		JLabel lblNewLabel = new JLabel("");
		tabbedPane.addTab("检查申请", null, lblNewLabel, null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		tabbedPane.addTab("病历处方", null, lblNewLabel_2, null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		tabbedPane.addTab("费用查询", null, lblNewLabel_1, null);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(65, 13, 116, 106);
		BaseFrameDao.GUI(label_2, "C:\\Users\\admin\\Desktop\\pic\\234617-1302.jpg");
		contentPane.add(label_2);
		
		JLabel label_1 = new JLabel("\u533B  \u751F");
		label_1.setBounds(195, 13, 139, 54);
		label_1.setForeground(UIManager.getColor("Button.shadow"));
		label_1.setBackground(UIManager.getColor("Button.light"));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 40));
		contentPane.add(label_1);
		
		JLabel label_3 = new JLabel("\u95E8  \u8BCA  \u5904");
		label_3.setBounds(195, 65, 168, 64);
		label_3.setForeground(UIManager.getColor("Button.shadow"));
		label_3.setFont(new Font("微软雅黑", Font.PLAIN, 40));
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(30, 150, 62, 54);
		BaseFrameDao.GUI(label_4, "C:\\Users\\admin\\Desktop\\pic\\7-1302201A41146.jpg");
		contentPane.add(label_4);
		
		JLabel lblNewLabel_3 = new JLabel("\u672A\u5C31\u8BCA\u60A3\u8005");
		lblNewLabel_3.setForeground(UIManager.getColor("Button.darkShadow"));
		lblNewLabel_3.setBounds(41, 150, 222, 54);
		lblNewLabel_3.setBackground(UIManager.getColor("Button.disabledShadow"));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		contentPane.add(lblNewLabel_3);
		
		JLabel label_5 = new JLabel("");
		BaseFrameDao.GUI(label_5, "C:\\Users\\admin\\Desktop\\pic\\234617-1302201A4146.jpg");
		label_5.setBounds(30, 408, 62, 54);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\u5DF2\u5C31\u8BCA\u60A3\u8005");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(SystemColor.controlDkShadow);
		label_6.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		label_6.setBackground(Color.WHITE);
		label_6.setBounds(41, 408, 222, 54);
		contentPane.add(label_6);
		
		textField = new JTextField();
		textField.setBounds(26, 150, 452, 532);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
