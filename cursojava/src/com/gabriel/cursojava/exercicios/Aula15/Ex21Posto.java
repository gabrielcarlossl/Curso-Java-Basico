package com.gabriel.cursojava.exercicios.Aula15;
import java.util.Scanner;
public class Ex21Posto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite qual combustivel voc� quer abastecer A - �lcool, G - Gasolina: ");
		String combustivel = scan.next();
		
		System.out.println("Quantos litros voc� quer abastecer? ");
		double litros = scan.nextInt();
		
		double desconto = 0;
		double preco = 0;
	
		
		if (combustivel.equalsIgnoreCase("a")) {
			
			combustivel = "�lcool";
			
			preco = 1.90;
			
			if (litros <= 20) {
				
				desconto = 0.03;
				
			} else if (litros > 20) {
				
				desconto = 0.05; }
			
		} else if (combustivel.equalsIgnoreCase("g")) {
			
			
			combustivel = "Gasolina";
			
			preco = 2.50;
			
			if (litros <= 20) {
				
				desconto = 0.04;
				
			}else if (litros > 20 ) {
				
				desconto = 0.06; }
		}
		
		double totalSemDesc = litros * preco;
		double totalDesc = totalSemDesc * desconto;
		double pagar = totalSemDesc - totalDesc;
		
		System.out.println("Voc� escolheu: " + combustivel);
		System.out.println("Voc� escolheu colocar: " + litros + " L");
		System.out.println("O pre�o do combustivel escolhido �: R$" + preco);
		System.out.println("Voc� vai pagar: R$"+ pagar);
		
		
	}

}
