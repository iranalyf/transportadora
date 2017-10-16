package factory.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import factory.Contato;

public class ContatoRepository {

	private List<Contato> contatos = new ArrayList<>();

	public void addContatosFixos() {
		Contato contato = new Contato();
		contato.setNome("Marta");
		contato.setEmail("marta@gmail.com");

		Contato contato2 = new Contato();
		contato2.setNome("Maria José");
		contato2.setEmail("maria.jose@gmail.com");

		contatos.addAll(Arrays.asList(contato, contato2));
	}

	public List<Contato> findAll() {
		addContatosFixos();
		return this.contatos;
	}
}
