package carrodeluxo;

public class TesteCarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		
		carro1.fabricante = "BMW";
		carro1.modelo = "X5 4.4 V8 biturbo";
		carro1.aceleracao = 5;
		carro1.velocidade = 250;
		carro1.consumo_rodoviario = 7.6;
		
		System.out.println("Fabricante: " + carro1.fabricante);
		System.out.println("Modelo: " + carro1.modelo);
		System.out.println("Aceleração: " + carro1.aceleracao + "km/h(s)");
		System.out.println("Velocidade: " + carro1.velocidade + "km/h");
		System.out.println("Consumo rodoviário: " + carro1.consumo_rodoviario + "km/h(l)");
		
		Carro carro2 = new Carro();
		
		carro2.fabricante = "Porsche";
		carro2.modelo = "Cayenne 4.8 V8 Turbo";
		carro2.aceleracao = 5.3;
		carro2.velocidade = 258;
		carro2.consumo_rodoviario = 9.6;
		
		System.out.println("Fabricante: " + carro2.fabricante);
		System.out.println("Modelo: " + carro2.modelo);
		System.out.println("Aceleração: " + carro2.aceleracao + "km/h(s)");
		System.out.println("Velocidade: " + carro2.velocidade + "km/h");
		System.out.println("Consumo rodoviário: " + carro2.consumo_rodoviario + "km/h(l)");
		
		Carro carro3 = new Carro();
		
		carro3.fabricante = "Land Rover";
		carro3.modelo = "RR Vogue 5.0 V8";
		carro3.aceleracao = 5.8;
		carro3.velocidade = 220;
		carro3.consumo_rodoviario = 7.7;
		
		System.out.println("Fabricante: " + carro3.fabricante);
		System.out.println("Modelo: " + carro3.modelo);
		System.out.println("Aceleração: " + carro3.aceleracao + "km/h(s)");
		System.out.println("Velocidade: " + carro3.velocidade + "km/h");
		System.out.println("Consumo rodoviário: " + carro3.consumo_rodoviario + "km/h(l)");

	}

}
