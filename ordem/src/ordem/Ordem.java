package ordem;

public class Ordem {
	
	private int x;
	private int y;
	private int z;
	
	public Ordem(int a, int b, int c) {
		x = a;
		y =b;
		z =c;	
	}
	
	public void MostrarMaior() {
		int maior = x;
		String atributo = "x";
		
		if(y > maior) {
			maior = y;
			atributo = "y";
		}
		
		if (z > maior) {
			maior = z;
			atributo = "z";
		}
		
		System.out.println("O maior é: " + maior + " no atributo " + atributo);
	}
	
	public void MostrarMenor() {
		int menor = x;
		String atributo = "x";
		
		if(y < menor) {
			menor = y;
			atributo = "y";
		}
		
		if(z < menor) {
			menor = z;
			atributo = "z";
		}
		
		System.out.println("O menor é: " + menor + " no atributo " + atributo);
	} 
	
	public void MostrarCrescente() {
		int a = x;
		int b = y;
		int c = z;
		
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
			
		if(b > c) {
			int temp = b;
			b = c;
			c = temp;
		}
			
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
			
			System.out.println("Ordem crescente: " + a + "," + b + "," + c);
		}
	
	public void MostrarDecrescente() {
		int a = x;
		int b = y;
		int c = z;
		
		if(a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		if(b < c) {
			int temp = b;
			b = c;
			c = temp;
		}
		
		if(a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		System.out.println("Ordem decrescente: " + a + "," + b + "," + c);
	}
	
	}
