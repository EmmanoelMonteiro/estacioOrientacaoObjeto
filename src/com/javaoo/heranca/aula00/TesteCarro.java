package com.javaoo.heranca.aula00;

public class TesteCarro {
    //Por estarem no mesmo pacote de trabalho (aula00), podemos instanciar a classe Carro
	public static void main(String[] args) {
		//Inicialização da classe Carro
		Carro van = new Carro();
		
		//Preenchimento da classe Carro
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPAssageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		//Operação dos métodos da classe carro.
		van.exibirAutonomia();
		double autonomia = van.obterAutonomia();
		System.out.println(autonomia);
		double combustivel = van.calcularCombustivel(20);
		System.out.println(combustivel);
		
		

	}

}
