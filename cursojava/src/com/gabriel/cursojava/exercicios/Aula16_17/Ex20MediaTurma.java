package com.gabriel.cursojava.exercicios.Aula16_17;
import java.util.Scanner;

public class Ex20MediaTurma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de idade das pessoas: ");
		int qtdIdades = scan.nextInt();
		int idades;
		
		double soma = 0;
		
		for (int i = 1; i<= qtdIdades; i++ ) {
			System.out.println("Digite a " + i +" idade: ");

			idades = scan.nextInt();
			soma += idades;
		}
		
		
		double media = soma/qtdIdades;
		
		System.out.println("A soma das idades é: " + soma);
		System.out.println("A média das idades é: " + media);
		
		if (media >= 0 && media <=25 ) {
			System.out.println("É uma turma Jovem.");
		}else if (media >= 26 && media <=60 ) {
			System.out.println("É uma turma Adulta.");
		}else if (media >60) {
			System.out.println("É uma turma Idosa.");
		}
	}

}
