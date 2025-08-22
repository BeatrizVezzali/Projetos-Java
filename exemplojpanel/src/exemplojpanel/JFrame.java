package exemplojpanel;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class JFrame extends javax.swing.JFrame {
	JPanel panel;
	public JFrame() {
		panel = new JPanel(new GridLayout(2,2) );
		panel.setBackground(Color.CYAN);
		this.getContentPane().add(panel);
		setTitle("Exemplo JFrame com um JPanel ciano");
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
public static void main (String[] args) {
	JFrame janela = new JFrame();
}

}
