package torcedor;

public class SaoPaulo extends Torcedor {
	
	public SaoPaulo() {
		this.nomeTime = "São Paulo Futebol Clube";
		this.qtdPauistas = 22;
		this.qtdBrasileiros = 6;
		this.qtdRebaixamentos = 0;
	}
	
	@Override
	public void apresenta() {
		System.out.println("O time " + this.nomeTime + " tem " + this.qtdPauistas + " paulistas," + this.qtdBrasileiros
				+ " brasileiros e " + this.qtdRebaixamentos + " rebaixamentos.");
	}
}
