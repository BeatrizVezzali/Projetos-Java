package velocidade;

public class Carro {
	
	static double velocidade;
	
	public void acelerar() {
		velocidade += 10;
	}
	
	public void frear() {
		velocidade -= 10;
	}
	
	public void MostrarVelocidade() {
		System.out.println("Velocidade atual: " + velocidade + "km");
	}

}
