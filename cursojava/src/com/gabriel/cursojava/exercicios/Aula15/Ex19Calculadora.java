package com.gabriel.cursojava.exercicios.Aula15;

import java.util.Scanner;

public class Ex19Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois n�meros para realizar calculo:");
		System.out.println("Digite primeiro n�mero:");
		double num1 = scan.nextInt();
		
		System.out.println("Digite segundo n�mero:");
		double num2 = scan.nextInt();
		
		System.out.println("Digite para realizar a opera��o ( +  -  /  *  :");
		
		String operacao = scan.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch (operacao) {
		case "+":resultado = num1 + num2;break;
		case "-":resultado = num1 - num2;break;
		case "/":resultado = num1 / num2;break;
		case "*":resultado = num1 * num2;break;
		default:System.out.println("Opera��o invalida");valida = false;
		}
		
		if (valida) {
			
			if (resultado >= 0) {
				System.out.println("Resultado: "+ resultado +" � positivo.");
			} else {
				System.out.println("Resultado: "+ resultado +" � negativo.");
			}
			
			if (resultado % 2 == 0) {
				System.out.println("Resultado: "+ resultado +" � par.");
			}else {
				System.out.println("Resultado: "+ resultado +" � �mpar.");
			}
			
			
		}
		
	}

}
