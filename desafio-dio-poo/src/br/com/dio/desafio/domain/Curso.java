package br.com.dio.desafio.domain;

public class Curso extends Conteudo {

	private Integer cargaHoraria;

	// Construtores
	public Curso() {

	}

	// getters e Setters
	

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

    // ----- Fim  getters e setters-----/
	// ToString
	@Override
	public String toString() {
		return "-Titulo: " + super.getTitulo() + "\n" +
				   "-Descrição: " + super.getDescricao() + "\n" +
				   "-Carga horária: " + this.cargaHoraria+ "\n" +
				   "----------------------------- \n" ;
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}

}

//Calcular XP