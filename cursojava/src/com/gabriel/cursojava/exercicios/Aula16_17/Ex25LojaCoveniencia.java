package com.gabriel.cursojava.exercicios.Aula16_17;
import java.util.Scanner;

public class Ex25LojaCoveniencia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		boolean sair = false;
		String continuar;
		double preco;
		double total;
		String output;
		double valorPago;
		double troco;
		
		
		System.out.println("Loja Coveniência");
		
		do {
			System.out.println("Informar uma compra - [S/N] : ");
			continuar = scan.next();
			
			
			if (continuar.equalsIgnoreCase("s")) {
				
				output = "Loja Coveniência\n";
				
				System.out.println("Quantidade de produtos: ");
				int qtdProdutos = scan.nextInt();
				
				total =0;
				
				for (int i = 1; i<= qtdProdutos; i++ ) {
					  
					System.out.print("Produto " + i+ ": R$ ");
					preco = scan.nextDouble();
					total += preco;
					output += "Produto " + i + ": R$ " + preco + "\n";
					
				}
				
				output += "Total: R$" + total+ "\n";
				
				System.out.println("Você está comprando "+ qtdProdutos + " produtos.");

				System.out.println("Total a pagar: R$ "+ total);

				System.out.print("Digite o valor pago pelos produtos: R$ ");
				valorPago = scan.nextDouble();
				
				output += "Dinheiro: R$ " + valorPago+ "\n";
				troco = valorPago - total;
				
				output += "Troco: R$ " + troco;
				
				System.out.println(output);
				
			}else {
				sair = true;
			}
			
			
		} while (!sair);
		
		
	}

}
