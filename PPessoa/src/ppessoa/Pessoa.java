package ppessoa;
public class Pessoa {
	
	protected int data_nascimento;
	protected String nome;
	protected String CPF;
	protected String localizacao;
	
	public void setdata_nascimento(int dnasc) {
		this.data_nascimento = dnasc;
	}
	
	
	public int getdata_nascimento() {
		return data_nascimento;
	}
	
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public String getnome() {
	return nome;
	}
	
	public void setCPF(String cpf) {
		this.CPF = cpf;
	}
	
	public String getCPF() {
		return CPF;
	}
	
	public void setlocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	public String getlocalizacao() {
		return localizacao;
	}
	
	public void apresenta() {
		System.out.println("Data de nascimento: " + data_nascimento);
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + CPF);
		System.out.println("Localização: " + localizacao);
	}
	// Construtor com overload
	Pessoa(int dnasc, String nome, String cpf, String localizacao) {
		this.data_nascimento = dnasc;
		this.nome = nome;
		this.CPF = cpf;
		this.localizacao = localizacao;
	}

}
