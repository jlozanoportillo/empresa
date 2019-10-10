package controller;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

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

        if (userName.trim().equals("admin") && password.trim().equals("admin")) {
          JOptionPane.showMessageDialog(source, " Login sucessfull"); 
          
          
          setVisible(false);
          new HomePage().setVisible(true);
        } else {
          JOptionPane.showMessageDialog(source, " Login error");
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
