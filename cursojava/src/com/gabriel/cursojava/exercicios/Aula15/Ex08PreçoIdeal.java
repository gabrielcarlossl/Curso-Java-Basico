package com.gabriel.cursojava.exercicios.Aula15;

import java.util.Scanner;

public class Ex08PreçoIdeal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		

		
		System.out.println("Digite 3 preços de produtos para saber qual o ideal:");
		
		System.out.println("Digite primeiro preço: ");
		double price1 = scan.nextDouble();
		System.out.println("Digite segundo preço: ");
		double price2 = scan.nextDouble();
		System.out.println("Digite terceiro preço: ");
		double price3 = scan.nextDouble();
	
		
		if (price1 < price2 && price1 < price3) {
			System.out.println("R$" + price1 + " é o preço ideal!");
		} else if (price2 < price1 && price2 < price3) {
			System.out.println("R$" + price2 + " é o preço ideal!");
		} else if (price3 < price1 && price3 < price2) {
			System.out.println("R$" + price3 + " é o preço ideal!");
		}
		
	}
}
