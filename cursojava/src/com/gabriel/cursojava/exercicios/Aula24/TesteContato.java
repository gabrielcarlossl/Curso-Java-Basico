package com.gabriel.cursojava.exercicios.Aula24;

public class TesteContato {

	public static void main(String[] args) {
		
		Contato contato1 = new Contato();
		Contato contato2 = new Contato();
		
		contato1.nome = "Gabriel";
		contato1.email = "gabrielcarlos@gmail.com";
		contato1.endereco = "Rua cantora maria da glória gouveia de vasconcelos 151";
		contato1.telefones = new String[2];
		contato1.telefones[0] = "988354229";
		
		contato2.nome = "Gabriel";
		contato2.email = "gabrielcarlos@gmail.com";
		contato2.endereco = "Rua cantora maria da glória gouveia de vasconcelos 151";
		contato2.telefones = new String[2];
		contato2.telefones[0] = "986209546";
	}

}
