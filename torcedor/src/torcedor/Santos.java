package torcedor;

public class Santos extends Torcedor {
	
	public Santos() {
		this.nometime = "Santos Futebol Clube";
		this.qtdPauistas = 22;
		this.qtdBrasileiros = 8;
		this.qtdRebaixamentos = 1;
	}
	
	@Override
	public void apresenta() {
		System.out.println("O time " + this.nometime + " tem " + this.qtdPauistas + " paulistas," + this.qtdBrasileiros
				+ " brasileiros e " + this.qtdRebaixamentos + " rebaixamento.");
	}

}
