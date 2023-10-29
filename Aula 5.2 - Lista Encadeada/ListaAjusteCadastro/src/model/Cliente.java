package model;

public class Cliente {

	//Atributos do cliente
	public String cpf;
	public String nome;
	public int idade;
	public double limiteCredito;
	
	public Cliente(String cpf, String nome, int idade, double limiteCredito) {
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.limiteCredito = limiteCredito;
	}

	public Cliente() {
		super();
	}

}
