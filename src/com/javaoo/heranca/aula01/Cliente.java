package com.javaoo.heranca.aula01;

//Extende a classe Pessoa herdando as propriedades e m�todos.
public class Cliente extends Pessoa {
    //Propriedade exclusiva da classe Cliente
	int numeroCartao;
	
	//M�todos exclusivo da classe Cliente 
	void imprimirCartao() {
		System.out.println("O n�mero do cart�o de cr�dito �: "+ numeroCartao);
	}
		

}
