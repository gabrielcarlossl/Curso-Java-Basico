package com.gabriel.cursojava.exercicios.Aula15;

import java.util.Scanner;

public class Ex10Turno {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite qual turno você estuda: M - Matutino, V - Vespertino ou N - Noturno:");
		
		String turno = scan.next();
		
		switch (turno) {
		case "m":
		case "M": System.out.println("Bom dia!"); break;
		case "v":
		case "V": System.out.println("Boa tarde!"); break;
		case "n":
		case "N": System.out.println("Boa Noite!"); break;
		default: System.out.println("Turno inválido.");
		}

	}

}
