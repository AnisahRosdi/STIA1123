package assignment3;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class PanelFinancial extends JPanel{
	
	public static double Profit;
	private JTextField textRevenue;
	private JTextField textExpenses;
	private JTextField textSalary;
	private JTextField textProfit;
	

	/**
	 * Create the panel.
	 */
	public PanelFinancial() {
		setBackground(new Color(0, 0, 0));

		
		setBounds(0, 0, 890, 521);
		setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(102, 51, 153));
		panel.setBounds(10, 10, 870, 56);
		add(panel);
		
		JLabel lblFinancial = new JLabel("COMPANY FINANCIAL");
		lblFinancial.setForeground(new Color(255, 255, 255));
		lblFinancial.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblFinancial.setBounds(10, 10, 285, 36);
		panel.add(lblFinancial);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 0, 153));
		panel_1.setBounds(10, 73, 870, 438);
		add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 153, 255));
		panel_2.setBounds(538, 10, 322, 418);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(204, 153, 255));
		panel_3.setBounds(10, 10, 520, 418);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblRevenue = new JLabel("Total Revenue(RM):");
		lblRevenue.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblRevenue.setBounds(10, 21, 142, 13);
		panel_3.add(lblRevenue);
		
		textRevenue = new JTextField();
		textRevenue.setFont(new Font("Dialog", Font.PLAIN, 15));
		textRevenue.setBounds(180, 20, 244, 19);
		panel_3.add(textRevenue);
		textRevenue.setColumns(10);
		
		JLabel lblExpenses = new JLabel("Total Expenses(RM):");
		lblExpenses.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblExpenses.setBounds(10, 80, 142, 13);
		panel_3.add(lblExpenses);
		
		textExpenses = new JTextField();
		textExpenses.setFont(new Font("Dialog", Font.PLAIN, 15));
		textExpenses.setBounds(180, 79, 244, 19);
		panel_3.add(textExpenses);
		textExpenses.setColumns(10);
		
		JLabel lblSalary = new JLabel("Employee Salary(RM):");
		lblSalary.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblSalary.setBounds(10, 136, 160, 13);
		panel_3.add(lblSalary);
		
		textSalary = new JTextField();
		textSalary.setFont(new Font("Dialog", Font.PLAIN, 15));
		
		
		
		textSalary.setBounds(180, 135, 244, 19);
		panel_3.add(textSalary);
		textSalary.setColumns(10);
		
		JLabel lblProfit = new JLabel("Total Profit(RM):");
		lblProfit.setFont(new Font("Dialog", Font.BOLD, 18));
		lblProfit.setBounds(10, 202, 160, 26);
		panel_3.add(lblProfit);
		
		textProfit = new JTextField();
		textProfit.setFont(new Font("Dialog", Font.BOLD, 18));
		textProfit.setBounds(180, 195, 244, 33);
		panel_3.add(textProfit);
		textProfit.setColumns(10);
		
		JButton btnGSalary = new JButton("+");
		btnGSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textSalary.setText(Double.toString(PanelEmployee.totalS));
				
			}
		});
		btnGSalary.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGSalary.setBounds(442, 134, 57, 21);
		panel_3.add(btnGSalary);
		
		JButton btnGRevenue = new JButton("+");
		btnGRevenue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textRevenue.setText(Double.toString(customer.totalPrice));
				
			}
		});
		btnGRevenue.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGRevenue.setBounds(442, 19, 57, 21);
		panel_3.add(btnGRevenue);
		
		JButton btnNewButton = new JButton("PROFIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double revenue = customer.totalPrice;
				double expenses = Double.parseDouble(textExpenses.getText());
				double salary = PanelEmployee.totalS;
				
				
				double profit = (expenses-salary)-revenue;
				
				Profit = profit;
				
				
				textProfit.setText(Double.toString(profit));
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnNewButton.setBounds(164, 309, 143, 44);
		panel_3.add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textRevenue.setText("");
				textExpenses.setText("");
				textSalary.setText("");
				textProfit.setText("");
				
				
			}
		});
		btnReset.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnReset.setBounds(345, 309, 143, 44);
		panel_3.add(btnReset);
		
		JButton btnGExpenses = new JButton("+");
		btnGExpenses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textExpenses.setText(Double.toString(PanelIventory.Order));
			}
		});
		btnGExpenses.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGExpenses.setBounds(442, 78, 57, 21);
		panel_3.add(btnGExpenses);
		setVisible(true);
		
		
	}	
}
