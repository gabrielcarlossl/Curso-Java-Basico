package com.gabriel.cursojava.exercicios.Aula13;

import java.util.Scanner;

public class Ex05Conversor {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um tamanho em metros para converter para cent�metros:");
		
		double tamanho = scan.nextDouble();
		System.out.println("Voc� digitou o tamanho: " + tamanho + "m");
		double conversor = tamanho * 100;
		System.out.println("O tamanho em cent�metros �: " + conversor + "cm");

	}

}
