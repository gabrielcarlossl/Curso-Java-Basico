package com.gabriel.cursojava.exercicios.Aula15;

import java.util.Scanner;

public class Ex12ImpostoRenda {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor da hora: ");
		double priceHour = scan.nextDouble();
		System.out.println("Informe quantas horas foram trabalhadas no mês: ");
		double hoursWorked = scan.nextDouble();
		
		double salary = hoursWorked * priceHour;
		
		
		double iNSS = salary * 0.1;
		double fGTS = salary * 0.11;
		
		if (salary <= 900) {
			
			double impostoR = 0;
			
			double totalDesc = iNSS + impostoR;
			
			double salaryLiq = salary - totalDesc;
			
			
			System.out.println("Salário bruto: ( " + priceHour + " * " + hoursWorked + " )           " + " : R$" + salary);
			System.out.println("( - ) IR   (Isento)                       : R$" + impostoR);
			System.out.println("( - ) INSS ( 10% )                        : R$" + iNSS);
			System.out.println("FGTS       ( 11% )                        : R$" + fGTS);
			System.out.println("Total de descontos                        : R$" + totalDesc);
			System.out.println("Salário Líquido                           : R$" + salaryLiq);
			
		} else if (salary <= 1500 && salary > 900) {
			
			double impostoR = salary * 0.05;
			
			double totalDesc = iNSS + impostoR;
			
			double salaryLiq = salary - totalDesc;
			
			
			System.out.println("Salário bruto: ( " + priceHour + " * " + hoursWorked + " )           " + " : R$" + salary);
			System.out.println("( - ) IR   (  5% )                        : R$" + impostoR);
			System.out.println("( - ) INSS ( 10% )                        : R$" + iNSS);
			System.out.println("FGTS       ( 11% )                        : R$" + fGTS);
			System.out.println("Total de descontos                        : R$" + totalDesc);
			System.out.println("Salário Líquido                           : R$" + salaryLiq);
			
		} else if ( salary <= 2500 && salary > 1500) {
			
			double impostoR = salary * 0.1;
			
			double totalDesc = iNSS + impostoR;
			
			double salaryLiq = salary - totalDesc;
			
			
			System.out.println("Salário bruto: ( " + priceHour + " * " + hoursWorked + " )           " + " : R$" + salary);
			System.out.println("( - ) IR   ( 10% )                        : R$" + impostoR);
			System.out.println("( - ) INSS ( 10% )                        : R$" + iNSS);
			System.out.println("FGTS       ( 11% )                        : R$" + fGTS);
			System.out.println("Total de descontos                        : R$" + totalDesc);
			System.out.println("Salário Líquido                           : R$" + salaryLiq);
			
		} else if (salary > 2500) {
			
			double impostoR = salary * 0.2;
			
			double totalDesc = iNSS + impostoR;
			
			double salaryLiq = salary - totalDesc;
			
			System.out.println("Salário bruto: ( " + priceHour + " * " + hoursWorked + " )           " + " : R$" + salary);
			System.out.println("( - ) IR   ( 20% )                        : R$" + impostoR);
			System.out.println("( - ) INSS ( 10% )                        : R$" + iNSS);
			System.out.println("FGTS       ( 11% )                        : R$" + fGTS);
			System.out.println("Total de descontos                        : R$" + totalDesc);
			System.out.println("Salário Líquido                           : R$" + salaryLiq);
		}
		
		
		
		
		
	}
	

}
