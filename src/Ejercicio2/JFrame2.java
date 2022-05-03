package Ejercicio2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class JFrame2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void createFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame2 frame = new JFrame2();
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
	public JFrame2() {
		setTitle("Pel\u00EDculas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 187);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Escribe el t\u00EDtulo de una pel\u00EDcula");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(38, 39, 193, 14);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(38, 64, 154, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Pel\u00EDculas");
		lblNewLabel_1.setBounds(375, 39, 76, 14);
		contentPane.add(lblNewLabel_1);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(319, 63, 154, 22);
		contentPane.add(comboBox);

		JButton btnNewButton = new JButton("A\u00F1adir");
		btnNewButton.setBounds(38, 103, 76, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.addItem(textField.getText());
			}
		});
	}

}
