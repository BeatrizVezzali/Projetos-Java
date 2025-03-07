package luz;

public class Lampada {
	
	static boolean estado;
	
	public void ligar() {
		Lampada.estado = true;
	}
	
	public void desligar() {
		Lampada.estado = false;
	}
	
	void MostrarEstado() {
		if(Lampada.estado == true) {
			System.out.println("Lâmpada ligada!");
		}
		else {
			System.out.println("Lâmpada desligada!");
		}
	}

}
