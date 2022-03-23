package com.gabriel.cursojava.exercicios.Aula13;

import java.util.Scanner;

public class Ex11Calc {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 2 números inteiros e um número Real: ");
		
		System.out.println("Digite o 1º número inteiro: ");
		double numInt1 = scan.nextDouble();
		System.out.println("Digite o 2º número inteiro: ");
		double numInt2 = scan.nextDouble();
		System.out.println("Digite o numero real: ");
		double numReal = scan.nextDouble();
		
		double calc1 = ((numInt1 * 2) * (numInt2 /2));
		System.out.println("O produto do dobro do primeiro com metade do segundo: " + calc1);
		
		double calc2 = ((numInt1 * 3) + numReal);
		System.out.println("A soma do triplo do primeiro com o terceiro: " + calc2);
		
		double calc3 = Math.pow(numReal, 3);
		System.out.println("O terceiro número elevado ao cubo: " + calc3);
		

	}

}
