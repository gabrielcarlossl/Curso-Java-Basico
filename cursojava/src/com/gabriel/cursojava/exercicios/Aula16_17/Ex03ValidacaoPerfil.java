package com.gabriel.cursojava.exercicios.Aula16_17;
import java.util.Scanner;

public class Ex03ValidacaoPerfil {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean nomeValido = false;
		boolean idadeValida = false;
		boolean salarioValido = false;
		boolean sexoValido = false;
		boolean estadoCivilValido = false;
		
		String nome, sexo, estadoCivil;
		int idade;
		double salario;
		
		do {
			System.out.println("Digite um nome: ");
			nome = scan.next();
			if (nome.length() < 3) {
				System.out.println("Voc� digitou um nome inv�lido, tente novamente: ");
			}else {
				System.out.println("Voc� digitou o nome: " + nome);
				nomeValido = true;
			}
		}while (!nomeValido);
		
		
		do {
			System.out.println("Digite sua idade: ");
			idade = scan.nextInt();
			
			if (idade < 0 || idade > 140) {
				
				System.out.println("Voc� digitou uma idade inv�lida, tente novamente: ");
				
			}else {
				
				System.out.println("Voc� digitou "+ idade + " como sua idade.");
				idadeValida = true;
			}
		} while (!idadeValida);
		
		do {
			System.out.println("Digite seu sal�rio: ");
			salario = scan.nextDouble();
			
			if (salario < 0 ) {
				
				System.out.println("Voc� digitou uma sal�rio inv�lido, tente novamente: ");
				
			}else {
				
				System.out.println("Voc� digitou R$ "+ salario + " como seu sal�rio.");
				salarioValido = true;
			}
		} while (!salarioValido);
		
		do {
			System.out.println("Digite seu sexo: ");
			sexo = scan.next();
			
			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m") ) {
				
				
				sexoValido = true;
				if (sexo.equalsIgnoreCase("f")) {
					System.out.println("Seu sexo � Feminino.");
				}else {
					System.out.println("Seu sexo � Masculino.");
				}
			}else {
				
				System.out.println("Voc� digitou um sexo inv�lido, tente novamente: ");
				
			}
		} while (!sexoValido);
	
		do {
			System.out.println("Digite seu estado C�vil: ");
			estadoCivil = scan.next();
			
			if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") ||
					estadoCivil.equalsIgnoreCase("d") ) {
				
				estadoCivilValido = true;
				
				if (estadoCivil.equalsIgnoreCase("s")) {
					
					System.out.println("Voc� � Solteiro.");
					
				}else if (estadoCivil.equalsIgnoreCase("c")) {
					
					System.out.println("Voc� � casado.");
				}else if (estadoCivil.equalsIgnoreCase("v")) {
					
					System.out.println("Voc� � viuvo(a).");
					
				}else if (estadoCivil.equalsIgnoreCase("d")) {
					System.out.println("Voc� � Divorsiado(a).");
				}
				
			}else {
				System.out.println("Voc� digitou um estado C�vil inv�lido, tente novamente: ");
			}
			
		} while (!estadoCivilValido);
	}
}
