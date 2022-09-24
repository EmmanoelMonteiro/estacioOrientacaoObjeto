package com.javaoo.heranca.aula00;

//Estrutura b�sica de uma classe com propriedades e m�todos
public class Carro {
	//PROPRIEDADES
	String marca;
	String modelo;
	int numPAssageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	//M�TODOS
	
	//M�todo que n�o retorna nenhum valor (void), s� executa uma a��o.
	void exibirAutonomia() {
		System.out.println("A autonomia do carro �: "+ capCombustivel * consumoCombustivel + "KM" );
	}
	
	//M�todo que retorna um valor do tipo double. � obrigat�rio o RETURN no final.
	double obterAutonomia() {
		System.out.println("M�todo Obter Autonomia foi chamado");
		double resultado = capCombustivel * consumoCombustivel;
		//Obrigat�rio o return em m�todos que retornam valores
		return resultado;
	}
	
	double calcularCombustivel(double km) {
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}

}
