package model;

public class Chocolate {

	//Atributos do chocolate
	public int peso; 
	public int volume;
	public int altura;
	public int largura;
	public int comprimento;
	public String receita; 
	
	//Construtor chocolate
	public Chocolate(int peso, int volume, int altura, int largura, int comprimento, String receita) {
		this.peso = peso;
		this.volume = volume;
		this.altura = altura;
		this.largura = largura;
		this.comprimento = comprimento;
		this.receita = receita;
	}
	
	//Hash para colocar na tabela 
	public int hash(int volume) {
		return (volume / 50) - 1;
	}
	
	//Exibir informacoes do chocolate
	public String toString() {
		return "Chocolate \nReceita = " + receita + "\nPeso = " + peso + " g\nVolume = " + volume + " cm3\naltura = " + altura + 
				" cm\nLargura = " + largura + "cm\nComprimento = " + comprimento + " cm";
	}

	//Construtor vazio chocolate
	public Chocolate() {
		super();
	}

}
