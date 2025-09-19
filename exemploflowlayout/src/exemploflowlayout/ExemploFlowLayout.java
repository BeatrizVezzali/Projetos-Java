package exemploflowlayout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class ExemploFlowLayout {
	public static void main(String[] args) {
		Frame janela = new Frame("Exemplo FlowLayout");
		
		Button bt1 = new Button("Menu 1");
		Button bt2 = new Button("Menu 2");
		Button bt3 = new Button("Menu 3");
		Button bt4 = new Button("Menu 4");
		Button bt5 = new Button("Menu 5");
		Button bt6 = new Button("Menu 6");
		
		janela.setSize(600,400);
		janela.setLocation(200,200);
		janela.setLayout(new FlowLayout());
		
		janela.add(bt1);
		janela.add(bt2);
		janela.add(bt3);
		janela.add(bt4);
		janela.add(bt5);
		janela.add(bt6);
		janela.setVisible(true);
	}

}
