package com.gabriel.cursojava.exercicios.Aula16_17;
import java.util.Scanner;

public class Ex30TabuadaPersonalizada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero para receber a tabuada: ");
		int num = scan.nextInt();
		
		System.out.println("Digite em qual n�mero come�a a tabuada: ");
		int start = scan.nextInt();
		
		System.out.println("Digite em qual n�mero termina a tabuada: ");
		int end = scan.nextInt();
		
		System.out.println("Tabuada de = "+ num);
		for ( int i = start; i <= end; i++) {
			 
			System.out.println(num + " x " + i +" = " + num * i  );
			
			
		}
	}

}
