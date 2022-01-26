package domain;

public class ContaCorrente extends Conta {
	
	@lombok.Getter
	private static final int COD = 1;

	public ContaCorrente() {
		super();
		
	}

	public ContaCorrente(Cliente cliente, Double saldo) {
		super(cliente, saldo);
		
	}

	

}
