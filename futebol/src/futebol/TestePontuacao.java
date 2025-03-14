package futebol;

public class TestePontuacao {
	
	public static void main (String[] args) {
		Pontuacao Brasil = new Pontuacao();
		
		Brasil.GanharPartida();
		Brasil.GanharPartida();
		Brasil.GanharPartida();
		Brasil.EmpatarPartida();
		Brasil.GanharPartida();
		Brasil.PerderPartida();
		Brasil.MostrarPontuacao();
	}

}
