package com.gabriel.cursojava.exercicios.Aula27;


public class TesteContaCorrente {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		
		conta.numero = "77777";
		conta.agencia = "8673";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.valorEspecialUsado = 0;
		conta.saldo = -10;
		
		System.out.println("Saldo da conta: " + conta.numero + " = R$ " + conta.saldo);
		
		boolean saqueEfetuado = conta.realizarSaque(10);
		
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			conta.consultarSaldo();
		}else {
			System.out.println("Não foi possível efetuar saque, saldo insuficiente");
		}
		
		saqueEfetuado = conta.realizarSaque(500);
		System.out.println("Tentativa de saque de R$500");
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			conta.consultarSaldo();
		}else {
			System.out.println("Não foi possível efetuar saque, saldo insuficiente");
		}
		
		System.out.println("Depositando valor: R$ 500");
		conta.depositar(500);
		conta.consultarSaldo();
		
		if (conta.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		}else {
			System.out.println("Não está usando cheque especial.");

		}
		
		conta.realizarSaque(600);
		conta.consultarSaldo();
		if (conta.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		}else {
			System.out.println("Não está usando cheque especial.");

		}
		
	}
}
