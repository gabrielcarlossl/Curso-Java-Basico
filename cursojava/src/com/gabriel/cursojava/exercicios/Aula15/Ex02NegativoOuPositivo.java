package com.gabriel.cursojava.exercicios.Aula15;

import java.util.Scanner;

public class Ex02NegativoOuPositivo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero para saber se � - ou +:");
		
		int num = scan.nextInt();
		
		if(num >= 0) {
			System.out.println("� Positivo.");
		} else{
			System.out.println("� Negativo.");
		}
	}

}
