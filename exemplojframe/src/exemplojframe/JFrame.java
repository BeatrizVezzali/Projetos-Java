package exemplojframe;

public class JFrame extends javax.swing.JFrame {
	public JFrame() {
		setTitle("Exemplo JFrame");
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

public static void main(String[] args) {
	JFrame janela = new JFrame();
}

}
