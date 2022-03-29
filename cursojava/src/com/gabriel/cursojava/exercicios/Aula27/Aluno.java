package com.gabriel.cursojava.exercicios.Aula27;

public class Aluno {
	
	String nome;
	String nomeCurso;
	String matricula;
	String[] nomeDisciplinas = new String[3];
	double[][] notasDisciplinas= new double[3][4];
	
	void mostrarInfo() {
		System.out.println("Nome: "+ nome);
		System.out.println("Nome do curso: " + nomeCurso);
		System.out.println("Matrícula: " + matricula);
		
		
		for (int i=0 ; i<notasDisciplinas.length; i++) {
			System.out.println("Notas da disciplina " + nomeDisciplinas[i] + ": ");
			
			for(int j=0; j<notasDisciplinas[i].length; j++) {
				System.out.println(notasDisciplinas[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	boolean verificarAprovado(int indiceDisciplinas){
		
		
		if (obterMedia(indiceDisciplinas) >=7) {
			return true;
		}
			return false;
	}
	
	double obterMedia(int indiceDisciplinas) {
		
		double soma= 0;
		
		for(int i=0; i<notasDisciplinas[indiceDisciplinas].length; i++) {
			soma+= notasDisciplinas[indiceDisciplinas][i];
		}
		
		double media = soma/4;
		
		return media;
	}
	
}
