package com.gabriel.cursojava.exercicios.Aula16_17;

public class Ex24Padaria {

	public static void main(String[] args) {
		
		System.out.println("Pre�o do p�o: R$ 0.18");
		System.out.println("Tabela de pre�os - Padaria Lambda");
		
		double preco = 0.18;
		for ( int i = 1; i<= 50; i++) {
			preco = 0.18 * i;
			System.out.println(i + " - R$ " + preco);

		}

	}

}
