package heranca;

public class CursoPessoa extends Pessoa {
	
	private String codCurso;
	private char periodo;
	private int cargaHoraria;
	
	public String getCodCurso() {
		return codCurso;
	}
	
	public void setCodCurso(String codCurso) {
		
		this.codCurso = codCurso;	
	}
	
	public char getPeriodo() {
		return periodo;
	}
	
	public void setPeriodo(char periodo) {
		
		this.periodo = periodo;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		
		this.cargaHoraria = cargaHoraria;
	}
	
	public void apresenta() {
		super.apresenta();
		System.out.println("Código do curso: " + getCodCurso());
		System.out.println("Período: " + getPeriodo());
		System.out.println("Carga horária: " + getCargaHoraria());
	}

}
