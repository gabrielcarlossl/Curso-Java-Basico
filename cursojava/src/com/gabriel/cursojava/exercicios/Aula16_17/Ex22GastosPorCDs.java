package com.gabriel.cursojava.exercicios.Aula16_17;
import java.util.Scanner;

public class Ex22GastosPorCDs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a quantidade de CD's que você possui :");
		int numCd = scan.nextInt();
		
		double valor = 0;
		double soma = 0;
		
		
		for (int i= 1; i <= numCd; i++ ) {
			System.out.println("Digite o valor do "+ i +"º CD: ");
			valor = scan.nextDouble();
			soma += valor;
			
		}
		System.out.println("Total gasto com os CD's: R$" + soma);
		
		double media = soma/numCd;
		System.out.println("Média de gasto com cada CD: R$" + media);
	}

}
