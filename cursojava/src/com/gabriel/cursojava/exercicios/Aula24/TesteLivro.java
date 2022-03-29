package com.gabriel.cursojava.exercicios.Aula24;

public class TesteLivro {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		
		livro.nome = "Manual do CS";
		livro.autor = "Gabriel";
		livro.anoLancamento = 2022;
		
		System.out.println("Nome do livro = " + livro.nome);

	}

}
