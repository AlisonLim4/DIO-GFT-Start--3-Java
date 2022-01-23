package domain;

import domain.interfaces.IConta;

public class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	@lombok.Getter
	private static final int COD = 0;

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
	protected Double saldo;

	// ==== Construtores ==== //
	public Conta() {

		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}

	public Conta(Cliente cliente, Double saldo) {

		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;

		this.cliente = cliente;
		this.saldo = saldo;
	}

	// ==== Metodos ==== //

	@Override
	public void sacar(double valor) {
		if (this.getSaldo() >= valor) {
			this.saldo -= valor;
			System.out.println("Operação realizada com sucesso");
		} else if (this.getSaldo() < valor) {
			System.out.println("Impossível realizar esta operação. Saldo insuficiente!");
		}
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;

		System.out.println("Operação realizada com sucesso!");

	}

	@Override
	public void transferir(double valor, Conta contaDestino, Banco banco) {
		if (banco.existeConta(contaDestino)) {
			if (this.saldo >= valor) {
				this.sacar(valor);
			} else {
				System.out.println("Saldo Insuficiente!");
			}
		} else {
			System.out.println("Impossível realizar essa operação. Conta inexistente!");
		}
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Informações da Conta ===");
		;
		System.out.println("Cliente: " + this.getCliente().getNome());
		System.out.println("Agência: " + this.getAgencia());
		System.out.println("Número da Conta: " + this.getNumero());
		System.out.println("Saldo: " + this.getSaldo());

	}

	@Override
	public String getTipoDeConta() {

		if (this.getCOD() == 1) {
			return "Conta Corrente";
		} else {
			return "Conta Poupança";
		}
	}

}
