package heranca;

public class ContaPessoa extends Pessoa {
	
	private boolean contaConjunta;
	private double saldo;
	private int mesesAplicados;
	private double resgate;
	
	
	public void setcontaConjunta(boolean contaConjunta) {
		this.contaConjunta = contaConjunta;
	}
	
	private boolean getcontaConjunta() {
		return contaConjunta;
	}
	
	public void setsaldo(double saldo) {
		this.saldo = saldo;		
	}
	
	public double getsaldo() {
		return saldo;
	}
	
	public void setmesesAplicados(int mesesAplicados) {
		this.mesesAplicados = mesesAplicados;
	}
	
	public int getmesesAplicados() {
		return mesesAplicados;
	}
	
	private void setresgate(double s, int d) {
		resgate = s;
		for (int x = 1; x <= d; x ++) {
			resgate = resgate * 1.005;
		}
	}
	
	public double getresgate() {
		return resgate;
	}
	
	public void apresenta() {
		super.apresenta();
		System.out.println("Tipo de conta: ");
		if(getcontaConjunta() == true) {
			System.out.println("Conjunta");
		}
		else {
			System.out.println("Individual");
		}
		System.out.println("Saldo: R$ " + getsaldo());
		System.out.println("Meses aplicados: " + getmesesAplicados());
		setresgate(getsaldo(), getmesesAplicados());
		System.out.println("Resgate previsto: R$ " + getresgate());
	}

}
