package com.gabriel.cursojava.exercicios.Aula16_17;
import java.util.Scanner;
public class Ex10DoisNumInt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int firstNumb = scan.nextInt();
		System.out.print("Digite outro número: ");
		int secNumb = scan.nextInt();
		
		for (int i = firstNumb; i <= secNumb; i++) {
			System.out.println(i);
		}
		
		
		while ( firstNumb < secNumb) {
			firstNumb++;
			System.out.println(firstNumb);
		}
	}

}
