package model;

public class Departamento {

	public String andar;
	public String nome;
	public String descricao;
	
	public Departamento(String andar, String nome, String descricao) {
		this.andar = andar;
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public String toString() {
		return "Departamento = " + nome + "\nAndar = " + andar + "\nDescricao = " + descricao;
	}

	public Departamento() {
		super();
	}

}