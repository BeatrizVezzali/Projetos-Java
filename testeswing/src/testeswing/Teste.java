package testeswing;
import javax.swing.JOptionPane;

public class Teste {
	
	public static void main (String[] args) {
		
		String nome;
		int idade;
		
		nome = JOptionPane.showInputDialog("Digite o nome: ");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
		
		JOptionPane.showMessageDialog(null, "Seu nome: " + nome);
		JOptionPane.showMessageDialog(null, "Sua idade: " + idade);
	}
	
}
