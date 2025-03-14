package telefone;

public class TesteTelefone {
	
	public static void main (String[] args) {
		
		Telefone Telesp = new Telefone();
		
		Telesp.DuracaoLigacao(10);
		Telesp.MostrarConta();
		Telesp.AlterarPreco(1.5);
		Telesp.DuracaoLigacao(20);
		Telesp.MostrarConta();
	}

}
