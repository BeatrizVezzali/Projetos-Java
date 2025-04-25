package heranca;

public class TestaPessoa {

	public static void main(String[] args) {
		ContaPessoa conta1 = new ContaPessoa();
		conta1.setnome("José da Silva");
		conta1.setidade((byte)35);
		conta1.setEstadoCivil('C');
		conta1.setcontaConjunta(false);
		conta1.setsaldo(108000.75);
		conta1.setmesesAplicados(12);
		System.out.println("Apresentando a conta bancária: ");
		System.out.println("------------------------------");
		conta1.apresenta();
		
		CursoPessoa curso1 = new CursoPessoa();
		curso1.setnome("José das Couves");
		curso1.setidade((byte)21);
		curso1.setEstadoCivil('S');
		curso1.setcodCurso("345-6");
		curso1.setperiodo('N');
		curso1.setcargaHoraria(360);
		System.out.println("\nApresentando o curso: ");
		System.out.println("---------------------");
		curso1.apresenta();
	}

}
