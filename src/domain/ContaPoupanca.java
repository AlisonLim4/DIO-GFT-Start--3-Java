package domain;

public class ContaPoupanca extends Conta {
	
	@lombok.Getter
	private static final int COD = 2;

	
	//construtores
	public ContaPoupanca() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaPoupanca(Cliente cliente, Double saldo ) {
		super(cliente, saldo);
		// TODO Auto-generated constructor stub
	}
	

	
	

}
