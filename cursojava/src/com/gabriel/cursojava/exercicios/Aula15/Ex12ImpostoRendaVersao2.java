package com.gabriel.cursojava.exercicios.Aula15;

import java.util.Scanner;
public class Ex12ImpostoRendaVersao2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor da hora: ");
		
		double hourPrice = scan.nextDouble();
		
		System.out.println("Informe quantas horas foram trabalhadas no mês: ");
		
		double hoursWorked = scan.nextDouble();
		
		double salary = hoursWorked * hourPrice;
		
		double impostoR = 0;
		
		if (salary <= 900) {
			
			impostoR = 0;
			
			
		} else if (salary <= 1500 && salary > 900) {
			
			impostoR = 5;
			
			
		} else if ( salary <= 2500 && salary > 1500) {
			
			impostoR = 10;
			
		} else if (salary > 2500) {
			
			impostoR = 20;
			
		}
		
		double ir = (salary / 100) * impostoR;
		double inss = (salary / 100) * 10;
		double fgts = (salary / 100) * 11;
		double totalDesc = ir + inss;
		double liqSalary = salary - totalDesc;
		
		System.out.println("Salário bruto: (" + hourPrice + " * " + hoursWorked + ")          : R$ " + salary);
		System.out.println("( - ) Imposto de Renda (" + impostoR + "% )        : R$ " + ir);
		System.out.println("( - ) INSS ( 10% )                     : R$ " + inss);
		System.out.println("FGTS ( 11% )                           : R$ " + fgts);
		System.out.println("Total de descontos                     : R$ " + totalDesc);
		System.out.println("Salário Líquido                        : R$ " + liqSalary);
		
	}

}
