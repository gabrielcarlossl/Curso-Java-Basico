package com.gabriel.cursojava.exercicios.Aula16_17;
import java.util.Scanner;
public class Ex29NumsPrimosDoIntervalo1_X {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite até que número quer saber se é primo: ");
		
		int num = scan.nextInt();
		
		
		for (int i = 1; i<= num; i++) {
			
			boolean primo = true;
			
			for (int j=2; j< i; j++) {
				
				if (i % j == 0) {
					
					primo = false;
				}
				
			}
			
			if (primo) {
				System.out.println(i + " - É número primo!");
			}
			
		}
	}

}
