package com.gabriel.cursojava.exercicios.Aula16_17;
import java.util.Scanner;

public class Ex12Tabuada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número entre 1 e 10 para receber a tabuada: ");
		int num = scan.nextInt();
		
		
		System.out.println("Tabuada de = "+ num);
		for ( int i = 0; i <=10; i++) {
			 
			System.out.println(num + " x " + i +" = " + num * i  );
			
			
		}
		
	}

}
