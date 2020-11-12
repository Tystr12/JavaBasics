import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener, KeyListener {

	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;
	private static JLabel failure;
	private static String usernameInput;
	private static String passwordInput;
	
	

	public static void main(String[] args) {
		
		usernameInput = JOptionPane.showInputDialog("Enter your username");
		passwordInput = JOptionPane.showInputDialog("Enter your password");
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();

		frame.setSize(350, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);

		panel.setLayout(null);

		userLabel = new JLabel("User");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);

		userText = new JTextField();
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);

		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);

		passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		passwordText.addKeyListener(new KeyDemoKeyListener());
	
		panel.add(passwordText);

		button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new GUI());
		
		panel.add(button);

		success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);
		
		failure = new JLabel("");
		failure.setBounds(10, 110, 300, 25);
		panel.add(failure);
		
		

		frame.setVisible(true);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		  if (e.getKeyCode()==KeyEvent.VK_ENTER) {
			  button.doClick();
		  } else {
			  System.out.println("no access");
		  }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String password = passwordText.getText();
		
		if(user.equals(usernameInput) && password.equals(passwordInput)) {
			success.setText("Login successful!");
		}else {
			failure.setText("Login failed");
		}
				
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
