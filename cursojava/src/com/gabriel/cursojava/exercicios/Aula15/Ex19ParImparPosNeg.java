package com.gabriel.cursojava.exercicios.Aula15;
import java.util.Scanner;
public class Ex19ParImparPosNeg {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 2 n�meros.");
		
		System.out.println("Digite primeiro n�mero:");
		int num1 = scan.nextInt();
		
		System.out.println("Digite segundo n�mero:");
		int num2 = scan.nextInt();
		
		System.out.println("Digite (pi) para saber se os n�meros s�o par ou �mpar: ");
		System.out.println("Digite (pn) para saber se os n�meros s�o positivos ou negativos: ");
		
		String resposta = scan.next();
		
		
			if (num1 % 2 == 0 || num1 > 0) {
				
				switch (resposta) {
				case "pi": System.out.println("O n�mero: " + num1 + " � par");break;
				case "pn": System.out.println("O n�mero: " + num1 + " � positivo");break;
				}
				
				
			}else if (num1 % 2 != 0 || num1 < 0 ) {
				
				switch (resposta) {
				case "pi": System.out.println("O n�mero: " + num1 + " n�o � par");
				case "pn": System.out.println("O n�mero: " + num1 + " � negativo");
				}
				
				
			}if (num2 % 2 == 0 || num2 > 0) {
				switch (resposta) {
				case "pi": System.out.println("O n�mero: " + num2 + " � par");
				case "pn": System.out.println("O n�mero: " + num2 + " � positivo");
				}
				
				
			}else if (num2 % 2 != 0 ) {
				switch (resposta) {
				case "pi": System.out.println("O n�mero: " + num2 + " n�o � par");
				case "pn": System.out.println("O n�mero: " + num2 + " � negativo");
				}
				
				
			}
			
			
		
		
	}

}
