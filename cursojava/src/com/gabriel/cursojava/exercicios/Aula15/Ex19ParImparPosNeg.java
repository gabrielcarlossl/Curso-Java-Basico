package com.gabriel.cursojava.exercicios.Aula15;
import java.util.Scanner;
public class Ex19ParImparPosNeg {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 2 números.");
		
		System.out.println("Digite primeiro número:");
		int num1 = scan.nextInt();
		
		System.out.println("Digite segundo número:");
		int num2 = scan.nextInt();
		
		System.out.println("Digite (pi) para saber se os números são par ou ímpar: ");
		System.out.println("Digite (pn) para saber se os números são positivos ou negativos: ");
		
		String resposta = scan.next();
		
		
			if (num1 % 2 == 0 || num1 > 0) {
				
				switch (resposta) {
				case "pi": System.out.println("O número: " + num1 + " é par");break;
				case "pn": System.out.println("O número: " + num1 + " é positivo");break;
				}
				
				
			}else if (num1 % 2 != 0 || num1 < 0 ) {
				
				switch (resposta) {
				case "pi": System.out.println("O número: " + num1 + " não é par");
				case "pn": System.out.println("O número: " + num1 + " é negativo");
				}
				
				
			}if (num2 % 2 == 0 || num2 > 0) {
				switch (resposta) {
				case "pi": System.out.println("O número: " + num2 + " é par");
				case "pn": System.out.println("O número: " + num2 + " é positivo");
				}
				
				
			}else if (num2 % 2 != 0 ) {
				switch (resposta) {
				case "pi": System.out.println("O número: " + num2 + " não é par");
				case "pn": System.out.println("O número: " + num2 + " é negativo");
				}
				
				
			}
			
			
		
		
	}

}
