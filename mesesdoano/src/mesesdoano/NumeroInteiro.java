package mesesdoano;
import java.util.Scanner;

public class NumeroInteiro {
	
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número de 1 até 12: ");
		int numero = entrada.nextInt();
		
		String nomeMes;
		
		switch(numero) {
		case 1:
			nomeMes = "Janeiro";
			break;
		case 2:
			nomeMes = "Fevereiro";
			break;
		case 3:
			nomeMes = "Março";
			break;
		case 4:
			nomeMes = "Abril";
			break;
		case 5:
			nomeMes = "Maio";
			break;
		case 6:
			nomeMes = "Junho";
			break;
		case 7:
			nomeMes = "Julho";
			break;
		case 8:
			nomeMes = "Agosto";
			break;
		case 9:
			nomeMes = "Setembro";
			break;
		case 10:
			nomeMes = "Outubro";
			break;
		case 11:
			nomeMes = "Novembro";
			break;
		case 12:
			nomeMes = "Dezembro";
			break;
		default:
			nomeMes = "Mês inválido";
		}
		
		System.out.println("O número digitado foi: " + numero);
		System.out.println("O mês correspondente é: " + nomeMes);
		
		entrada.close();
	}
	
}
	


