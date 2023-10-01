package model;

public class Processo {
	
    public String nome;          // Nome do processo
    public int qtdRetornos;      // Quantidade de retornos do processo
    
    // Construtor para inicializar um Processo com nome e quantidade de retornos
    public Processo(String nome, int qtdRetornos) {
        this.nome = nome;
        this.qtdRetornos = qtdRetornos;
    }

    // Construtor vazio padrao
    public Processo() {
        super();
    }
}

