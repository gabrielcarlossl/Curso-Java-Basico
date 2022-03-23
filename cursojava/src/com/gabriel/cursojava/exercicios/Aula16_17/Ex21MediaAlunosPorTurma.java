package com.gabriel.cursojava.exercicios.Aula16_17;

import java.util.Scanner;

public class Ex21MediaAlunosPorTurma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean valido = false;
		
		System.out.println("Digite a quantida de turmas: ");
		int qtdTurmas = scan.nextInt();
		
		int alunos = 0 ;
		
		boolean invalido = true;
		
		double soma = 0;
		
		for (int i = 0; i< qtdTurmas; i++ ) {
			invalido = true;
			
			do {
				System.out.println("Digite o número de alunos da " + (i+1) + "º turma: ");
				alunos = scan.nextInt();
				
				if (alunos <= 40) {
					invalido = false;
				}else {
					System.out.println("Número de alunos passou do limite, digite menor que 40 alunos:");
				}
				
			} while (invalido);
			
			soma += alunos;
		}
		
		
		double media = soma/qtdTurmas;
		
		System.out.println("A soma dos alunos de todas as turmas é: " + soma);
		System.out.println("A média do número de alunos por turma é: " + media);

	}

}
