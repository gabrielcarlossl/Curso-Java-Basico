package com.gabriel.cursojava.aula20;

import java.util.Scanner;

/* Escreva um programa para guardar dados de uma pesquisa feita com uma amostra de pessoas da avenida mais movimentada da cidade onde voc� mora.
 * A pesquisa consiste em perguntar ao cidad�o a quantidade de filhos e o nome de cada filho. Guarde essas informa��es em uma matriz de forma que cada pessoa 
 * entravistada ocupe somente o espa�o necess�rio na mem�ria par guardar os nomes dos filhos. Imprima a quantidade de pessoas entrevistadas, a quantidade de filhos 
 * de cada entrevistado e os respectivos nomes dos filhos.
 * */
public class MatrizIrregular {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o n�mero de pessoas entrevistadas: ");
		int numEntrevistados = scan.nextInt();
		
		String [][] nomesFilhos = new String[numEntrevistados][];
		
		for (int i=0; i<nomesFilhos.length; i++) {
			
			System.out.println("Entre com a quantidade de filhos: ");
			int qtdFilhos = scan.nextInt();
			
			nomesFilhos[i] = new String[qtdFilhos];
			
			for ( int j= 0; j<nomesFilhos[i].length; j++) {
				
				System.out.println("Digite o nome do filho: " + (j+1));
				
				nomesFilhos[i][j] = scan.next();
				
			}
			
		}
		
		for (int i = 0; i<nomesFilhos.length; i++) {
			System.out.println("Pessoa "+ i + " tem "+ nomesFilhos[i].length + " filhos");
			for ( int j= 0; j<nomesFilhos[i].length; j++) {
				System.out.println(nomesFilhos[i][j]);
			}
			
		}
		
		
		
	}

}
