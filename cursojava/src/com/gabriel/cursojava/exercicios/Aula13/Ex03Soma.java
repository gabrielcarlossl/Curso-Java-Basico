package com.gabriel.cursojava.exercicios.Aula13;

import java.util.Scanner;

public class Ex03Soma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois n�meros: ");
		System.out.println("Digite o primeiro n�mero: ");
		int value1 = scan.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int value2 = scan.nextInt();
		
		System.out.println("A soma �: " + (value1 + value2));

	}

}
