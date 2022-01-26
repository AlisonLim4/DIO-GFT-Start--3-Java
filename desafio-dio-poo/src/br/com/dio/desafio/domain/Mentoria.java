package br.com.dio.desafio.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo {
	
	DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	
	private LocalDate data;
	
	public Mentoria() {
	}



	public Mentoria(DateTimeFormatter df, LocalDate data) {
		super();
		this.df = df;
		this.data = data;
	}

	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public double calcularXp() {
		
		return XP_PADRAO + 20d;
	}
	
	@Override
	public String toString() {
		return "-Titulo: " + super.getTitulo() + "\n" +
			   "-Descrição: " + super.getDescricao() + "\n" +
			   "-Data: " + this.data + "\n" +
			   "----------------------------- \n";
	}



	
	
	
	
	
	
	
	
	
}
