import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;


public class Frame1 {
	
    double Nigerian_Naira = 302.96;
    double US_Dollar = 1.53;
    double Kenyan_Shilling = 156.21;
    double Brazilian_Real = 5.86;
    double Canadian_Dollar = 2.03;
    double India_Rupee = 100.68;
    double Philippine_Peso = 71.74;
    double Indonesian_Rupiah = 20746.75;
	
	
	private JFrame frame;
	private JTextField jtxtConvert;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 507, 345);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Currency Converter");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(139, 11, 200, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox jcmbCurrency = new JComboBox();
		jcmbCurrency.setFont(new Font("Tahoma", Font.BOLD, 13));
		jcmbCurrency.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		jcmbCurrency.setModel(new DefaultComboBoxModel(new String[] {"Choose One..", "USA", "Nigeria", "Brazil", "Canada", "Kenyan", "Indonesia", "India", "Philippine"}));
		jcmbCurrency.setBounds(129, 51, 178, 37);
		frame.getContentPane().add(jcmbCurrency);
		
		JLabel jlblConvert = new JLabel("");
		jlblConvert.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlblConvert.setToolTipText("                                                                              ");
		jlblConvert.setBounds(129, 163, 178, 47);
		frame.getContentPane().add(jlblConvert);
		
		jtxtConvert = new JTextField();
		jtxtConvert.setForeground(Color.RED);
		jtxtConvert.setFont(new Font("Tahoma", Font.BOLD, 14));
		jtxtConvert.setText("                    ");
		jtxtConvert.setBounds(129, 99, 178, 53);
		frame.getContentPane().add(jtxtConvert);
		jtxtConvert.setColumns(10);
		
		JButton jbtnConvert = new JButton("Convert");
		jbtnConvert.setFont(new Font("Tahoma", Font.BOLD, 13));
		jbtnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double British_Pound = Double.parseDouble(jtxtConvert.getText());
			
			if (jcmbCurrency.getSelectedItem().equals("Nigeria")) 
			{
			String cConvert1 = String.format("N %.2f", British_Pound * Nigerian_Naira);
			jlblConvert.setText(cConvert1);
			}
			if (jcmbCurrency.getSelectedItem().equals("USA")) 
			{
			String cConvert1 = String.format("$ %.2f", British_Pound * US_Dollar);
			jlblConvert.setText(cConvert1);
			}	
			if (jcmbCurrency.getSelectedItem().equals("Canada")) 
			{
			String cConvert1 = String.format("c$ %.2f", British_Pound * Canadian_Dollar);
			jlblConvert.setText(cConvert1);
			}	
			if (jcmbCurrency.getSelectedItem().equals("Indonesia")) 
			{
			String cConvert1 = String.format("Idr %.2f", British_Pound * Indonesian_Rupiah);
			jlblConvert.setText(cConvert1);
			}
			if (jcmbCurrency.getSelectedItem().equals("Philippine")) 
			{
			String cConvert1 = String.format("PhP %.2f", British_Pound * Philippine_Peso);
			jlblConvert.setText(cConvert1);
			}
			if (jcmbCurrency.getSelectedItem().equals("India")) 
			{
			String cConvert1 = String.format("Inr %.2f", British_Pound * India_Rupee);
			jlblConvert.setText(cConvert1);
			}
			if (jcmbCurrency.getSelectedItem().equals("Brazil")) 
			{
			String cConvert1 = String.format("Bra %.2f", British_Pound * Brazilian_Real);
			jlblConvert.setText(cConvert1);
			}
			if (jcmbCurrency.getSelectedItem().equals("Kenyan")) 
			{
			String cConvert1 = String.format("Ks %.2f", British_Pound * Kenyan_Shilling);
			jlblConvert.setText(cConvert1);
			}
			
			}
		});
		jbtnConvert.setBounds(45, 240, 89, 37);
		frame.getContentPane().add(jbtnConvert);
		
		JButton jbtnReset = new JButton("Reset");
		jbtnReset.setFont(new Font("Tahoma", Font.BOLD, 13));
		jbtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtConvert.setText(null);
				jlblConvert.setText(null);
				jcmbCurrency.setSelectedIndex(0);
			}
		});
		jbtnReset.setBounds(179, 240, 89, 37);
		frame.getContentPane().add(jbtnReset);
		
		JButton jbtnExit = new JButton("Exit");
		jbtnExit.setFont(new Font("Tahoma", Font.BOLD, 13));
		jbtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		jbtnExit.setBounds(310, 240, 100, 37);
		frame.getContentPane().add(jbtnExit);
	}
}
