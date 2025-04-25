package veiculo;
import javax.swing.JOptionPane;

public class Oficina {
	
	public static void manutVeiculo(Veiculo v) {
		v.checkList();
		v.adjust();
		v.cleanup();
		System.out.println("-----------------------");
	}
	
	public static void main (String[] args) {
		int opc;
		do {
			String resposta;
			resposta = JOptionPane.showInputDialog("Escolha uma opção:\n" +
			                                       "0 - Sair\n" +
					                               "1 - Carro\n" +
			                                       "2 - Bicicleta\n" +
					                               "3 - Caminhão\n" +
			                                       "4 - Ônibus");
			opc = Integer.parseInt(resposta);
			Veiculo v;
			switch(opc){
			case 1:
				v = new Automovel(); manutVeiculo(v); break;
			case 2:
				v = new Bicicleta(); manutVeiculo(v); break;
			case 3:
				v = new Caminhao(); manutVeiculo(v); break;
			case 4:
				v = new Onibus(); manutVeiculo(v); break;
			default:
				break;
			}
			
		} while(opc!=0);
	}

}
