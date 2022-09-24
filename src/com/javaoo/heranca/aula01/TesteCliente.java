package com.javaoo.heranca.aula01;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.numeroCartao = 123456;
		cliente.nome = "Carlos Andre";
		cliente.email = "carlos@gmail.com";
		
		cliente.imprimirNome();
		cliente.imprimirEmail();
		cliente.imprimirCartao();

	}

}
