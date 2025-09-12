package exemplojcheckbox;

import java.awt.GridLayout;
import javax.swing.*;

public class JFrame extends javax.swing.JFrame{
	JPanel panel;
	JLabel label;
	JCheckBox checkbox;
	JCheckBox checkbox2;
	
	public JFrame() {
		panel = new JPanel();
		panel.setLayout(new GridLayout(5,1));
		label = new JLabel("Nome");
		panel.add(label);
		
		JCheckBox checkbox = new JCheckBox("Teste 1",true);
		panel.add(checkbox);
		JCheckBox checkbox2 = new JCheckBox("Teste 2",false);
		panel.add(checkbox2);
		this.getContentPane().add(panel);
		
		setTitle("Exemplo com JCheckBox");
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
public static void main(String[] args) {
	JFrame janela = new JFrame();
}
	

}
