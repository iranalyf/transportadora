package strategy;

import strategy.frete.Normal;
import strategy.frete.Rapido;

public enum TipoFrete {

	NORMAL {
		@Override
		public Frete obterFrete() {
			return new Normal();
		}
	},
	SEDEX {
		@Override
		public Frete obterFrete() {
			return new Rapido();
		}
	};
	
	public abstract Frete obterFrete();
	
}
