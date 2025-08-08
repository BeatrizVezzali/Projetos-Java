package herança2;

public class ContaPessoa extends Pessoa{
	
	private boolean ctaConjunta;
	private double saldo;
	private int mesesAplic;
	private double resgate;
	public void setCtaConjunta(boolean ctaConjunta) {this.ctaConjunta = ctaConjunta;}
	private boolean getCtaConjunta() {return ctaConjunta;}
	public void setSaldo(double saldo) {this.saldo = saldo;}
	public double getSaldo() {return saldo;}
	public void setMesesAplic(int mesesAplic) {this.mesesAplic = mesesAplic;}
	public int getMesesAplic() {return mesesAplic; }
	private void setResgate(double s, int d) {
	resgate = s;
	for(int x = 1; x <= d; x++)
	{
	resgate = resgate * 1.005;
	}
	}
	public double getResgate() {return resgate;}
	public void apresenta() {
	// Chama o metodo super herdado da classe Pessoa
		super.apresenta();
		System.out.print("Tipo de Conta: ");
		if (getCtaConjunta()==true)
		System.out.println("Conjunta");
		else
		System.out.println("Individual");
		System.out.println("Saldo Poupança: R$" + getSaldo());
		System.out.println("Meses a aplicar: " + getMesesAplic());
		setResgate(getSaldo(), getMesesAplic());
		System.out.println("Resgate previsto: R$" + getResgate());
	}
}
