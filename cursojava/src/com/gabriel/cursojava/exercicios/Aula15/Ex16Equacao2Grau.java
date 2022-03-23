package com.gabriel.cursojava.exercicios.Aula15;
import java.util.Scanner;
public class Ex16Equacao2Grau {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe os valores de: a b c da equação");
		
		System.out.println("Valor de a: ");
		int a = scan.nextInt();
		
		switch (a) {
		case 0: System.out.println("Não é equação do segundo grau.");break;
		}
		
		
		
		if (a > 0 ) {
			System.out.println("Valor de b: ");
			int b = scan.nextInt();
			
			System.out.println("Valor de c: ");
			int c = scan.nextInt();
			
			double delta = (Math.pow(b, 2)) - (4 * a * c);
			
			if (delta < 0) {
				System.out.println("Delta= " + delta + " não possui raizes reais.");
			}else if (delta == 0) {
				double raiz1 = (-b + (Math.sqrt(delta)))/ 2 * a;
				
				System.out.println("Delta= " + delta + " Possui apenas uma raiz real.");
				System.out.println("A raiz é: " + raiz1);
			} else if (delta > 0) {
				double raiz1 = (-b + (Math.sqrt(delta)))/ 2 * a;
				double raiz2 = (-b - (Math.sqrt(delta)))/ 2 * a;
				System.out.println("Delta= " + delta + " Possui duas raizes reais.");
				System.out.println("Primeira raiz: X' = " + raiz1);
				System.out.println("Primeira raiz: X'' = " + raiz2);
			}
			
		}
		
		
		
		
	}

}
