package com.javaoo.heranca.aula00;

public class Carro {
	
	String marca;
	String modelo;
	int numPAssageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro �: "+ capCombustivel * consumoCombustivel + "KM" );
	}
	
	double obterAutonomia() {
		System.out.println("M�todo Obter Autonomia foi chamado");
		return capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}

}
