package veiculo2;

public class Veiculo {
	
	private String modelo;
	private String placa;
	private int ano;
	
	public void setmodelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getmodelo() {
		return modelo;
	}
	
	public void setplaca(String placa) {
		this.placa = placa;
	}
	
	public String getplaca() {
		return placa;
	}
	
	public void setano(int ano) {
		this.ano = ano;
	}
	
	public int getano() {
		return ano;
	}
	
	public void Apresenta() {
		System.out.println("Modelo: " + getmodelo());
		System.out.println("Placa: " + getplaca());
		System.out.println("Ano: " + getano());
	}

}
