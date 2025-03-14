package velocidade;

public class TesteCarro {

	public static void main (String[] args) {
		Carro Fusca = new Carro();
		
		Fusca.MostrarVelocidade();
		Fusca.acelerar();
		Fusca.MostrarVelocidade();
		Fusca.acelerar();
		Fusca.MostrarVelocidade();
		Fusca.frear();
		Fusca.MostrarVelocidade();
		Fusca.frear();
		Fusca.MostrarVelocidade();
	}

}
