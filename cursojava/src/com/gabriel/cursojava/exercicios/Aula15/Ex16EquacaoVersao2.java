package com.gabriel.cursojava.exercicios.Aula15;

import java.util.Scanner;

public class Ex16EquacaoVersao2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre valor de a: ");
		int a = scan.nextInt();
		
		if (a == 0) {
			System.out.println("Não é equação do segundo grau.");
		}else {
			
			System.out.println("Entre valor de b: ");
			int b = scan.nextInt();
			
			System.out.println("Entre valor de c: ");
			int c = scan.nextInt();
			
			double delta = (b*b) - (4 * a * c);
			
			if (delta < 0) {
				
				System.out.println("Delta negativo.");
			} else {
				
				System.out.println("Delta: " + delta);
				
				double x1 = ((-b) + Math.sqrt(delta))/(2*a);
				double x2 = ((-b) - Math.sqrt(delta))/(2*a);
				
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
				
			}
			
			
		}
		
		
		
	}

}
