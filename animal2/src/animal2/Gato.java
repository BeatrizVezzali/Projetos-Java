package animal2;

public class Gato extends Animal {
	
	public Gato() {
		this.nome = "Gato";
		this.numeroPatas = 4;
	}
	
	@Override
	public void apresenta() {
		System.out.println("O " + this.nome + " que tem " + this.numeroPatas + " patas, faz MIAU!");
	}

}
