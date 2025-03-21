package relogio;

public class Relogio {
	
	private int hora;
	
	public Relogio(int hora) {
		this.hora = hora;
	}
	
	public void AdicionarHora() {
		if(hora < 23) {
			hora++;
		}
		else {
			hora = 0;
		}
	}
	
	public void SubtrairHora() {
		if(hora > 0) {
			hora--;
		}
		else {
			hora = 23;
		}
	}
	
	public void MostrarHora() {
		System.out.println("Hora atual: " + hora);
	}
	
}
