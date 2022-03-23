package com.gabriel.cursojava.exercicios.Aula16_17;
import java.util.Scanner;

public class Ex08SomaMedia5Num {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		int num;
		double media;
		int soma = 0;
		
		for (int i = 0; i<5; i++) {
			System.out.println("Digite o um número: ");
			num = scan.nextInt();
			
			soma +=num;
		}
		
		media = soma/5;
		
		System.out.println("Soma: "+ soma);
		System.out.println("Média: "+ media);

	}

}
