package com.javaoo.Alexandre.encapsulamento;

public class TestarConta extends ContaCorrente {

	public TestarConta(int numeroConta, double saldoConta) {
		super(numeroConta, saldoConta);
		
	}

	public static void main(String[] args) {
		TestarConta primeirConta = new TestarConta(89888544, 0);
		
		System.out.println("O saldo  " + primeirConta.getNumeroConta() + " é: ");
		System.out.println(primeirConta.getSaldoConta());
	}

}
