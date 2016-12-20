package br.com.gerenciadordecursos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cursos {
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<>();

	public Cursos(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adicionar(Aula aula) {
		this.aulas.add(aula);
	}

}
