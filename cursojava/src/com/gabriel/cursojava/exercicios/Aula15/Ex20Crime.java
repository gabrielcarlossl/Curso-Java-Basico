package com.gabriel.cursojava.exercicios.Aula15;
import java.util.Scanner;
public class Ex20Crime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Perguntas, responda sim ou n�o [S/N]");
		
		System.out.println("Telefonou para a vitima?");
		
		String resposta1 = scan.next();
		
		System.out.println("Esteve no local do crime?");
		
		String resposta2 = scan.next();
		
		System.out.println("Mora perto da vitima?");
		
		String resposta3 = scan.next();
		
		System.out.println("Devia para a vitima?");
		
		String resposta4 = scan.next();
		
		System.out.println("J�  trabalhou com a vitima?");
		
		String resposta5 = scan.next();
		
		int numRespostas = 0;
		
		
		
		
		if (resposta1.equalsIgnoreCase("S")) {
			numRespostas +=1;
		}if (resposta2.equalsIgnoreCase("S")) {
			numRespostas +=1;
		}if (resposta3.equalsIgnoreCase("S")) {
			numRespostas +=1;
		}if (resposta4.equalsIgnoreCase("S")) {
			numRespostas +=1;
		}if (resposta5.equalsIgnoreCase("S")) {
			numRespostas +=1;
		}
		
		if (numRespostas == 2) {
			System.out.println("Voc� � suspeito.");
		} else if (numRespostas >=3  && numRespostas <= 4) {
			System.out.println("Voc� � um c�mplice.");
		} else if (numRespostas == 5) {
			System.out.println("VOC� � O ASSASSINO!!");
		} else {
			System.out.println("Voc� � inocente.");
		}
		

	}

}
