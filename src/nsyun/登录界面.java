package nsyun;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BaseFrameDao.BaseFrameDao;

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
import java.awt.Color;

public class µÇÂ¼½çÃæ extends JFrame {

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
					µÇÂ¼½çÃæ frame = new µÇÂ¼½çÃæ();
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
	public µÇÂ¼½çÃæ() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 658, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton button = new JButton("\u767B\u5F55");
		button.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 26));
		button.setBounds(252, 323, 127, 43);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		contentPane.add(button);
		
		JLabel label = new JLabel("\u8D26\u53F7:");
		label.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 24));
		label.setBounds(111, 160, 60, 27);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u5BC6\u7801:");
		label_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 24));
		label_1.setBounds(111, 213, 60, 27);
		contentPane.add(label_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(195, 212, 311, 34);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
		textField.setBounds(195, 158, 311, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblhis = new JLabel("\u6B22\u8FCE\u767B\u5F55HIS\u533B\u7597\u7CFB\u7EDF");
		lblhis.setForeground(new Color(0, 0, 0));
		lblhis.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 34));
		lblhis.setBounds(212, 49, 342, 63);
		contentPane.add(lblhis);
		
		JRadioButton radioButton = new JRadioButton("\u6302\u53F7\u5458");
		radioButton.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
		radioButton.setBounds(136, 267, 96, 27);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("\u533B\u751F");
		radioButton_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
		radioButton_1.setBounds(265, 267, 85, 27);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("\u836F\u623F\u4EBA\u5458");
		radioButton_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
		radioButton_2.setBounds(384, 267, 157, 27);
		contentPane.add(radioButton_2);
		
		JLabel label_2 = new JLabel("");
		BaseFrameDao.GUI(label_2, "C:\\Users\\admin\\Desktop\\pic\\318-50015.jpg");
		label_2.setBounds(129, 49, 73, 63);
		contentPane.add(label_2);
	}
}
