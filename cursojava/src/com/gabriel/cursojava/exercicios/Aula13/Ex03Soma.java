package com.gabriel.cursojava.exercicios.Aula13;

import java.util.Scanner;

public class Ex03Soma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois números: ");
		System.out.println("Digite o primeiro número: ");
		int value1 = scan.nextInt();
		System.out.println("Digite o segundo número: ");
		int value2 = scan.nextInt();
		
		System.out.println("A soma é: " + (value1 + value2));

	}

}
