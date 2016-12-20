package br.com.gerenciadordecursos;

public class TesteCurso {
	public static void main(String[] args) {
		Cursos javaColecoes = new Cursos("Dominando as coleções", "Paulo Silveira");

		javaColecoes.adicionar(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adicionar(new Aula("Criando uma aula", 20));
		javaColecoes.adicionar(new Aula("Modelando coleções", 22));

		System.out.println(javaColecoes.getAulas());
	}
}
