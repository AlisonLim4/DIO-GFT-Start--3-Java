package domain;

import domain.interfaces.IConta;

public class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	@lombok.Getter
	@lombok.Setter
	protected int agencia;

	@lombok.Getter
	@lombok.Setter
	protected Integer numero;

	@lombok.Getter
	@lombok.Setter
	protected Cliente cliente;

	@lombok.Getter
	@lombok.Setter
	protected Double saldo;

	// ==== Construtores ==== //
	public Conta() {
		
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL ++;
	}
	
	public Conta(Cliente cliente, Double saldo) {
		
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL ++;
		
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	// ==== Metodos ==== //
	
	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;

	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);

	}



}
