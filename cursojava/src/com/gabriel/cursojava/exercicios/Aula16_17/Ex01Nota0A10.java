package com.gabriel.cursojava.exercicios.Aula16_17;
import java.util.Scanner;
public class Ex01Nota0A10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma nota entre 0 a 10: ");
		
		int nota = scan.nextInt();
		
		boolean notaValida = false;
		
		while (notaValida == false) {
			System.out.println("Digite uma nota válida: ");
			nota = scan.nextInt();
			
			if (nota >= 0 && nota <= 10) {
				System.out.println("Nota: " + nota + " Válida");
				notaValida = true;
			}
			
			
			}

	}

}
