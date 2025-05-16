package torcedor;

public class Palmeiras extends Torcedor {
	
	public Palmeiras() {
		this.nometime = "Sociedade Esportiva Palmeiras";
		this.qtdPauistas = 26;
		this.qtdBrasileiros = 12;
		this.qtdRebaixamentos = 2;
	}
	
	@Override
	public void apresenta() {
		System.out.println("O time " + this.nometime + " tem " + this.qtdPauistas + " paulistas," + this.qtdBrasileiros
				+ " brasileiros e " + this.qtdRebaixamentos + " rebaixamentos.");
	}

}
