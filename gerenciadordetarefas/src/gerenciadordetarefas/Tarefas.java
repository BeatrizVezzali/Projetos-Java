package gerenciadordetarefas;

import javax.swing.*;
import java.awt.BorderLayout;

public class Tarefas {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Gerenciador de Tarefas");
		
		DefaultListModel<String> taskListModel = new DefaultListModel<>();
		JList<String> taskList = new JList<>(taskListModel);
		
		JTextField taskTextField = new JTextField(20);
		JButton addButton = new JButton("Adicionar Tarefa");
		JButton removeButton = new JButton("Remover Tarefa");
		
		addButton.addActionListener(e -> {
			String task = taskTextField.getText();
			taskListModel.addElement(task);
			taskTextField.setText("");
		});
		removeButton.addActionListener(e -> {
			int selectedIndex = taskList.getSelectedIndex();
			if(selectedIndex !=1) {
				taskListModel.remove(selectedIndex);
			}
		});
		JPanel controlPanel = new JPanel();
		controlPanel.add(taskTextField);
		controlPanel.add(addButton);
		controlPanel.add(removeButton);
		
		frame.setLayout(new BorderLayout());
		frame.add(new JScrollPane(taskList),BorderLayout.CENTER);
		frame.add(controlPanel,BorderLayout.SOUTH);
		
		frame.setSize(400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
