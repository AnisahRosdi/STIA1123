package assignment3;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelHome extends JPanel {

	/**

	/**
	 * Create the panel.
	 */
	public PanelHome() {
		setBackground(new Color(204, 153, 255));

		setBounds(0, 0, 890, 521);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(204, 153, 255));
		lblNewLabel.setIcon(null);
		lblNewLabel.setBounds(64, 52, 826, 469);
		add(lblNewLabel);
		setVisible(true);
	}
}