package com.javaoo.Vinicius.encapsulamento;

public class TestarConta extends ContaCorrente {
    

    public TestarConta(int numeroConta, int saldoConta) {
        super(numeroConta, saldoConta);
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        
        ContaCorrente primeiraConta = new ContaCorrente(1234, 0);

        System.out.println(primeiraConta.getSaldoConta());

    }
}
