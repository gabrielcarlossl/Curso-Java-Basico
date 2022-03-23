package com.gabriel.cursojava.exercicios.Aula15;
import java.util.Scanner;
public class Ex15Triangulo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 3 lados para formar um triangulo: ");
		
		System.out.println("Primeiro lado: ");
		int lado1 = scan.nextInt();
		System.out.println("Segundo lado: ");
		int lado2 = scan.nextInt();
		System.out.println("Terceiro lado: ");
		int lado3 = scan.nextInt();
		
		if (((lado1 + lado2) > lado3) || 
				((lado1 + lado3) > lado2) ||
				((lado2 + lado3) > lado1)) {
			System.out.println("É um triangulo: ");
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("Trinagulo Equilátero");
			}else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
				System.out.println("Triangulo Escaleno");
			}else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Triangulo Isoceles");
			}
			
		} else {
			System.out.println("Não é um triangulo");
		}
		
		
		

	}

}
