package com.javaoo.heranca.aula01;

//Classe para operar a classe Cliente.
public class TesteCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.numeroCartao = 123456;
		//Devido a Herança das propriedades e métodos de Pessoa na classe Cliente
		// é possível acessar as propriedades da classe pessoa através da classe Cliente. 
		cliente.nome = "Carlos Andre";
		cliente.email = "carlos@gmail.com";
		
		cliente.imprimirCartao();
		//Devido a Herança das propriedades e métodos de Pessoa na classe Cliente
	    // é possível acessar os métodos da classe Pessoa através da classe Cliente.
		cliente.imprimirNome();
		cliente.imprimirEmail();

	}

}
