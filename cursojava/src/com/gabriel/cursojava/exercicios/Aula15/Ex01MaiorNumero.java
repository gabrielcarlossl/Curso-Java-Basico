package com.gabriel.cursojava.exercicios.Aula15;

import java.util.Scanner;

public class Ex01MaiorNumero {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois n�meros para receber qual � maior:");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1 + " � maior que " + num2);
		} else if (num2 > num1) {
			System.out.println(num2 + " � maior que " + num1);
		} else {
			System.out.println("S�o iguais.");
		}
	}

}
