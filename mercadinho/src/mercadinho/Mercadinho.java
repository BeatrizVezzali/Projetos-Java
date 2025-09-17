package mercadinho;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Mercadinho extends JFrame {
	JComboBox<String> comboProdutos;
	JTextField txtQuantidade;
	JButton btnAdicionar;
	JButton btnFinalizar;
	JTextArea txtResumo;
	JLabel lblTotal;
	
	double totalPedido = 0.0;
	
	String[] produtos = {"Arroz","Feijão","Macarrão","Óleo",
"Leite","Tomate"};
	
	double[] precos = {5.0,4.0,3.5,6.0,2.5,0.70};
	
	public Mercadinho() {
		setTitle("Mercadinho");
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		comboProdutos = new JComboBox<>(produtos);
		txtQuantidade = new JTextField(5);
		btnAdicionar = new JButton("Adicionar ao pedido");
		btnFinalizar = new JButton("Finalizar pedido");
		txtResumo = new JTextArea(10,30);
		txtResumo.setEditable(false);
		lblTotal = new JLabel("Total: R$ 0,00");
		
		add(new JLabel("Produto: "));
		add(comboProdutos);
		add(new JLabel("Quantidade: "));
		add(txtQuantidade);
		add(btnAdicionar);
		add(new JScrollPane(txtResumo));
		add(lblTotal);
		add(btnFinalizar);
		
		btnAdicionar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String produtoSelecionado = (String)
comboProdutos.getSelectedItem();
				int quantidade = Integer.parseInt(txtQuantidade.getText());
				int indexProduto = comboProdutos.getSelectedIndex();
				double precoProduto = precos[indexProduto];
				double totalProduto = precoProduto * quantidade;
				
				txtResumo.append(produtoSelecionado + " - Quantidade: " +
quantidade + " - Total: R$ " + totalProduto + "\n");
				totalPedido += totalProduto;
				lblTotal.setText("Total: R$ " + String.format("%.2f",
totalPedido));
				txtQuantidade.setText("");
			}
		});
		btnFinalizar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(totalPedido > 0) {
					JOptionPane.showMessageDialog(null, 
"Pedido finalizado!\nTotal: R$ " + String.format("%.2f",totalPedido));
					txtResumo.setText("");
					lblTotal.setText("Total: R$ 0,00");
					totalPedido = 0;
				}
				else {
					JOptionPane.showMessageDialog(null, 
"Nenhum item foi adicionado ao pedido.");
				}
			}
		});
	}
public static void main(String[] args) {
	SwingUtilities.invokeLater(new Runnable() {
		@Override
		public void run() {
			new Mercadinho().setVisible(true);
		  }
	   });
	}
}



