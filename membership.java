package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class membership extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					membership frame = new membership();
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
	public membership() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(12, 10, 30, 30);
		panel.add(lblId);
		
		JLabel lblPassward = new JLabel("Password");
		lblPassward.setBounds(12, 60, 77, 30);
		panel.add(lblPassward);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setBounds(12, 103, 116, 30);
		panel.add(lblConfirmPassword);
		
		textField = new JTextField();
		textField.setBounds(12, 37, 116, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(12, 83, 116, 21);
		panel.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(12, 131, 116, 21);
		panel.add(passwordField_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(12, 202, 116, 21);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(12, 255, 116, 21);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(155, 255, 116, 21);
		panel.add(passwordField_2);
		
		JLabel label = new JLabel("-");
		label.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		label.setBounds(137, 255, 18, 21);
		panel.add(label);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(12, 177, 57, 15);
		panel.add(lblNewLabel);
		
		JLabel lblRegiseterNumber = new JLabel("Regiseter number");
		lblRegiseterNumber.setBounds(12, 233, 121, 15);
		panel.add(lblRegiseterNumber);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("\uC0AC\uC6A9\uC790 \uC815\uBCF4 \uC81C\uACF5\uC744 \uB3D9\uC758\uD569\uB2C8\uB2E4.");
		chckbxNewCheckBox.setBounds(183, 426, 218, 23);
		panel.add(chckbxNewCheckBox);
		
		JButton button = new JButton("\uCDE8\uC18C");
		button.setBounds(61, 455, 138, 50);
		panel.add(button);
		
		JButton button_1 = new JButton("\uD68C\uC6D0 \uAC00\uC785");
		button_1.setBounds(225, 455, 138, 50);
		panel.add(button_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("\uC0AC\uC6A9\uC790 \uC815\uBCF4\uC81C\uACF5 ");
		textPane.setEditable(false);
		textPane.setBounds(12, 299, 357, 121);
		panel.add(textPane);
	}
}
