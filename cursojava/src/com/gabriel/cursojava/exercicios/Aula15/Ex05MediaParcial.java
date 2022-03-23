package com.gabriel.cursojava.exercicios.Aula15;

import java.util.Scanner;

public class Ex05MediaParcial {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite duas notas para saber se foi aprovado ou não:");
		
		System.out.println("Primeira nota:");
		double nota1 = scan.nextDouble();
		System.out.println("Segunda nota:");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2)  / 2;
		
		if (media >= 7 && media <= 9) {
			System.out.println("Aprovado.");
		} else if (media < 7) {
			System.out.println("Reprovado.");
		} else if(media == 10) {
			System.out.println("Aprovado com média Máxima!");
		}
		

	}

}
