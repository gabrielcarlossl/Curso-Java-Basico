package com.gabriel.cursojava.exercicios.Aula16_17;
import java.util.Scanner;
public class Ex02LoginSenha {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Crie um Usu�rio e senha para o sistema.");
		
		boolean loginValido = false;
		
		do {
			
			System.out.println("Digite um usu�rio: ");
			String user = scan.next();
			System.out.println("Digite uma senha: ");
			String passWord = scan.next();
			
			if(user.equalsIgnoreCase(passWord)){
				System.out.println("Login Inv�lido, Usu�rio igual a senha, tente novamente: ");
				
			}else {
				loginValido = true;
				System.out.println("Login v�lido.");

			}
			
		} while (!loginValido);


	}

}
