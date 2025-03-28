package animal;
import javax.swing.JOptionPane;

public class TesteAnimal {

	public static void main(String[] args) {
		Animal animal0 = new Animal();
		
		animal0.nascer();
		animal0.nome = JOptionPane.showInputDialog("Digite o nome do animal:");
		animal0.classe = JOptionPane.showInputDialog("Digite a classe do animal:");
		animal0.familia = JOptionPane.showInputDialog("Digite a família que o animal pertence:");
		animal0.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do animal:"));
		animal0.dormir();
		animal0.VerificarEstado();
		animal0.comer();
		animal0.VerificarEstado();
		animal0.correr();
		animal0.VerificarEstado();
		animal0.morrer();
		animal0.VerificarEstado();
	}

}
