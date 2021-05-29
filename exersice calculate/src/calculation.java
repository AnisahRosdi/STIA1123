import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class calculation {

	private JFrame frame;
	private JLabel AnwerLabel;
	private JButton MinusButton;
	private JButton AddButton;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculation window = new calculation();
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
	public calculation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setFont(new Font("Arial Black", Font.PLAIN, 13));
		textFieldNum1.setBounds(50, 61, 96, 20);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setFont(new Font("Arial Black", Font.PLAIN, 13));
		textFieldNum2.setBounds(239, 61, 96, 20);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JButton AddButton = new JButton("Add");
		AddButton.setFont(new Font("Arial Black", Font.PLAIN, 13));
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,answer;
				
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					answer = num1+num2;
					textFieldAnswer.setText(Double.toString(answer));
				
			}
		});
		AddButton.setBounds(50, 121, 89, 23);
		frame.getContentPane().add(AddButton);
		
		MinusButton = new JButton("Minus");
		MinusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,answer;
				
				num1 = Integer.parseInt(textFieldNum1.getText());
				num2 = Integer.parseInt(textFieldNum2.getText());
				answer = num1-num2;
				textFieldAnswer.setText(Double.toString(answer));
			}
		});
		MinusButton.setFont(new Font("Arial Black", Font.PLAIN, 13));
		MinusButton.setBounds(246, 123, 89, 23);
		frame.getContentPane().add(MinusButton);
		
		AnwerLabel = new JLabel("Answer");
		AnwerLabel.setFont(new Font("Arial Black", Font.PLAIN, 13));
		AnwerLabel.setBounds(111, 202, 59, 20);
		frame.getContentPane().add(AnwerLabel);
		
		textFieldAnswer = new JTextField();
		textFieldAnswer.setFont(new Font("Arial Black", Font.PLAIN, 13));
		textFieldAnswer.setBounds(179, 204, 96, 20);
		frame.getContentPane().add(textFieldAnswer);
		textFieldAnswer.setColumns(10);
	}
}
