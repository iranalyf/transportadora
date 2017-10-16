package factory;

import java.util.List;

import factory.repository.ContatoRepository;

public class MalaDireta {

	public boolean enviarEmail(String mensagem) {

		ContatoRepository contatoRepository = new ContatoRepository();

		List<Contato> contatos = contatoRepository.findAll();

		System.out.println("Mensagem a ser enviada:>>> " + mensagem);

		for (Contato contato : contatos) {
			System.out.println("From: <contato@transportadora.com.br>");
			System.out.printf("To: [%s] <%s>\n", contato.getNome(), contato.getEmail());
			System.out.println();
		}

		return true;
	}
}
