package calculomedia;
import javax.swing.JOptionPane;

public class Media {
	
	public static void main (String[] args) {
		
		float nota1;
		float nota2;
		float media; 
		
		nota1 = Float.parseFloat(JOptionPane.showInputDialog("Insira a primeira nota: "));
		nota2 = Float.parseFloat(JOptionPane.showInputDialog("Insira a segunda nota: "));
		
		media = (nota1 + nota2) / 2;
		
		JOptionPane.showMessageDialog(null, "Sua média é: " + media);
		
		
	}

}
