package com.gabriel.cursojava.exercicios.Aula16_17;
import java.util.Scanner;

public class Ex19MediaVariasNotas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a quantida de notas: ");
		int qtdNotas = scan.nextInt();
		int notas;
		
		double soma = 0;
		
		for (int i = 1; i<= qtdNotas; i++ ) {
			System.out.println("Digite a " + i +" nota: ");

			notas = scan.nextInt();
			soma += notas;
		}
		
		
		double media = soma/qtdNotas;
		
		System.out.println("A soma das notas é: " + soma);
		System.out.println("A média das notas é: " + media);
		
	}

}
