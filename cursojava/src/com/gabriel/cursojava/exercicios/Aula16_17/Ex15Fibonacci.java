package com.gabriel.cursojava.exercicios.Aula16_17;
import java.util.Scanner;
public class Ex15Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite quantos termos da série de Fibonacci você quer receber: ");
		int n = scan.nextInt();
		
		int primeiro = 1;
		int segundo = 1;
		int proximo;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		for ( int i = 3; i <= n; i++ ) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			System.out.println(proximo);
		}
	}

}
