package heranca;

public class CursoPessoa extends Pessoa {
	
	private String codCurso;
	private char periodo;
	private int cargaHoraria;
	
	public void setcodCurso(String codCurso) {
		this.codCurso = codCurso;
	}
	
	public String getcodCurso() {
		return codCurso;
	}
	
	public void setperiodo(char periodo) {
		this.periodo = periodo;
	}
	
	public char getperiodo() {
		return periodo;
	}
	
	public void setcargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public int getcargaHoraria() {
		return cargaHoraria;
	}
	
	public void apresenta() {
		super.apresenta();
		System.out.println("Código do curso: " + getcodCurso());
		System.out.println("Período: " + getperiodo());
		System.out.println("Carga Horária: " + getcargaHoraria());
	}

}
