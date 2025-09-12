package exemplojtextfield;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;

public class JFrame extends javax.swing.JFrame{
	JPanel panel;
	JLabel labelNome;
	JTextField textField;
	
	public JFrame() {
		panel = new JPanel();
		panel.setLayout(new GridLayout(5,1));
		labelNome = new JLabel("Nome");
		panel.add(labelNome);
		
		textField = new JTextField("Beatriz");
		textField.setBackground(Color.CYAN);
		textField.setSelectedTextColor(Color.GREEN);
		textField.setForeground(Color.RED);
		panel.add(textField);
		this.getContentPane().add(panel);
		
		setTitle("Exemplo com JTextField");
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
public static void main(String[] args) {
	JFrame janela = new JFrame();
}
	
	

}
