package com.gabriel.cursojava.exercicios.Aula15;

import java.util.Scanner;

public class Ex19Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois números para realizar calculo:");
		System.out.println("Digite primeiro número:");
		double num1 = scan.nextInt();
		
		System.out.println("Digite segundo número:");
		double num2 = scan.nextInt();
		
		System.out.println("Digite para realizar a operação ( +  -  /  *  :");
		
		String operacao = scan.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch (operacao) {
		case "+":resultado = num1 + num2;break;
		case "-":resultado = num1 - num2;break;
		case "/":resultado = num1 / num2;break;
		case "*":resultado = num1 * num2;break;
		default:System.out.println("Operação invalida");valida = false;
		}
		
		if (valida) {
			
			if (resultado >= 0) {
				System.out.println("Resultado: "+ resultado +" É positivo.");
			} else {
				System.out.println("Resultado: "+ resultado +" É negativo.");
			}
			
			if (resultado % 2 == 0) {
				System.out.println("Resultado: "+ resultado +" É par.");
			}else {
				System.out.println("Resultado: "+ resultado +" É ímpar.");
			}
			
			
		}
		
	}

}
