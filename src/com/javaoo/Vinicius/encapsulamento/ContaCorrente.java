package com.javaoo.Vinicius.encapsulamento;

public class ContaCorrente {

    private int numeroConta;
    private int saldoConta = 0;


    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public int getSaldoConta() {
        return saldoConta;
    }
    public void setSaldoConta(int saldoConta) {
        
        this.saldoConta = saldoConta;
    }
    
//construtor da classe, sempre adiciona o valor de 100,00. Nesta caso o saldo nunca será vazio.
    public ContaCorrente (int numeroConta, int saldoConta){

        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta + 100;
        
    }
    }


   
    

