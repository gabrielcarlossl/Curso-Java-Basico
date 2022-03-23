package com.gabriel.cursojava.exercicios.Aula13;

import java.util.Scanner;
public class Ex10ConverterFarenheit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius °C para converter em Farenheit °F: " );
		
		double tempCelsius = scan.nextDouble();
		
		double converter = (tempCelsius * 9/5) + 32;
		
		System.out.println(tempCelsius + "°C é igual a: " + converter + "°F");
		
	}

}
