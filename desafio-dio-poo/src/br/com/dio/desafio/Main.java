package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.domain.Bootcamp;
import br.com.dio.desafio.domain.Curso;
import br.com.dio.desafio.domain.Dev;
import br.com.dio.desafio.domain.Mentoria;

public class Main {
	public static void main(String[] args) {

		// Curso
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("descrição curso javascript");
		curso2.setCargaHoraria(4);

		// Mentoria
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("descrição mentoria Java");
		mentoria1.setData(LocalDate.now());

		// Bootcamp
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);

		// Dev
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Camila: ");
		System.out.println(devCamila.getConteudosInscritos());
		
		devCamila.progredir();
		
		System.out.println("Conteudos Concluídos Camila: ");
		System.out.println(devCamila.getConteudosConcluidos());
		
		System.out.println("Atualizado conteúdos inscritos Camila: ");
		System.out.println(devCamila.getConteudosInscritos());
		
		System.out.println("XP Camila: ");
		System.out.println(devCamila.calcularXp());
		
		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		System.out.println("Conteudos inscritos João: " + devJoao.getConteudosInscritos());
		// saídas
//		System.out.println("----\tCursos\t----");
//		System.out.println(curso1);
//		System.out.println(curso2);
//
//		System.out.println("----\tMentorias\t----");
//		System.out.println(mentoria1);

	}
}