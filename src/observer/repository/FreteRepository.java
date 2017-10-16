package observer.repository;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import observer.models.Frete;
import observer.models.builder.FreteBuilder;

public class FreteRepository {

	public List<Frete> findAll() {
		
		Frete frete1 = FreteBuilder.criarFrete()
									.comDescricao("Frete de Combustível Alcool")
									.comEstado("Bahia")
									.comValor(new BigDecimal("20000"))
									.comMotorista("Joao Pereira", "(99)9.9999-9999")
									.comVeiculo("Scania X1", "XXX-9999")
									.build();
				
				
		Frete frete2 = FreteBuilder.criarFrete()
									.comDescricao("Frete de Combustível Diesel")
									.comEstado("São Paulo")
									.comValor(new BigDecimal("24000"))
									.comMotorista("Maria Val", "(88)8.8888-8899")
									.comVeiculo("Scania C6", "XPT-91241")
									.build();
		
		return Arrays.asList(frete1, frete2);
	}

}
