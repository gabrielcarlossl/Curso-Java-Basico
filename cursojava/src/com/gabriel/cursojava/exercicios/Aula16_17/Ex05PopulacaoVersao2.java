package com.gabriel.cursojava.exercicios.Aula16_17;
import java.util.Scanner;

public class Ex05PopulacaoVersao2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
		
		boolean valido = false;
		 
		double popA;
		double popB;
		double taxaA;
		double taxaB;
		
		

		do {
			System.out.println("Entre com a popula��o A: ");
			popA = scan.nextDouble();
			
			if (popA >0) {
				valido = true;
			}else {
				System.out.println("Popula��o A precisa ser maior que 0");
			}
		} while (!valido);
		
		
		valido = false;
		do {
			System.out.println("Entre com a popula��o B: ");
			popB = scan.nextDouble();
			
			if (popB >0) {
				valido = true;
			}else {
				System.out.println("Popula��o B precisa ser maior que 0");
			}
		} while (!valido);
		
		valido = false;
		
		do {
			System.out.println("Entre com a taxa da popula��o A: ");
			taxaA = scan.nextDouble();
			
			if (taxaA >0) {
				valido = true;
			}else {
				System.out.println("Taxa A precisa ser maior que 0");
			}
		} while (!valido);
		
		
		valido = false;
		
		do {
			System.out.println("Entre com a taxa da popula��o B: ");
			taxaB = scan.nextDouble();
			
			if (taxaB >0) {
				valido = true;
			}else {
				System.out.println("Taxa B precisa ser maior que 0");
			}
		} while (!valido);
		
		int anos = 0;
		
		while (popA < popB) {
			popA += (popA/100) * taxaA;
			popB += (popB/100) * taxaB;
			anos++;
			System.out.println("Popula��o A: "+ popA);
			System.out.println("Popula��o B: "+ popB);
			System.out.println(" ");
			System.out.println("Quantidade de anos: "+ anos);
			System.out.println(" ");
		}
		
	}

}
