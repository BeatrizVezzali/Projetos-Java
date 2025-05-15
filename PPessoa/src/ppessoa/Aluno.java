package ppessoa;

public class Aluno extends Pessoa {
	
	private String instituicao;
	
	public void setinstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	
	public String getinstituicao() {
		return instituicao;
	}
	
	public void apresenta() {
		super.apresenta();
		System.out.println("Instituição: " + instituicao);
	}
	
	Aluno(int dnasc, String nome, String cpf, String localizacao, String instituicao) {
		super(dnasc, nome, cpf, localizacao);
		this.instituicao = instituicao;
	}
}
