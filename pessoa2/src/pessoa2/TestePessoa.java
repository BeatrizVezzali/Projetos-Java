package pessoa2;

public class TestePessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa Pessoa1 = new Pessoa();
		
		Pessoa1.dados("Pedro", "12345", 5000);
		System.out.println("Nome: " + Pessoa1.getNome());
		System.out.println("RG: " + Pessoa1.getRG());
		System.out.println("Salário: R$ " + Pessoa1.getSalário());
		
		Estudante Jovem1 = new Estudante();
		
		Jovem1.dados("Mario", "1234", 15000);
		Jovem1.bonus();
		System.out.println("Nome: " + Jovem1.getNome());
		System.out.println("RG: " + Jovem1.getRG());
		System.out.println("Salário: R$ " + Jovem1.getSalário());
		Jovem1.setInstituicao("MIT");
		Jovem1.apresenta();
	}

}
