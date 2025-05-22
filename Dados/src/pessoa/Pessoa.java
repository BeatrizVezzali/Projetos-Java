package pessoa;
import java.util.Scanner;

public class Pessoa {
	
	public static void main (String [] args) {
		Scanner entrada = new Scanner(System.in);
		String nome = "Baco da Silva";
		//Variável não primitiva tipo String
		int idade = 25;
		//Variável primitiva tipo inteiro
		double altura = 1.74;
		int sapato;
		System.out.println("Qual o número do seu sapato? ");
		sapato = entrada.nextInt();
		//Apresentar os valores
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade + "anos");
		System.out.println("Altura: " + altura + "m");
		System.out.println("Número do sapato: " + sapato);
		
		entrada.close();
	}

}
