package pessoa3;

public class PessoaFisica extends Pessoa{
	
	private String cpf;
	public void setCPF(String cpf) {this.cpf = cpf;}
	public String getCPF() {return cpf;}
	
	public void apresenta() {
		super.apresenta();
		System.out.println("CPF: " + getCPF());
	}

}
