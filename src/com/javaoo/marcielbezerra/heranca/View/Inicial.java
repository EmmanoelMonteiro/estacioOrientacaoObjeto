package com.javaoo.marcielbezerra.heranca.View;

import com.javaoo.marcielbezerra.heranca.Model.Cliente;
import com.javaoo.marcielbezerra.heranca.Model.Funcionario;

public class Inicial {

	public static void main(String[] args) {
		System.out.println("####### Bem vindo Cliente!\n");
		Cliente cliente1 = new Cliente("Manoel", "manoel@marciel.com", "123.456.789-54", 123654987987l);
		
		System.out.println("Olá cliente: " + cliente1.imprimeNome());
		
		System.out.println("\n####### fim do atendimento!");
		
		
		System.out.println("\n####### Bem vindo Funcionário!\n");
		Funcionario funcionario1 = new Funcionario("Marciel", "marciel@marciel.com", "123.456.789-54",987654, 3.500);
		
		System.out.println("Olá Funcionário: " + funcionario1.imprimeNome());
		
		System.out.println("\n####### fim do registro!");
		
	}

}
