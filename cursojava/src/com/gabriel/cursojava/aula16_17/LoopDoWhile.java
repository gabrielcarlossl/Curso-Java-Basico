package com.gabriel.cursojava.aula16_17;

public class LoopDoWhile {

	public static void main(String[] args) {
		
		
		int i = 0; // geralmente chama i de cont ou count
		
		int max = 10;
		
		System.out.println("Contando at� " + max);
		
		while (i < max) {
			System.out.println("Valor de i: " + i);
			i++; //i = i + 1 ou i +=1
		}

		System.out.println(i);
		
		do {
			i++;
			System.out.println("Valor de i: " + i);
		} while (i < 15);
		
		System.out.println(i);
	}

}
