package com.javaoo.marcielbezerra.encapsulamento;

public class ContaCorrente {
	private int numeroConta;
	private double saldoConta = 0;
	
	
	public ContaCorrente(int numeroConta, double saldoConta) {
		this.numeroConta = numeroConta;
		this.saldoConta = saldoConta;
	}


	public int getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}


	public double getSaldoConta() {
		if (saldoConta <= 0) {
			return 100;
		}
		return saldoConta;
	}


	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}
	
	
	
	
}
