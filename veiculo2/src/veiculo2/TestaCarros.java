package veiculo2;

public class TestaCarros {

	public static void main(String[] args) {
		Fusca fusca1 = new Fusca();
		fusca1.setmodelo("VW Fusca 1.0");
		fusca1.setplaca("ABC 2345");
        fusca1.setano(1985);
        fusca1.Apresenta();
        
        Corcel corcel1 = new Corcel();
        corcel1.setmodelo("Ford Corcel I 1.3");
        corcel1.setplaca("DEF 6789");
        corcel1.setano(1977);
        corcel1.Apresenta();
        
        Opala opala1 = new Opala();
        opala1.setmodelo("Chevrolet Opala SS");
        opala1.setplaca("GHI 5467");
        opala1.setano(1970);
        opala1.Apresenta();
	}

}
