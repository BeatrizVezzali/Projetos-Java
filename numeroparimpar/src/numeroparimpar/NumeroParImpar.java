package numeroparimpar;
import java.util.Scanner;

public class NumeroParImpar {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int numero = scanner.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O número " + numero + " é par.");
		}
		else {
			System.out.println("O número " + numero + " é ímpar.");
		}
		scanner.close();
	}

}
