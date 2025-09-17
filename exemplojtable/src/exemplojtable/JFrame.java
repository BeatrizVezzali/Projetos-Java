package exemplojtable;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class JFrame extends javax.swing.JFrame {
	JPanel panel;
	javax.swing.JTable table;
	
	public JFrame() {
		panel = new JPanel();
		panel.setLayout(new GridLayout(1,1));
		
		String columnNames[] = {"Coluna 1","Coluna 2","Coluna 3"};
		String dataValues[][] = {
				{"12","23","100"},
				{"50","-80","45"},
				{"200","10","70"}
		};
		table = new javax.swing.JTable(dataValues,columnNames);
		JScrollPane scrollPane = new JScrollPane(table);
		panel.add(scrollPane);
		this.getContentPane().add(panel);
		
		setTitle("Exemplo JTable");
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
public static void main(String[] args) {
	JFrame janela = new JFrame();
}

}
