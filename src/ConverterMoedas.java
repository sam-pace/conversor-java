import javax.swing.*;

public class ConverterMoedas {

    public void converterReaisParaDolares(double valorRecebido){
        double moedaDolar = valorRecebido / 5.13;
        moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Voc� tem $ " + moedaDolar + " D�lares");

    }
	
	public void ConverterReaisParaEuro(double valorRecebido) {
		double moedaEuro = valorRecebido / 5.52;
		moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Voc� tem $ " + moedaEuro + " Euros");

	}  
}
