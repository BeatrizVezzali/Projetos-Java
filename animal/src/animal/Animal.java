package animal;
import javax.swing.JOptionPane;

public class Animal {
	
	public String nome,classe,familia;
	public int idade,caloria,forca;
	static boolean estado;
	
	public void nascer() {
		nome = JOptionPane.showInputDialog("Nome: ");
		classe = JOptionPane.showInputDialog("Classe: ");
		familia = JOptionPane.showInputDialog("Família: ");
		idade = 0;
		estado = true;
		caloria = 10;
		forca = 10;
		
		System.out.println("Nascer - " + this.toString());
	}
	
	public void morrer() {
		forca = 0;
		estado = false;
		
		System.out.println("Morrer - " + this.toString());
	}
	
	public void comer() {
	  if(estado == true && caloria < 100) {
		 caloria += 10;
		 forca -= 2;
		 
		 System.out.println("Comer - " + this.toString());
	  }
	  else if(caloria >= 100) {
		  JOptionPane.showMessageDialog(null, nome + " está satisfeito! Calorias:" + caloria);
	  }
	  else {
		  JOptionPane.showMessageDialog(null, nome + " está morto!");
	  }
		
	}
	
	public void correr() {
	  if(estado == true && caloria > 0) {
		 caloria -= 5;
		 forca -= 5;
		  
		  System.out.println("Correr - " + this.toString());
	  }
	  else if(caloria <= 0) {
		  JOptionPane.showMessageDialog(null, nome + " está exausto!");
	  }
	  else {
		  JOptionPane.showMessageDialog(null, nome + " está morto!");
	  }
	}
	
	public void dormir() {
	  if(estado == true) {
		 caloria += 2;
		 forca += 10;
		 
		 System.out.println("Dormir - " + this.toString());
	  }
	  else {
		  JOptionPane.showMessageDialog(null, nome + " está morto!");
	  }
	  
	}
	
	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", classe=" + classe + ", familia=" + familia + ", estado=" + estado
				+ ", idade=" + idade + ", caloria=" + caloria + ", forca=" + forca + "]";
		}
	
	}
	

