package observer;

public class Email implements Observador {

	@Override
	public void notificar() {
		System.out.println("fui notificado pelo Email");

	}

}
