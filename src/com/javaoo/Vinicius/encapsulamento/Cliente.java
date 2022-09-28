package com.javaoo.Vinicius.encapsulamento;

public class Cliente extends Pessoa{
    
    private int numeroCartao;

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
}
