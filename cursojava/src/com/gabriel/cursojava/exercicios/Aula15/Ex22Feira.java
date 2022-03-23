package com.gabriel.cursojava.exercicios.Aula15;
import java.util.Scanner;
public class Ex22Feira {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("                     Até 5kg              Acima de 5kg");
		System.out.println(" Morango         R$ 2,50 por kg           R$ 2,20 por Kg");
		System.out.println(" Maçã            R$ 1,80 por kg           R$ 1,50 por Kg");
		System.out.println("Se comprar mais de 8kg ou gastar mais de R$ 25, recebe 10% desconto");
		
		System.out.println("Quantos Kg de morango você quer? ");
		double morango = scan.nextDouble();
		System.out.println("Quantos Kg de maçã você quer? ");
		double maca = scan.nextDouble();
		
		double precoMo = 0;
		double desconto = 0;
		
		if (morango <= 5) {
			precoMo = 2.5;
		}else {
			precoMo = 2.2;	
		}

		double precoMa =  0;
		
		if (maca <=5) {
			precoMa = 1.8;
		}else {
			precoMa= 1.5;
		}
		
		double pagarMo = precoMo * morango;
		double pagarMa = precoMa * maca;
		
		if (morango > 8 || pagarMo >25) {
			desconto = 0.1;
			pagarMo = pagarMo - (pagarMo * 0.1);
		}
		
		if (maca > 8 || pagarMa > 25) {
			pagarMa = pagarMa - (pagarMa * 0.1);
		}
		
		System.out.println("Total a pagar pelo morango: R$" + pagarMo);
		System.out.println("Total a pagar pelo maçã: R$" + pagarMa);
	}
}