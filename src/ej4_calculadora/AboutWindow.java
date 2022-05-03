package ej4_calculadora;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.SystemColor;

public class AboutWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void createAboutFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutWindow frame = new AboutWindow();
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
	public AboutWindow() {
		setTitle("About");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 434, 179);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel aboutVersionTextLabel = new JLabel("0.0.1v");
		aboutVersionTextLabel.setBounds(10, 11, 69, 21);
		contentPane.add(aboutVersionTextLabel);
		
		JTextArea aboutText = new JTextArea();
		aboutText.setBackground(SystemColor.menu);
		aboutText.setEditable(false);
		aboutText.setWrapStyleWord(true);
		aboutText.setLineWrap(true);
		aboutText.setText("Calculadora sencilla para realizar operaciones matem\u00E1ticas b\u00E1sicas. ");
		aboutText.setBounds(10, 43, 398, 86);
		contentPane.add(aboutText);
	}
}
