package ordem;

public class TesteOrdem {

	public static void main(String[] args) {
		Ordem ordem = new Ordem(20, 10, 40);
		
		ordem.MostrarMaior();
		ordem.MostrarMenor();
		ordem.MostrarCrescente();
		ordem.MostrarDecrescente();
	}

}
