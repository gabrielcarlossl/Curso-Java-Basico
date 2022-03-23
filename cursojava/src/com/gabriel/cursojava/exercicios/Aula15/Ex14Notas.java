package com.gabriel.cursojava.exercicios.Aula15;
import java.util.Scanner;
public class Ex14Notas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println("Média de Aproveitamento  " + "  Conceito");
		System.out.println("* Entre 10.0 e 9.0  " + "          A");
		System.out.println("* Entre 9.0 e 7.5  " + "           B");
		System.out.println("* Entre 7.5 e 6.0  " + "           C");
		System.out.println("* Entre 6.0 e 4.0  " + "           D");
		System.out.println("* Entre 4.0 e Zero  " + "          E");
		System.out.println();
		System.out.println("Suas notas foram: " + nota1 +" e " + nota2);
		System.out.println("Sua média foi: " + media);
	
		
		
		if (media <= 10 && media > 9) {
			System.out.println("Aprovado Conceito: A");
		}else if (media <= 9 && media > 7.5 ) {
			System.out.println("Aprovado Conceito: B");
		}else if (media <= 7.5 && media > 6) {
			System.out.println("Aprovado Conceito: C");
		}else if (media <= 6 && media > 4) {
			System.out.println("Reprovado Conceito: D");
		}else if (media <= 4 && media >= 0) {
			System.out.println("Reprovado Conceito: E");
		}
		
		
		
	}
}