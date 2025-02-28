package dados;

public class Dados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = "José Pereira";
		byte idade = 25;
		char estadoCivil = 'S';
		boolean ctaConjunta = false;
		double saldo = 1500.70;
		int mesesAplic = 10;
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Estado Civil: " + estadoCivil);
		
		switch(estadoCivil) {
		case 'S':
			System.out.println("Solteiro");
			break;
		case 'C':
			System.out.println("Casado");
			break;
		case 'V':
			System.out.println("Viúvo");
			break;
		default:
			System.out.println("Padre");
		}
		System.out.println("Tipo de conta: ");
		if(ctaConjunta == true) {
			System.out.println("Conta Conjunta");
		}
		else {
			System.out.println("Conta Individual");
		}
		System.out.println("Saldo conta: R$" + saldo);
		System.out.println("Meses aplicados: " + mesesAplic);
		double resgate = saldo;
		for(int i = 1; i <= mesesAplic; i++) {
			resgate = resgate * 1.005;
		}
		//System.out.println("Valor para resgatar: R$" + resgate);
		System.out.printf("Valor para resgatar: R$ %.2f" ,resgate);
	}

}
