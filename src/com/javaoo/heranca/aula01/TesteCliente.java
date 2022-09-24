package com.javaoo.heranca.aula01;

//Classe para operar a classe Cliente.
public class TesteCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.numeroCartao = 123456;
		//Devido a Heran�a das propriedades e m�todos de Pessoa na classe Cliente
		// � poss�vel acessar as propriedades da classe pessoa atrav�s da classe Cliente. 
		cliente.nome = "Carlos Andre";
		cliente.email = "carlos@gmail.com";
		
		cliente.imprimirCartao();
		//Devido a Heran�a das propriedades e m�todos de Pessoa na classe Cliente
	    // � poss�vel acessar os m�todos da classe Pessoa atrav�s da classe Cliente.
		cliente.imprimirNome();
		cliente.imprimirEmail();

	}

}
