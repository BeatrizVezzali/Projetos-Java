package exemplocardlayout;

import java.awt.*;

public class ExemploCardLayout {
	public static void main(String[] args) {
		Frame minhaJanela = new Frame("Exemplo Card Layout");
		
		Button bt1 = new Button("Menu 1");
		Button bt2 = new Button("Menu 2");
		Button bt3 = new Button("Menu 3");
		Button bt4 = new Button("Menu 4");
		Button bt5 = new Button("Menu 5");
		Button bt6 = new Button("Menu 6");
		
		minhaJanela.setSize(600,400);
		minhaJanela.setLocation(200,200);
		
		CardLayout layout = new CardLayout();
		minhaJanela.setLayout(layout);
		
		minhaJanela.add(bt1,"BT1");
		minhaJanela.add(bt2,"BT2");
		minhaJanela.add(bt3,"BT3");
		minhaJanela.add(bt4,"BT4");
		minhaJanela.add(bt5,"BT5");
		minhaJanela.add(bt6,"BT6");
		
		layout.show(minhaJanela, "BT1");
		
		minhaJanela.setVisible(true);
	}

}
