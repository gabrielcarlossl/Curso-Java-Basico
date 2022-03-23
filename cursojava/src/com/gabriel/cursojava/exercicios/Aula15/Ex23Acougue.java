package com.gabriel.cursojava.exercicios.Aula15;
import java.util.Scanner;
public class Ex23Acougue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		/*                   ate 5kg          acima de 5 kg 
		 * File duplo        R$ 4,90           R$ 5,80
		 * Alcatra           R$ 5,90           R$ 6,90
		 * Picanha           R$ 6,90           R$ 7,90
		 * 
		 *  Compra feita no cartão recebe no final 5% de desconto*/
		
		System.out.println("Informa qual carne você deseja: ");
		System.out.println("1 - File Duplo ");
		System.out.println("2 - Alcatra ");
		System.out.println("3 - Picanha ");
		System.out.println("Digite o código da carne que deseja:  ");
		int carne = scan.nextInt();
		
		
		
		System.out.println("Informa quantos Kg de carne deseja: ");
		double kg = scan.nextDouble();
		
		System.out.println("Pagamento com cartão, SIM ou NÃO? [S/N]: ");
		String cartao = scan.next();
		
		double preco = 0;
		
		double desconto = 0.05;
		
		String tipoCarne ="";
		
		if (carne == 1) {
			tipoCarne = "File Duplo";
			if (kg <= 5) {
				preco = 4.9;
			}else {
				preco = 5.8;
			}
			
		} else if (carne == 2) {
			tipoCarne = "Alcatra";
			if (kg <= 5) {
				preco = 5.9;
			}else {
				preco = 6.9;
			}
		} else if (carne == 3) {
			tipoCarne = "Picanha";
			if (kg <= 5) {
				preco = 6.9;
			}else {
				preco = 7.9;
			}
		} else{
			System.out.println("Código do produto incorreto.");
		}
		
		
		
		
		double totalSemDesc = preco * kg;
		double totalComDesc = totalSemDesc - (totalSemDesc*desconto);
		
		double valorDesconto = totalSemDesc * desconto;
		
		System.out.println("Você comprou a carne: " +tipoCarne);
		System.out.println("Você comprou " + kg + "Kg");
		System.out.println("Preço por Kg: R$ " + preco);
		
		if (cartao.equals("s")) {
			System.out.println("Valor a ser pago sem desconto: R$" + totalSemDesc);
			System.out.println("Você recebeu 5% de desconto: R$" + valorDesconto);
			System.out.println("Valor a ser pago com o desconto: R$" + totalComDesc);
		} else if (cartao.equals("n")) {
			System.out.println("Você não recebeu 5% de desconto.");
			System.out.println("Valor a ser pago sem desconto: R$" + totalSemDesc);
		} else {
			System.out.println("Não foi respondido corretamente.");
		}
		
	}

}
