package com.javaoo.heranca.aula00;

public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPAssageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		van.exibirAutonomia();
		double autonomia = van.obterAutonomia();
		System.out.println(autonomia);
		double combustivel = van.calcularCombustivel(20);
		System.out.println(combustivel);
		
		

	}

}
