package numero;

public class NumComplexo {
	
	private double real;
	private double imaginario;
	
	public NumComplexo(double real, double i) {
		this.real = real;
		this.imaginario = i;
	}
	
	public double raiz() {
		return Math.sqrt(real * real + imaginario * imaginario);
	}
	
	public String toString() {
		if(imaginario >= 0) {
			return real + " + " + imaginario + "i";
		}
		else {
			return real + " - " + (-imaginario) + "i";
		}
		
		
	}
	
}
