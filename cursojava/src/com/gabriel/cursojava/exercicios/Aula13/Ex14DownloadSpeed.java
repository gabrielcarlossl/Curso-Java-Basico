package com.gabriel.cursojava.exercicios.Aula13;

import java.util.Scanner;

public class Ex14DownloadSpeed {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("----Calculadora de Velocidade de Download----");
		System.out.println("Digite o tamanho do arquivo em MB: ");
		
		double fileSize = scan.nextDouble();
		
		System.out.println("Digite a velocidade de download da sua internet em MB/s: ");
		double internetSpeed = scan.nextDouble();
		
		double downloadSpeed = fileSize /(internetSpeed/8);
		System.out.println("A velocidade de download será: " + (downloadSpeed/60) + " Minutos");
		

	}

}
