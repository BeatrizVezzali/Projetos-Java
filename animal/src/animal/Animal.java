package animal;

public class Animal {
	
	public String nome;
	public String classe;
	public String familia;
	public int idade;
	static boolean estado;
	public int caloria;
	public int forca;
	
	public void nascer() {
		forca = 10;
		caloria = 10;
		idade = 0;
		estado = true;
	}
	
	public void morrer() {
		forca = 0;
		estado = false;
	}
	
	public void comer() {
	    caloria += 10;
	    forca -= 2;
		
	}
	
	public void correr() {
		forca -= 5;
		caloria -= 5;
	}
	
	public void dormir() {
		forca += 10;
		caloria -= 2;
	}
	
	public void VerificarEstado() {
		if(Animal.estado == true) {
			System.out.println("O animal está vivo.");
		}
		else {
			System.out.println("O animal está morto.");
		}
		
		}
	}
	

