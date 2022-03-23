package com.gabriel.cursojava.exercicios.Aula15;
import java.util.Scanner;
public class Ex18ParImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número para saber se é par ou impar: ");
		
		int numero = scan.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O número: " + numero + " é par.");
			
		}else if(numero % 2 !=0) {
			System.out.println("O número: " + numero + " é ímpar.");
		}

	}

}
