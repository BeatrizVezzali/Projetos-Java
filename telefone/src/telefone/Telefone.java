package telefone;

public class Telefone {
	
	private int numeroMinutos;
	private double preco;
	
	public Telefone() {
		this.numeroMinutos = 0;
		this.preco = 2.0;
	}
	
	public void DuracaoLigacao(int vl) {
		this.numeroMinutos += vl;
	}
	
	public void AlterarPreco(double prc) {
		this.preco = prc;
	}
	
	public void MostrarConta() {
		double conta = this.numeroMinutos * this.preco;
		System.out.println("Valor da conta: R$ " + conta);
	}
	
}
