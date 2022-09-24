package com.javaoo.heranca.aula00;

//Estrutura básica de uma classe com propriedades e métodos
public class Carro {
	//PROPRIEDADES
	String marca;
	String modelo;
	int numPAssageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	//MÉTODOS
	
	//Método que não retorna nenhum valor (void), só executa uma ação.
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: "+ capCombustivel * consumoCombustivel + "KM" );
	}
	
	//Método que retorna um valor do tipo double. É obrigatório o RETURN no final.
	double obterAutonomia() {
		System.out.println("Método Obter Autonomia foi chamado");
		double resultado = capCombustivel * consumoCombustivel;
		//Obrigatório o return em métodos que retornam valores
		return resultado;
	}
	
	double calcularCombustivel(double km) {
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}

}
