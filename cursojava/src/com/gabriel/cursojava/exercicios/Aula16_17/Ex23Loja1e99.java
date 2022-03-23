package com.gabriel.cursojava.exercicios.Aula16_17;

public class Ex23Loja1e99 {

	public static void main(String[] args) {
		
		System.out.println("Loja Quase Dois - Tabela de preços");
		
		double preco = 1.99;
		for (int i = 1; i <=50; i++) {
			preco = 1.99 * i;
			System.out.println(i + " - R$ " + preco);
			
		}
	}

}
