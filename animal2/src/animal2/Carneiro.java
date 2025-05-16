package animal2;

public class Carneiro extends Animal {
	
	public Carneiro() {
		this.nome = "Carneiro";
		this.numeroPatas = 4;	
	}
	
	@Override
	public void apresenta() {
		System.out.println("O " + this.nome + " que tem " + this.numeroPatas + " patas, faz BÉÉÉ!");
	}

}
