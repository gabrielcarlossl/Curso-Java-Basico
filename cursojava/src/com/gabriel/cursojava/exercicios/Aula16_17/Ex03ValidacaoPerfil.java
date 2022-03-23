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
				System.out.println("Você digitou um nome inválido, tente novamente: ");
			}else {
				System.out.println("Você digitou o nome: " + nome);
				nomeValido = true;
			}
		}while (!nomeValido);
		
		
		do {
			System.out.println("Digite sua idade: ");
			idade = scan.nextInt();
			
			if (idade < 0 || idade > 140) {
				
				System.out.println("Você digitou uma idade inválida, tente novamente: ");
				
			}else {
				
				System.out.println("Você digitou "+ idade + " como sua idade.");
				idadeValida = true;
			}
		} while (!idadeValida);
		
		do {
			System.out.println("Digite seu salário: ");
			salario = scan.nextDouble();
			
			if (salario < 0 ) {
				
				System.out.println("Você digitou uma salário inválido, tente novamente: ");
				
			}else {
				
				System.out.println("Você digitou R$ "+ salario + " como seu salário.");
				salarioValido = true;
			}
		} while (!salarioValido);
		
		do {
			System.out.println("Digite seu sexo: ");
			sexo = scan.next();
			
			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m") ) {
				
				
				sexoValido = true;
				if (sexo.equalsIgnoreCase("f")) {
					System.out.println("Seu sexo é Feminino.");
				}else {
					System.out.println("Seu sexo é Masculino.");
				}
			}else {
				
				System.out.println("Você digitou um sexo inválido, tente novamente: ");
				
			}
		} while (!sexoValido);
	
		do {
			System.out.println("Digite seu estado Cívil: ");
			estadoCivil = scan.next();
			
			if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") ||
					estadoCivil.equalsIgnoreCase("d") ) {
				
				estadoCivilValido = true;
				
				if (estadoCivil.equalsIgnoreCase("s")) {
					
					System.out.println("Você é Solteiro.");
					
				}else if (estadoCivil.equalsIgnoreCase("c")) {
					
					System.out.println("Você é casado.");
				}else if (estadoCivil.equalsIgnoreCase("v")) {
					
					System.out.println("Você é viuvo(a).");
					
				}else if (estadoCivil.equalsIgnoreCase("d")) {
					System.out.println("Você é Divorsiado(a).");
				}
				
			}else {
				System.out.println("Você digitou um estado Cívil inválido, tente novamente: ");
			}
			
		} while (!estadoCivilValido);
	}
}
