package com.gabriel.cursojava.exercicios.Aula16_17;
import java.util.Scanner;

public class Ex14QtdNumParEImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		int par = 0;
		int impar = 0;
		
		System.out.println("Digite 10 n�meros: ");
		for (int i= 1; i < 11; i++) {
			System.out.println("Digite o " + i + " n�mero: ");
			num = scan.nextInt();
			
			if (num % 2 == 0) {
				par +=1;
			}else {
				impar +=1;
			}
			
		}
		
		System.out.println("Dos 10 n�meros digitados: ");
		System.out.println("Quantidade de n�meros Pares: " + par);
		System.out.println("Quantidade de n�meros �mpares: " + impar);
		
		
	}

}
