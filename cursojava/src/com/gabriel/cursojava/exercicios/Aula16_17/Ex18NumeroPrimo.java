package com.gabriel.cursojava.exercicios.Aula16_17;
import java.util.Scanner;

public class Ex18NumeroPrimo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero para saber se � primo: ");
		
		int num = scan.nextInt();
		
		boolean primo = true;
		
		for(int i = 2; i <num; i++) {
			if(num % i == 0) {
				System.out.println("N�o � n�mero primo.");
				primo = false;
			}
			
		}
		
		if (primo) {
			System.out.println("� n�mero primo.");
			

		}
		
	}
		
}


