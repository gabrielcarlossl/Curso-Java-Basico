package com.gabriel.cursojava.exercicios.Aula13;

import java.util.Scanner;

public class Ex06Raio {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo para receber sua �rea: ");
		
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow(raio,2);
		System.out.println("A �rea do circulo �: " +  area);
		

	}

}
