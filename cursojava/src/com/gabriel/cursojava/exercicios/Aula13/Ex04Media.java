package com.gabriel.cursojava.exercicios.Aula13;

import java.util.Scanner;

public class Ex04Media {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 4 notas para receber a m�dia: ");
		
		System.out.println("Digite a 1� nota: ");
		double nota1 = scan.nextDouble();
		System.out.println("Digite a 2� nota: ");
		double nota2 = scan.nextDouble();
		System.out.println("Digite a 3� nota: ");
		double nota3 = scan.nextDouble();
		System.out.println("Digite a 4� nota: ");
		double nota4 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4; 
		System.out.println("A m�dia das 4 notas �: " + media);
		
	}

}
