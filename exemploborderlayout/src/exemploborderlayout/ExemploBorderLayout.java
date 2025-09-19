package exemploborderlayout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class ExemploBorderLayout {
	public static void main(String[] args) {
		Frame janela = new Frame("Exemplo BorderLayout");
		
		Button bt1 = new Button("Menu 1");
		Button bt2 = new Button("Menu 2");
		Button bt3 = new Button("Menu 3");
		Button bt4 = new Button("Menu 4");
		Button bt5 = new Button("Menu 5");
		
		janela.setSize(600,400);
		janela.setLocation(200,200);
		
		BorderLayout layout = new BorderLayout();
		janela.setLayout(layout);
		
		janela.add(bt1,BorderLayout.NORTH);
		janela.add(bt2,BorderLayout.WEST);
		janela.add(bt3,BorderLayout.SOUTH);
		janela.add(bt4,BorderLayout.EAST);
		janela.add(bt5,BorderLayout.CENTER);
		
		janela.setVisible(true);
	}

}
