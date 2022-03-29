package com.gabriel.cursojava.exercicios.Aula24;

public class Ex01_Teste_lampada {

	public static void main(String[] args) {
		Ex01_POO_Lampada lampada = new Ex01_POO_Lampada();
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.potencia = 7;
		lampada.garantiaMeses = 36;
		lampada.cor = "Amarela";
		lampada.tipoLuz = "Amarela";
		lampada.tipoAbajur = true;
		
		lampada.tipos = new String[5];
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Lampeões";

	}

}
