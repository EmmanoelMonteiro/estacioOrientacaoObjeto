package com.javaoo.Alexandre.heranca;

public class Funcionario extends Pessoa {
	private int matricula;
	private Double salario;
	
	
	public Funcionario(String nome,String email, String cpf,int matricula, Double salario) {
		setNome(nome);
		setEmail(email);
		setCpf(cpf);
		this.matricula = matricula;
		this.salario = salario;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public Double imprimeSalario() {
		return salario;
	}


	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
	
	
}
