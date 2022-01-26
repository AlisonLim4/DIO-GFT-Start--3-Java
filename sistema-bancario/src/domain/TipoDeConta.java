package domain;

public enum TipoDeConta {

	CONTA_CORRENTE(1, "Conta Corrente"), CONTA_POUPANCA(2, "Conta Poupança");

	@lombok.Getter
	private Integer cod;
	@lombok.Getter
	private String descricao;

	// ==== construtor ==== //
	TipoDeConta(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	// ==== conversor ==== //
	public static TipoDeConta toEnum(Integer cod) {

		if (cod == null) {
			return null;
		}

		for (TipoDeConta x : TipoDeConta.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}

		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
