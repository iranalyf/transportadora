package Principal;

import observer.Email;
import observer.PedidoFrete;

public class Observer {

	public static void main(String[] args) {
		PedidoFrete pedidoFrete = new PedidoFrete();
		pedidoFrete.addObservador(new Email());
		pedidoFrete.setPedido(true);
	}
}
