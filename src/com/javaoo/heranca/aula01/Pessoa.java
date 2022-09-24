package com.javaoo.heranca.aula01;

//Classe
public class Pessoa {
	//Atributos
	String nome;
	String cpf;
	String email;

	//Métodos
	void imprimirNome () {
		System.out.println("O nome da pessoa é: "+ nome);
    }
	
	void imprimirEmail() {
		System.out.println("O e-mail da pessoa é: "+ email);
	}
}