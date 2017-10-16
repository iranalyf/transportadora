package observer;

public class Celular implements Observador {

	@Override
	public void notificar() {
		System.out.println("fui notificado pelo Celular");

	}

}
