package com.gabriel.cursojava.exercicios.Aula13;

import java.util.Scanner;

public class Ex13Imposto {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-----Calculadora de Descontos salarial-----");
		
		System.out.println(" Quanto ganha por hora? ");
		double hourPrice = scan.nextDouble();
		System.out.println(" Quantas horas por mês? ");
		double hoursPerMonth = scan.nextDouble();
		double salary = hourPrice * hoursPerMonth;
		System.out.println(" Seu salário bruto será de : R$" + salary);
		System.out.println("------------------------------");

		double inss = (salary * 0.08);
		System.out.println(" 8% Pago ao INSS: R$" + inss );
		System.out.println("------------------------------");

		double sindicato = (salary * 0.05);
		System.out.println(" 5% Pago ao sindicato: R$" + sindicato);
		
		System.out.println("----------------------------------------");
		double impostoRenda = (salary * 0.11);
		System.out.println(" 11% Pago ao Imposto de Renda: R$" + impostoRenda);
		System.out.println("----------------------------------------");
		double liquidSalary = salary - (inss + sindicato + impostoRenda);
		System.out.println("Seu salário líquido será de: R$" + liquidSalary);
		
	}

}
