package torcedor;

public class Corinthians  extends Torcedor {
	
	public Corinthians() {
		this.nometime = "Sport Club Corinthians Paulista";
		this.qtdPauistas = 31;
		this.qtdBrasileiros = 7;
		this.qtdRebaixamentos = 1;
	}
	
	@Override
	public void apresenta() {
		System.out.println("O time " + this.nometime + " tem " + this.qtdPauistas + " paulistas," + this.qtdBrasileiros
				+ " brasileiros e " + this.qtdRebaixamentos + " rebaixamento.");
	}

}
