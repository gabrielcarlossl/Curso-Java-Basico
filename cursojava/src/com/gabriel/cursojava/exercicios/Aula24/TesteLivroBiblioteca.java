package com.gabriel.cursojava.exercicios.Aula24;

import java.util.Date;

public class TesteLivroBiblioteca {

	public static void main(String[] args) {
		
		LivroBiblioteca livro = new LivroBiblioteca();
		
		livro.nome = "Manual do CS";
		livro.autor = "Gabriel";
		livro.anoLancamento = 2022;
		
		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.locador = "Gabriel";
		

	}

}
