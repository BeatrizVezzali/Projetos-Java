package exemplojlabel;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFrame extends javax.swing.JFrame {
	JPanel panel;
	JLabel label;
	Icon icone;
	
	public JFrame() {
		setTitle("Exemplo JFrame com um JLabel com ícone");
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel = new JPanel(new GridLayout(2,2));
		panel.setBackground(Color.CYAN);
		this.getContentPane().add(panel);
		
		icone = new ImageIcon("D:/Java/exemplojlabel/src/images.jpg", "Teste");//Mudar o diretório
		
		label = new JLabel(icone);
		panel.add(label);
	}
	
public static void main(String[] args) {
	JFrame janela = new JFrame();
}

}
