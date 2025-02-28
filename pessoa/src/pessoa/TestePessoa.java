package pessoa;

public class TestePessoa {
	
	static Pessoa Pessoa0 = new Pessoa();
	static Pessoa Pessoa1 = new Pessoa();
	static Pessoa Pessoa2 = new Pessoa();
	
	public static void main (String[] args) {
		
		Pessoa0.rg = "1234567832-8";
		Pessoa0.cpf = "7879093243544";
		Pessoa0.nome = "Roberval";
		Pessoa0.endereço = "Rua das Flores,123";
		Pessoa0.celular = "+5511787866654";
		Pessoa0.altura = 1.50;
		Pessoa0.peso = 50;
		Pessoa0.sexo = 'M';
		Pessoa0.idade = 30;
		
		Pessoa1.rg = "3989985711-7";
		Pessoa1.cpf = "8872214667133";
		Pessoa1.nome = "Antenor da Silva";
		Pessoa1.endereço = "Rua Tambor,420";
		Pessoa1.celular = "+5511995157883";
		Pessoa1.altura = 1.60;
		Pessoa1.peso = 70;
		Pessoa1.sexo = 'M';
		Pessoa1.idade = 50;
		
		Pessoa2.rg = "6677883244-6";
		Pessoa2.cpf = "0411665475218";
		Pessoa2.nome = "Patty";
		Pessoa2.endereço = "Rua ABCD,57";
		Pessoa2.celular = "+5511214489726";
		Pessoa2.altura = 1.80;
		Pessoa2.peso = 66;
		Pessoa2.sexo = 'F';
		Pessoa2.idade = 29;
		
		System.out.println("RG: " + Pessoa0.rg);
		System.out.println("CPF: " + Pessoa0.cpf);
		System.out.println("Nome: " + Pessoa0.nome);
		System.out.println("Endereço: " + Pessoa0.endereço);
		System.out.println("Celular: " + Pessoa0.celular);
		System.out.println("Altura: " + Pessoa0.altura + "m");
		System.out.println("Peso: " + Pessoa0.peso + "kg");
		System.out.println("Sexo: " + Pessoa0.sexo);
		System.out.println("Idade: "  + Pessoa0.idade + " anos");
		
		System.out.println("RG: " + Pessoa1.rg);
		System.out.println("CPF: " + Pessoa1.cpf);
		System.out.println("Nome: " + Pessoa1.nome);
		System.out.println("Endereço: " + Pessoa1.endereço);
		System.out.println("Celular: " + Pessoa1.celular);
		System.out.println("Altura: " + Pessoa1.altura + "m");
		System.out.println("Peso: " + Pessoa1.peso + "kg");
		System.out.println("Sexo: " + Pessoa1.sexo);
		System.out.println("Idade: " + Pessoa1.idade + " anos");
		
		System.out.println("RG: " + Pessoa2.rg);
		System.out.println("CPF: " + Pessoa2.cpf);
		System.out.println("Nome: " + Pessoa2.nome);
		System.out.println("Endereço: " + Pessoa2.endereço);
		System.out.println("Celular: " + Pessoa2.celular);
		System.out.println("Altura: " + Pessoa2.altura + "m");
		System.out.println("Peso: " + Pessoa2.peso + "kg");
		System.out.println("Sexo: " + Pessoa2.sexo);
		System.out.println("Idade: " + Pessoa2.idade + " anos");
		
	}
	

}
