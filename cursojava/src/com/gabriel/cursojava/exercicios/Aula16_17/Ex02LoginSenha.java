package com.gabriel.cursojava.exercicios.Aula16_17;
import java.util.Scanner;
public class Ex02LoginSenha {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Crie um Usuário e senha para o sistema.");
		
		boolean loginValido = false;
		
		do {
			
			System.out.println("Digite um usuário: ");
			String user = scan.next();
			System.out.println("Digite uma senha: ");
			String passWord = scan.next();
			
			if(user.equalsIgnoreCase(passWord)){
				System.out.println("Login Inválido, Usuário igual a senha, tente novamente: ");
				
			}else {
				loginValido = true;
				System.out.println("Login válido.");

			}
			
		} while (!loginValido);


	}

}
