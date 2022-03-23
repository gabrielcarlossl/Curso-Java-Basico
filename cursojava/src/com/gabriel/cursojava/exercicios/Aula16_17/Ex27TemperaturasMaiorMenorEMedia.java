package com.gabriel.cursojava.exercicios.Aula16_17;
import java.util.Scanner;
public class Ex27TemperaturasMaiorMenorEMedia {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double temp;
		double media= 0;
		double soma = 0;
		
		double maior = Double.MIN_VALUE;
		double menor = Double.MAX_VALUE;
		System.out.println("Digite a quantidade de temperaturas: ");
		int qtdTemp = scan.nextInt();
		
		for ( int i =1; i <= qtdTemp; i++ ) {
			System.out.println("Digite a "+i+"� temperatura: ");
			temp = scan.nextDouble();
			soma += temp;
			
			if (temp > maior) {
				maior  = temp;
			}
			
			if (temp < menor) {
				menor = temp;
			}
		}
		
		media = soma/ qtdTemp;
		
		System.out.println("A m�dia das temperaturas �: " + media + "�C");
		System.out.println("A maior temperaturas �: " + maior + "�C");
		System.out.println("A menor temperaturas �: " + menor + "�C");

		
	}

}
