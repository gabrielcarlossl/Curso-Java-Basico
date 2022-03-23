package com.gabriel.cursojava.exercicios.Aula16_17;

public class Ex04Populacao {

	public static void main(String[] args) {
		
		 
		 int popA =80000;
		 int popB= 200000;
		 int anos = 0;
		 
		 double taxaA = 3;
		 double taxaB= 1.5;
		 
		 System.out.println("População A: "+ popA);
		 System.out.println("População B: "+ popB);
		 System.out.println(" ");

		 while (popA < popB) {
			popA += (popA/100) * taxaA;
			popB += (popB/100) * taxaB;
			anos++;
			System.out.println("População A: "+ popA);
			System.out.println("População B: "+ popB);
			System.out.println(" ");
			System.out.println("Quantidade de anos: "+ anos);
			System.out.println(" ");

		}
		 
	}

}
