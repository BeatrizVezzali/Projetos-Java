package exemplojoptionpane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ExemploJOptionPane {
	public static void main(String[] args) {
		String[] personagens = {"Bruxa do 71","Chapolin Colorado","Chaves","Chiquinha","Dona Florinda","Kiko","Professor Girafales",
				"Seu Barriga","Seu Madruga"};
		String resposta = (String)JOptionPane.showInputDialog(null,"Qual é o seu personagem favorito?",
				"Pesquisa",JOptionPane.QUESTION_MESSAGE,
				new ImageIcon("D:/Java/exemplojoptionpane/src/Kiko.jpg"),personagens,"");//Mudar o diretório da imagem
		System.out.println(resposta);
	}

}
