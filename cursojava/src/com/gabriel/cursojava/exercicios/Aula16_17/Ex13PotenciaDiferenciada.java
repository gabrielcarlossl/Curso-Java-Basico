package com.gabriel.cursojava.exercicios.Aula16_17;
import java.util.Scanner;

public class Ex13PotenciaDiferenciada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número para a base: ");
		int base = scan.nextInt();
		System.out.println("Digite o número para o expoente: ");
		int expoente = scan.nextInt();
		int resultado = base;
		System.out.print( base + "^" + expoente + " = ");
		
		for (int i = 1; i < expoente; i++) {
			
			
			System.out.print( base + " x ");
			 resultado *=base;
			
		}
		System.out.print(base);
		System.out.print(" = " + resultado);
		
	}

}
