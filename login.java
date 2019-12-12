package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.image.*;
import javax.swing.JTextArea;
import javax.swing.JPanel;




public class login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setTitle("My Diary");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(200, 43, 391, 462);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("\uC544\uC774\uB514 \uCC3E\uAE30");
		btnNewButton.setBounds(24, 363, 108, 63);
		panel_1.add(btnNewButton);
		
		JButton button = new JButton("\uBE44\uBC00\uBC88\uD638 \uCC3E\uAE30");
		button.setBounds(147, 363, 108, 63);
		panel_1.add(button);
		
		JButton button_1 = new JButton("\uD68C\uC6D0\uAC00\uC785");
		button_1.setBounds(267, 363, 108, 63);
		panel_1.add(button_1);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		lblId.setBounds(24, 100, 63, 30);
		panel_1.add(lblId);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		lblPassword.setBounds(24, 184, 108, 30);
		panel_1.add(lblPassword);
		
		JButton button_2 = new JButton("\uB85C\uADF8\uC778");
		button_2.setBounds(278, 140, 97, 118);
		panel_1.add(button_2);
		
		textField = new JTextField();
		textField.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		textField.setBounds(24, 140, 206, 34);
		panel_1.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		passwordField.setBounds(24, 224, 206, 34);
		panel_1.add(passwordField);
	
		
	}
}
