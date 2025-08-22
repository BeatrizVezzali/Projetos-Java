package exemplojbutton;

import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class JFrame extends javax.swing.JFrame {
	JPanel panel;
	JButton botao1;
	JButton botao2;
	JButton botao3;
	
	public JFrame() {
		setTitle("Exemplo JFrame com Buttons");
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel = new JPanel();
		
		panel.setLayout(new GridLayout(1,3));
		botao1 = new JButton("Botão 1");
		botao2 = new JButton("Botão 2");
		botao3 = new JButton(new ImageIcon("D:/Java/exemplojbutton/src/Chaves.jpg", "Teste"));//Mudar o diretório
		
		panel.add(botao1);
		panel.add(botao2);
		panel.add(botao3);
		
		this.getContentPane().add(panel);
	}
	
public static void main(String[] args) {
	JFrame janela = new JFrame();
}

}
