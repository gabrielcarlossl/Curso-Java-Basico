package com.gabriel.cursojava.exercicios.Aula13;

import java.util.Scanner;

public class Ex05Conversor {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um tamanho em metros para converter para centímetros:");
		
		double tamanho = scan.nextDouble();
		System.out.println("Você digitou o tamanho: " + tamanho + "m");
		double conversor = tamanho * 100;
		System.out.println("O tamanho em centímetros é: " + conversor + "cm");

	}

}
