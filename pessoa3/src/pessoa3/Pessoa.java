package pessoa3;

public class Pessoa {

	private String nome;
	private byte idade;
	private char estadoCivil;
	public void setNome(String nome) {this.nome = nome;}
	public String getNome() {return nome;}
	public void setIdade(byte idade) {this.idade = idade;}
	public byte getIdade() {return idade;}
	public void setEstadoCivil(char estadoCivil) {this.estadoCivil = estadoCivil;}
	public char getEstadoCivil() {return estadoCivil;}
	
	public void apresenta() {
		System.out.println("Nome:" + getNome());
		System.out.println("Idade: " + getIdade() + " anos");
		System.out.print("Estado Civil: ");
		switch(getEstadoCivil()){
			case 'S':
			System.out.println("Solteiro"); break;
			case 'C':
			System.out.println("Casado"); break;
			case 'D':
			System.out.println("Divorciado"); break;
			case 'V':
			System.out.println("Viúvo"); break;
			default:
			System.out.println("Estado inválido!");
	}
	}
}
