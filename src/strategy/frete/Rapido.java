package strategy.frete;

import strategy.Frete;

public class Rapido implements Frete {

	public double calcularPreco(int distancia) {
		return distancia * 1.45 + 50;
	}
	
}
