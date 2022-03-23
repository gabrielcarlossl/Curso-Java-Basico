package com.gabriel.cursojava.exercicios.Aula16_17;
import java.util.Scanner;

public class Ex26FatorialVersao2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número para fazer sua fatorial: ");
		int num = scan.nextInt();
		int fatorial = 1;
		System.out.print(num + "! = " );
		for (int i=num; i>1; i--) {
			
			System.out.print(i+ " . ");
			fatorial *=i;

			
		}
		System.out.print( "1 = " + fatorial );
	}

}
