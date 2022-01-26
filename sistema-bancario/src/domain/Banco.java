package domain;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	@lombok.Getter
	@lombok.Setter
	private String nome;

	@lombok.Getter
	@lombok.Setter
	List<Conta> contas = new ArrayList<>();

	@lombok.Getter
	@lombok.Setter
	List<Cliente> clientes = new ArrayList<>();

	// ==== Construtores ==== //

	public Banco() {
	}

	public Banco(String nome) {
		this.nome = nome;
	}

	// ==== Metodos ==== //

	public Boolean existeConta(Conta conta) {
		for (Conta c : this.contas) {
			if (c.getCliente().equals(conta.getCliente())) {
				return true;
			}
		}
		return false;
	}

}
