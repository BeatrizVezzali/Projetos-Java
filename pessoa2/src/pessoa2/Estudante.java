package pessoa2;

public class Estudante extends Pessoa {
	
	private String instituicao;
	
	void setInstituicao(String i) {
		instituicao = i;
	}
	
	void bonus() {
		salario = salario + 100;
	}
	
	void apresenta() {
		System.out.println("Instituição: " + instituicao);
	}
	
}
