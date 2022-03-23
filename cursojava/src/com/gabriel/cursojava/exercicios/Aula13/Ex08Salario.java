package com.gabriel.cursojava.exercicios.Aula13;

import java.util.Scanner;

public class Ex08Salario {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quanto você ganha por hora trabalhada: ");
		double hourPrice = scan.nextDouble();
		
		System.out.println("Digite quantas horas por dia você trabalha: ");
		double hourPerDay = scan.nextDouble();
		
		System.out.println("Digite quantos dias você trabalhou no mês:");
		int workedDays = scan.nextInt();
		
		double hoursPerMonth = workedDays * hourPerDay;
		
		double salary = hoursPerMonth * hourPrice;
		System.out.println("Seu salário no mês será de: R$"+ salary);
		
		
		
		
		

	}

}
