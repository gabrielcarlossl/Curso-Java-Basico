package com.gabriel.cursojava.exercicios.Aula15;

import java.util.Scanner;

public class Ex06MaiorOuMenor {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 3 n�meros para receber qual o maior deles:");
		
		System.out.println("Digite primeiro n�mero: ");
		int num1 = scan.nextInt();
		System.out.println("Digite segundo n�mero: ");
		int num2 = scan.nextInt();
		System.out.println("Digite terceiro n�mero: ");
		int num3 = scan.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1+ " � o maior!");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2+ " � o maior!");
		} else if (num3 > num1 && num3 > num2) {
			System.out.println(num3+ " � o maior!");
		}
	}

}
