package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmTest extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	int brojJedan, brojDva = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) { //kreira se objekat i postavlja se visible na true
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTest frame = new FrmTest();
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
	public FrmTest() { //konstruktor klase
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 302);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(253, 255, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 7;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 4;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnFive = new JButton("5");
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //pita samo logiku koju ovde kucamo
				//textField.setText("5"); moze i ovako ali onda ako hocemo da napisemo br 5762 nece moci
				textField.setText(textField.getText() + "5"); //pozivamo text koji se nalazi u polju i dodajemo mu broj 5
			}
		});
		btnFive.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		GridBagConstraints gbc_btnFive = new GridBagConstraints();
		gbc_btnFive.insets = new Insets(0, 0, 5, 5);
		gbc_btnFive.gridx = 1;
		gbc_btnFive.gridy = 6;
		contentPane.add(btnFive, gbc_btnFive);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		btn1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		GridBagConstraints gbc_btn1 = new GridBagConstraints();
		gbc_btn1.gridwidth = 4;
		gbc_btn1.insets = new Insets(0, 0, 5, 5);
		gbc_btn1.gridx = 2;
		gbc_btn1.gridy = 6;
		contentPane.add(btn1, gbc_btn1);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				brojJedan = Integer.parseInt(textField.getText());
				textField.setText("");
				
			}
		});
		btnAdd.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.insets = new Insets(0, 0, 5, 5);
		gbc_btnAdd.gridx = 8;
		gbc_btnAdd.gridy = 6;
		contentPane.add(btnAdd, gbc_btnAdd);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				try {
					brojDva = Integer.parseInt(textField.getText());
				}catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "Morate uneti drugi broj",
							"Greska", JOptionPane.ERROR_MESSAGE);
				
				}
				
				textField.setText("" + (brojJedan + brojDva));
				
				
			}
		});
		btnEqual.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		GridBagConstraints gbc_btnEqual = new GridBagConstraints();
		gbc_btnEqual.insets = new Insets(0, 0, 5, 5);
		gbc_btnEqual.gridx = 10;
		gbc_btnEqual.gridy = 6;
		contentPane.add(btnEqual, gbc_btnEqual);
	}

}
