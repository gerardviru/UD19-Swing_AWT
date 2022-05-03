package ej4_calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import java.awt.Font;

public class MainWindow extends JFrame {
	private JTextField firstOperandText;
	private JTextField secondOperandText;

	/**
	 * Launch the application.
	 */
	public static void createMainWindow() {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		// Init calculator
		Calculator calc = new Calculator();

		setTitle("Mini Calculadora");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 334);
		getContentPane().setLayout(null);

		// Buttons panel
		JPanel buttons = new JPanel();
		buttons.setBounds(10, 101, 414, 79);
		getContentPane().add(buttons);
		buttons.setLayout(new GridLayout(1, 0, 0, 0));

		JButton sumBtn = new JButton("+");
		sumBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		buttons.add(sumBtn);

		JButton restBtn = new JButton("-");
		restBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		buttons.add(restBtn);

		JButton divideBtn = new JButton("/");
		divideBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		buttons.add(divideBtn);

		JButton multiplyBtn = new JButton("*");
		multiplyBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		buttons.add(multiplyBtn);

		// Display panel
		JPanel display = new JPanel();
		display.setBounds(10, 11, 414, 79);
		getContentPane().add(display);

		firstOperandText = new JTextField();
		firstOperandText.setFont(new Font("Tahoma", Font.PLAIN, 16));
		display.add(firstOperandText);
		firstOperandText.setColumns(10);

		JLabel symbolLabel = new JLabel("+");
		symbolLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		display.add(symbolLabel);

		secondOperandText = new JTextField();
		secondOperandText.setFont(new Font("Tahoma", Font.PLAIN, 16));
		display.add(secondOperandText);
		secondOperandText.setColumns(10);

		JLabel equalLabel = new JLabel("=");
		display.add(equalLabel);

		JLabel resultLabel = new JLabel("");
		resultLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		display.add(resultLabel);

		// Panel with about and close buttons
		JPanel about = new JPanel();
		about.setBounds(10, 191, 414, 93);
		getContentPane().add(about);
		about.setLayout(null);

		
		// Button that close the app
		JButton closeBtn = new JButton("Cerrar");
		closeBtn.setBounds(244, 33, 80, 60);
		// Close on click event
		closeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		about.add(closeBtn);

		// About button - opens a window with the about info
		JButton aboutBtn = new JButton("About");
		aboutBtn.setBounds(334, 33, 80, 60);
		aboutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutWindow.createAboutFrame();
			}
		});
		about.add(aboutBtn);
		
		// Buttons listeners

		sumBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				symbolLabel.setText(sumBtn.getText());
				calc.setFirstOperand(Double.parseDouble(firstOperandText.getText()));
				calc.setSecondOperand(Double.parseDouble(secondOperandText.getText()));
				resultLabel.setText(Double.toString(calc.sum()));
			}
		});

		restBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				symbolLabel.setText(restBtn.getText());
				calc.setFirstOperand(Double.parseDouble(firstOperandText.getText()));
				calc.setSecondOperand(Double.parseDouble(secondOperandText.getText()));
				resultLabel.setText(Double.toString(calc.rest()));
			}
		});

		divideBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				symbolLabel.setText(divideBtn.getText());
				calc.setFirstOperand(Double.parseDouble(firstOperandText.getText()));
				calc.setSecondOperand(Double.parseDouble(secondOperandText.getText()));
				resultLabel.setText(Double.toString(calc.divide()));
			}
		});
		multiplyBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				symbolLabel.setText(multiplyBtn.getText());
				calc.setFirstOperand(Double.parseDouble(firstOperandText.getText()));
				calc.setSecondOperand(Double.parseDouble(secondOperandText.getText()));
				resultLabel.setText(Double.toString(calc.multiply()));
			}
		});

	}
}
