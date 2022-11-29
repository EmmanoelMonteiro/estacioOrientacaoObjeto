package com.javaoo.Alexandre.heranca;

import com.javaoo.Alexandre.heranca.Cliente;
import com.javaoo.Alexandre.heranca.Funcionario;

public class Inicial {

	public static void main(String[] args) {
			
		System.out.println("\n####### Ola!\n");
		Funcionario funcionario1 = new Funcionario("Alexandre", "alexandre@gmail.com", "444.555.777-33",321, 2.600);
		
		System.out.println("Olá Sr: " + funcionario1.imprimeNome());
		
		System.out.println("\n####### fim!");


		System.out.println("####### Ola!\n");
		Cliente cliente1 = new Cliente("Alex", "alexmkt@gmail.com", "000.111.222-33", 999888777656l);
		
		System.out.println("Olá Sr: " + cliente1.imprimeNome());
		
		System.out.println("\n####### fim!");
		
	}

}
