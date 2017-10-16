package Principal;

import java.util.Scanner;

import javax.swing.JOptionPane;

import strategy.Frete;
import strategy.TipoFrete;

public class Strategy {

	public static void main(String[] args) {

		try (Scanner entrada = new Scanner(System.in)) {
			int distancia = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a distancia em Km"));
			int opcaoFrete = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Qual o tipo de frete (1) Normal, (2) Rápido: "));
			TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete - 1];

			Frete frete = tipoFrete.obterFrete();
			double preco = frete.calcularPreco(distancia);
			JOptionPane.showMessageDialog(null, String.format("O valor total é de R$%.2f", preco));
		}
	}
}
