package com.gabriel.cursojava.exercicios.Aula24;

public class TesteConta {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		
		conta.numero = "77777";
		conta.agencia = "8673";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.saldo = 1049.51;
		
		System.out.println("Saldo da conta: " + conta.numero + " = R$ " + conta.saldo);

	}

}
