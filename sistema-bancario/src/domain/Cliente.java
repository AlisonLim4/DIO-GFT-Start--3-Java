package domain;

public class Cliente {
	
	private static int SEQUENCIAL = 1;
	
	@lombok.Getter
	@lombok.Setter
	private Integer cod;
	
	@lombok.Getter
	@lombok.Setter
	private String nome;
	
	@lombok.Getter
	@lombok.Setter
	private String dataNascimento;
	
	@lombok.Getter
	@lombok.Setter
	private String cpfOuCnpj;
	
	@lombok.Getter
	@lombok.Setter
	private String telefone;
	
	@lombok.Getter
	@lombok.Setter
	private Conta conta;
	
	
	// ==== Construtores ==== //
	public Cliente() {
		this.cod = SEQUENCIAL ++;
	}

	public Cliente(String nome, String dataNascimento, String cpfOuCnpj, String telefone,Conta conta) {
		this.cod = SEQUENCIAL ++;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpfOuCnpj = cpfOuCnpj;
		this.telefone = telefone;
		this.conta = conta;
	}

	
	
	
}
