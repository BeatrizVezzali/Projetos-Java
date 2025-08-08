package herança2;

public class TestaPessoa {

	public static void main(String[] args) {
		// Instancia Objeto conta1
				ContaPessoa conta1 = new ContaPessoa();
				// Valoriza Atributos da conta1
				conta1.setNome("José Pereira");
				conta1.setIdade((byte) 25);
				conta1.setEstadoCivil('S');
				conta1.setCtaConjunta(false);
				conta1.setSaldo(1000.78);
				conta1.setMesesAplic(10);
				// Aciona Método da conta1
				System.out.println("Apresentando a conta");
				System.out.println("------------------");
				conta1.apresenta();
		 }

	}

