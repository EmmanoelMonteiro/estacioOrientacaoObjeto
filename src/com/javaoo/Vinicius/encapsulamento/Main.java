package com.javaoo.Vinicius.encapsulamento;

public class Main {
    
    public static void main(String[] args) {

        Funcionario func1 = new Funcionario();
        func1.setNome("fulano A");
        func1.setCpf("222222222");
        func1.setEmail("fulanoA@gmail.com");

        System.out.println(func1.getNome());


        Cliente cli1 = new Cliente();
        cli1.setNome("fulano B");
        cli1.setCpf("11111111111");
        cli1.setEmail("fulanoB@gmail.com");

        System.out.println(cli1.getEmail());

        
    }
}
