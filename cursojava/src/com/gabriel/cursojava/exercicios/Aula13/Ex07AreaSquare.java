package com.gabriel.cursojava.exercicios.Aula13;

import java.util.Scanner;

public class Ex07AreaSquare {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do lado do quadrado para receber o dobro de sua �rea: ");
		
		double squareSide = scan.nextDouble();
		double areaSquare = Math.pow(squareSide, 2);
		
		System.out.println("A �rea do quadro �: " + areaSquare  + "e o dobro dela �: " + areaSquare * 2 );
		

	}

}
