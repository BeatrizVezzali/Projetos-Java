package exemplowindow;

import java.awt.event.WindowListener;

public class Aplicacao  {
	public static void main(String[] args) {
		Janela jan = new Janela();
		TratEventosJan trat = new TratEventosJan();
		
		jan.addWindowListener(TratEventosJan());
		jan.show();
	}

	private static WindowListener TratEventosJan() {
		// TODO Auto-generated method stub
		return null;
	}

}
