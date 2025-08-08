package pessoa3;

public class TestaPessoa {

	public static void main(String[] args) {
		PessoaFisica pessoafisica1 = new PessoaFisica();
		pessoafisica1.setNome(" Jonas da Silva");
		pessoafisica1.setIdade((byte)25);
		pessoafisica1.setEstadoCivil('S');
		pessoafisica1.setCPF("122.333.908-10");
		System.out.println("\nApresentando a pessoa física");
		System.out.println("----------------------------");
		pessoafisica1.apresenta();
		
		PessoaJuridica pessoajuridica1 = new PessoaJuridica();
		pessoajuridica1.setNome(" Denis Costa");
		pessoajuridica1.setIdade((byte)30);
		pessoajuridica1.setEstadoCivil('C');
		pessoajuridica1.setCNPJ("33.234.999/888-00");
		System.out.println("\nApresentando a pessoa jurídica");
		System.out.println("------------------------------");
		pessoajuridica1.apresenta();
	}

}
