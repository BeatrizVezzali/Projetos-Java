package pessoa3;

public class PessoaJuridica extends Pessoa{
	
	private String cnpj;
	public void setCNPJ(String cnpj) {this.cnpj = cnpj;}
	public String getCNPJ() {return cnpj;}
	
	public void apresenta() {
		super.apresenta();
		System.out.println("CNPJ: " + getCNPJ());
	}

}
