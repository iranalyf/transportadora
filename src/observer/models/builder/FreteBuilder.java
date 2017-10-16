package observer.models.builder;

import java.math.BigDecimal;

import observer.models.Frete;
import observer.models.Motorista;
import observer.models.Veiculo;

public class FreteBuilder {

	private Frete instancia;

	public static FreteBuilder criarFrete() {
		return new FreteBuilder();
	}

	public FreteBuilder() {
		this.instancia = new Frete();
	}

	public FreteBuilder comMotorista(String nome, String telefone) {
		Motorista motorista = new Motorista();
		motorista.setNome(nome);
		motorista.setTelefone(telefone);
		this.instancia.setMotorista(motorista);
		return this;
	}

	public FreteBuilder comVeiculo(String nome, String placa) {
		Veiculo veiculo = new Veiculo();
		veiculo.setNome(nome);
		veiculo.setPlaca(placa);
		this.instancia.setVeiculo(veiculo);
		return this;
	}

	public FreteBuilder comDescricao(String descricao) {
		this.instancia.setDescricao(descricao);
		return this;
	}

	public FreteBuilder comValor(BigDecimal valor) {
		this.instancia.setValor(valor);
		return this;
	}

	public FreteBuilder comEstado(String estado) {
		this.instancia.setEstado(estado);
		return this;
	}

	public Frete build() {
		return this.instancia;
	}

}
