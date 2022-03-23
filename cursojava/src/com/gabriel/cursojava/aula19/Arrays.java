package com.gabriel.cursojava.aula19;

import java.util.Random;

public class Arrays {

	public static void main(String[] args) {
		
		double tempDia001 = 31.3;
		double tempDia002 = 32;
		double tempDia003 = 33.7;
		double tempDia004 = 34;
		double tempDia005 = 33.1;
		
		double[] temperaturas = new double [365];
		Random gerador = new Random();
		
		for (int i = 0; i< temperaturas.length; i++) {
			temperaturas[i] = gerador.nextInt(41);
		}
		
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;
		
		for (int i = 0; i< temperaturas.length; i++ ) {
			System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temperaturas[i]);
		}
		
		System.out.println("O tamanho do array é: " + temperaturas.length);
		
		//outro tipo de for melhorado
		
		
	}

}
