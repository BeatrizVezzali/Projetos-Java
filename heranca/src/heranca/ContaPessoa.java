package heranca;

public class ContaPessoa extends Pessoa {
	
	private boolean contaConjunta;
	private double saldo;
	private int mesesAplicados;
	private double resgate;
	
	public boolean getContaConjunta() {
		return contaConjunta;
	}
	
	public void setContaConjunta(boolean contaConjunta) {
		
		this.contaConjunta = contaConjunta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		
		this.saldo = saldo;		
	}
	
	public int getMesesAplicados() {
		return mesesAplicados;
	}
	
	public void setMesesAplicados(int mesesAplicados) {
		
		this.mesesAplicados = mesesAplicados;
	}
	
	public double getResgate() {
		return resgate;
	}
	
	public void setResgate(double resgate) {
		
		this.resgate = resgate;
	}
	
	public void apresenta() {
		super.apresenta();
		System.out.println("A conta é conjunta? " + getContaConjunta());
		System.out.println("Saldo: R$ " + getSaldo());
		System.out.println("Meses aplicados: " + getMesesAplicados());
		System.out.println("Resgate: R$ " + getResgate());
	}

}
