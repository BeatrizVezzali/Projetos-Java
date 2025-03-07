package caranga;

public class TesteCarro {
	
	static Carro Opala = new Carro();
	
	static boolean LigarDesligar() {
		return true;
	}
	
	static void ConstroiOpala() {
		
		Opala.placa = "ABC0000";
		Opala.cor = "azul";
		Opala.nrPortas = 4;
		Opala.combustivel = "gasolina";
		Opala.quilometragem = 1000;
		Opala.renavan = "1234567890";
		Opala.chassis = "22222333333333";
		Opala.nrMarchas = 4;
		Opala.velocidade = 200;
		Opala.ligado = LigarDesligar();
	}
	
	public static void main (String[] args) {
		ConstroiOpala();
		
		System.out.println("Placa: " + Opala.placa);
		System.out.println("Cor: " + Opala.cor);
		System.out.println("Número de portas: " + Opala.nrPortas);
		System.out.println("Combustível: " + Opala.combustivel);
		System.out.println("Quilometragem: " + Opala.quilometragem + "km");
		System.out.println("Número do renavan: " + Opala.renavan);
		System.out.println("Número do chassis: " + Opala.chassis);
		System.out.println("Número de marchas: " + Opala.nrMarchas);
		System.out.println("Velocidade máxima:" + Opala.velocidade + "km/h");
		System.out.println("O Opala está ligado? " + Opala.ligado);
	}
}
	

