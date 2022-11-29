package com.javaoo.Alexandre.heranca;

public class Cliente extends Pessoa{
	private Long cartaoDeCredito;
	
		
	public Cliente(String nome,String email, String cpf,Long cartaoDeCredito) {
		setNome(nome);
		setEmail(email);
		setCpf(cpf);
		this.cartaoDeCredito = cartaoDeCredito;
	}

	public Long imprimeCartaoDeCredito() {
		return cartaoDeCredito;
	}

	public void setCartaoDeCredito(Long cartaoDeCredito) {
		this.cartaoDeCredito = cartaoDeCredito;
	}
	
	
}
