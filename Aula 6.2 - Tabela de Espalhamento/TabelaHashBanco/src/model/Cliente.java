package model;

public class Cliente {

	public int numeroConta;
	public String nome;
	public double saldoConta;
	
	public Cliente(int numeroConta, String nome, double saldoConta) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.saldoConta = saldoConta;
	}

	public String toString() {
		return "Conta #" + numeroConta + "\nCliente = " + nome + "\nSaldo da Conta = $" + saldoConta;
	}
	
	public int hash(int numeroConta) {
		return numeroConta / 1000;
	}

	public Cliente() {
		super();
	}

}
