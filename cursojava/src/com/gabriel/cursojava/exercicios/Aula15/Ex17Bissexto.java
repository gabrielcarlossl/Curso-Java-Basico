package com.gabriel.cursojava.exercicios.Aula15;
import java.util.Scanner;
public class Ex17Bissexto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um ano para saber se � bissexto: ");
		
		int ano = scan.nextInt();
		
		if (ano % 400 == 0 ) {
			System.out.println("O ano " + ano + " � bissexto.");
		}else if (ano % 4 == 0 && ano % 100 != 0 ) {
			System.out.println("O ano " + ano + " � bissexto.");
		}else {
			System.out.println("O ano " + ano + " n�o � bissexto.");
		}
	
		
		
	}

}


