import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String opcoes = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "Conversor de Moeda", "Conversor de temperatura" }, "Escolha").toString();

	}

}
