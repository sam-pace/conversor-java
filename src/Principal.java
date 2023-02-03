import javax.swing.JOptionPane;

public class Principal {


	public static void main(String[] args) {
		boolean executa = true;
		Funcao moeda = new Funcao();
		
		while (executa == true) {

				String input = JOptionPane.showInputDialog(null, "Insira um valor", "Conversor de moedas", JOptionPane.PLAIN_MESSAGE).toString();
				long  valorRecebido = Long.parseLong(input);

				moeda.ConverterMoedas(valorRecebido);

				int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirm",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (JOptionPane.YES_OPTION == resposta) {

				} else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					System.exit(0);
				}

			}
		}
	}

