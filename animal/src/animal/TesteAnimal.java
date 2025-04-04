package animal;
import javax.swing.JOptionPane;

public class TesteAnimal {

	public static void main(String[] args) {
		Animal animal1 = new Animal();
		int opcao = 0;
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"1 - Nascer \n"
					+ "2 - Comer \n"
					+ "3 - Correr \n"
					+ "4 - Dormir \n"
					+ "5 - Morrer \n\n"
					+ "Escolha uma opção:"));
			switch(opcao) {
			case 1:
				animal1.nascer();
				break;
			case 2:
				animal1.comer();
				break;
			case 3:
				animal1.correr();
				break;
			case 4:
				animal1.dormir();
				break;
			case 5:
				animal1.morrer();
				break;
				default:
				break;
			}
			
		} while(opcao <= 5);
		

	}

}
