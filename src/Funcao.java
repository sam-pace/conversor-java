import javax.swing.JOptionPane;

public class Funcao {
	
	ConverterMoedas moedas = new ConverterMoedas();

	public void ConverterMoedas(double valorRecebido) {
	

		String opcao = JOptionPane
				.showInputDialog(null, "Escolha a moeda para a qual voc� deseja converter seu dinheiro", "Moedas",
						JOptionPane.PLAIN_MESSAGE, null, new Object[] { "De Reais para D�lares", "De Reais para Euros",
								"De D�lares para Reais", "De Euros para Reais" },
						"Escolha")
				.toString();
		
		switch(opcao) {
		
		case "De Reais para D�lares":
			moedas.converterReaisParaDolares(valorRecebido);
			break;
			
		case "De Reais para Euros":
			moedas.ConverterReaisParaEuro(valorRecebido);
			break;
			
		case "De D�lares para Reais":
			moedas.converterReaisParaDolares(valorRecebido);
			break;
			
		case "De Euros para Reais":
			moedas.ConverterReaisParaEuro(valorRecebido);
			break;
			}
	}
}
