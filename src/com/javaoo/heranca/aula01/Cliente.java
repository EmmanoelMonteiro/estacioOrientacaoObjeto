package com.javaoo.heranca.aula01;

//Extende a classe Pessoa herdando as propriedades e métodos.
public class Cliente extends Pessoa {
    //Propriedade exclusiva da classe Cliente
	int numeroCartao;
	
	//Métodos exclusivo da classe Cliente 
	void imprimirCartao() {
		System.out.println("O número do cartão de crédito é: "+ numeroCartao);
	}
		

}
