import javax.swing.JOptionPane;

public class Funcao {
	
	ConverterMoedas moedas = new ConverterMoedas();

	public void ConverterMoedas(double valorRecebido) {
	

		String opcao = JOptionPane
				.showInputDialog(null, "Escolha a moeda para a qual você deseja converter seu dinheiro", "Moedas",
						JOptionPane.PLAIN_MESSAGE, null, new Object[] { "De Reais para Dólares", "De Reais para Euros",
								"De Dólares para Reais", "De Euros para Reais" },
						"Escolha")
				.toString();
		
		switch(opcao) {
		
		case "De Reais para Dólares":
			moedas.converterReaisParaDolares(valorRecebido);
			break;
			
		case "De Reais para Euros":
			moedas.ConverterReaisParaEuro(valorRecebido);
			break;
			
		case "De Dólares para Reais":
			moedas.converterReaisParaDolares(valorRecebido);
			break;
			
		case "De Euros para Reais":
			moedas.ConverterReaisParaEuro(valorRecebido);
			break;
			}
	}
}
