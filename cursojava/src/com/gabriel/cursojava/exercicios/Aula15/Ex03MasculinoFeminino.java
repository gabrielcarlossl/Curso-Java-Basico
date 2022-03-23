package com.gabriel.cursojava.exercicios.Aula15;

import java.util.Scanner;

public class Ex03MasculinoFeminino {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite letra do seu Sexo, F - Feminino, M - Masculino");
		
		String sexo = scan.next();
		
		switch(sexo) {
		case "F": System.out.println("Feminino."); break;
		case "M": System.out.println("Masculino"); break;
		default: System.out.println("Sexo Inválido");
		}
		
		if (sexo.equalsIgnoreCase("f")) {
			System.out.println("Feminino.");
		} else if (sexo.equalsIgnoreCase("m")) {
			System.out.println("Masculino");
		}else {
			System.out.println("Sexo Inválido");
		}
	}

}
