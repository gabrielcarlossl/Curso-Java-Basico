package com.gabriel.cursojava.exercicios.Aula15;

import java.util.Scanner;

public class Ex11ReajusteSalario {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe seu salário para receber o reajuste: ");
		double salary = scan.nextDouble();
		
		
		if (salary <= 280) {
			System.out.println("O salário antes do reajuste é de: R$" + salary); 
			System.out.println("O reajuste foi de 20% de aumento");
			System.out.println("O valor de aumento foi de: R$" + salary * 0.2);
			System.out.println("O salário com aumento: R$" + salary * 1.2);
		} else if ( 280 < salary && salary < 700) {
			System.out.println("O salário antes do reajuste é de: R$" + salary); 
			System.out.println("O reajuste foi de 15% de aumento");
			System.out.println("O valor de aumento foi de: R$" + salary * 0.15);
			System.out.println("O salário com aumento: R$" + salary * 1.15);
		} else if ( 700 < salary && salary < 1500) {
			System.out.println("O salário antes do reajuste é de: R$" + salary); 
			System.out.println("O reajuste foi de 10% de aumento");
			System.out.println("O valor de aumento foi de: R$" + salary * 0.1);
			System.out.println("O salário com aumento: R$" + salary * 1.1);
		} else if (salary >= 1500) {
			System.out.println("O salário antes do reajuste é de: R$" + salary); 
			System.out.println("O reajuste foi de 5% de aumento");
			System.out.println("O valor de aumento foi de: R$" + salary * 0.05);
			System.out.println("O salário com aumento: R$" + salary * 1.05);
		}
		
		
		
	
	}

}
