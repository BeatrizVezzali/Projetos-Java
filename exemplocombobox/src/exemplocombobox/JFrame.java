package exemplocombobox;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFrame extends javax.swing.JFrame {
	JPanel panel;
	JLabel label;
	javax.swing.JComboBox combobox;
	
	public JFrame() {
		panel = new JPanel();
		panel.setLayout(new GridLayout(5,1));
		label = new JLabel("Times");
		panel.add(label);
		
		String times[] = {"Corinthians","Palmeiras","Santos","São Paulo"};
		combobox = new javax.swing.JComboBox<String>(times);
		
		panel.add(combobox);
		this.getContentPane().add(panel);
		
		setTitle("Exemplo com JComboBox");
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
public static void main (String[] args) {
	JFrame janela = new JFrame();
}

}
