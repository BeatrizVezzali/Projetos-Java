package imc;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class IMC extends JFrame {
	JTextField txtPeso;
	JTextField txtAltura;
	JButton btnCalcular;
	JLabel lblResultado;
	JLabel lblPeso;
	JLabel lblAltura;
	
	public IMC() {
		setTitle("Calculadora de IMC");
		setSize(300,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		lblPeso = new JLabel("Peso (kg): ");
		lblAltura = new JLabel("Altura (m): ");
		lblResultado = new JLabel("Resultado: ");
		
		txtPeso = new JTextField(10);
		txtAltura = new JTextField(10);
		
		btnCalcular = new JButton("Calcular IMC");
		
		add(lblPeso);
		add(txtPeso);
		add(lblAltura);
		add(txtAltura);
		add(btnCalcular);
		add(lblResultado);
		
		btnCalcular.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					double peso = Double.parseDouble(txtPeso.getText());
					double altura = Double.parseDouble(txtAltura.getText());
					if(peso <= 0 || altura <= 0) {
						JOptionPane.showMessageDialog(null,
"Por favor, insira valores válidos.");
						return;
					}
					double imc = peso / (altura * altura);
					String categoria = getCategoriaIMC(imc);
			
					lblResultado.setText(String.format("IMC: %.2f - %s", imc, categoria));
				}
				catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,
"Por favor, insira valores válidos.");
					  
				}
				
			}

		});
	}
private String getCategoriaIMC(double imc) {
	if(imc < 18.5) {
		return "Abaixo do peso";
	}
	else if(imc >= 18.5 && imc < 24.9) {
		return "Peso normal";
	}
	else if(imc >= 25 && imc < 29.9) {
		return "Sobrepeso";
	}
	else {
		return "Obesidade";
	}
}
public static void main(String[] args) {
	SwingUtilities.invokeLater(new Runnable() {
		@Override
		public void run() {
			new IMC().setVisible(true);
		}
	});
 }
	
}

