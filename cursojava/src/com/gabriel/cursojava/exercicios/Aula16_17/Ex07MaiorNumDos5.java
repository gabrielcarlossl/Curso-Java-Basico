package com.gabriel.cursojava.exercicios.Aula16_17;
import java.util.Scanner;

public class Ex07MaiorNumDos5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num;
		int maior= Integer.MIN_VALUE;
		
		for (int i = 0; i<5; i++) {
			System.out.println("Digite o primeiro número: ");
			num = scan.nextInt();
			
			if (num > maior) {
				maior = num;
				System.out.println("O maior número é: " + maior);
			}
		}
		
		
		
	}

}
