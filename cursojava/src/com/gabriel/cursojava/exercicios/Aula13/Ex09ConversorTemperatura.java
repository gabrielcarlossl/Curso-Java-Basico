package com.gabriel.cursojava.exercicios.Aula13;

import java.util.Scanner;

public class Ex09ConversorTemperatura {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Farenheit °F para converter em Celsius °C: ");
		double tempFaren = scan.nextDouble();
		
		double converter = (5*(tempFaren - 32) /9);
		System.out.println("A temperatura em Celsius °C é: " + converter + "°C");
		

	}

}
