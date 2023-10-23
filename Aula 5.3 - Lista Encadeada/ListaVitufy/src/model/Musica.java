package model;

public class Musica {
	
	//Atributos da Musica
	public String nome;				//Nome da musica
	public String nomeArtista;		//Nome do cantos
	public int duracao;				//Duracao da musica
	
	//Construtor para inicializar Musica
	public Musica(String nome, String nomeArtista, int duracao) {
		this.nome = nome;
		this.nomeArtista = nomeArtista;
		this.duracao = duracao;
	}

	//Construtor vazio
	public Musica() {
		super();
	}

}
