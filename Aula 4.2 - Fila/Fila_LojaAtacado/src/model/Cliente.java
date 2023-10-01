package model;

public class Cliente {
	
    // Atributos do Cliente
    public String nome;           // Nome do cliente
    public int qtdPecas;          // Quantidade de pecas
    public float valorPecas;      // Valor das pecas
    
    // Construtor para inicializar um Cliente
    public Cliente(String nome, int qtdPecas, float valorPecas) {
        this.nome = nome;
        this.qtdPecas = qtdPecas;
        this.valorPecas = valorPecas;
    }
    
    // Construtor vazio padrão
    public Cliente() {
        super();
    }
}
