package model;

public class Morador {

	public int apartamento;
	public String nome;
	public String modeloCarro;
	public String corCarro;
	public String placaCarro;
	public int andar;

	public Morador(int apartamento, String nome, String modeloCarro, String corCarro, String placaCarro, int andar) {
		this.apartamento = apartamento;
		this.nome = nome;
		this.modeloCarro = modeloCarro;
		this.corCarro = corCarro;
		this.placaCarro = placaCarro;
		this.andar = andar;
	}

	public Morador() {
		super();
	}
	
	public String toString() {
		return "Morador \nNome = " + nome + "\nApartamento = " + apartamento + "\nAndar = " + andar + 
				"\nModelo do carro = " + modeloCarro + "\nCor do carro = " + corCarro
				+ "\nPlaca do carro = " + placaCarro;
	}

}
