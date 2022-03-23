package com.gabriel.cursojava.exercicios.Aula15;

import java.util.Scanner;

public class Ex04VogalOuConsoante {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra para saber se é Vogal ou Consoante:");
		
		String letra = scan.next();
		
		if (letra.length() > 1) {
			System.out.println("Não é letra válida.");
		} else {
			switch(letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u": 
			case "A":
			case "E":
			case "I":
			case "O":
			case "U": System.out.println("É Vogal."); break;
			default: System.out.println("É consoante"); 
			}

			if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
					letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || 
					letra.equalsIgnoreCase("u")) {
				System.out.println("É Vogal.");
			} else {
				System.out.println("É consoante"); 
			}
		}

		}
		
		
}
