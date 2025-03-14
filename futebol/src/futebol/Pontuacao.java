package futebol;

public class Pontuacao {
	
	static int pontosGanhos;
	
	public void GanharPartida() {
		pontosGanhos += 3;
	}
	
	public void EmpatarPartida() {
		pontosGanhos += 0;
	}
	
	public void PerderPartida() {
		pontosGanhos -= 3;
	}
	
	public void MostrarPontuacao() {
		System.out.println("Pontuação atual:" + pontosGanhos);
	}

}
