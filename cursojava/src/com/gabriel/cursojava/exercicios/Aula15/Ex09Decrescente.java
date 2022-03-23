package com.gabriel.cursojava.exercicios.Aula15;

import java.util.Scanner;
public class Ex09Decrescente {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 3 números para receber a ordem decrescente:");
		
		System.out.println("Digite primeiro número: ");
		int num1 = scan.nextInt();
		System.out.println("Digite segundo número: ");
		int num2 = scan.nextInt();
		System.out.println("Digite terceiro número: ");
		int num3 = scan.nextInt();
		
		if (num1 > num2 && num1 > num3 && num2 > num3 ) {
			System.out.println("Ordem decrescente: " + num1 + " - " + num2 + " - "+ num3);
		} else if (num2 > num1 && num2 > num3 && num1 > num3) {
			System.out.println("Ordem decrescente: " + num2 + " - " + num1 + " - "+ num3);
		} else if (num3 > num1 && num3 > num2 && num2 > num1) {
			System.out.println("Ordem decrescente: " + num3 + " - " + num2 + " - "+ num1);
		} else if (num2 > num3 && num2 > num1 && num3 > num1) {
			System.out.println("Ordem decrescente: " + num2 + " - " + num3 + " - "+ num1);
		} else if (num3 > num1 && num3 > num2 && num1 > num2) {
			System.out.println("Ordem decrescente: " + num3 + " - " + num1 + " - "+ num2);
		} else if (num1 > num3 && num1 > num2 && num3 > num2) {
			System.out.println("Ordem decrescente: " + num1 + " - " + num3 + " - "+ num2);
		}
		

	}

}
