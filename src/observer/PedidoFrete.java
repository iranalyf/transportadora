package observer;

import java.util.ArrayList;
import java.util.List;

public class PedidoFrete {

	private boolean temPedidoFrete;
	private List<Observador> observadores = new ArrayList<>();

	public void setPedido(boolean temPedidoFrete) {
		this.temPedidoFrete = temPedidoFrete;
		notificarTodos();
	}

	public void addObservador(Observador observador) {
		this.observadores.add(observador);
	}

	private void notificarTodos() {
		this.observadores.forEach(observador -> observador.notificar());
	}

}
