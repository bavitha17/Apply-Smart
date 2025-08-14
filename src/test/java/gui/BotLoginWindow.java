package gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

public class BotLoginWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BotLoginWindow frame = new BotLoginWindow();
					frame.setVisible(true);
					// Set the image as the window icon
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BotLoginWindow() {

		setTitle("APPLY SMART");
		setResizable(false);
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(123, 104, 238));
		panel.setBounds(0, 0, 360, 613);
		contentPane.add(panel);
		panel.setLayout(null);

		Label brandName = new Label("APPLY SMART");
		brandName.setAlignment(Label.CENTER);
		brandName.setFont(new Font("Dialog", Font.BOLD, 20));
		brandName.setBounds(40, 154, 310, 33);
		brandName.setForeground(new Color(255, 255, 255));
		panel.add(brandName);

		Label dialog = new Label("Let's make a trend to help job seekers!");
		dialog.setForeground(Color.WHITE);
		dialog.setFont(new Font("Dialog", Font.BOLD, 15));
		dialog.setAlignment(Label.CENTER);
		dialog.setBounds(29, 184, 310, 26);
		panel.add(dialog);

		TextField usernameTextField = new TextField();
		usernameTextField.setFont(new Font("Dialog", Font.BOLD, 20));
		usernameTextField.setBounds(458, 74, 211, 41);
		contentPane.add(usernameTextField);

		JPasswordField passwordTextField = new JPasswordField();
		passwordTextField.setFont(new Font("Dialog", Font.BOLD, 20));
		passwordTextField.setBounds(458, 157, 211, 41);
		contentPane.add(passwordTextField);

		Label passwordLabel = new Label("Enter Your Password*");
		passwordLabel.setBounds(458, 130, 211, 21);
		contentPane.add(passwordLabel);

		Label usernameLabel = new Label("Enter Your Username*");
		usernameLabel.setBounds(458, 47, 211, 21);
		contentPane.add(usernameLabel);

		Label errorMessage = new Label();
		errorMessage.setForeground(new Color(255, 69, 0));
		errorMessage.setBounds(458, 265, 211, 21);
		contentPane.add(errorMessage);

		Button loginButton = new Button("Login");
		loginButton.setActionCommand("Login");
		loginButton.setForeground(new Color(255, 255, 255));
		loginButton.setFont(new Font("Dialog", Font.BOLD, 30));
		loginButton.setBackground(new Color(123, 104, 238));
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EntriesGui entriesGui = new EntriesGui();
				final String usernameConstant = "user2024";
				final String passwordConstant = "defaultpassword";
				if (usernameTextField.getText().toString().equals(usernameConstant)
						&& passwordTextField.getText().toString().equals(passwordConstant)) {
					entriesGui.setVisible(true);
					dispose();
					entriesGui.loadData();
				} else {
					errorMessage.setText("Enter Correct Username & Password !!");
					//remove these codes
					entriesGui.setVisible(true);
					dispose();
					entriesGui.loadData();
				}

			}
		});
		loginButton.setBounds(458, 214, 211, 45);
		contentPane.add(loginButton);

	}
}
