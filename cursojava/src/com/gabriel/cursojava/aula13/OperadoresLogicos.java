package com.gabriel.cursojava.aula13;

public class OperadoresLogicos {
	
	public static void main(String [] args) {
		
		int valor1 = 1;
		int valor2 = 2;
		
		boolean resultado1 = (valor1 ==1 && (valor2 ==2));
		System.out.println("Valor1 é 1 AND valor2 é 2 - resultado : " + resultado1);
		
		boolean resultado2 = (valor1 ==1 || (valor2 == 2));
		System.out.println("Valor1 é 1 Or valor2 é 2 - Resultado: " + resultado2);
		
		boolean verdadeiro = true;
		boolean falso = false;
		System.out.println(verdadeiro && falso); //and curto circuito
		System.out.println(verdadeiro || falso); // OR curto circuito
		System.out.println(verdadeiro ^ falso); //xor
		System.out.println(verdadeiro && falso); 
		
		
		
	}
}
