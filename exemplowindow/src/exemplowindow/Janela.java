package exemplowindow;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;

public class Janela extends Frame {
	public Janela() {
		setBackground(Color.CYAN);
		add("Center",new Label("Janela da aplicação"));
	}
	
}
