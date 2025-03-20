package pessoa2;

public class Pessoa {
	
	private String nome;
	private String rg;
	protected double salario;
	
	void apresenta() {
		System.out.println("Nome: " + nome);
		System.out.println("RG: " + rg);
		System.out.println("Salário: R$ " + salario);
	}
	
	void dados (String n, String r, double s) {
		nome = n;
		rg = r;
		salario = s;
	}
	
	String getNome() {
		return nome;
	}
	
	String getRG() {
		return rg;
	}
	
	double getSalário() {
		return salario;
	}
	

}
