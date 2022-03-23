package com.gabriel.cursojava.exercicios.Aula16_17;

public class Ex24Padaria {

	public static void main(String[] args) {
		
		System.out.println("Preço do pão: R$ 0.18");
		System.out.println("Tabela de preços - Padaria Lambda");
		
		double preco = 0.18;
		for ( int i = 1; i<= 50; i++) {
			preco = 0.18 * i;
			System.out.println(i + " - R$ " + preco);

		}

	}

}
