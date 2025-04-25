package heranca;

public class Pessoa {
	
	private String nome;
	private byte idade;
	private char estadoCivil;
	
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public String getnome() {
		return nome;
	}
	
	public void setidade(byte idade) {
		this.idade = idade;
	}
	
	public byte getidade(){
		return idade;
	}
	
	public void setEstadoCivil(char estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public char getEstadoCivil() {
		return estadoCivil;
	}
	
	public void apresenta() {
		System.out.println("Nome: " + getnome());
		System.out.println("Idade: " + getidade());
		System.out.println("Estado Civil: " + getEstadoCivil());
		switch(getEstadoCivil()) {
		   case 'S':
			   System.out.println("Solteiro");
			   break;
		   case 'C':
			   System.out.println("Casado");
			   break;
		   case 'D':
			   System.out.println("Divorciado");
			   break;
		   case 'V':
			   System.out.println("Viúvo");
			   break;
		   default:
			   System.out.println("Estado inválido!");
		}
	}

}
