package controller;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controller.model.exception.LoginError;
import controller.model.loggin.EventLogging;
import util.FileRegistry;

public class LoginPage extends JFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new LoginPage();
			}
		});
	}

	public LoginPage() {
		super("Inicio de Session");
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		placeComponents();
		setVisible(true);
	}

	private void placeComponents() {

		setLayout(null);

		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(10, 10, 80, 25);
		add(userLabel);

		JTextField userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		add(userText);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 40, 80, 25);
		add(passwordLabel);

		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 40, 160, 25);
		add(passwordText);

		JButton loginButton = new JButton("login");
		loginButton.setBounds(10, 80, 80, 25);
		add(loginButton);

		JButton registerButton = new JButton("register");
		registerButton.setBounds(180, 80, 80, 25);
		add(registerButton);

		loginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String userName = userText.getText();
				String password = passwordText.getText();
				JButton source = (JButton) e.getSource();
				String nowDate = FileRegistry.getNowDateString();
				if (userName.trim().equals("admin") && password.trim().equals("admin")) {
					try {
						
						EventLogging event = new EventLogging(nowDate, "login",
								userName.trim() + " Se autentifico correctamente");
						FileRegistry.saveLog("log-login.txt", true, event);
						setVisible(false);
						new HomePage().setVisible(true);
					} catch (IOException e1) {
						System.out.println(e1);
						JOptionPane.showMessageDialog(source, "No se puede guardar log de autentificacion");
					}
					
				} else {
					
					try {
						throw new LoginError(userName.trim() + "  No se autentifico correctamente");
						
					} catch (LoginError e1) { 
						EventLogging event = new EventLogging(nowDate, "login",
								userName.trim() + e1.getMessage());
						try {
							FileRegistry.saveLog("log-login.txt", true, event);
						} catch (IOException e2) {
							System.out.println(e1);
							JOptionPane.showMessageDialog(source, "No se puede guardar log de autentificacion");
						}
						
						JOptionPane.showMessageDialog(source, " Login error");
					}
					
				}
			}
		});

		registerButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton source = (JButton) e.getSource();
				JOptionPane.showMessageDialog(source, source.getText() + " button has been pressed");
			}
		});
	}

}
