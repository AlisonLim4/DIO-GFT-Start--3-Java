package br.com.dio.desafio.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	


	private String nome;

	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<Conteudo>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<Conteudo>();


	//Getters e Setters
	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Metodos
	
	public void inscreverBootcamp(Bootcamp bootcamp) {
				this.getConteudosInscritos().addAll(bootcamp.getConteudos());
				bootcamp.getDevs_inscritos().add(this);
	}
	
	public void progredir() {
		//buscando o primeiro conteudo e armazenando na variavel conteudo(lembrando que findfirst() retorna um optional
		Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();
		
		if(conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
		}else {
			System.err.println("Você não está matriculado em nenhum conteúdo");
		}
	}
	
	
	public double calcularXp() {
		return conteudosConcluidos.stream()
				.mapToDouble(conteudo -> conteudo.calcularXp()).sum();
			
		//forma opcional com reference Method
     /* conteudosConcluidos.stream()
	.mapToDouble(Conteudo::calcularXp).sum(); */
	
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosInscritos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(conteudosInscritos, other.conteudosInscritos);
	}
	
	
}
