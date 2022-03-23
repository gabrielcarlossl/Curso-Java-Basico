package com.gabriel.cursojava.exercicios.Aula16_17;
import java.util.Scanner;

public class Ex16FibonacciMaior500 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quantos termos da série de Fibonacci você quer receber: ");
		int n = scan.nextInt();
		
		int primeiro = 1;
		int segundo = 1;
		int proximo = 0;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		while ( proximo <= 500) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			System.out.println(proximo);
		}
			
		
	}

}
