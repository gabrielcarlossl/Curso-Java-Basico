package com.gabriel.cursojava.exercicios.Aula13;

import java.util.Scanner;

public class Ex12PesoIdeal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		System.out.println("Seu peso ideal �: " + pesoIdeal + "kg");
		

	}

}
