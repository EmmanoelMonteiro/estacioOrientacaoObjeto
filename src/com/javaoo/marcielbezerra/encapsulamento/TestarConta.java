package com.javaoo.marcielbezerra.encapsulamento;

public class TestarConta extends ContaCorrente {

	public TestarConta(int numeroConta, double saldoConta) {
		super(numeroConta, saldoConta);
		
	}

	public static void main(String[] args) {
		TestarConta primeirConta = new TestarConta(8955544, 0);
		
		System.out.println("Olá o saldo atual de sua conta " + primeirConta.getNumeroConta() + " é: ");
		System.out.println(primeirConta.getSaldoConta());
	}

}
