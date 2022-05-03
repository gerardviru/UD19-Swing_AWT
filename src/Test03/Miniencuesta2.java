package Test03;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Miniencuesta2 extends JFrame {
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void encuesta() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Miniencuesta2 frame = new Miniencuesta2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public Miniencuesta2() {
		
		// Añadimos el titulo
		setTitle("Mini Encuesta");
	

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 317, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Elije un sistema operativo:");
		lblNewLabel.setBounds(28, 13, 149, 14);
		contentPane.add(lblNewLabel);
		
		// Cremos los radioButtons
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows", true);
		rdbtnNewRadioButton.setBounds(28, 34, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Linux", false);
		rdbtnNewRadioButton_1.setBounds(28, 60, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Mac", false);
		rdbtnNewRadioButton_2.setBounds(28, 86, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		// Agrupamos los radioButtons
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rdbtnNewRadioButton);
		bgroup.add(rdbtnNewRadioButton_1);
		bgroup.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Elije tu espacialidad: ");
		lblNewLabel_1.setBounds(28, 127, 120, 14);
		contentPane.add(lblNewLabel_1);
		
		// Creamos los checkboxs
		JCheckBox chckbxNewCheckBox = new JCheckBox("Programaci\u00F3n");
		chckbxNewCheckBox.setBounds(28, 147, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Dise\u00F1o gr\u00E1fico");
		chckbxNewCheckBox_1.setBounds(28, 173, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Administraci\u00F3n");
		chckbxNewCheckBox_2.setBounds(28, 199, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel_2 = new JLabel("Horas dedicadas en el ordenador:");
		lblNewLabel_2.setBounds(28, 245, 198, 36);
		contentPane.add(lblNewLabel_2);
		
		
		//Creamos el spinner maximo de 10
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, null, 10, 1));
		spinner.setBounds(28, 292, 158, 20);
		contentPane.add(spinner);
		
		// Creamos el boton guardar
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String info = "Tu sistema operativo es:  ";
				//Creamos una lista de los radiobuttons
				JRadioButton[] radiobutt= {rdbtnNewRadioButton, rdbtnNewRadioButton_1, rdbtnNewRadioButton_2};
				
				//Recorremos la lista
				for (int i = 0; i < radiobutt.length; i++) {
					
					//Si el boton es el seleccionado lo añadimos a info
					if(radiobutt[i].isSelected()) {
						info += radiobutt[i].getText();
					}
					
				}
				
				//Creamos la lista de checkbox
				JCheckBox[] checkbox= {chckbxNewCheckBox, chckbxNewCheckBox_1, chckbxNewCheckBox_2};
				
				info += ", \n eres especialista en ";
				
				//Recorremos la lista de checkbox
				for (int i = 0; i < checkbox.length; i++) {
					
					// Cogemos los datos seleccionados por el checkbox
					if(checkbox[i].isSelected()) {
						info+= checkbox[i].getText()+ " - ";
					}
					
				}
				
				// A toda la info acumulada le añadimos las horas
				info +=  " \n el total de horas dedicadas son " + spinner.getValue() + " horas.";
				
				JOptionPane.showMessageDialog(null, info );
			}
		});
		
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setBounds(28, 330, 89, 23);
		contentPane.add(btnNewButton);
	}
}
